import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvWriter {
    public void write(List<String[]> dataLines, String filename) throws IOException {
        File csvOutputFile = new File(filename);
        try (FileWriter fw = new FileWriter(csvOutputFile, true)) {
            for (String[] data : dataLines) {
                for (int i = 0; i < data.length; i++) {
                    fw.write(escapeSpecialCharacters(data[i]) + ";");
                }
                fw.write("\n");
            }
            fw.close();
        }
    }

    private String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
}
