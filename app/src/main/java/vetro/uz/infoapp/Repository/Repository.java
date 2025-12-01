package vetro.uz.infoapp.Repository;

import java.util.ArrayList;
import java.util.List;

import vetro.uz.infoapp.R;

public class Repository {
    private List<InfoData> list;

    public Repository() {
        list = new ArrayList();
        list.add(new InfoData("Italiya", "Rim", R.drawable.img, "Italiya Rim imperiyasi vatani bo‘lib, Yevropa madaniyatiga eng katta ta’sir ko‘rsatgan davlatlardan biri. O‘rta asrda shahar-davlatlar (Venetsiya, Florensiya) rivojlangan. Bugun moda (Milan), oshxona (Pizza, Pasta) va tarixiy obidalar bilan mashhur."));
        list.add(new InfoData("Germaniya", "Berlin", R.drawable.img_1, "Germaniya Yevropaning sanoat va iqtisodiy markazi. 1 va 2-jahon urushlaridan keyin mamlakat Sharq va G‘arbga bo‘lingan. 1990-yilda qayta birlashgan. Bugun texnologiya, avtomobilsozlik (BMW, Mercedes), fan va ta’lim bo‘yicha yetakchi davlatlardan biri."));
        list.add(new InfoData("AQSH", "Vashinton", R.drawable.img_2, "1776-yilda mustaqillik e’lon qilingan. Bugun dunyoning eng kuchli iqtisodiy va harbiy davlatidan biri. Texnologiya gigantlari (Apple, Google, Microsoft), Hollywood va yuqori darajadagi ta’lim bilan mashhur."));
        list.add(new InfoData("Yaponiya", "Tokyo", R.drawable.img_3, "Samuraylar, shogunlar davri bilan mashhur. 2-jahon urushidan keyin juda tez tiklanib texnologiya markaziga aylangan. Toyota, Sony, Nintendo kabi yirik kompaniyalar shu yerda."));
        list.add(new InfoData("Ispaniya", "Madrid", R.drawable.img_4, "15–17-asrlarda dunyoning eng kuchli imperiyalaridan biri bo‘lgan. Kolumb Amerikani kashf etgach, Ispaniya katta mustamlaka imperiyasi qurdi. Bugun futbol (Real Madrid, Barcelona), flamenco raqsi va tarixiy me’morchilik bilan mashhur."));
        list.add(new InfoData("Fransiya", "Parij", R.drawable.img_5, "1789-yil Fransuz inqilobi Yevropaning siyosiy tizimini o‘zgartirgan. Napoleon davri, mustamlaka tarixi va san’at markazi sifatida mashhur. Bugun dunyoning eng ko‘p turist tashrif buyuradigan davlatidir."));
        list.add(new InfoData("Koreya", "Seul", R.drawable.img_6, "Koreya urushidan keyin Janubiy Koreya juda tez rivojlangan. Samsung, Hyundai, LG kabi texnologik gigantlar shu yerdan. Bugun K-pop (BTS, Blackpink) va K-doramalari bilan dunyoga mashhur."));
        list.add(new InfoData("Brazila", "Brazil", R.drawable.img_7, "Janubiy Amerikaning eng yirik davlati. Portugaliya mustamlakasi bo‘lgan, 1822-yilda mustaqillikka erishgan. Amazonka o‘rmoni, futbol yulduzlari (Pelé, Neymar) va karnavallari bilan mashhur"));
    }
    public List<InfoData> getList(){
        return list;
    }
}
