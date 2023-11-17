package Atm;


import java.io.*;
public class program
{
    public static void main(String args[] )throws Exception
    { 
        int balance = 5000, withdraw, deposit,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
        	System.out.println("THE SRI BANK WELCOMES YOU HAPPILY ");
        	System.out.println(" ");
            System.out.println(" Automated Teller Machine ");
            System.out.println(" Choose 1 for Withdraw ");
            System.out.println(" Choose 2 for Deposit ");
            System.out.println(" Choose 3 for Check Balance ");
            System.out.println(" Choose 4 for EXIT ");
            System.out.print(" Choose the operation you want to perform: ");
            n = Integer.parseInt(br.readLine());
            switch(n)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = Integer.parseInt(br.readLine());
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = Integer.parseInt(br.readLine());
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                System.exit(0);
            }
        }
    }
}
