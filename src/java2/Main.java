package java2;

public class Main {
    public static void main(String[] args) {
        Hoadoncafe c = new Hoadoncafe("Trung Nguyen", 100, 1.5);
        Hoadoncafe c2 = new Hoadoncafe("Trung Nguyen2", 200, 2.5);
        Hoadoncafe c3 = new Hoadoncafe("Trung Nguyen3", 300, 3.5);

        System.out.println("tong tien"+c.tongtien());
        System.out.println("tong tien"+c2.tongtien());
        System.out.println("tong tien"+c3.tongtien());
        System.out.println("tong tien"+c.kiemtra());
        System.out.println("tong tien"+c2.kiemtra());
        System.out.println("tong tien"+c3.kiemtra());

    }
}
