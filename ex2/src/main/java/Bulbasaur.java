public class Bulbasaur {
    private int id = 1;
    private int level = 1;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // TODO: Implement this method
        // Update the level
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        // If the new level is 32 or higher, evolve to Venusaur

    level = lv;
        if(level > 15 && level < 32) id = 2;
        else if(level > 32) id = 3;
        
    }

    // getLevel method
    public int getLevel() {
        return level; // Placeholder return value
    }

    // getName method
    public String getName() {
       if(id == 1) return "Bulbasaur";
    else if(id == 2) return "Ivysaur";
    else if(id == 3) return "Venusaur";
    else return "";
    }

    // getID method
    public int getID() {
      return id;
    }

    // toString method
    @Override
    public String toString() {
        
        return "Level: " + level + ", ID: " + id; // Placeholder return value
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        if(a.getLevel() != this.getLevel()) return false;
        else if(a.getName().equals(a.getName())) return true;
        else return false;
    }

    // copy method
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur b = new Bulbasaur();
        b.setLevel(this.getLevel());
        return b; // Placeholder return value
    }
}
