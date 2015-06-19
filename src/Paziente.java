import java.util.Random;

public class Paziente extends Persona {
    @Override
    public String toString() {
        Random random = new Random();
        return "PAZIENTE\n" + super.toString() + (random.nextInt(100)+120) + "\n" + (random.nextInt(100)+30) + "\n";
    }
}
