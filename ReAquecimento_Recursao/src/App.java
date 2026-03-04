public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(sucessiveSum(10, 4));
        System.out.println(incrementSum(202, 45));

    }


    public static int sucessiveSum (int x, int y) {
        int total = 0;
        if (x == 0){
            return total;
        }
        else {
            total = y +  sucessiveSum(x-1, y);
        } 
        return total;
    }   

    public static int incrementSum(int x, int y) {
        int total = 0;
        if (x == 0) {
            total = y;
        } else if (y == 0) {
            total = x;
        } else {
            total = 1 + incrementSum(x - 1, y);
        }

        return total;
    }
}
