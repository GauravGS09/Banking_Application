package banking;

public interface RBIBankinterface {


    public String addMoney(int money);

    public String withdrawMoney(int money,String password);

    public String checkBalance(String password);

    public Double calculateTotalInterest(int time) ;

}
