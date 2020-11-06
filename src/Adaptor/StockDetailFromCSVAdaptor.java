package Adaptor;

import java.util.ArrayList;
import java.util.List;

public class StockDetailFromCSVAdaptor implements IStockHistory{
    private CSVFileReader csvFileReader;
    public StockDetailFromCSVAdaptor(CSVFileReader csvFileReader) {
        // Need to set source obj (ASW s3), api-key, valid path
        this.csvFileReader = csvFileReader;
    }

    @Override
    public List<Stock> getHistoryData() {

        var rows = csvFileReader.readFile();
        List<Stock> stocks = new ArrayList<Stock>();
        var data = rows.getCSV();
        for(int i=0; i<data.size(); i++) {
            var stock = new Stock();
            stocks.add(stock);
            var row = data.get(i);
            for(int j=0; j<row.size(); j++) {
                switch (j) {
                    case 0:
                        stock.id = row.get(j);
                        break;
                    case 1:
                        stock.name = row.get(j);
                        break;
                    case 2:
                        stock.open = Double.parseDouble(row.get(j));
                        break;
                    case 3:
                        stock.close = Double.parseDouble(row.get(j));
                        break;
                    case 4:
                        stock.high = Double.parseDouble(row.get(j));
                        break;
                    case 5:
                        stock.low = Double.parseDouble(row.get(j));
                        break;

                }
            }
        }
        return stocks;
    }

    @Override
    public void updateHistoryData() {

    }
}
