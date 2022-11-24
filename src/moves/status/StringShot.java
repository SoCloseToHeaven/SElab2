package moves.status;

import ru.ifmo.se.pokemon.*;

/**
 * @author Dmitri Lyanguzov
 */
public class StringShot extends StatusMove {

    public StringShot() {
        super(Type.BUG, 0, 95);
    }

    @Override
    protected String describe() {
        return "использует String Shot.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int statDifference = -2;
        Effect stringShotEffect = new Effect().stat(Stat.SPEED, statDifference);
        pokemon.addEffect(stringShotEffect);
    }
}
