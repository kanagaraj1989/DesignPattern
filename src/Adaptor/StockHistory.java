package Adaptor;

import java.util.List;

public class StockHistory implements IStockHistory {
    private List<Stock> stockList;

    public StockHistory(List<Stock> stockList) {
        this.stockList = stockList;
    }

    @Override
    public List<Stock> getHistoryData() {
        return stockList;
    }

    @Override
    public void updateHistoryData() {
        System.out.println("updateHistoryCalled");
    }
}
