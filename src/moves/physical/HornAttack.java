package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class HornAttack extends PhysicalMove {

    public HornAttack() {
        super(Type.NORMAL, 65, 100);
    }

    @Override
    protected String describe() {
        return "использует Horn Attack.";
    }
}
