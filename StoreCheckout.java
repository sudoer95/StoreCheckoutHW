import java.util.Scanner;

public class StoreCheckout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mouse=0, keyboard=0, headphones=0, laptop_stand=0;
        double total = 0;
        double totaltotal = 0;
        double discount = 0;
        int command = 0;
        int temp = 0;
        int count = 0;
        while (command != -5){
            temp = 0;
            System.out.print("\n\n===== SIMPLE STORE =====\n1. Mouse - $20\n2. Keyboard - $40\n3. Headphones - $50\n4. Laptop Stand - $30\n5. Checkout\nChoose a product:");
            command = scan.nextInt();
            
            if(command >= 1 && command <=5){
                switch(command){
                    case 1:
                        System.out.print("\nYou selected: Mouse\nPrice: $20\nEnter quantity: ");
                        temp = scan.nextInt();
                        if (temp <= 0) {System.out.print("\nInvalid quantity. Quantity must be more than zero."); break;}
                        count += temp;
                        temp *= 20;
                        mouse += temp;
                        total += temp;
                        System.out.print("\n" + temp + " x 20$ = $" + temp + "\nAdded to cart!\nCurrent total is $" + total);
                        break;
                    case 2:
                        System.out.print("\nYou selected: Keyboard\nPrice: $40\nEnter quantity: ");
                        temp = scan.nextInt();
                        if (temp <= 0) {System.out.print("\nInvalid quantity. Quantity must be more than zero."); break;}
                        count += temp;
                        temp *= 40;
                        keyboard += temp;
                        total += temp;
                        System.out.print("\n" + temp + " x 40$ = $" + temp + "\nAdded to cart!\nCurrent total is $" + total);
                        break;
                    case 3:
                        System.out.print("\nYou selected: Headphones\nPrice: $50\nEnter quantity: ");
                        temp = scan.nextInt();
                        if (temp <= 0) {System.out.print("\nInvalid quantity. Quantity must be more than zero."); break;}
                        count += temp;
                        temp *= 50;
                        headphones += temp;
                        total += temp;
                        System.out.print("\n" + temp + " x 50$ = $" + temp + "\nAdded to cart!\nCurrent total is $" + total);
                        break;
                    case 4:
                        System.out.print("\nYou selected: Laptop stand\nPrice: $30\nEnter quantity: ");
                        temp = scan.nextInt();
                        if (temp <= 0) {System.out.print("\nInvalid quantity. Quantity must be more than zero."); break;}
                        count += temp;
                        temp *= 30;
                        laptop_stand += temp;
                        total += temp;
                        System.out.print("\n" + temp + " x 30$ = $" + temp + "\nAdded to cart!\nCurrent total is $" + total);
                        break;
                    case 5:
                        System.out.print("\nSubtotal: $"+total);
                        totaltotal = total;
                        discount = total * 0.10;
                        if (total>=100){
                            System.out.print("Discount: $" + (discount));
                            total*=0.90;
                        }else System.out.print("Discount: $0");
                        System.out.print("\nFinal total: $" + total);
                        command = -5;
                        break;
                    default:
                        break;
                }
            }else System.out.print("\nEnter valid option 1-5.");

        }
        double payment = 0;
        double change = 0;
        while(command != -10){
            System.out.print("\nEnter payment amount: ");
            payment += scan.nextInt();
            if (payment > total || payment == total) {
                change = payment > total ? payment - total : 0;
                System.out.print("\nPayment succesful!\nChange: $" + (change));
                command = -10;
            }
            else System.out.print("\nInsufficient payment. You still need to pay $" + (total - payment) + ".");
        }

        System.out.print("\n========================\nSIMPLE STORE\n========================\nItems purchased: " + count + "\nSubtotal: $" + totaltotal + "\nDiscount: $" + discount + "\nFinal total: $" + total + "\nPayment: $" + payment + "\nChange: $" + change + "\n========================\nThank you for shopping!\n========================\n");

        scan.close();
    }
    
}
