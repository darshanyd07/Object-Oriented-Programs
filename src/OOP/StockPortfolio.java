package OOP;

import java.util.ArrayList;

class StockPortfolio
{
    ArrayList<Stock> portf = new ArrayList<>();
    double totalValue = 0;

    static class Stock
    {
        int NoOfShare;
        String company;
        double price;
    }

    public double totalValue()
    {
        for (Stock stock : portf)
        {
            totalValue = stock.price * stock.NoOfShare;
        }
        return totalValue;
    }
}