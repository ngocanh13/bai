package vd;

public class Tree {
    private int yearold ;

    public Tree(int yearold) {
        this.yearold = yearold;
    }

    public int getYearold() {
        return yearold;
    }

    public void setYearold(int yearold) {
        this.yearold = yearold;
    }
    public Tree growup(){
        System.out.println("tree ...");
        return this;
    }

    public Tree die(){
        System.out.println("Tree die... ");
        return this;
    }
}
