package lab2.challenge1;

public class Human {
    private String name;
    private int health;

    public Human(int health, String humanName){
        this.health=health;
        this.name=humanName;
    }

    public int getHealth(){return health;}

    public String getName(){return name;}

    public void decreaseHealth(int damage){
        health=health-damage;

    }

}
