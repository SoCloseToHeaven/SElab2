package moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class IceBeam extends SpecialMove {

    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует Ice Beam.";
    }

    @Override
    protected void applyOppEffects(Pokemon oppositePokemon) {
        double chanceOfEffect = 0.1;
        if (Math.random() <= chanceOfEffect)
            Effect.freeze(oppositePokemon);
    }
}
