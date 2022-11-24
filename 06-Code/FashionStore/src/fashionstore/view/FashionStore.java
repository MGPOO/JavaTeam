package fashionstore.view;

import java.util.Scanner;

/**
 *
 * @author Pythons, DCCO-ESPE
 */
public class FashionStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=====\tGroup #5\t=====");
        System.out.println("===== Pythons =====");
        int option , orderId;
        
        double neck , chest , shoulder , arm , hip , waist , leg;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("===================================");
            System.out.println("\t\tMenu:");
            System.out.println("1. Create a new order");
            System.out.println("2. Print all orders");
            System.out.println("3. Export as JSON file");
            System.out.println("4. Exit");

            System.out.println("Enter an option: ");
            option = scan.nextInt();
            while (option > 4) {
                System.out.println("Option invalid, Enter an option: ");
                option = scan.nextInt();
            }

            try {
                switch (option) {
                    case 1 -> {
                        
                    }
                }
            }

        } while (option < 4);

    }

}
