public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // System.out.println(sucessiveSum(10, 4));
        // System.out.println(incrementSum(202, 45));
        // System.out.println(divisionSum(6));
        // System.out.println(stringInversion("papagaio"));
        int[] array = {1, 2, 3, 4};
        System.out.println(arraySum(array, array.length));
        System.out.println(arrayMultiply(array, array.length));

    }


    //1
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

    //2
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

    //3
    public static float divisionSum(int n) {
        float total = 0;
        if (n == 0) {
            return total;
        } else {
            total = (1 / (float) n) + divisionSum(n - 1);
        }
        return total;
    }

    //4
    public static String stringInversion(String str) {
        String newStr = "";
        if (str.length() == 0) {
            return newStr;
        }
        newStr = str.charAt(str.length() - 1) + stringInversion(str.substring(0, str.length() - 1));
        return newStr;
    }

    //7
    public static int arraySum(int[] array, int length) {
        if (length == 0) {
            return 0;
        }
        int total = 0;

        total = array[length - 1] + arraySum(array, length - 1);

        return total;
    }

    public static int arrayMultiply(int[] array, int length) {
        if (length == 0) {
            return 1;
        }
        int total = 0;

        total = array[length - 1] * arrayMultiply(array, length - 1);

        return total;
    }

    //8
    public static boolean isPalindrome(String str) {
        if (stringInversion(str).equals(str)) {
            return true;
        }
        return false;
    }


}
