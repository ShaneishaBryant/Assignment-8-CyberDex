public abstract class DigitalMonster {
    private String name;
    private int level;
    private String element;

    public DigitalMonster(){

    }

    public DigitalMonster(String name, int level, String element){
        this.name = name;
        this.level = level;
        this.element = element;
    }

    public String getName(){return name;}
    public int getLevel(){return level;}
    public String getElement(){return element;}

    public void setName(String name){this.name = name;}
    public void setLevel(int level){this.level = level;}
    public void setElement(String element){this.element = element;}

    //abstract method
    public abstract void performAttack();

}
