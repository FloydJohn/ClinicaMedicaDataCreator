import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Persona {
    @Override
    public String toString() {
        String out = "";
        Random random = new Random();
        out +=capitalize(getRandomLine("nomi.txt"));
        out += getRandomLine("cognomi.txt");
        out += getRandomLine("provincie.txt");
        //Numero tel
        for (int i = 0; i < 10; i++) out += random.nextInt(10);
        out += "\n";
        //Codice fiscale
        for (int i = 0; i < 6; i++) out += (char)(random.nextInt(26) + 'A');
        out += random.nextInt(99) + 1;
        out += (char)(random.nextInt(26) + 'A');
        out += random.nextInt(99) + 1;
        out += (char)(random.nextInt(26) + 'A');
        out += random.nextInt(999) + 1;
        out += (char)(random.nextInt(26) + 'A');
        out += "\n";
        //Data di nascita
        for (int i = 0; i < 3; i++) out += (random.nextInt(31) + 1) + (i != 2 ? "/" : "\n");
        //Sesso
        if (random.nextInt() % 2 == 0) out += "Maschio";
        else out += "Femmina";
        out += "\n";
        return out;
    }

    public String getRandomLine (String file) {
        Random random = new Random();
        try (Scanner in = new Scanner(new InputStreamReader(getClass().getResourceAsStream(file)))) {
            LinkedList<String> fileLines = new LinkedList<>();
            while (in.hasNextLine()) fileLines.add(in.nextLine());
            return fileLines.get(random.nextInt(fileLines.size()-1)) + "\n";
        }
    }

    public String capitalize(String in) {
        String prima = in.substring(0, 1);
        String ultime = in.substring(1, in.length());
        return prima.toUpperCase() + ultime;
    }
}
