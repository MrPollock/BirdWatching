public class Teacher {

    //Properties or Instance Variables
    String name;
    String subject;

    //Contructors  0 parameter, 1 parameter, 2 parameter
    public Teacher(){

    }

    public Teacher(String nm){
        name = nm;
    }

    public Teacher(String nm, String sj){
        name = nm;
        subject = sj;
    }

    // method that returns information
    public String toString(){
        return name + " teaches " + subject;
    }


    // method that returns index position of a string
    public int  indexPosition(String str){
        return toString().indexOf(str);
    }
        
    

    
}
