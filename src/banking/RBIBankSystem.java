package banking;

public interface RBIBankSystem {

    public String addMoney(int money);

    public String withDrawMoney(int money, String password);

    public String CheckBalance(String password);

    public Double CalculateTotalInterest(int time);

}
