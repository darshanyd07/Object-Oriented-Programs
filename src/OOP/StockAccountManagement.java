package OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        StockPortfolio p = new StockPortfolio();

        while (flag == 0)
        {
            System.out.println("Enter the details of Stock ");
            StockPortfolio.Stock s = new StockPortfolio.Stock();
            System.out.println("Enter Stock names:");
            s.company = sc.nextLine();
            System.out.println("Enter number of share:");
            s.NoOfShare = sc.nextInt();
            System.out.println("Enter Price of share:");
            s.price = sc.nextDouble();
            p.portf.add(s);
            System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO");
            flag = sc.nextInt();
        }


        for (int i = 0; i < p.portf.size(); i++)
        {
            System.out.println("Total value of Stock :- "+p.totalValue());
            System.out.println("----------------------------------------");
        }
    }
}

