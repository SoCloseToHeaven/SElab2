package pokemons;

import moves.status.CalmMind;
import moves.status.StringShot;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


/**
 * @author Dmitri Lyanguzov
 */
//
public class Sewaddle extends Pokemon {
    public Sewaddle(String name, int level) {
        super(name, level);
        this.setMove(new CalmMind(), new StringShot());
        this.setStats(45, 53, 70, 40, 60, 42);
        this.setType(Type.BUG, Type.GRASS);
    }

}
