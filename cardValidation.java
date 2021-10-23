import java.util.Scanner;

public final class CardValidator {
    public static void main(final String[] args) {
        final var scanner = new Scanner(System.in);
        final var creditCardNumber = scanner.next();

        if (abc.isValid(creditCardNumber)) {
            System.out.print("valid");
        } else {
            System.out.print("not valid");
        }
    }
}

class abc {

    static boolean isValid(String number) {

        if (number.length() != 16) {
            return false;
        }
        var reverse = new StringBuilder(number).reverse().chars().map(c -> c - '0');
        int sum = 0;
        var isEven = false;

        for (int i : reverse.toArray()) {
            if (isEven) {
                i *= 2;
            }
            sum += i > 9 ? i - 9 : i;
            isEven = !isEven;
        }
        return 0 == sum % 10;
    }
}