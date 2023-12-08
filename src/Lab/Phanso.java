package Lab;

import java.util.Scanner;

public class Phanso {
    public int Tu;
    public int mau;

    public Phanso(){
        this.Tu = 0;
        this.mau = 1;
    }
    public Phanso(int Tu, int mau){
        this.Tu = Tu;
        this.mau = mau;
    }
    public void setTuso(int Tu) {
        this.Tu = Tu;
    }

    public void setMauso(int mau) {
        this.mau = mau;
    }

    public int getTuso() {
        return Tu;
    }

    public int getmauso() {
        return mau;
    }
    public void nhapphanso(){
        Scanner a = new Scanner(System.in);
        System.out.println("nhap gia tri tu:");
        Tu = a.nextInt();
        System.out.println("nhap gia tri mau:");
        mau = a.nextInt();
        while (mau ==0){
            System.out.println("nhap lai gia tri cau mau:");
            mau = a.nextInt();

        }
    }
    public void inphanso(){
        System.out.println("phan so:"+ Tu +"/"+ mau);
    }
    public int timucln(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return timucln(b, a % b);
        }
    }
    public void rutgon(){
        int ucln = timucln(Tu,mau);
        int turutgon = Tu/ucln;
        int maurutgon = mau/ucln;
        System.out.println("phan so gut gon"+turutgon+ "/"+ maurutgon);
    }

    public void nghichdao(){
        int tudao = mau;
        int maudao = Tu;
        System.out.println("nghich dao:" + tudao+"/" + maudao);
    }
}
