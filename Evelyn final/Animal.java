class Animal {
    private String name;
    private int health;

    public Animal(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void eat() {
        this.health += 10;
        System.out.println(name + " eats and restores health. Health is now: " + health);
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name + " takes " + damage + " damage. Health is now: " + health);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Health: " + health;
    }
}