public class AquaMonster extends DigitalMonster{

    public AquaMonster (String name, int level, String element){
        super(name, level, "Water");
    }

    @Override
    public void performAttack() {
        int waterDamage = getLevel() * 10;
        System.out.println(getName() + " is a level: " + getLevel() +
                " and uses attack Tidal Surge!" + getElement() + " dealt "
                + waterDamage + " damage.");
    }
}
