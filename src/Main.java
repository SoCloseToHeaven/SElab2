import pokemons.*;
import ru.ifmo.se.pokemon.*;

/**
 * @author Dmitri Lyanguzov
 */
public class Main {
    public static void main(String[] args) {





        Battle b = new Battle();
        Pokemon p1 = new Baltoy("Диман", 42);
        Pokemon p2 = new Bouffalant("Свят", 21);
        Pokemon p3 = new Claydol("Андрей", 71);
        Pokemon p4 = new Sewaddle("Цопа", 4);
        Pokemon p5 = new Swadloon("Белозубов", 4);
        Pokemon p6 = new Leavanny("Клименков",4);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        try {
            b.go();
        } catch (NullPointerException e) {
            System.out.println("You're doing something wrong, so battle won't work :)");
        }
    }
}
