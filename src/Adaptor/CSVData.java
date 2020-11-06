package Adaptor;

import java.util.ArrayList;
import java.util.List;

public class CSVData {
    private List<List<String>> rows = new ArrayList<>();
    public void AddRow(List<String> row) {
        rows.add(row);
    }

    public List<List<String>> getCSV() {
        return rows;
    }
}
