import java.util.ArrayList;
import java.util.List;

class Bird {
    private String birdType;
    private String definingCharacteristic;
    private boolean extinct;
    private int numWings;
    private List<String> preferredFood;

    public Bird(String birdType, String definingCharacteristic, boolean extinct, int numWings) {
        this.birdType = birdType;
        this.definingCharacteristic = definingCharacteristic;
        this.extinct = extinct;
        this.numWings = numWings;
        this.preferredFood = new ArrayList<>();
    }

    public void setPreferredFood(List<String> foodList) {
        this.preferredFood = foodList;
    }

    public void addPreferredFood(String foodItem) {
        this.preferredFood.add(foodItem);
    }
}

class BirdsOfPrey extends Bird {
    public BirdsOfPrey(String birdType, String definingCharacteristic, boolean extinct, int numWings) {
        super(birdType, definingCharacteristic, extinct, numWings);
    }
}

class FlightlessBird extends Bird {
    public FlightlessBird(String birdType, String definingCharacteristic, boolean extinct, int numWings) {
        super(birdType, definingCharacteristic, extinct, numWings);
    }
}

class Owls extends Bird {
    private String facialDisks;

    public Owls(String birdType, String definingCharacteristic, boolean extinct, int numWings, String facialDisks) {
        super(birdType, definingCharacteristic, extinct, numWings);
        this.facialDisks = facialDisks;
    }
}

class Parrots extends Bird {
    private int vocabulary;
    private String favoriteSaying;

    public Parrots(String birdType, String definingCharacteristic, boolean extinct, int numWings, int vocabulary, String favoriteSaying) {
        super(birdType, definingCharacteristic, extinct, numWings);
        this.vocabulary = vocabulary;
        this.favoriteSaying = favoriteSaying;
    }
}

class Pigeons extends Bird {
    public Pigeons(String birdType, String definingCharacteristic, boolean extinct, int numWings) {
        super(birdType, definingCharacteristic, extinct, numWings);
    }
}

class Shorebirds extends Bird {
    private String habitat;

    public Shorebirds(String birdType, String definingCharacteristic, boolean extinct, int numWings, String habitat) {
        super(birdType, definingCharacteristic, extinct, numWings);
        this.habitat = habitat;
    }
}

class Waterfowl extends Bird {
    private String waterBody;

    public Waterfowl(String birdType, String definingCharacteristic, boolean extinct, int numWings, String waterBody) {
        super(birdType, definingCharacteristic, extinct, numWings);
        this.waterBody = waterBody;
    }
}

public class BirdTracker {
    public static void main(String[] args) {
        Waterfowl duck = new Waterfowl("Duck", "Webbed feet", false, 2, "Pond");
        List<String> duckPreferredFood = new ArrayList<>();
        duckPreferredFood.add("Aquatic invertebrates");
        duckPreferredFood.add("Vegetation");
        duck.setPreferredFood(duckPreferredFood);

        BirdsOfPrey hawk = new BirdsOfPrey("Hawk", "Sharp beak", false, 2);
        List<String> hawkPreferredFood = new ArrayList<>();
        hawkPreferredFood.add("Small mammals");
        hawkPreferredFood.add("Birds");
        hawk.setPreferredFood(hawkPreferredFood);

        Parrots gray = new Parrots ("Gray", "Short Beak", false, 2, 25, "Pew");
        List<String> grayPreferredFood = new ArrayList<>();
        grayPreferredFood.add("Small mammals");
        grayPreferredFood.add("Birds");
        gray.setPreferredFood(grayPreferredFood);
    }
}
