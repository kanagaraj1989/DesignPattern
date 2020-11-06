package Adaptor;

import java.util.List;

public interface IStockHistory {
    public List<Stock> getHistoryData();
    public void updateHistoryData();
}
