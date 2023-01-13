public interface bankinterface {
    double checkbalance();
    String addMoney(int amount);
    String withdraw(int amount, String Password);
    double calculateIntrest(int years);
}
