package mondayTrial;

import java.util.Scanner;
    public class Pyramid {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a number");
            int n = scan.nextInt();

            for (int i = 1; i <= n; i++) {
                // Print spaces
                for (int j = 0; j < (n - i) * 2; j++) {
                    System.out.print(" ");
                }
                // Print first half of the row
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                // Print second half of the row
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }

