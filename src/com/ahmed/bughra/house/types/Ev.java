package com.ahmed.bughra.house.types;

import com.ahmed.bughra.house.House;

/**
 * @Created: 2/10/2022 00:27
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class Ev extends House {
    private Long odaSayisi;
    private Integer bulunduguKat;
    private Boolean gunesliMi;

    // generate getter and setter method
    public Long getOdaSayisi() {
        return odaSayisi;
    }
    public void setOdaSayisi(Long odaSayisi) {
        this.odaSayisi = odaSayisi;
    }
    public Integer getBulunduguKat() {
        return bulunduguKat;
    }
    public void setBulunduguKat(Integer bulunduguKat) {
        this.bulunduguKat = bulunduguKat;
    }
    public Boolean getGunesliMi() {
        return gunesliMi;
    }
    public void setGunesliMi(Boolean gunesliMi) {
        this.gunesliMi = gunesliMi;
    }
}
