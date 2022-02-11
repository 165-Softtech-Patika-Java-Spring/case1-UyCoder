package com.ahmed.bughra.house;

import com.ahmed.bughra.house.types.Ev;
import com.ahmed.bughra.house.types.Villa;
import com.ahmed.bughra.house.types.Yazlik;

import java.math.BigDecimal;

import static com.ahmed.bughra.house.Service.*;

/**
 * @Created: 2/10/2022 01:21
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class HouseForSale {
    public static void main(String[] args) {
     // ev1  bilgileri
        Ev ev1 = new Ev();
        ev1.setHouseId(201);
        ev1.setFiyati(400000L);
        ev1.setOdaSayisi(3L);
        ev1.setMetrakareNet(BigDecimal.valueOf(200));
     // ev2  bilgileri
        Ev ev2 = new Ev();
        ev2.setHouseId(205);
        ev2.setFiyati(415000L);
        ev2.setOdaSayisi(4L);
        ev2.setGunesliMi(false);
        ev2.setMetrakareNet(BigDecimal.valueOf(250));
     // ev3  bilgileri
        Ev ev3 = new Ev();
        ev3.setHouseId(208);
        ev3.setFiyati(358000L);
        ev3.setOdaSayisi(2L);
        ev3.setGunesliMi(false);
        ev3.setMetrakareNet(BigDecimal.valueOf(260));

   // Villa1 bilgileri
        Villa villa1 = new Villa();
        villa1.setHouseId(308);
        villa1.setFiyati(8580000L);
        villa1.setOdaSayisi(10L);
        villa1.setKatSayisi(4L);
        villa1.setKapaliHavuzluMu(true);
        villa1.setSporSalonuVarMi(true);
        villa1.setMetrakareNet(BigDecimal.valueOf(2200));
    // Villa2 bilgileri
        Villa villa2 = new Villa();
        villa2.setHouseId(358);
        villa2.setFiyati(8000000L);
        villa2.setOdaSayisi(9L);
        villa2.setKatSayisi(3L);
        villa2.setKapaliHavuzluMu(false);
        villa2.setSporSalonuVarMi(false);
        villa2.setMetrakareNet(BigDecimal.valueOf(2000));
     // Villa3 bilgileri
        Villa villa3 = new Villa();
        villa3.setHouseId(304);
        villa3.setFiyati(9050000L);
        villa3.setOdaSayisi(12L);
        villa3.setKatSayisi(4L);
        villa3.setKapaliHavuzluMu(true);
        villa3.setSporSalonuVarMi(true);
        villa3.setMetrakareNet(BigDecimal.valueOf(2500));

   // Yazlik1 bilgileri
        Yazlik yazlik1 = new Yazlik();
        yazlik1.setHouseId(483);
        yazlik1.setFiyati(2500000L);
        yazlik1.setOdaSayisi(5L);
        yazlik1.setPazaraYakinMi(true);
        yazlik1.setSalonSayisi(5L);
        yazlik1.setMetrakareNet(BigDecimal.valueOf(300));
   // Yazlik2 bilgileri
        Yazlik yazlik2 = new Yazlik();
        yazlik2.setHouseId(415);
        yazlik2.setFiyati(1500000L);
        yazlik2.setOdaSayisi(5L);
        yazlik2.setPazaraYakinMi(true);
        yazlik2.setSalonSayisi(2L);
        yazlik2.setMetrakareNet(BigDecimal.valueOf(350));
   // Yazlik3 bilgileri
        Yazlik yazlik3 = new Yazlik();
        yazlik3.setHouseId(445);
        yazlik3.setFiyati(1550000L);
        yazlik3.setOdaSayisi(6L);
        yazlik3.setPazaraYakinMi(false);
        yazlik3.setSalonSayisi(3L);
        yazlik3.setMetrakareNet(BigDecimal.valueOf(330));

    // Service class dan çağırılan metodlar
        getEvFiyatlari(ev1.getFiyati(), ev2.getFiyati(), ev3.getFiyati());
        getVillaFiyatlari(villa1.getFiyati(),villa2.getFiyati(),villa3.getFiyati());
        getYazlikFiyatlari(yazlik1.getFiyati(), yazlik2.getFiyati(),yazlik3.getFiyati());
        getHouseFiyatlari(ev1.getFiyati(), villa2.getFiyati(), yazlik3.getFiyati());
        int evAvarage = getEvAvarageCapacity(ev1.getMetrakareNet(), ev2.getMetrakareNet(), ev3.getMetrakareNet());
        int villaAvarage = getVillaAvarageCapacity(villa1.getMetrakareNet(), villa2.getMetrakareNet(), villa3.getMetrakareNet());
        int yazlikAvarage = getYazlikAvarageCapacity(yazlik1.getMetrakareNet(), yazlik2.getMetrakareNet(), yazlik3.getMetrakareNet());
        getHousesAvarageCapacity(evAvarage, villaAvarage, yazlikAvarage);
        getHouseRoomNum(ev1.getOdaSayisi(),ev2.getOdaSayisi(),ev3.getOdaSayisi(),
                        villa1.getOdaSayisi(),villa2.getOdaSayisi(),villa3.getOdaSayisi(),
                        yazlik1.getOdaSayisi(), yazlik2.getOdaSayisi(), yazlik3.getOdaSayisi());
    }
}
