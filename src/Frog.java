
public class Frog {

    private String name = "Name not set";
    private int id = -1; // -1 used to indicate it has not been set
    private int age = 0;

    public Frog() {
        // Constructor currently does nothing
        // no code in body of constructor
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "**** Start of print method ****\n"
                + "Frog's name is " + name + "\n"
                + "Id is " + id;
    }
}
