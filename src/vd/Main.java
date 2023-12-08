package vd;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree(1);
        t.growup();
        t.die();

        t.growup().die();
    }
}
