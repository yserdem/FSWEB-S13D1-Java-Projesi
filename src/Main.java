
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
        System.out.println(shouldWakeUp (true, 8));
        System.out.println(shouldWakeUp (true, -1));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        System.out.println(area(5.0));
        System.out.println(area(-1));
    }

    public static boolean shouldWakeUp(boolean arg1, int arg2) {
        int minVal = 0;
        int maxVal = 23;
            if(arg2<minVal || arg2 > maxVal) {
                return false;
            } else if ((arg2>20 || arg2<8) && arg1)  {
                return true;
            } else {
                return false;
            }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer &&
                (temp<=45 && temp>=25)){
            return true;
        } else return !isSummer &&
                (temp <= 35 && temp >= 25);
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        return (num1 >= 13 && num1<=19) ||
                (num2 >= 13 && num2<=19) ||
                (num3 >= 13 && num3<=19);
    }

    public static double area(double num1, double num2) {
        if (num1 < 0 || num2 < 0) {
            return -1;
        } else {
            return num1 * num2;
        }
    }

    public static double area(double radius) {
        if (radius < 0){
            return -1;
        } else {
            return radius * radius * Math.PI;
        }
    }


}