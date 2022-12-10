
import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {
  Hashtable < String, Boolean > collection;
  Boolean hasElevator;


/* Default constructor taking name, address, nFloors, and haseleavator as input */

  public Library(String name, String address, int nFloors, Boolean haseleavator) {
    super(name, address, nFloors);
    this.collection = new Hashtable < String, Boolean > ();
    this.hasElevator = haseleavator;
  }

/*Shows available options in the library */
  public void showOptions() {
      super.showOptions();
      System.out.println("checkOut() \n + returnBook() \n + isAvailable() \n + printCollection()");
  }

  public void goToFloor(int floorNum) {
    if (this.activeFloor == -1) {
      throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
    }
    if (floorNum < 1 || floorNum > this.nFloors) {
         throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors + ".");
    }
  }
    public void addTitle(String title) {
        collection.put(title, true);
    }
    public String removeTitle(String title) { // return the title that we removed
      this.collection.remove(title);
      return title;
    }
    public void checkOut(String title) {
      this.collection.replace(title, true, false);
    }
    public void returnBook(String title) {
      this.collection.replace(title, false, true);
    }

    public boolean containsTitle(String title) { // returns true if the title appears as a key in the Libary's collection, false otherwise
      return this.collection.contains(title);
    }
    public boolean isAvailable(String title) { // returns true if the title is currently available, false otherwise
      return this.collection.get(title);
    }

    public void printCollection() { // prints out the entire collection in an easy-to-read way (including checkout status)
      System.out.println(this.collection.toString());
    }
    public static void main(String[] args) {
        Library nielson = new Library("Nielson Library", "10 Elm Street", 5, true);
        System.out.println(nielson);
    }
  }