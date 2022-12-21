package com.ea.framework.utilities;

import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CucumberUtil {


    private static List<DataCollection> _dataCollection = new ArrayList<>();


    public static List<DataCollection> ConvertDataTableToDict(DataTable table) {
        _dataCollection.clear();

        var data = table.asList();

        int rowNumber = 0;

        for (String col : data) {
            _dataCollection.add(rowNumber, new DataCollection(data.get(2), data.get(3), rowNumber));


            rowNumber++;
        }

        return _dataCollection;

    }

    public static String GetCellValueWithRowIndex(String columnName, int rowNumber) {
        final String[] columnValue = {null};
        _dataCollection.forEach(x -> {
            if(x.ColumnName.equals(columnName) && x.RowNumber == rowNumber){
                columnValue[0] = x.ColumnValue;
            }
        });
        return columnValue[0];
    }

    private static class DataCollection {
        private String ColumnName;
        private String ColumnValue;
        private int RowNumber;

        public DataCollection(String columnName, String columnValue, int rowNumber) {
            ColumnName = columnName;
            ColumnValue = columnValue;
            RowNumber = rowNumber;
        }
    }

    public static synchronized Map<String, String> TableDictionaryConverter(List<List<String>> data) {
        Map<String, String> mapTable = new HashMap<String, String>();
        for(List<String> rows: data) {
            mapTable.put(rows.get(0), rows.get(1));
        }
        return mapTable;
    }

}



