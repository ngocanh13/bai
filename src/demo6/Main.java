package demo6;

public class Main {
    public static void main(String[] args) {

        try {
            int x = 10;
            int y =0;
            System.out.println("x:y");
            if (y<5){
                throw new Exception("ko ddc chia be hon 5");
            }
            int z = x/y;
            System.out.println(z);
            demo();

        }catch (ArithmeticException e){
            System.out.println("Eroor:" );
        }catch (Exception a) {
            System.out.println("Eroor:" + a.getMessage());
        }finally {

        }
      //  demo();
    }
    public static void demo()throws Exception{
        System.out.println("demo");
        int x = 2;
        int y = 0;
        System.out.println(x/y);
    }

}
