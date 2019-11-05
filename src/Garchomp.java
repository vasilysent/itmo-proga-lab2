import ru.ifmo.se.pokemon.*;

public class Garchomp extends Gabite {
    public Garchomp(String name, int level){
        super(name, level);
        setStats(108, 130, 95, 80, 85, 102);
        setType(Type.DRAGON, Type.GROUND);
        setMove(new Confide(), new Swagger(), new IcyWind(), new Scald());
    }
}
