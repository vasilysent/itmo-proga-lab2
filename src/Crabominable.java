import ru.ifmo.se.pokemon.*;

public class Crabominable extends Crabrawler {
    public Crabominable(String name, int level){
        super(name, level);
        setStats(97, 132, 77, 62, 67, 43);
        setType(Type.FIGHTING, Type.ICE);
        setMove(new Facade(), new Rest(), new Swagger(), new Twister());
    }
}
class Twister extends SpecialMove{
    public Twister(){
        super(Type.DRAGON, 40.0, 1.0);
    }
    @Override
    protected void applyOppEffects (Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.flinch(p);
        }
    }
}