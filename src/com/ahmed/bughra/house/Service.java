package com.ahmed.bughra.house;

import com.ahmed.bughra.house.House;

import java.math.BigDecimal;

/**
 * @Created: 2/10/2022 00:30
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class Service {
    //a. Evlerin toplam fiyatlarını dönen bir metot
    public static void getEvFiyatlari(Long evFiyat1,
                                      Long evFiyat2,
                                      Long evFiyat3){
        System.out.println("===============  a. Evlerin toplam fiyatları  ====================");
        System.out.println("Satilik olan ev1 Fiyati:          " + evFiyat1);
        System.out.println("Satilik olan ev2 Fiyati:          " + evFiyat2);
        System.out.println("Satilik olan ev3 Fiyati:          " + evFiyat3);
        System.out.println();
    }
    //b. Villaların toplam fiyatlarını dönen bir metot
    public static void getVillaFiyatlari(Long VillaFiyat1,
                                         Long VillaFiyat2,
                                         Long VillaFiyat3){
        System.out.println("=============== b. Villaların toplam fiyatları  ====================");
        System.out.println("Satilik olan villa1 Fiyati:          " + VillaFiyat1);
        System.out.println("Satilik olan villa2 Fiyati:          " + VillaFiyat2);
        System.out.println("Satilik olan villa3 Fiyati:          " + VillaFiyat3);
        System.out.println();
    }
    //c. Yazlıkların toplam fiyatlarını dönen metot
    public static void getYazlikFiyatlari(Long yaziliFiyat1,
                                          Long yaziliFiyat2,
                                          Long yaziliFiyat3){
        System.out.println("=============== c. Yazlıkların toplam fiyatları  ====================");
        System.out.println("Satilik olan yazili1 Fiyati:          " + yaziliFiyat1);
        System.out.println("Satilik olan yazili2 Fiyati:          " + yaziliFiyat2);
        System.out.println("Satilik olan yazili3 Fiyati:          " + yaziliFiyat3);
        System.out.println();
    }
    //d. Tüm tipteki evlerin toplam fiyatını dönen metot
    public static void getHouseFiyatlari(Long evFiyat1,
                                         Long VillaFiyat2,
                                         Long yaziliFiyat3){
        System.out.println("=============== d. Tüm tipteki evlerin toplam fiyatı  ====================");
        System.out.println("Satilik olan evFiyat1 Fiyati:          " + evFiyat1);
        System.out.println("Satilik olan VillaFiyat2 Fiyati:       " + VillaFiyat2);
        System.out.println("Satilik olan yaziliFiyat3 Fiyati:      " + yaziliFiyat3);
        System.out.println();
    }
    //e. Evlerin ortalama metrekaresini dönen bir metot
    public static int getEvAvarageCapacity(BigDecimal capacity1,
                                            BigDecimal capacity2,
                                            BigDecimal capacity3){
        System.out.println("=============== e. Evlerin ortalama metrekaresi  ====================");
        int avaragePrice = (capacity1.intValue()+capacity2.intValue()+capacity3.intValue())/3;
        System.out.print("Satilik olan evlerin ortalama metrekaresi:  ");
        System.out.println(avaragePrice+ " square meter");
        System.out.println();
        return avaragePrice;
    }
    //f. Villaların ortalama metrekaresini dönen bir metot
    public static int getVillaAvarageCapacity(BigDecimal capacity1,
                                               BigDecimal capacity2,
                                               BigDecimal capacity3){
        System.out.println("=============== f. Villaların ortalama metrekaresi  ====================");
        int avaragePrice = (capacity1.intValue()+capacity2.intValue()+capacity3.intValue())/3;
        System.out.print("Satilik olan Villalarin ortalama metrekaresi:  ");
        System.out.println(avaragePrice+ " square meter");
        System.out.println();
        return avaragePrice;
    }
    //g. Yazlıkların ortalama metrekaresini dönen metot
    public static int getYazlikAvarageCapacity(BigDecimal capacity1,
                                                BigDecimal capacity2,
                                                BigDecimal capacity3){
        System.out.println("=============== h. Tüm tipteki evlerin ortalama metrekaresi  ====================");
        int avaragePrice = (capacity1.intValue()+capacity2.intValue()+capacity3.intValue())/3;
        System.out.print("Satilik olan Yazliklarin ortalama metrekaresi:  ");
        System.out.println(avaragePrice+ " square meter");
        System.out.println();
        return avaragePrice;
    }
        //h. Tüm tipteki evlerin ortalama metrekaresini dönen metot
    public static int getHousesAvarageCapacity(int evAverage, int villaAverage, int yazlikAverage){
        System.out.println("=============== h. Tüm tipteki evlerin ortalama metrekaresi  ====================");
        int avaragePrice = (evAverage+villaAverage+yazlikAverage)/3;
        System.out.print("Satilik olan tum tipteki evlerin ortalama metrekaresi:  ");
        System.out.println(avaragePrice+ " square meter");
        return avaragePrice;
    }

    //i. Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot
    public static void getHouseRoomNum(Long ev1, Long ev2, Long ev3,
                                        Long villa1, Long villa2,  Long villa3,
                                        Long yazlik1, Long yazlik2, Long yazlik3){
        System.out.println("=============== i. Oda ve salon sayısına göre tüm tipteki evler  ====================");
        System.out.println("Satilik olan ev1 Oda sayısı:  "+ev1);
        System.out.println("Satilik olan ev2 Oda sayısı:  "+ev2);
        System.out.println("Satilik olan ev3 Oda sayısı:  "+ev3);
        System.out.println("Satilik olan Villa1 Oda sayısı:  "+villa1);
        System.out.println("Satilik olan Villa2 Oda sayısı:  "+villa2);
        System.out.println("Satilik olan Villa3 Oda sayısı:  "+villa3);
        System.out.println("Satilik olan Yazlik1 Oda sayısı:  "+yazlik1);
        System.out.println("Satilik olan Yazlik2 Oda sayısı:  "+yazlik2);
        System.out.println("Satilik olan Yazlik3 Oda sayısı:  "+yazlik3);
        System.out.println();
    }




}
