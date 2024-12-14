class Zebra extends Animal {
    private int speed;

    public Zebra(String name, int health, int speed) {
        super(name, health);
        this.speed = speed;
    }

    public void runFromPredator() {
        System.out.println(getName() + " the zebra runs away from danger!");
        speed += 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}