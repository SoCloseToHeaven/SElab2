package moves.special;

import ru.ifmo.se.pokemon.*;


public class Psychic extends SpecialMove {

    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected String describe() {
        return "использует Psychic";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int statDifference = -1;
        Effect psychicEffect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, statDifference);
        pokemon.addEffect(psychicEffect);
    }
}
