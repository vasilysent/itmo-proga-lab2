import ru.ifmo.se.pokemon.*;

public class Gible extends Pokemon {
    public Gible(String name, int level){
        super(name, level);
        setStats(58, 70, 75, 40, 45, 42);
        setType(Type.DRAGON, Type.GROUND);
        setMove(new Confide(), new Swagger());
    }
}
