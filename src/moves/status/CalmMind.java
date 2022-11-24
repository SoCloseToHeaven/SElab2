package moves.status;

import ru.ifmo.se.pokemon.*;

/**
 * @author Dmitri Lyanguzov
 */
public class CalmMind extends StatusMove {

    public CalmMind() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe() {
        return "использует Calm Mind";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        int statDifference = 1;
        Effect calmMindBuff = new Effect()
                .stat(Stat.SPECIAL_ATTACK, statDifference)
                .stat(Stat.SPECIAL_DEFENSE, statDifference);
        pokemon.addEffect(calmMindBuff);
    }
}
