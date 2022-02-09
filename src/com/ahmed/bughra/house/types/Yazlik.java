package com.ahmed.bughra.house.types;

import com.ahmed.bughra.house.House;

/**
 * @Created: 2/10/2022 00:28
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class Yazlik extends House {
    private Boolean pazaraYakinMi;
    private Long salonSayisi;
    private Boolean HavuzluMu;

    // generate getter and setter
    public Boolean getPazaraYakinMi() {
        return pazaraYakinMi;
    }
    public void setPazaraYakinMi(Boolean pazaraYakinMi) {
        this.pazaraYakinMi = pazaraYakinMi;
    }
    public Long getSalonSayisi() {
        return salonSayisi;
    }
    public void setSalonSayisi(Long salonSayisi) {
        this.salonSayisi = salonSayisi;
    }
    public Boolean getHavuzluMu() {
        return HavuzluMu;
    }
    public void setHavuzluMu(Boolean havuzluMu) {
        HavuzluMu = havuzluMu;
    }
}
