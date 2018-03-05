package com.fjw.domain;
//多条件查询
public class Condition  {
    private Petinfo petinfo;
    private PageBean pageBean;

    public Petinfo getPetinfo() {
        return petinfo;
    }

    public void setPetinfo(Petinfo petinfo) {
        this.petinfo = petinfo;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }
}
