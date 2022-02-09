package com.ahmed.bughra.house.types;

import com.ahmed.bughra.house.House;

/**
 * @Created: 2/10/2022 00:27
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class Villa extends House {
    private Long katSayisi;
    private Boolean kapaliHavuzluMu;
    private Boolean sporSalonuVarMi;

    // generate getter and setter
    public Long getKatSayisi() {
        return katSayisi;
    }
    public void setKatSayisi(Long katSayisi) {
        this.katSayisi = katSayisi;
    }
    public Boolean getKapaliHavuzluMu() {
        return kapaliHavuzluMu;
    }
    public void setKapaliHavuzluMu(Boolean kapaliHavuzluMu) {
        this.kapaliHavuzluMu = kapaliHavuzluMu;
    }
    public Boolean getSporSalonuVarMi() {
        return sporSalonuVarMi;
    }
    public void setSporSalonuVarMi(Boolean sporSalonuVarMi) {
        this.sporSalonuVarMi = sporSalonuVarMi;
    }
}
