package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    private Map<String, String> options;

    public Recaudacion(Map<String, String> options ){
        this.options= options;
    }
    public List<Map<String, String>> metodo()
            throws IOException {

        List<String[]> csvData = LibroRecaudacion.leerCsv();

        if (options.containsKey("company_name")) {
            csvData = getRow(csvData, 1, options, "company_name");
        }

        if (options.containsKey("city")) {
            csvData = getRow(csvData, 4, options, "city");
        }

        if (options.containsKey("state")) {
            csvData = getRow(csvData, 5, options, "state");
        }

        if (options.containsKey("round")) {
            csvData = getRow(csvData, 9, options, "round");
        }

        return toMapList(csvData);
    }

    private List<Map<String, String>> toMapList(List<String[]> csvData) {
        List<Map<String, String>> output = new ArrayList<Map<String, String>>();

        for (int i = 0; i < csvData.size(); i++) {
            Map<String, String> mapped = new HashMap<String, String>();
            mapped.put("permalink", csvData.get(i)[0]);
            mapped.put("company_name", csvData.get(i)[1]);
            mapped.put("number_employees", csvData.get(i)[2]);
            mapped.put("category", csvData.get(i)[3]);
            mapped.put("city", csvData.get(i)[4]);
            mapped.put("state", csvData.get(i)[5]);
            mapped.put("funded_date", csvData.get(i)[6]);
            mapped.put("raised_amount", csvData.get(i)[7]);
            mapped.put("raised_currency", csvData.get(i)[8]);
            mapped.put("round", csvData.get(i)[9]);
            output.add(mapped);
        }
        return output;
    }

    private List<String[]> getRow(List<String[]> csvData, int x, Map<String, String> options, String company_name) {
        List<String[]> results = new ArrayList<String[]>();
        for (int i = 0; i < csvData.size(); i++) {
            if (csvData.get(i)[x].equals(options.get(company_name))) {
                results.add(csvData.get(i));
            }
        }
        csvData = results;
        return csvData;
    }
}
