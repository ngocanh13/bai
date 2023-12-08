package java7;

import java.time.LocalDate;

public class Lop {
    private String tenlop;
    private String phonghoc;
    private  String malop;
    private LocalDate date;

    public Lop(String tenlop, String phonghoc, String malop, LocalDate date) {
        this.tenlop = tenlop;
        this.phonghoc = phonghoc;
        this.malop = malop;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getPhonghoc() {
        return phonghoc;
    }

    public void setPhonghoc(String phonghoc) {
        this.phonghoc = phonghoc;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
    public String toString(){
        return tenlop+"\n"+ phonghoc+"\n"+malop+ "\n"+ date;
    }
}
