package moves.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class IronHead extends PhysicalMove {
    public IronHead() {
        super(Type.STEEL, 80, 100);
    }

    @Override
    protected String describe() {
        return "использует Iron Head.";
    }

    @Override
    protected void applyOppEffects(Pokemon oppositePokemon) {
        double chanceOfEffect = 0.3;
        if (Math.random() <= chanceOfEffect)
            Effect.flinch(oppositePokemon);
    }
}
