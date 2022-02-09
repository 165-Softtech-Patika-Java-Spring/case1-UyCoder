package com.ahmed.bughra.house;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Created: 2/10/2022 00:30
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */

public class House {

    private Integer HouseId;
    private BigDecimal metrekareBrut;
    private BigDecimal metrakareNet;
    private String binaYili;
    private Long fiyati;


    // genereta getter and setter method

    public Integer getHouseId() {
        return HouseId;
    }
    public void setHouseId(Integer evId) {
        this.HouseId = evId;
    }
    public BigDecimal getMetrekareBrut() {
        return metrekareBrut;
    }
    public void setMetrekareBrut(BigDecimal metrekareBrut) {
        this.metrekareBrut = metrekareBrut;
    }
    public BigDecimal getMetrakareNet() {
        return metrakareNet;
    }
    public void setMetrakareNet(BigDecimal metrakareNet) {
        this.metrakareNet = metrakareNet;
    }
    public String getBinaYili() {
        return binaYili;
    }
    public void setBinaYili(String binaYili) {
        this.binaYili = binaYili;
    }
    public Long getFiyati() {
        return fiyati;
    }
    public void setFiyati(Long fiyati) {
        this.fiyati = fiyati;
    }
}
