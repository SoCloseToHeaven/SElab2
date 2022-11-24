package pokemons;

import moves.physical.Facade;
import moves.physical.StoneEdge;
import moves.special.IceBeam;
import moves.special.Psychic;
import ru.ifmo.se.pokemon.Type;

/**
 * @author Dmitri Lyanguzov
 */
public class Claydol extends Baltoy {

    public Claydol(String name, int level) { // standart constructor
        super(name, level);
        this.setStats(60, 70, 105, 70, 120, 75);
        this.setType(Type.GROUND, Type.PSYCHIC);
        this.setMove(new Psychic(), new IceBeam(), new Facade(), new StoneEdge());
    }
}
