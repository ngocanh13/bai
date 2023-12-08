package java2;

public class Hoadoncafe {
    private String tenloaicafe;
    private double giatien1kg;
    private double khoiluong;

    public Hoadoncafe(String tenloaicafe, double giatien1kg, double khoiluong){
        this.tenloaicafe= tenloaicafe;
        this.giatien1kg= giatien1kg;
        this.khoiluong= khoiluong;
    }
    public double tongtien(){
        return this.giatien1kg * this.khoiluong;

    }
    public boolean kiemtra(){
        if (this.khoiluong> khoiluong){
            return true;
        }return false;
//        return this.khoiluong> khoiluong;
    }

}
