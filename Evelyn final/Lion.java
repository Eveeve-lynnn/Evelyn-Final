class Lion extends Animal {
    private int strength;

    public Lion(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    public void hunt(Animal prey) {
        System.out.println(getName() + " the lion hunts " + prey.getName());
        prey.takeDamage(strength);
    }

    @Override
    public void eat() {
        setHealth(getHealth() + 15);
        System.out.println(getName() + " the lion eats and gains extra health!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Strength: " + strength;
    }
}