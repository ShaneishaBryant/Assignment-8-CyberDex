public class Main {
    public static void main(String[] args) {
        //instantiate concrete subclasses
        DigitalMonster charmander = new FlameMonster("Charmander", 55,"fire");
        DigitalMonster squirtle = new AquaMonster("Squirtle", 56, "water");

        //declared zapdos as aquamonster
        AquaMonster zapdos = new AquaMonster("Zapdos", 35, "water");

        //call their attack methods
        charmander.performAttack();
        squirtle.performAttack();

        //call new interface ability methods
        zapdos.shock();
        zapdos.fly();

    }
}
