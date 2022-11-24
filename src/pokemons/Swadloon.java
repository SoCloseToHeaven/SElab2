package pokemons;


import moves.status.GrassWhistle;

/**
 * @author Dmitri Lyanguzov
 */

public class Swadloon extends Sewaddle {
    public Swadloon(String name, int level) {
        super(name, level);
        this.addMove(new GrassWhistle());
        this.setStats(55, 63, 90, 50, 80, 42);
        //this.setType(Type.BUG, Type.GRASS);
    }
}
