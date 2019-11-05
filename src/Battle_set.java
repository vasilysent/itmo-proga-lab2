import ru.ifmo.se.pokemon.*;

public class Battle_set
{
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new Zapdos("Kiril", 1); //add levels
        Pokemon p2 = new Pokemon("Jenya", 1);
        Pokemon p3 = new Crabominable("Lyoha", 1);
        Pokemon p4 = new Gible("Piotr", 1);
        Pokemon p5 = new Gabite("Andrey", 1);
        Pokemon p6 = new Garchomp("Arkadiy", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}