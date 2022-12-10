import java.util.ArrayList;


/* This is a stub for the House class */
public class House extends Building{
    private ArrayList<String> residents;
    private boolean hasDiningRoom;

 /**
     * Full house constructor
     * @param name, address, nfloors, hasDinngRoom to the house to add
     * adds an arraylist of arguments
     */
    public House(String name, String address,int nFloors, boolean hasDinngRoom) {
      super(name, address, nFloors);
      residents = new ArrayList<String>();
      this.hasDiningRoom = hasDinngRoom;
  }

    public void showOptions() {
      System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
    }
    /**
     allows the residents to go to diffrent floors and prints a message when they enter an invalid number
     */
    public void goToFloor(int floorNum) {
        if (this.activeFloor == -1) {
            throw new RuntimeException("You are not inside this Building. Must call enter() before navigating between floors.");
        }
        if (floorNum < 1 || floorNum > this.nFloors) {
            throw new RuntimeException("Invalid floor number. Valid range for this Building is 1-" + this.nFloors +".");
        }
    }
    public int nResidents(){
      return residents.size();

    }

  public void moveInResident(String name){
   residents.add(name);   

  }

  public String  moveOutResidents(String name){
      residents.remove(name); 
      return name;  

    }
    public void  moveOutResidents(){
      residents.clear();   

    }
    /**
    Checking if the resident is a person.
     */
  public boolean isResident(String person){
        return residents.contains(person);
}
 /**
  Overriding the isResident by checking if the resident is a person and if they have a pet
     */
  public boolean isResident(String person, String pet){
        return residents.contains(person) && residents.contains(pet);

}

public boolean hasDiningRoom(){
    return this.hasDiningRoom;
}




  

  public static void main(String[] args) {
  House albright = new House("Albright House", "1 Chapin Way", 5,  true);
  System.out.println(albright);
  albright.moveInResident("Jordan");
  System.out.println(albright.isResident("Jordan"));

  }
}

