package pokemons;

import moves.physical.Facade;
import moves.special.IceBeam;
import moves.special.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class Baltoy extends Pokemon {

    public Baltoy(String name, int level) {
        super(name, level);
        this.setMove(new Psychic(), new IceBeam(), new Facade());
        this.setStats(40,40, 55, 40, 70, 55);
        this.setType(Type.GROUND, Type.PSYCHIC);
    }
}
