import ru.ifmo.se.pokemon.*;

public class Crabrawler extends Pokemon {
    public Crabrawler(String name, int level){
        super(name, level);
        setStats(47, 82, 57, 42, 47, 63);
        setType(Type.FIGHTING);
        setMove(new Facade(), new Rest(), new Swagger());
    }
}
class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70.0, 1.0);
    }
    @Override
    /*protected void applySelfEffects(Pokemon p) { // power needed to be doubled, if opp is burned...
        if (p.getCondition() == Status.BURN || p.getCondition() == Status.PARALYZE || p.getCondition() == Status.POISON){

        }
    }*/
    protected String describe(){
        return "attacks with Facade";
    }
}
class Rest extends PhysicalMove {
    public Rest() {
        super(Type.PSYCHIC, 0.0, 0.0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(2);
        e.sleep(p);
        p.setCondition(e);
        p.restore();
    }
    @Override
    protected String describe(){
        return "doing Rest";
    }

}
class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0.0, 85.0);
    }
    //@Override
    protected void applyOppEffects(Pokemon p) { //mb add probabilities

        p.setMod(Stat.ATTACK,+2);
        Effect.confuse(p);
        /*Effect e = new Effect().turns(4);
        p.setCondition(e);*/
    }
    protected String describe(){
        return "attacks with Swagger";
    }
}
