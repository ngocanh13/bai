package demo5;

public class Main {
    public static void main(String[] args) {
        StudenInterface as = new StudenInterface() {
            @Override
            public void lear() {

            }
        };

        aptech apt = new aptech() {
            @Override
            public void code(String a) {

            }
        };
        //Lambda expresdion
        aptech apt2 = (a)->{

        };
    }

}
