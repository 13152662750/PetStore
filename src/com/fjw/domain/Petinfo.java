package com.fjw.domain;

import java.io.Serializable;

public class Petinfo {
    private Integer petId;

    private String petName;

    private String petSex;

    private Integer petStrength;

    private Integer petCute;

    private Integer petLove;

    private String petIntro;

    private String petOwnerName;

    private String petOwnerEmail;

    private String petPassword;

    private String petPic;

    private Integer petType;

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName == null ? null : petName.trim();
    }

    public String getPetSex() {
        return petSex;
    }

    public void setPetSex(String petSex) {
        this.petSex = petSex == null ? null : petSex.trim();
    }

    public Integer getPetStrength() {
        return petStrength;
    }

    public void setPetStrength(Integer petStrength) {
        this.petStrength = petStrength;
    }

    public Integer getPetCute() {
        return petCute;
    }

    public void setPetCute(Integer petCute) {
        this.petCute = petCute;
    }

    public Integer getPetLove() {
        return petLove;
    }

    public void setPetLove(Integer petLove) {
        this.petLove = petLove;
    }

    public String getPetIntro() {
        return petIntro;
    }

    public void setPetIntro(String petIntro) {
        this.petIntro = petIntro == null ? null : petIntro.trim();
    }

    public String getPetOwnerName() {
        return petOwnerName;
    }

    public void setPetOwnerName(String petOwnerName) {
        this.petOwnerName = petOwnerName == null ? null : petOwnerName.trim();
    }

    public String getPetOwnerEmail() {
        return petOwnerEmail;
    }

    public void setPetOwnerEmail(String petOwnerEmail) {
        this.petOwnerEmail = petOwnerEmail == null ? null : petOwnerEmail.trim();
    }

    public String getPetPassword() {
        return petPassword;
    }

    public void setPetPassword(String petPassword) {
        this.petPassword = petPassword == null ? null : petPassword.trim();
    }

    public String getPetPic() {
        return petPic;
    }

    public void setPetPic(String petPic) {
        this.petPic = petPic == null ? null : petPic.trim();
    }

    public Integer getPetType() {
        return petType;
    }

    public void setPetType(Integer petType) {
        this.petType = petType;
    }
}