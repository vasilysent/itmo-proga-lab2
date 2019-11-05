import ru.ifmo.se.pokemon.*;

public class Zapdos extends Pokemon {
    public Zapdos(String name, int level){
        super(name, level);
        setStats(90, 90, 85, 125, 90, 100);
        setType(Type.ELECTRIC, Type.FLYING);
        setMove(new AcidSpray(), new AuroraBeam(), new Confide(), new Scald());
    }
}

class AcidSpray extends SpecialMove{
    public AcidSpray(){
        super(Type.POISON, 40.0, 1.0);
    }
  //  @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_DEFENSE,-2);
    }
    protected String describe(){
        return "attacks with Acid Spray";
    }
}
class AuroraBeam extends SpecialMove {
    public AuroraBeam() {
        super(Type.ICE, 65.0, 1.0);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1)
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
    protected String describe(){
        return "attacks with Aurora Beam";
    }
}
class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0.0, 0.0);
    }
    @Override
    protected void applyOppEffects (Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK,-1);
    }
    protected String describe(){
        return "attacks with Confide";
    }
}
class Scald extends SpecialMove {
    public Scald() {
        super(Type.WATER, 80.0, 1.0);
    }


    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.3) {
            Effect.burn(p);
        }
    }
    @Override
    protected String describe(){
        return "attacks with Scald";
    }
}