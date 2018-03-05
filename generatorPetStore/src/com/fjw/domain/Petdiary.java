package com.fjw.domain;

import java.util.Date;

public class Petdiary {
    private Integer diaryId;

    private Integer diaryPetId;

    private Date diaryDate;

    private String diaryTitle;

    private String diaryWeather;

    private String diaryContext;

    private Boolean diaryIsPublic;

    private Date diaryLastModify;

    private String diaryAuthor;

    private String diaryAuthorEmail;

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public Integer getDiaryPetId() {
        return diaryPetId;
    }

    public void setDiaryPetId(Integer diaryPetId) {
        this.diaryPetId = diaryPetId;
    }

    public Date getDiaryDate() {
        return diaryDate;
    }

    public void setDiaryDate(Date diaryDate) {
        this.diaryDate = diaryDate;
    }

    public String getDiaryTitle() {
        return diaryTitle;
    }

    public void setDiaryTitle(String diaryTitle) {
        this.diaryTitle = diaryTitle == null ? null : diaryTitle.trim();
    }

    public String getDiaryWeather() {
        return diaryWeather;
    }

    public void setDiaryWeather(String diaryWeather) {
        this.diaryWeather = diaryWeather == null ? null : diaryWeather.trim();
    }

    public String getDiaryContext() {
        return diaryContext;
    }

    public void setDiaryContext(String diaryContext) {
        this.diaryContext = diaryContext == null ? null : diaryContext.trim();
    }

    public Boolean getDiaryIsPublic() {
        return diaryIsPublic;
    }

    public void setDiaryIsPublic(Boolean diaryIsPublic) {
        this.diaryIsPublic = diaryIsPublic;
    }

    public Date getDiaryLastModify() {
        return diaryLastModify;
    }

    public void setDiaryLastModify(Date diaryLastModify) {
        this.diaryLastModify = diaryLastModify;
    }

    public String getDiaryAuthor() {
        return diaryAuthor;
    }

    public void setDiaryAuthor(String diaryAuthor) {
        this.diaryAuthor = diaryAuthor == null ? null : diaryAuthor.trim();
    }

    public String getDiaryAuthorEmail() {
        return diaryAuthorEmail;
    }

    public void setDiaryAuthorEmail(String diaryAuthorEmail) {
        this.diaryAuthorEmail = diaryAuthorEmail == null ? null : diaryAuthorEmail.trim();
    }
}