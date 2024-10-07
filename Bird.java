public class Bird {

    //instance variables or properties

    String commonName;
    double wingSpan;
    String location;

    //Contructor 3 parameters
    public Bird(String nm, double ws, String loc){

        commonName = nm;
        wingSpan = ws;
        location = loc;

    }

    // methods
    // toString that returns a nice sentence about the bird

    public String toString(){
        return commonName + "has a wingspan of " + wingSpan +  " feet, and is found mostly in " + location + ".";
    }

    public int lengthOfName(){
        return commonName.length();
    }

    
}
