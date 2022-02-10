package com.ahmed.bughra.house.types;

import com.ahmed.bughra.house.House;

/**
 * @Created: 2/10/2022 00:27
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class Ev extends House {

    private Integer bulunduguKat;
    private Boolean gunesliMi;

    // generate getter and setter method
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
