package java1;

public class Main {
    public static void main(String[] args) {
        MyDate c = new MyDate(13, 9, 2004);
        MyDate c2 = new MyDate(13, 9, 2004);

//        c.printday();
//        c.printmouth();
//        c.printyear();
//        c.printdate();
//        c.getDay();
//        c.getMouth();
//        c.getYear();
//        c.setDay(13);
//        c.setMouth(9);
//        c.setYear(2004);
//        System.out.println(c.getDay());
//        System.out.println(c.getMouth());
//        System.out.println(c.getYear());
//        int a = 5;
//        int b = 6;
        if(c==c2 ){
            System.out.println("c=c2");
        }else{
            System.out.println("c!=c2");

        }
        //System.out.println(c);
    }
}
