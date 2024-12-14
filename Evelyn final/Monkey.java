class Monkey extends Animal {
    private int groomingCount;

    public Monkey(String name, int health, int groomingCount) {
        super(name, health);
        this.groomingCount = groomingCount;
    }

    public void groom(Animal animal) {
        System.out.println(getName() + " the monkey grooms " + animal.getName());
        animal.eat();
        groomingCount++;
    }

    @Override
    public String toString() {
        return super.toString() + ", Grooming Count: " + groomingCount;
    }
}