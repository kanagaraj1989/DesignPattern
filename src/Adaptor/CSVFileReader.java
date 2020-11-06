package Adaptor;

import java.util.ArrayList;
import java.util.List;

public class CSVFileReader implements FileReader<CSVData> {
    @Override
    public CSVData readFile() {
        // source - assume it is AWS S3, path - any valid S3 bucket
        CSVData data = new CSVData();
        List<String> rowOne = new ArrayList<>();
        rowOne.add("_id#1");
        rowOne.add("reliance");
        rowOne.add("10.50");
        rowOne.add("15.20");
        rowOne.add("17");
        rowOne.add("10");

        List<String> rowTwo = new ArrayList<>();
        rowTwo.add("_id#1");
        rowTwo.add("reliance");
        rowTwo.add("11.50");
        rowTwo.add("16.20");
        rowTwo.add("18");
        rowTwo.add("10");

        data.AddRow(rowOne);
        data.AddRow(rowTwo);

        return data;
    }

    @Override
    public void updateFile(CSVData csvData) {
        System.out.println("updateCSVFile called");
    }
}
