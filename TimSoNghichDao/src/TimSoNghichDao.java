import java.util.Scanner;
public class TimSoNghichDao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num, reverse = 0, initial;
        System.out.println("Mời nhập 1 số ");
        num = scanner.nextInt();
        initial = num;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        if (initial == reverse) {
            System.out.println(initial + "  là số nghịch đảo");
        } else {
            System.out.println(initial + "  không phải là số nghịch đảo");
        }
    }
}