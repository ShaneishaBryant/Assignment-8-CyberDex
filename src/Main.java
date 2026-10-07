public class Main {
    static void main(String[] args) {
        //instantiate concrete subclasses
        DigitalMonster charmander = new FlameMonster("Charmander", 55, "fire");
        DigitalMonster squirtle = new AquaMonster("Squirtle", 56, "water");

        //call their attack methods
        charmander.performAttack();
        squirtle.performAttack();
    }
}
