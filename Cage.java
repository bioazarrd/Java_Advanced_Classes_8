package rabbits;
import java.util.ArrayList;
import java.util.List;

public class Cage {

    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Rabbit newRabbit) {
        if (this.data.size() < capacity) {
            this.data.add(newRabbit);
        }
    }

    public void removeRabbit(String name) {
        for (Rabbit currRabbit : data) {
            if (currRabbit.getName().equals(name)) {
                System.out.println("true");
            }
        }
        System.out.println("false");
    }

    public void removeSpecies(String species)  {
        for (Rabbit currRabbit : data) {
            if (currRabbit.getSpecies().equals(species)) {
                data.remove(currRabbit);
            }
        }
    }

    public Rabbit sellRabbit(String name) {
        Rabbit toReturn = null;
        for (Rabbit currRabbit : data) {
            if (currRabbit.getName().equals(name) && currRabbit.isAvailable()) {
                currRabbit.setAvailable(false);
                toReturn = currRabbit;
                break;
            }
        }
        return toReturn;
    }


    public ArrayList<Rabbit> sellRabbitBySpecies(String species) {
        ArrayList<Rabbit> toReturn = new ArrayList<>();
        for (Rabbit currRabbit : data) {
            if (currRabbit.getSpecies().equals(species)) {
                toReturn.add(currRabbit);
                currRabbit.setAvailable(false);
            }
        }
        return toReturn;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder result = new StringBuilder();
        result.append("Rabbits available at ");
        String name = this.name;
        result.append(name).append(":");
        result.append(System.lineSeparator());
        for (Rabbit curr : data) {
            if (curr.isAvailable()) {
                result
                        .append("Rabbit ")
                        .append("(")
                        .append(curr.getSpecies())
                        .append("):")
                        .append(" ")
                        .append(curr.getName());
                result.append(System.lineSeparator());
            }
        }
        return result.toString();
    }


}
