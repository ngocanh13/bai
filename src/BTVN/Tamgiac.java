package BTVN;


public class Tamgiac {
    float c1, c2, c3;

    public Tamgiac(float c1, float c2, float c3){
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

    }
    void Dieukien(){
        if(c1 + c2 > c3 && c1 +c3 >c2&&c2+ c3>c1){
            System.out.println("La mot tam giac");
        }else{
            System.out.println("Ko phai la mot tam giac");
            System.exit(0);
        }
    }

    void Chuvi(){
        float cv = c1 + c2 + c3;
        System.out.println("Chu vi cua tam giac =" + cv);
    }
    void Dientich(){
        float p = (c1 + c2 + c3 )/2;
        float s =(float) Math.sqrt(p*(p -c1)*(p-c2)*(p-c3));
        System.out.println("Dien tich cua tam giac = "+ s);
    }
}
