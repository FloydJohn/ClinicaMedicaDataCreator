import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Medico extends Persona {

    public enum Specializzazione {
        Ortopedia, Chirurgia, Otorino, Oculista, Neurologia, Pediatria, Geriatria, Cardiologia, Nefrologia
    }

    @Override
    public String toString() {
        String out = "MEDICO\n";
        out += super.toString();
        Random random = new Random();
        out += "ID" + random.nextInt() + "\n";
        if (random.nextInt() % 2 == 0) {
            //Generale
            out += "Generale\n";
        }
        else {
            //Specializzato
            ArrayList<Specializzazione> possible = new ArrayList<>(Arrays.asList(Specializzazione.values()));
            for (int i = 0; i < random.nextInt(5); i++) {
                Specializzazione s = possible.remove(random.nextInt(possible.size()));
                out += s.name() + "\n";
            }
        }
        return out;
    }
}
