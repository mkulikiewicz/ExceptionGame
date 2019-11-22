import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class GetExceptionFromFile {

    private HashMap<String, String> exceptionList = new HashMap<>();
    private String fileName;


    GetExceptionFromFile(String fileName) throws IOException {
        this.fileName = fileName;
        addToExceptionFromFileToMap();
    }

    HashMap<String, String> getMap() {
        return exceptionList;
    }

    private void addToExceptionFromFileToMap() throws IOException {
        CSVReader reader = new CSVReader(new FileReader(fileName));
        String[] header = reader.readNext();

        for (String[] line : reader) {
            exceptionList.put(line[0], line[1]);
        }
    }

}
