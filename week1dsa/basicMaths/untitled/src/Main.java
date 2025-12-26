import java.util.Set;
import java.util.TreeSet;

public class Main {

    /* -------------------------------------------------
       1. Extract digits (Right to Left)
       Example: 512 -> 2 1 5
       ------------------------------------------------- */
    public void extractDigits(int number) {
        System.out.println("\n[Digit Extraction]");
        number = Math.abs(number);

        if (number == 0) {
            System.out.println("Digits: 0");
            return;
        }

        System.out.print("Digits (right to left): ");
        while (number > 0) {
            int lastDigit = number % 10;
            System.out.print(lastDigit + " ");
            number /= 10;
        }
        System.out.println();
    }

    /* -------------------------------------------------
       2. Count digits (Iterative – safest approach)
       ------------------------------------------------- */
    public int countDigits(int number) {
        number = Math.abs(number);

        if (number == 0) return 1;

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    /* -------------------------------------------------
       3. Palindrome Check (Numeric method)
       ------------------------------------------------- */
    public boolean isPalindrome(int number) {
        number = Math.abs(number);

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = (reversed * 10) + digit;
            number /= 10;
        }

        return original == reversed;
    }

    /* -------------------------------------------------
       4. Count digits (Logarithmic optimization)
       ------------------------------------------------- */
    public int countDigitsOptimized(int number) {
        number = Math.abs(number);
        if (number == 0) return 1;
        return (int) Math.log10(number) + 1;
    }

    /* -------------------------------------------------
       5. Armstrong Number Check (3-digit assumption)
       ------------------------------------------------- */
    public void checkArmstrong(int number) {
        System.out.println("\n[Armstrong Check]");
        int sum = 0;
        int temp = number;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (temp == sum) {
            System.out.println(temp + " → Armstrong number");
        } else {
            System.out.println(temp + " → Not an Armstrong number");
        }
    }

    /* -------------------------------------------------
       6. Print all divisors (Brute force)
       ------------------------------------------------- */
    public void printDivisors(int number) {
        System.out.println("\n[Divisors – Brute Force]");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /* -------------------------------------------------
       7. Print divisors (Optimized using √n)
       ------------------------------------------------- */
    public void printDivisorsOptimized(int number) {
        System.out.println("\n[Divisors – Optimized]");
        Set<Integer> divisors = new TreeSet<>();

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                divisors.add(i);
                divisors.add(number / i);
            }
        }
        System.out.println("Divisors: " + divisors);
    }

    /* -------------------------------------------------
       8. Prime Number Check (Optimized)
       ------------------------------------------------- */
    public void checkPrime(int number) {
        System.out.println("\n[Prime Check]");

        if (number <= 1) {
            System.out.println(number + " → Not prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " → Not prime");
                return;
            }
        }
        System.out.println(number + " → Prime number");
    }

    /* -------------------------------------------------
       Main Driver
       ------------------------------------------------- */
    public static void main(String[] args) {

        Main obj = new Main();

        int sample = 5124517;

        obj.extractDigits(sample);

        System.out.println("\n[Digit Count]");
        System.out.println("Loop method: " + obj.countDigits(sample));
        System.out.println("Log method : " + obj.countDigitsOptimized(sample));

        System.out.println("\n[Palindrome Check]");
        System.out.println(sample + " → " + obj.isPalindrome(sample));

        obj.checkArmstrong(5645);
        obj.checkArmstrong(371);

        obj.printDivisors(36);
        obj.printDivisorsOptimized(36);

        obj.checkPrime(7);
    }
}
