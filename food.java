
import java.util.Scanner;

public class food {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalAmount = 0; 
        System.out.println("\tWelcome to Zomato, Order your favorite food");
        while (true) {
            System.out.println("\nSelect a food item from the menu: \n1. Briyani \n2. Samosa \n3. Butter Chicken \n4. Masala Dosa \n5. Fruit juice \n6.Exit");
            System.out.print("\nEnter your choice (1-6): ");
            int choice = sc.nextInt();
            if (choice == 6) {
                System.out.println("Thank you for visiting Zomato! Have a great day!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println("enter no of Briyani");
                    int a = sc.nextInt();
                    totalAmount = totalAmount + (250 * a);
                    System.out.println("Biryani added to your order.");
                    System.out.println("\nAvailable restaurants for Biryani and their discounts:");
                    System.out.println("1. Thalaphakattu Biryani - Price: Rs.250, Discount: 10%");
                    System.out.println("2. Thala King Briyani - Price: Rs.270, Discount: 5%");
                    System.out.println("3. Hot Biryani - Price: Rs.300, Discount: 15%");
                    System.out.print("\nChoose a restaurant (1-3): ");
                    int biryaniChoice = sc.nextInt();
                    if (biryaniChoice == 1) {
                        totalAmount -= 250  * 0.10; 
                        System.out.println("Applied 10% discount. New price: Rs.225");
                    } else if (biryaniChoice == 2) {
                        totalAmount -= 270 * 0.05; 
                        System.out.println("Applied 5% discount. New price: Rs.256.5");
                    } else if (biryaniChoice == 3) {
                        totalAmount -= 300 * 0.15;
                        System.out.println("Applied 15% discount. New price: Rs.255");
                    }
                    break;
                case 2:
                    System.out.println("enter no of Samosa");
                    int b = sc.nextInt();
                    totalAmount = totalAmount + (50 * b); 
                    System.out.println("Samosa added to your order.");
                    System.out.println("\nAvailable restaurants for Samosa and their discounts:");
                    System.out.println("1. Samosa King - Price: Rs.50, Discount: 5%");
                    System.out.println("2. GBS Samosa  - Price: Rs.60, Discount: 10%");
                    System.out.println("3. Samosa Kadai - Price: Rs.55, Discount: 8%");
                    System.out.println("Choose a restaurant (1-3): ");
                    int samosaChoice = sc.nextInt();
                    if (samosaChoice == 1) {
                        totalAmount -= 50 * 0.05; 
                        System.out.println("Applied 5% discount. New price: Rs.47.5");
                    } else if (samosaChoice == 2) {
                        totalAmount -= 60 * 0.10; 
                        System.out.println("Applied 10% discount. New price: Rs.54");
                    } else if (samosaChoice == 3) {
                        totalAmount -= 55 * 0.08; 
                        System.out.println("Applied 8% discount. New price: ₹50.6");
                    }
                    break;
                case 3:
                    System.out.println("enter no of Butter Chicken");
                    int c = sc.nextInt();
                    totalAmount = totalAmount + (300 * c); 
                    System.out.println("Butter Chicken added to your order.");
                    System.out.println("\nAvailable restaurants for Butter Chicken and their discounts:");
                    System.out.println("1. Butter Chicken - Price: Rs.300, Discount: 15%");
                    System.out.println("2. The Chicken Queens - Price: Rs.280, Discount: 10%");
                    System.out.println("3. Punjabi Butter Chicken - Price: Rs.320, Discount: 8%");
                    System.out.print("\nChoose a restaurant (1-3): ");
                    int butterChickenChoice = sc.nextInt();
                    if (butterChickenChoice == 1) {
                        totalAmount -= 300 * 0.15;
                        System.out.println("Applied 15% discount. New price: Rs.255");
                    } else if (butterChickenChoice == 2) {
                        totalAmount -= 280 * 0.10; 
                        System.out.println("Applied 10% discount. New price: RS.252");
                    } else if (butterChickenChoice == 3) {
                        totalAmount -= 320 * 0.08; 
                        System.out.println("Applied 8% discount. New price: Rs.294.4");
                    }
                    break;
                case 4:
                    System.out.println("enter no of Masala Dosa");
                    int d = sc.nextInt();
                    totalAmount = (totalAmount + 120) * d;
                    System.out.println("Masala Dosa added to your order.");
                    System.out.println("\nAvailable restaurants for Masala Dosa and their discounts:");
                    System.out.println("1. Dosa Point - Price: Rs.120, Discount: 10%");
                    System.out.println("2. Pandiyan hotel - Price: Rs.130, Discount: 5%");
                    System.out.println("3. Masala Dosa King - Price: Rs.110, Discount: 8%");
                    System.out.print("\nChoose a restaurant (1-3): ");
                    int dosaChoice = sc.nextInt();
                    if (dosaChoice == 1) {
                        totalAmount -= 120 * 0.10;
                        System.out.println("Applied 10% discount. New price: Rs.108");
                    } else if (dosaChoice == 2) {
                        totalAmount -= 130 * 0.05; 
                        System.out.println("Applied 5% discount. New price: Rs.123.5");
                    } else if (dosaChoice == 3) {
                        totalAmount -= 110 * 0.08; 
                        System.out.println("Applied 8% discount. New price: Rs.101.2");
                    }
                    break;
                case 5:
                    System.out.println("enter no of Juice");
                    int e = sc.nextInt();
                    totalAmount = (totalAmount + 80) * e;
                    System.out.println("Friut juice added to your order.");
                    System.out.println("\nAvailable restaurants for Fruit Juice and their discounts:");
                    System.out.println("1. Pazhamudhir chozhai - Price: Rs.80, Discount: 5%");
                    System.out.println("2. Ammal juice - Price: Rs.90, Discount: 8%");
                    System.out.println("3. The Juice Shop - Price: Rs.85, Discount: 7%");
                    System.out.print("\nChoose a restaurant (1-3): ");
                    int juiceChoice = sc.nextInt();
                    if (juiceChoice == 1) {
                        totalAmount -= 80 * 0.05;
                        System.out.println("Applied 5% discount. New price: Rs.76");
                    } else if (juiceChoice == 2) {
                        totalAmount -= 90 * 0.08; 
                        System.out.println("Applied 8% discount. New price: Rs.83.4");
                    } else if (juiceChoice == 3) {
                        totalAmount -= 85 * 0.07; 
                        System.out.println("Applied 7% discount. New price: Rs.79.05");
                    }
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
            System.out.print("\nDo you want to order more? (yes/no): ");
            String more = sc.next();
            if (more.equalsIgnoreCase("no")) {
                System.out.println("Your total amount is: Rs." + totalAmount);
                System.out.print("Do you want to confirm the order? (yes/no): ");
                String confirm = sc.next();
                if (confirm.equalsIgnoreCase("yes")) {
                    System.out.println("\tThank you for in AGL Total: Rs." + totalAmount);
                } else {
                    System.out.println("Order has been canceled.");
                }
                break;
            }
        }
    }
}
