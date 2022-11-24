package pokemons;

import moves.physical.AerialAce;
import moves.physical.HornAttack;
import moves.physical.IronHead;
import moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class Bouffalant extends Pokemon {

    public Bouffalant(String name, int level) {
        super(name, level);
        this.setMove(new IronHead(), new AerialAce(), new HornAttack(), new Rest());
        this.setStats(95, 110, 95, 40, 95, 55);
        this.setType(Type.NORMAL);
    }
}
