public class SoccerPlayer {
        // instance variables
        String name;
        int number;

        // Constructor
        public SoccerPlayer(String nm, int nbr){
            name = nm;
            number = nbr;
        }

        // toString method

        public String toString(){
            return name + " is number " + number + ".";
        }


}
