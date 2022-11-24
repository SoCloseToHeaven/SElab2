package moves.status;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class GrassWhistle extends StatusMove {

    public GrassWhistle() {
        super(Type.GRASS, 0, 55);
    }

    @Override
    protected String describe() {
        return "использует Grass Whistle.";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.sleep(pokemon);
    }
}
