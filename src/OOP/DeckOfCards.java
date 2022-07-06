package OOP;
import java.util.Scanner;
public class Account
{
    private double balance;
    public Account ( double initialBalance )
        {
            if ( initialBalance > 0.0 )
                balance = initialBalance;
        }


        public void credit( double amount )
        {
            balance = balance + amount;	// add amount to balance
        }
        public void debit( double debitAmount )
        {
            if (debitAmount > balance)
            {
                debitAmount = 0.0;
                System.out.println( "Debit amount exceeded account balance." );
            }
            balance = balance - debitAmount;
        }


        public double getBalance()
        {
            return balance;
        }

    public static void main(String[] darsh)
    {
        Account account1 = new Account( 50.00 );
        Account account2 = new Account( 70.53 );

        System.out.println("------------ Welcome In Darsh Bank -------------");
        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );


        Scanner input = new Scanner ( System.in );
        double withdrawAmount;

        System.out.print( "Enter debit amount for account1: " );
        withdrawAmount = input.nextDouble();

        System.out.printf("\ndeducting %.2f from account1 balance\n\n", withdrawAmount );
        account1.debit(withdrawAmount); // deduct from account1 balance


        System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );

        System.out.print( "Enter withdraw amount for account2: "); // prompt
        withdrawAmount = input.nextDouble(); // obtain user input

        System.out.printf( "\ndeducting %.2f from account2 balance\n\n", withdrawAmount );
        account2.debit( withdrawAmount ); //deduct from account2 balance


        System.out.printf( "Account1 Balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 Balance: $%.2f\n", account2.getBalance() );
        System.out.println("----------------------------");
    }
}

