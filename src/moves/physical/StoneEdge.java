package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import java.util.Random;

/**
 * @author Dmitri Lyanguzov
 */
public class StoneEdge extends PhysicalMove {

    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected String describe() {
        return "использует Stone Edge.";
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        Random random = new Random();
        double randomChance = random.nextDouble();
        double criticalHitChance = 1.0/8;
        return (randomChance <= criticalHitChance) ? 2.0 : 1.0;
    }
}
