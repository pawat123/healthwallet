import java.util.Scanner;

public class APP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        User user = new User(name);

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Show Balance");
            System.out.println("2. Add Funds");
            System.out.println("3. Spend Funds");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: $%.2f%n", user.getWallet().getBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to add: ");
                    user.getWallet().addFunds(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to spend: ");
                    user.getWallet().spendFunds(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Goodbye, " + user.getName() + "!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
