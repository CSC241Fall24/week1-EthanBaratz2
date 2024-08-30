public class Bulbasaur {
    private int id = 1;
    private int level = 1;

    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    public void setLevel(int lv) {
    level = lv;
        if(level > 15 && level < 32) id = 2;
        else if(level >= 32) id = 3;
        
    }

    public int getLevel() {
        return level; // Placeholder return value
    }

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
    
    public String toString() {
        return "Level: " + level + ", ID: " + id; // Placeholder return value
    }

    public boolean equals(Bulbasaur obj) {
        if(obj.getLevel() != this.getLevel()) return false;
        else if(obj.getName().equals(this.getName())) return true;
        else return false;
    }
    
    public Bulbasaur copy() {
        // TODO: Implement this method
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur b = new Bulbasaur();
        b.setLevel(this.getLevel());
        return b; // Placeholder return value
    }
}
