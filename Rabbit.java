package rabbits;
public class Rabbit {

    private String name;
    private String species;
    private boolean available;

    public Rabbit(String newName, String newSpecies) {
        this.name = newName;
        this.species = newSpecies;
        this.available = true;
    }

    public String getName() {
        return this.name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public void setAvailable(boolean availability) {
        this.available = availability;
    }

    @Override
    public String toString() {
        return String.format("Rabbit (%s): %s", this.species, this.name);
    }
}
