public class AquaMonster extends DigitalMonster implements Electric, Flyable{

    public AquaMonster (String name, int level, String element){
        super(name, level, "Water");
    }

    @Override
    public void performAttack() {
        int waterDamage = getLevel() * 10;
        System.out.println(getName() + " is a level " + getLevel() +
                " and uses attack Tidal Surge! " + getElement() + " dealt "
                + waterDamage + " damage.");
    }

    @Override
    public void shock() {
        System.out.println(getName() + " shots a powerful electric shock wave.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " jumps high into the sky!");
    }
}
