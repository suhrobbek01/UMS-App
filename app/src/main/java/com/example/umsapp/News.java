package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.umsapp.databinding.ActivityNewsBinding;

public class News extends AppCompatActivity {
    private ActivityNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.progressBar.setVisibility(View.INVISIBLE);
        binding.webView.getSettings().setJavaScriptEnabled(true);
        binding.webView.setWebViewClient(new MyWebViewClient());

        binding.webView.loadUrl("https://www.google.com/url?sa=t&source=web&rct=j&url=https://company.mobi.uz/uz/&ved=2ahUKEwjEuI7E7J7xAhUpiYsKHWZaAW8QFjAAegQICxAC&usg=AOvVaw0r5evPiQyBYuTxzzHY7g3S");


    }

    class MyWebViewClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            binding.progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            binding.progressBar.setVisibility(View.INVISIBLE);
        }
    }
}