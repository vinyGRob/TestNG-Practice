package config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	
	public static List<String> getValuesFromCSV() {
		List<String> operationValues = new ArrayList<String>();
		String csvFile = "operationTestData.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
			    String[] field = line.split(cvsSplitBy);
			    operationValues.add(field[0]);
			    operationValues.add(field[1]);
			    operationValues.add(field[2]);
			    operationValues.add(field[3]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return operationValues;
	  }
}