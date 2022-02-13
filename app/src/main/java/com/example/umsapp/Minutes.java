package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.umsapp.adapter.MinuteAdapter;
import com.example.umsapp.databinding.ActivityMinutesBinding;
import com.example.umsapp.model.Minute;

import java.util.ArrayList;
import java.util.List;

public class Minutes extends AppCompatActivity {
    private ActivityMinutesBinding binding;
    private List<Minute> minuteList;
    private MinuteAdapter minuteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMinutesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadData();
        minuteAdapter = new MinuteAdapter(minuteList, minute -> {
            Intent intent = new Intent(Minutes.this, MinuteData.class);
            intent.putExtra("minute", minute);
            startActivity(intent);
        });
        binding.gridView.setAdapter(minuteAdapter);
    }

    private void loadData() {
        minuteList = new ArrayList<>();
        minuteList.add(new Minute("«60 daqiqalik to‘plam»", "*103*60#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
        minuteList.add(new Minute("«120 daqiqalik to‘plam»", "*103*120#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
        minuteList.add(new Minute("«180 daqiqalik to‘plam»", "*103*180#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
        minuteList.add(new Minute("«300 daqiqalik to‘plam»", "*103*300#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
        minuteList.add(new Minute("«900 daqiqalik to‘plam»", "*103*900#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
        minuteList.add(new Minute("«1200 daqiqalik to‘plam»", "*103*1200#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
        minuteList.add(new Minute("«1800 daqiqalik to‘plam»", "*103*1800#", "Izohlar:\n" +
                "\n" +
                "Daqiqalar to'plamini barcha jismoniy shaxslar uchun mo'ljallangan tarif rejalarida faollashtirish imkoniyati bor;\n" +
                "To'plamlarga kiritilgan daqiqalar tarmoq ichida, boshqa mobil operator tarmoqlariga va shahar raqamlariga chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "To'plamga kiritilgan daqiqalar hajmi abonent bandlanganligi/bandlanmaganligidan qat'iy nazar 30 kalendar kuni davomida amal qiladi;\n" +
                "\n" +
                "To'plam faollashtirilishi uchun abonent hisobida yetarlicha mablag bo'lishi shart, ya'ni u faollashganidan keyin abonent balansida kamida 42,10 so'm qolishi kerak;\n" +
                "\n" +
                "To'plam muvaffaqiyatli faollashganda bu haqida SMS-xabarnoma keladi;\n" +
                "\n" +
                "Xarid qilingan barcha to'plamlar hajmi qo‘shiladi va uning amal qilish muddati oxirgi xarid qilingan to'plamdan boshlab 30 kunni tashkil qiladi;\n" +
                "\n" +
                "To'plam yoki tarif rejasi bo'yicha beriladigan daqiqalar yakunlanganidan so'ng qo'ng'iroqlar belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Tarif rejasi o'zgartirilganda daqiqalar to'plamidan foydalanish shartlari o'zgarmaydi;\n" +
                "\n" +
                "To'plamdagi daqiqalar O'zbekiston Respublikasi bo'yicha chiquvchi qo'ng'iroqlar uchun mo'ljallangan;\n" +
                "\n" +
                "Daqiqalar to'plamlari abonent faqat O'zbekiston hududida, \"UMS\" MChJ tarmog'ida bo'lgandagina amal qiladi;\n" +
                "\n" +
                "Xalqaro chiquvchi qo'ng'iroqlar va kontent-provayder xizmatlariga qo'ng´iroqlar ular uchun belgilangan tariflar bo'yicha narxlanadi;\n" +
                "\n" +
                "Daqiqalarning sarflanish tartibi:\n" +
                "\n" +
                "Tarif rejasi bo‘yicha daqiqalar >Xarid qilingan daqiqalar to‘plami \n" +
                "\n" +
                "Abonentda bir qancha to‘plamlar bo‘lganida daqiqalarning sarflanish tartibi:\n" +
                "“Gap ko‘p” xizmati >Tarif rejasi bo‘yicha daqiqalar>Xarid qilingan daqiqalar to‘plami.\n" +
                "\n" +
                "Narxlar barcha soliqlarni hisobga olgan holda ko'rsatilgan"));
    }
}