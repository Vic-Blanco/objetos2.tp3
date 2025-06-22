package oop2.tp3.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class LibroRecaudacion {

    public static List<String[]> leerCsv() throws IOException {
    List<String[]> csvData = new ArrayList<String[]>();
    CSVReader reader = new CSVReader(new FileReader("src/main/resources/data.csv"));
    String[] row = null;

    while((row =reader.readNext())!=null) {
        csvData.add(row);
    }

    reader.close();
    csvData.remove(0);
    return csvData;
    }

}
