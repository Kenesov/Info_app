package vetro.uz.infoapp.utils;


import java.util.ArrayList;
import java.util.List;

import vetro.uz.infoapp.R;
import vetro.uz.infoapp.models.ProgrammingLanguage;

public class LanguageData {

    public static List<ProgrammingLanguage> getLanguages() {
        List<ProgrammingLanguage> languages = new ArrayList<>();

        // C
        languages.add(new ProgrammingLanguage(
                "C",
                "C - bu 1972 yilda Dennis Ritchie tomonidan yaratilgan umumiy maqsadli dasturlash tili. U tizim dasturlash uchun ishlab chiqilgan va ko'plab zamonaviy dasturlash tillarining asosi hisoblanadi. C tili yuqori samaradorlik va apparat bilan yaqin ishlash imkoniyatini beradi. Operating system yaratish, embedded system dasturlash va yuqori samaradorlik talab qilinadigan dasturlar uchun juda mos keladi.",
                "Operatsion tizimlar, embedded systems, kompilatorlar, device drivers",
                new int[]{R.drawable.dennis_ritchie, R.drawable.c_his, R.drawable.c_his2},
                75, 85, 95,
                R.drawable.img_c
        ));

        // C++
        languages.add(new ProgrammingLanguage(
                "C++",
                "C++ - Bjarne Stroustrup tomonidan 1985 yilda yaratilgan ob'ekt-yo'naltirilgan dasturlash tili. C tilining kengaytmasi bo'lib, ob'ekt-yo'naltirilgan dasturlash, generic dasturlash va low-level memory manipulatsiya imkoniyatlarini qo'shadi. C++ yuqori samaradorlik talab qiladigan dasturlar, o'yinlar va tizim dasturlarida keng qo'llaniladi.",
                "O'yin ishlab chiqish, tizim dasturlari, dasturiy ta'minot infratuzilmasi",
                new int[]{R.drawable.c_plus, R.drawable.c_plus_his, R.drawable.c_plus2},
                70, 80, 92,
                R.drawable.img_c_plus
        ));

        // C#
        languages.add(new ProgrammingLanguage(
                "C#",
                "C# (C Sharp) - Microsoft kompaniyasi tomonidan 2000 yilda yaratilgan zamonaviy, ob'ekt-yo'naltirilgan dasturlash tili. .NET platformasi uchun ishlab chiqilgan va Windows desktop dasturlari, veb-ilovalar va o'yin ishlab chiqishda keng qo'llaniladi. C# til sintaksisi C++ va Java tillariga o'xshash, lekin yanada oson va xavfsiz.",
                "Windows desktop, ASP.NET veb-dasturlash, Unity o'yin ishlab chiqish",
                new int[]{R.drawable.c_sharp, R.drawable.c_sharp_ver, R.drawable.c_sharpw},
                72, 78, 88,
                R.drawable.img_c_shar
        ));

        // Java
        languages.add(new ProgrammingLanguage(
                "Java",
                "Java - 1995 yilda Sun Microsystems tomonidan yaratilgan, platformaga bog'liq bo'lmagan dasturlash tili. 'Write once, run anywhere' prinsipi asosida ishlaydi. Java ob'ekt-yo'naltirilgan, xavfsiz va ishonchli til hisoblanadi. Enterprise dasturlar, Android mobil ilovalar va katta hajmli veb-tizimlar uchun juda mashhur tanlovdir.",
                "Android mobil ilovalar, enterprise dasturlar, veb-backend",
                new int[]{R.drawable.java_sun, R.drawable.java_android, R.drawable.java_his},
                73, 90, 85,
                R.drawable.img_java
        ));

        // Kotlin
        languages.add(new ProgrammingLanguage(
                "Kotlin",
                "Kotlin - JetBrains kompaniyasi tomonidan 2011 yilda yaratilgan zamonaviy dasturlash tili. 2017 yilda Google uni Android uchun rasmiy til sifatida e'lon qildi. Kotlin Java bilan to'liq mos keladi, lekin yanada qisqa va xavfsiz kod yozish imkonini beradi. Null safety va funksional dasturlash xususiyatlari bilan ajralib turadi.",
                "Android mobil ilovalar, server-side dasturlash, multiplatform",
                new int[]{R.drawable.kotlin_img, R.drawable.kotlin_super, R.drawable.img_kotlin},
                68, 82, 87,
                R.drawable.img_kotlin
        ));

        // JavaScript
        languages.add(new ProgrammingLanguage(
                "JavaScript",
                "JavaScript - 1995 yilda Brendan Eich tomonidan yaratilgan dinamik dasturlash tili. Dastlab veb-sahifalarni interaktiv qilish uchun ishlab chiqilgan, lekin hozirda Node.js orqali server tomonda ham ishlatiladi. JavaScript veb-dasturlashning ajralmas qismi bo'lib, React, Vue, Angular kabi zamonaviy frameworklar asosida turadi.",
                "Frontend veb-dasturlash, backend (Node.js), mobil ilovalar (React Native)",
                new int[]{R.drawable.img_javascript, R.drawable.img_javascript, R.drawable.img_javascript},
                70, 95, 80,
                R.drawable.img_javascript
        ));

        // Python
        languages.add(new ProgrammingLanguage(
                "Python",
                "Python - Guido van Rossum tomonidan 1991 yilda yaratilgan yuqori darajali dasturlash tili. O'qish va yozish oson sintaksisi bilan mashhur. Python sun'iy intellekt, ma'lumotlar tahlili, veb-dasturlash va avtomatlashtirish uchun eng mashhur tillardan biri hisoblanadi. Katta kutubxonalar ekotizimi va sodda sintaksisi uni boshlovchilar uchun ideal qiladi.",
                "Sun'iy intellekt, ma'lumotlar tahlili, veb-dasturlash, avtomatlashtirish",
                new int[]{R.drawable.img_python, R.drawable.img_python, R.drawable.img_python},
                80, 95, 82,
                R.drawable.img_python
        ));

        // PHP
        languages.add(new ProgrammingLanguage(
                "PHP",
                "PHP - 1995 yilda Rasmus Lerdorf tomonidan yaratilgan server-side dasturlash tili. Veb-sahifalar yaratish uchun maxsus ishlab chiqilgan va WordPress, Laravel kabi mashhur platformalar asosida turadi. PHP dinamik veb-saytlar, content management systems va e-commerce platformalari uchun keng qo'llaniladi.",
                "Veb-backend dasturlash, CMS (WordPress, Drupal), e-commerce",
                new int[]{R.drawable.img_php, R.drawable.img_php, R.drawable.img_php},
                75, 70, 75,
                R.drawable.img_php
        ));

        // Swift
        languages.add(new ProgrammingLanguage(
                "Swift",
                "Swift - Apple kompaniyasi tomonidan 2014 yilda yaratilgan zamonaviy dasturlash tili. iOS, macOS, watchOS va tvOS uchun dastur ishlab chiqishda ishlatiladi. Swift xavfsiz, tez va zamonaviy sintaksisga ega. Objective-C tilini almashtirish uchun yaratilgan va Apple ekotizimida asosiy til hisoblanadi.",
                "iOS mobil ilovalar, macOS desktop, Apple Watch, Apple TV",
                new int[]{R.drawable.img_swift, R.drawable.img_swift, R.drawable.img_swift},
                72, 75, 90,
                R.drawable.img_swift
        ));

        // Dart
        languages.add(new ProgrammingLanguage(
                "Dart",
                "Dart - Google tomonidan 2011 yilda yaratilgan ob'ekt-yo'naltirilgan dasturlash tili. Flutter framework bilan birgalikda cross-platform mobil ilovalar yaratish uchun ishlatiladi. Dart bir marta kod yozib, Android va iOS uchun native ilovalar yaratish imkonini beradi. Yuqori unumdorlik va hot reload xususiyati bilan ajralib turadi.",
                "Flutter mobil ilovalar, veb-dasturlash, cross-platform",
                new int[]{R.drawable.img_dart, R.drawable.img_dart, R.drawable.img_dart},
                74, 70, 86,
                R.drawable.img_dart
        ));

        // Go
        languages.add(new ProgrammingLanguage(
                "Go",
                "Go (Golang) - Google kompaniyasi tomonidan 2009 yilda yaratilgan statik tipli dasturlash tili. Sodda sintaksis, tez kompilyatsiya va yuqori samaradorlik bilan ajralib turadi. Go mikroservislar, cloud computing va tarmoq dasturlash uchun juda mos keladi. Concurrency bilan ishlash uchun goroutine xususiyatiga ega.",
                "Backend mikroservislar, cloud computing, DevOps toollar",
                new int[]{R.drawable.img_go, R.drawable.img_go, R.drawable.img_go},
                71, 73, 92,
                R.drawable.img_go
        ));

        // Rust
        languages.add(new ProgrammingLanguage(
                "Rust",
                "Rust - Mozilla tomonidan 2010 yilda yaratilgan tizim dasturlash tili. Xotira xavfsizligi va concurrency xavfsizligiga katta e'tibor qaratilgan. Rust C va C++ kabi yuqori samaradorlikni ta'minlaydi, lekin ko'plab xatolardan himoya qiladi. Zamonaviy tizim dasturlash, embedded systems va blockchain texnologiyalarida qo'llaniladi.",
                "Tizim dasturlash, embedded systems, blockchain, WebAssembly",
                new int[]{R.drawable.img_rust, R.drawable.img_rust, R.drawable.img_rust},
                65, 72, 95,
                R.drawable.img_rust
        ));

        return languages;
    }
}
