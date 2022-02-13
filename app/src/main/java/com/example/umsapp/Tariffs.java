package com.example.umsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.umsapp.adapter.TariffAdapter;
import com.example.umsapp.databinding.ActivityMainBinding;
import com.example.umsapp.databinding.ActivityTariffsBinding;
import com.example.umsapp.model.Tariff;

import java.util.ArrayList;
import java.util.List;

public class Tariffs extends AppCompatActivity {
    private ActivityTariffsBinding binding;
    private List<Tariff> tariffList;
    private TariffAdapter tariffAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTariffsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadData();
        tariffAdapter = new TariffAdapter(tariffList, tariff -> {
            Intent intent = new Intent(Tariffs.this, TariffData.class);
            intent.putExtra("tariff", tariff);
            startActivity(intent);
        });
        binding.gridView.setAdapter(tariffAdapter);

    }

    private void loadData() {
        tariffList = new ArrayList<>();
        tariffList.add(new Tariff("Mobi 110", "*111*133#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 150", "*111*134#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 90", "*111*132#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 70", "*111*131#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 60", "*111*130#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 50", "*111*129#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 40", "*111*122#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 30+", "*111*128#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 25", "*111*102#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Mobi 20", " *111*120#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Chilla Lite+", " *111*042#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Terminal+", "*111*112#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Yengil", "*001# ", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Gap yo`q pro", " *111*101#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Omad plus", "*001# ", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
        tariffList.add(new Tariff("Gap yo`q", " *111*100#", "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                "\n" +
                "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                "\n" +
                "Internet-trafikni yaxlitlash kvanti 1 KB\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasida “Gap ko‘p” xizmati ishlamaydi.\n" +
                "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi;\n" +
                "Ushbu tarif rejasiga o‘tish uchun abonent hisobida kamida 39 210,35 so‘m (TR almashtirish uchun 4210,35 so‘m to‘lovni hisobga olgan holda) yoki 45 000  so‘m (TR almashtirish uchun 10 000 so‘m to‘lovni hisobga olgan holda) bo‘lishi kerak. Hisobdagi mablag‘ yuqorida ko‘rsatib o‘tilgandan kam bo‘lsa tarif rejasiga o‘tish imkoniyati - mavjud emas.\n" +
                "\n" +
                "Abonent to`lovi yuqoriroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 10000 so`m \n" +
                "\n" +
                "Abonent to`lovi pastroq bo`lgan tarif rejalaridan «GAP yo‘q» tarif rejasiga o`tish narxi - 4210,35 so`m\n" +
                "\n" +
                "«GAP yo‘q» tarif rejasi va  Faxriy, MOBIUZ bilan birga tarif rejalari orasida o‘zaro o‘tish narxi –  0.\n" +
                "\n" +
                "Chilla Lite+, Mobi 20 tarif rejalariga o‘tish narxi - 20 000 so‘m.\n" +
                "\n" +
                "Tarif rejasi o‘zgartirilganda foydalanilmagan daqiqa, SMS va megabaytlar keyingi davrga o‘tkaziladi va qo’shiladi. \n" +
                "\n" +
                "Balans nolga teng yoki manfiy bo‘lib qolganda, raqam qisman blokirovka qilinadi(qisman blokirovkada chiquvchi daqiqalar, SMS va internet bloklanadi) va abonent «Aloqadaman» xizmatining shartlariga muvofiq kiruvchi qo‘ng‘iroqlar va SMS larni qabul qilishi mumkin bo‘ladi.\n" +
                "\n" +
                "Bloklangan holatda abonent to‘lovi yechilmaydi;\n" +
                "\n" +
                "Abonent to‘lovini oylik yechib olish holatida MB to‘liqligicha 1 kalendar oyiga beriladi.\n" +
                "\n" +
                "Agar abonent to‘lovini yechib olish payti kelganda, abonent hisobida oylik abonent to'lovini yechib olish uchun  yetarli mablag‘ bo‘lmasa, lekin kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lsa,to'lovni yechib olish va to'plamlar har kunlik tartibga o'tkaziladi. Abonent to‘lovini yechish sanasi 1 kunga suriladi.\n" +
                "\n" +
                "Abonent to‘lovini har kunlik yechib olish holatida, MB, SMS va daqiqalar 1 kun uchun belgilangan miqdorda beriladi.\n" +
                "\n" +
                "Agar abonent to'lovini yechib olish vaqti kelganda, abonent hisobida oylik va kunlik abonent to'lovini yechib olish uchun yetarli mablag' bo'lmasa, abonent ulanganligi to'g'risida SMS-xabar orqali ogohlantiriladigan mablag' yetishmasligi bo'yicha blokga tushadi. Abonent hisob tarif bo'yicha abonent to'lovini (oylik yoki kunlik) yechib olish uchun yetarli bo'lgan qiymatgacha to'ldirishiga qadar blokda bo'ladi. Abonent to'lovi hisob to'ldirilgandan keyin darhol yechib olinadi.\n" +
                "\n" +
                "Agar hisobni to‘ldirish paytida abonent to‘lovni har kunlik yechishda bo‘lsa, abonent to‘lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "a)      Abonent bloklangan va balansni 0 so‘mdan ko‘proq va 35 000  so‘mdan kamroq bo‘lgan mablag’ bilan to‘ldiradi (oylik abonent to‘lovining to‘liq miqdoridan kamroq):\n" +
                "\n" +
                "1 Misol: Abonent 15-yanvarda bloklangan (mablag' yetishmaganligi sababli yoki qisman bloklash) holatda. 15-yanvar  soat 12:00 da balansni 5000 so‘mga to‘ldiradi. Raqam faollashadi, balans 4 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob  to'ldirilishi bilan,\"GAP yo‘q\" tarif rejasi uchun joriy kunga kunlik abonent to'lovini yechish darhol amalga oshiriladi.Joriy kun oxirigacha kunlik daqiqa,MB va SMS to'plamlardan foydalanish mumkin. Hisobda 35 000 so'mdan kam mablag' bo'lganligi sababli, abonent to'lovini oylik yechib olishga o'tish AMALGA OSHIRILMAYDI.\n" +
                "\n" +
                "\n" +
                "b)      Abonent bloklangan va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "2 Misol: Abonent 10-yanvarda -200 so‘m balans bilan blokga tushgan. Tarif bo'yicha abonent to'lovini yechish 15-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 45000 so‘mga to‘ldiradi. Raqam faollashadi, balans 44 800 so‘mni (-200 so‘m qarzdorlikni qoplashga) tashkil qiladi. Hisob to'ldirilgandan keyin tarif rejasi uchun abonent to'lovi to'liqligicha yechib olinadi. Mablag'lar yechib olingandan keyin abonent balansi 9800 so'mni tashkil qiladi.Mablag'lar yechib olinganda tarif bo'yicha to'plamlar to'liq hajmda, 1 kalendar oyiga beriladi. Keyingi yechib olish sanasi 15-fevral deb belgilanadi\n" +
                "c)       Abonent  faol holatda,abonent to'lovini har kunlik yechishda va balansni  35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "3 Misol: Abonent 15-yanvarda 5000 so‘m balans bilan faol holatda. Tarif uchun kunlik abonent to'lovi 0:00 dan keyin yechib olingan. Abonent 15-yanvar soat 17:00 da balansni 35 000 so‘mga to‘ldiradi. Balans jami 40 000 so'mni tashkil qiladi. Hisob to'ldirilgandan keyin abonent to'lovini har oylik yechib olishga o'tiladi va abonent to'lovi darhol yechib olinadi. Mablag'lar yechib olingandan keyin balans 5000 so'mni tashkil qiladi. To'plamlarning 15-yanvar uchun qoldiqlari oylik 500 daqiqa, 10000 MB to‘plamlari bilan qo'shiladi. Abonent to‘lovini keyingi yechib olish sanasi 15-fevral deb belgilanadi.\n" +
                "\n" +
                "Agar hisobni to'ldirish paytida abonent to'lovini har oylik yechib olishda bo'lsa, abonent to'lovini yechishning quyidagi qoidalari amal qiladi:\n" +
                "\n" +
                "a)  Abonent faol holatda,abonent to'lovini har oylik yechishda va balansni 35 000 so‘mgacha yoki ko‘proq mablag’ bilan to‘ldirdi (oylik abonent to‘loviga teng yoki undan ko‘proq):\n" +
                "4 Misol: Abonent 15 yanvarda 5000 so‘m balans bilan faol holatda.Tarif bo'yicha abonent to'lovini keyingi yechish 16-yanvarga belgilangan. 15-yanvar soat 12:00 da balansni 40000 so‘mga to‘ldiradi. Balans jami 45 000 so'mni tashkil qiladi. Yechib olish har oylik bo'lib qoladi. 16-yanvar  00:00 dan keyin 1 abonent to‘lovi - butun oy uchun yechib olinadi.Oylik 500 daqiqa, 10000 MB to‘plamlardan foydalanish mumkin. Keyingi safar abonent to‘lovini yechish 16-fevralda amalga oshiriladi. \n" +
                "\n" +
                "*  tarmoq ichidagi Unlim daqiqalar bu Mobiuz abonentlariga chiquvchi qo‘ng‘iroqlar uchun tarif rejasiga kiritilgan cheksiz bepul daqiqalar to‘plami.\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. dan ulangan yoki o‘tgan abonentlarga, megabayt va daqiqa to‘plamlari to‘liq hajmda (10000 MB, 500 daqiqa) beriladi;\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha ulangan yoki o‘tgan abonentlarga, yangilangan daqiqalar to‘plami yangi davrning boshidan (abonent 11-mayda to‘lovni qanday yechish usulida: oylik yoki kunlik bo‘lganiga qarab) taqdim etiladi.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021y. gacha, ulangan yoki o‘tgan abonentlarga daqiqalar to‘plami 11.05.2021y. kuni ichida taqdim etiladi: \n" +
                "\n" +
                "- Agar abonent, 11-mayda to‘lovni har oylik yechishda bo‘lsa proreytni hisobga olgan holda, oylik hajmda beriladi. Ushbu to‘plamning amal qilish muddati – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha.\n" +
                "\n" +
                "Yangi to‘plamni to‘liq hajmda taqdim qilish – abonent uchun yangi hisoblanadigan oyning boshidan.\n" +
                "\n" +
                "- Agar abonent 11-mayda to‘lovni har kunlik yechishda bo‘lsa 17 daqiqa beriladi. Ushbu to‘plamning amal qilish muddati –11.05.2021y. 23:59 gacha.\n" +
                "\n" +
                "- Gap yo‘q tarif rejasiga 11.05.2021 gacha (shu jumladan) ulangan yangi va amaldagi abonentlarga berilgan megabayt va daqiqalar hajmi – yakka tartibdagi hisoblanadigan kalendar oyi tugaguncha amal qiladi;\n" +
                "\n" +
                "1-Misol: Yangi abonent Gap yo‘q tarif rejasiga  12.05.2021 da ulandi. Ulanganda 10000 MB va 500 daqiqa berildi. Ushbu to‘plamlarning amal qilish muddati 12.06.2021 gacha.\n" +
                "\n" +
                "2-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da  abonent to‘lovini har oylik yechishda. To‘lovni yechish kuni – 28-may. 11.05.2021 kuni abonentga – 28-maygacha amal qiladigan 283 daqiqa beriladi. 28-mayda unga 10000 MB, 500 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 28-iyungacha.\n" +
                "\n" +
                "3-Misol: Gap yo‘q tarif rejasining amaldagi abonenti 11.05.2021 da abonent to‘lovini har kunlik yechishda. Abonentga kun oxirigacha amal qiladigan – 17 daqiqa beriladi. To‘lovni yechishning keyingi kuni – 12-may. 12-mayda abonentga 334 MB, 17 daqiqa beriladi. Ushbu to‘plamlarning amal qilish muddati 13-maygacha. \n" +
                "\n" +
                "Markaziy Osiyo: Tojikiston, Qozog‘iston, Turkmaniston va Qirg‘iziston.\n" +
                "\n" +
                "MDH mamlakatlari: Аzarbayjon, Armaniston, Bеlarus, Gruziya, Qozog‘iston, Qirg‘iziston, Moldova, Rossiya, Tojikiston, Turkmaniston, Ukraina.\n" +
                "Yevropa: Аvstriya, Albaniya, Andorra, Bеlgiya, Bolgariya, Bosniya va Gеrtsеgovina, Vatikan, Buyuk Britaniya, Vеngriya, Gеrmaniya, Grеtsiya, Daniya, Isroil, Irlandiya, Islandiya, Ispaniya, Italiya, Kipr, Kosovo, Latviya, Litva, Lixtеnshtеyn, Lyuksеmburg, Makеdoniya, Malta, Monako, Nidеrlandiya, Norvеgiya, Polsha, Portugaliya, Ruminiya, Slovakiya, Slovеniya, Turkiya, Finlyandiya, Fransiya, Xorvatiya, Chеrnogoriya, Chеxiya, Shvеytsariya, Shvеtsiya, Estoniya.\n" +
                "Аmеrika, Afrika: Jazoir, Angilya, Angola, Antigua va Barbuda, Argеntina, Aruba, Bеrmud, Braziliya, Burkina-Faso, Burundi, Vеnеsuela, Gabon, Gaiti, Gambiya, Gana, Gvatеmala, Gonduras, Grеnada, Guam, Kongo Dеmokratik Rеspublikasi, Dominika, Misr, Kayman orollari, Kanada, Kеniya, Kuba, Libеriya, Madagaskar, Malavi, Mali, Marokko, Mеksika, Mozambik, Namibiya, Nigеriya, Tеrks va Kaykos orollari, Panama, Paragvay, Sudan, Samoa, Sеnеgal, Sеnt Vinsеnt va Grеnadin, Sеnt Kits va Nеvis, Sеnt Lyusiya, AQSH, Sеrra-Lеonе, Tanzaniya, Trinidad va Tobago, Tunis, Chili, Urugvay, Ekvador, El-Salvador, Efiopiya, JAR, Yamayka.\n" +
                "Osiyo: Afg‘oniston, Bangladеsh, Baxrеyn, Brunеy, Vyеtnam, Gonkong, Hindiston, Indonеziya, Iordaniya, Iroq, Eron, Yaman, Kambodja, Qatar, Xitoy, Liviya, Malayziya, Maldivi, Mongoliya, Nеpal, Oman, Pokiston, Saudiya Arabistoni, Singapur, Suriya, Tailand, Tayvan, Yaponiya, Janubiy Korеya.\n" +
                "Xalqaro aloqa uchun tariflar."));
    }
}