import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/InputData.txt");
        FileReader fin = new FileReader(inputFile);
        BufferedReader reader = new BufferedReader(fin);

        File outputFile = new File("src/OutputData.txt");
        FileWriter fout = new FileWriter(outputFile);

        if (inputFile.isFile()) {
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split("[ ,]");
                for (String word : words) {
                    if (word.startsWith("a") || word.startsWith("A")) {
                        fout.write(word + " ");
                    };
                }
                line = reader.readLine();
            }
        }
        fin.close();
        fout.close();
    }
}

