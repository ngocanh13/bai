package vd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        boolean flag = false;
        do {
            flag = false;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("nhap nagy sinh:");
                String s = sc.nextLine();
                LocalDate dob = LocalDate.parse(s);
                int year = dob.getYear();
                if (year % 4 == 0)
                    System.out.println("day la nam nhuan");
                else
                    System.out.println("day ko phai nam nhuan");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                flag = true;
            }
        } while (flag);

//        boolean flag = false;
//        do{
//            flag = false;
//            try {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("NHap ngay sinh:");
//                String s = sc.nextLine();
//                LocalDate dob = LocalDate.parse(s);
//                int year = dob.getYear();
//                if (year % 4 == 0)
//                    System.out.println("Day la nam nhuan");
//                else
//                    System.out.println("Day khong phai nam nhuan");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                flag = true;
//            }
//        }while (flag);
    }


}