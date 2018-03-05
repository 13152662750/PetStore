package com.fjw.domain;

import java.util.List;

public class PageBean {
    private int totalPage;//总页数
    private int currentPage;//当前页
    private int pageSize;//每页显示条数
    private int count;//总条数
    private List<Petinfo> petinfos;

    @Override
    public String toString() {
        return "PageBean{" +
                "totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", pageSize=" + pageSize +
                ", count=" + count +
                ", petinfos=" + petinfos +
                ", start=" + start +
                '}';
    }

    private int start;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public PageBean() {
    }

    public PageBean(int totalPage, int currentPage, int pageSize, int count, int start) {
        this.totalPage = totalPage;
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.count = count;
        this.start=start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Petinfo> getPetinfos() {
        return petinfos;
    }

    public void setPetinfos(List<Petinfo> petinfos) {
        this.petinfos = petinfos;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
