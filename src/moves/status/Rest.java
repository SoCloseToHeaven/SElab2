package moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class Rest extends StatusMove {

    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует Rest.";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        Effect restSleep = new Effect().turns(2).attack(0);
        pokemon.addEffect(restSleep);
    }
}
