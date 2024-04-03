package com.example.aplikasimobile;

public class Novel {
    String judul;
    String penulis;
    String deskripsi;
    String chapter;
    int coveriimage;

    public Novel(String judul, String penulis, String deskripsi, String chapter, int coveriimage) {
        this.judul = judul;
        this.penulis = penulis;
        this.deskripsi = deskripsi;
        this.chapter = chapter;
        this.coveriimage = coveriimage;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public int getCoveriimage() {
        return coveriimage;
    }

    public void setCoveriimage(int coveriimage) {
        this.coveriimage = coveriimage;
    }
}
