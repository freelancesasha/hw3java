import java.util.Scanner;

public class numbers {
    public static void main(String[] argv) throws Exception {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        try {

            if (a >= 0 & a <= 17) {
                System.out.println("от 0 до 17");
            } else if (a >= 18 & a <= 65) {
                System.out.println("от 18 до 65");
            } else if (a >= 66) {
                System.out.println("больше или равно 66");
            } else if (a < 0) {
                throw new Exception("Отрицательный числа запрещены");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}