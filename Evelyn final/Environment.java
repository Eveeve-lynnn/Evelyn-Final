class Environment {
    private String type;

    public Environment(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void affectAnimal(Animal animal) {
        if (type.equals("Desert")) {
            animal.takeDamage(10);
            System.out.println(animal.getName() + " is affected by the harsh desert.");
        } else if (type.equals("Forest")) {
            animal.eat();
            System.out.println(animal.getName() + " thrives in the lush forest.");
        }
    }
}