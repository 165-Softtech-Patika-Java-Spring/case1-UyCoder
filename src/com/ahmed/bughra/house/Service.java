package com.ahmed.bughra.house;

import com.ahmed.bughra.house.House;

/**
 * @Created: 2/10/2022 00:30
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class Service {
    //a. Evlerin toplam fiyatlarını dönen bir metot
    public static void getEvFiyatlari(Long evFiyat1, Long evFiyat2, Long evFiyat3){
        System.out.println("===============  a. Evlerin toplam fiyatları  ====================");
        System.out.println("Satilik olan ev1 Fiyati:          " + evFiyat1);
        System.out.println("Satilik olan ev2 Fiyati:          " + evFiyat2);
        System.out.println("Satilik olan ev3 Fiyati:          " + evFiyat3);
        System.out.println();
    }
    //b. Villaların toplam fiyatlarını dönen bir metot
    public static void getVillaFiyatlari(Long VillaFiyat1, Long VillaFiyat2, Long VillaFiyat3){
        System.out.println("=============== b. Villaların toplam fiyatları  ====================");
        System.out.println("Satilik olan villa1 Fiyati:          " + VillaFiyat1);
        System.out.println("Satilik olan villa2 Fiyati:          " + VillaFiyat2);
        System.out.println("Satilik olan villa3 Fiyati:          " + VillaFiyat3);
        System.out.println();
    }
    //c. Yazlıkların toplam fiyatlarını dönen metot
    public static void getYazlikFiyatlari(Long yaziliFiyat1, Long yaziliFiyat2, Long yaziliFiyat3){
        System.out.println("=============== c. Yazlıkların toplam fiyatları  ====================");
        System.out.println("Satilik olan yazili1 Fiyati:          " + yaziliFiyat1);
        System.out.println("Satilik olan yazili2 Fiyati:          " + yaziliFiyat2);
        System.out.println("Satilik olan yazili3 Fiyati:          " + yaziliFiyat3);
        System.out.println();
    }
    //d. Tüm tipteki evlerin toplam fiyatını dönen metot
    public static void getHouseFiyatlari(Long evFiyat1, Long VillaFiyat2, Long yaziliFiyat3){
        System.out.println("=============== d. Tüm tipteki evlerin toplam fiyatı  ====================");
        System.out.println("Satilik olan evFiyat1 Fiyati:          " + evFiyat1);
        System.out.println("Satilik olan VillaFiyat2 Fiyati:       " + VillaFiyat2);
        System.out.println("Satilik olan yaziliFiyat3 Fiyati:      " + yaziliFiyat3);
        System.out.println();
    }
    //e. Evlerin ortalama metrekaresini dönen bir metot
    //f. Villaların ortalama metrekaresini dönen bir metot
    //g. Yazlıkların ortalama metrekaresini dönen metot
    //h. Tüm tipteki evlerin ortalama metrekaresini dönen metot
    //i. Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot

    // *. Bu metod satilik olan ev bilgileri getiriyor
    public static void getEvBilgiler(Integer evId, Long evFiyati, String binaYili, Boolean GunesliMi){
        System.out.println("===============  Satilik olan Ev bilgileri  ====================");
        System.out.println("Satilik olan ev Id:              " + evId);
        System.out.println("Satilik olan ev Fiyati:          " + evFiyati);
        System.out.println("Satilik olan ev Yili:            " + binaYili);
        System.out.println("Satilik olan ev Gunesli Mi:      " + GunesliMi);
        System.out.println();
    }

    // *. Bu metod satilik olan evlerin id nomurasini listeliyor
    public static void getHouseId(Integer evId, Integer villaId, Integer yazlikId){
        System.out.println("===============  Satilik olan Evler  ====================");
        System.out.println("Satilik olan ev Id:          " + evId);
        System.out.println("Satilik olan villa Id:       " + villaId);
        System.out.println("Satilik olan yazlik Id:      " + yazlikId);
        System.out.println();
    }

    // *. Bu metod satilik olan evlerin fiyatini listeliyor
    public static void getHousePrice(Long evPrice, Long villaPrice, Long yazlikPrice){
        System.out.println("==============  Satilik olan Ev fiyatlari listesi ========");
        System.out.println("Satilik olan ev fiyati:         " + evPrice);
        System.out.println("Satilik olan villa fiyati:      " + villaPrice);
        System.out.println("Satilik olan yazlik fiyati:     " + yazlikPrice);
    }

}
