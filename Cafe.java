/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

/**
 Default constructor for Cafe
*/
    public Cafe(String name,String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        nCoffeeOunces = this.nCoffeeOunces;// Override nCoffeeOunces
        nSugarPackets = this.nSugarPackets;// Override nSugarPackets
        nCreams = this.nCreams;// Override nCreams
        nCups = this.nCups;// Override nCups

    }
    // Shows available option in the Cafe
    public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)");
    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {  //used each-time a cup of coffee is selled
        this.nCoffeeOunces = this.nCoffeeOunces - size;        //reduces the nCoffeeOunces by 12oz 
        this.nSugarPackets = this.nSugarPackets - nSugarPackets; // reduces the nSugarPackets by 2packets
        this.nCreams = this.nCreams - nCreams;//reduces the nCreams by 3 splashes
        this.nCups = this.nCups - 1; //reduces nCups by 1
             if (this.nCoffeeOunces <= 0){  
                    restock(50, 0,0, 0);
             }
             if (this.nSugarPackets <= 0){
                  restock(0, 100,0, 0);
            }
            if (this.nCreams <= 0){
                restock(0, 0 ,100, 0);
            }
            if (this.nCups <= 0){
                restock(0, 0 ,0, 50);
            }
            
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) { //Restocking the number 
        this.nCoffeeOunces = this.nCoffeeOunces + nCoffeeOunces;
        this.nSugarPackets = this.nSugarPackets + nSugarPackets;
        this.nCreams = this.nCreams + nCreams;
        this.nCups = this.nCups + nCups;

    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe("Ford Hall", "Elm Street", 5, 12, 2, 1, 1);
        System.out.println(myCafe);
    }

}