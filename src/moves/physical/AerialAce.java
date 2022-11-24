package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class AerialAce extends PhysicalMove {

    public AerialAce() {
        super(Type.FLYING, 60, Double.MAX_VALUE);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true; // Accuracy of attack is infinite, so Pokemon can't this attack can't be missed.
    }

    @Override
    protected String describe() {
        return "использует Aerial Ace";
    }
}
