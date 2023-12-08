package java1;

import jdk.nashorn.internal.ir.IfNode;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int mouth, int year){
        this.day=day;
        this.month= month;
        this.year= year;

    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public int getMouth(){
        return this.month;

    }
    public void setMonth(int mouth){
        this.month = month;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }


//    public void printday(){
//        System.out.println("day:"+ this.day);
//
//    }
//    public void printmonth(){
//        System.out.println("mouth:"+ this.month);
//
//    }
//    public void printyear(){
//        System.out.println("year:"+ this.year);
//
//    }
//    public void printdate(){
//        System.out.println("date"+ this.day+"-"+this.month+"-"+ this.year);
//
//    }

    @Override
    public String toString() {
        return this.day + "/"+this.month + "/"+this.year;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//        return true;
//        if (obj == null)
//            return false;
//        if (this.getClass() != obj.getClass())
//            return false;
//        MyDate other = (MyDate) obj;
//        if (this.day != other.day)
//            return false;
//        if (this.year != other.year)
//            return false;
//        if (this.month != other.month)
//            return false;
//        return true;
//    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        MyDate other = (MyDate) obj;
        if (this.day != other.day)
            return false;
        if (this.month != other.month)
            return false;
        if (this.year != other.year)
            return false;
        return true;

    }
}

