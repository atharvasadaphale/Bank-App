import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your Name, Password & balance");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        String password= sc.next();
        double balance=sc.nextDouble();

        sbiUser user = new sbiUser(name, balance, password);
        //add
        String message=user.addMoney(100000);
        System.out.println(message);
        //withdrawing amount

        System.out.println("enter money");
        int money= sc.nextInt();
        System.out.println("enter password");
        String pass=sc.next();
        System.out.println(user.withdraw(money,pass ));
        System.out.println("hello");
    }
}