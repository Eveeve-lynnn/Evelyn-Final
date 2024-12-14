class Elephant extends Animal {
    private int alertLevel;

    public Elephant(String name, int health, int alertLevel) {
        super(name, health);
        this.alertLevel = alertLevel;
    }

    public void warnOthers() {
        System.out.println(getName() + " the elephant warns other animals.");
        alertLevel += 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", Alert Level: " + alertLevel;
    }
}