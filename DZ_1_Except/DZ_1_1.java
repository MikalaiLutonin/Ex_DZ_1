// 1) Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class DZ_1_1 {

public static void main(String[] args) {
    String name = null;
    System.out.println(name.length());    //NullPointerException
}

public static void main1() {
    String number = "123qwe";
    int result = Integer.parseInt(number);
    System.out.println(result);             //NumberFormatException
}

public static void main2() {
    int number = 10 / 0;
    System.out.println(number);             //ArithmeticException
}


}