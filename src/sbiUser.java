import java.util.Objects;
import java.util.UUID;

public class sbiUser implements bankinterface {
    String name;
    String AccNo;
    double balance;
    String password;
    private static double rateOfIntrest;

    public sbiUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        //bank Initialising
        this.rateOfIntrest=6.5;
        this.AccNo= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccNo() {
        return AccNo;
    }

    public void setAccNo(String accNo) {
        AccNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public static void setRateOfIntrest(double rateOfIntrest) {
        sbiUser.rateOfIntrest = rateOfIntrest;
    }

    @Override
    public double checkbalance() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "Balance Updated to "+ balance;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Insufficent Funds";
            }
            else{
                balance=balance-amount;
                return ("Amount deducted "+balance);
            }
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateIntrest(int years) {
        double intrest = (balance*years*rateOfIntrest)/100;
        return intrest;
    }
}
