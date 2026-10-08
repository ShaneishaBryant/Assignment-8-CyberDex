public class FlameMonster extends DigitalMonster {

    public FlameMonster(String name, int level){
        super(name, level, "Fire");
    }

    @Override
    public void performAttack(){
        int fireDamage = getLevel() * 20;
        System.out.println(getName() + " is a level " + getLevel() +
                " and attacks with a bursting flame! " + " " +
                getElement() + " dealt " + fireDamage + " damage.");
    }

}
