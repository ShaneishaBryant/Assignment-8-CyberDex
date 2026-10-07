import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //array list to hold monsters
        ArrayList<DigitalMonster> roster = new ArrayList<>();

        //add to monsters to array
        roster.add(new FlameMonster("Charmander", 55, "fire"));
        roster.add(new FlameMonster("Charizard", 65, "fire"));
        roster.add(new AquaMonster("Squirtle", 56, "water"));
        roster.add(new AquaMonster("Zapdos", 35, "water"));

        //for each loop to iterate through array and call performAttack
        System.out.println("-------The Cyber-Dex-------");
        System.out.println("=====The digital encyclopedia for monsters.====");
        for(DigitalMonster monster : roster){
            monster.performAttack();
        }

        /*instantiate concrete subclasses
        DigitalMonster charmander = new FlameMonster("Charmander", 55,"fire");
        DigitalMonster squirtle = new AquaMonster("Squirtle", 56, "water");

        //declared zapdos as aquamonster
        AquaMonster zapdos = new AquaMonster("Zapdos", 35, "water");

        call their attack methods
        charmander.performAttack();
        squirtle.performAttack();

        //call new interface ability methods
        zapdos.shock();
        zapdos.fly();*/

    }
}
