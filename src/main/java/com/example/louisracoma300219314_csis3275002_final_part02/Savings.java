package com.example.louisracoma300219314_csis3275002_final_part02;

public class Savings {
    private String custno;
    private String custname;
    private double cdep;
    private int nyears;
    private String savtype;

    public Savings(String custno, String custname, double cdep, int nyears, String savtype) {
        this.custno = custno;
        this.custname = custname;
        this.cdep = cdep;
        this.nyears = nyears;
        this.savtype = savtype;
    }

    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public double getCdep() {
        return cdep;
    }

    public void setCdep(double cdep) {
        this.cdep = cdep;
    }

    public int getNyears() {
        return nyears;
    }

    public void setNyears(int nyears) {
        this.nyears = nyears;
    }

    public String getSavtype() {
        return savtype;
    }

    public void setSavtype(String savtpe) {
        this.savtype = savtpe;
    }
}
