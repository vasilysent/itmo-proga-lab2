import ru.ifmo.se.pokemon.*;

public class Gabite extends Gible {
    public Gabite(String name, int level){
        super(name, level);
        setStats(68, 90, 65, 50, 55, 82);
        setType(Type.DRAGON, Type.GROUND);
        setMove(new Confide(), new Swagger(), new IcyWind());
    }
}
class IcyWind extends SpecialMove {
    public IcyWind() {
        super(Type.ICE, 55.0, 95.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.SPEED, -1);
    }
    protected String describe(){
        return "attacks with Icy Wind";
    }
}