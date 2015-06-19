import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) System.err.println("Usage : creator.jar NUM_PAZIENTI NUM_MEDICI");
        try (FileWriter writer = new FileWriter(new File("clinica.dat"))){
            for (int i = 0; i < Integer.parseInt(args[0]); i++) writer.write(new Paziente().toString());
            for (int i = 0; i < Integer.parseInt(args[1]); i++) writer.write(new Medico().toString());
            writer.write("CALENDARIO\nNON_IMPLEMENTATO");
            writer.close();
            System.out.println("DONE!");
        } catch (IOException e) {
            System.err.println("Could not open clinica.dat");
        }

    }
}
