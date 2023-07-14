package banking;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Which bank you want to open an account");
        System.out.println("Print 1 to create in Lotak and 2 to create in SBI");
        Scanner sc = new Scanner(System.in);

        int option=sc.nextInt();
        System.out.println("Enter password and initial deposit");
        String password=sc.next();
        Integer initialBalance = sc.nextInt();
        double account =Math.abs(Math.random()*Math.pow(10,9));
        String stringVersion =String.valueOf(account);
        RBIBankinterface bankAccount;

        if(option==1){
            bankAccount=new LotakBank(stringVersion,password,initialBalance);
        }else{
                bankAccount=new SBIBank(stringVersion,password,initialBalance);
        }

        String result = bankAccount.withdrawMoney(700000,"abc123");
        System.out.println(result);
          result = bankAccount.withdrawMoney(70000,"abc123");

        //deposit Money :70000

        result = bankAccount.addMoney(70000);
        System.out.println(result);
        System.out.println(bankAccount.checkBalance("abc123"));

        System.out.println(bankAccount.calculateTotalInterest(3));
    }
}