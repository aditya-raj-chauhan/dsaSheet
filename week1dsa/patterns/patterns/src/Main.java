public class Main {

    // 1. Solid Square Pattern
    public void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Left Aligned Triangle (Stars)
    public void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. Number Triangle (1 2 3...)
    public void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    // 4. Same Number Row Triangle
    public void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }

    // 5. Inverted Star Triangle
    public void pattern5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 6. Inverted Number Triangle
    public void pattern6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    // 7. Pyramid Pattern
    public void pattern7(int n) {
        for (int i = 0; i < n; i++) {

            // Left spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Right spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // 8. Inverted Pyramid
    public void pattern8(int n) {
        for (int i = 0; i < n; i++) {

            // Left spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }

            // Right spaces
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    // 9. Diamond Pattern
    public void pattern9(int n) {
        pattern7(n);
        pattern8(n);
    }

    public void pattern10(int n){

        for(int i = 0; i < 2 * n - 1; i++){
            int stars = i < n ? i + 1 : 2 * n - i - 1;
            for (int j = 0; j < stars; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }

    // Main Method
    public static void main(String[] args) {
        Main obj = new Main();
        obj.pattern10(5);
    }
}
