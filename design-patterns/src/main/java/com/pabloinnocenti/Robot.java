public class Robot
{
    String name;
   
    public Robot (String name) {
        this.name = name;
    }
    
    public void step() {
        System.out.println("I am a bad Robot named " + name);
    }
}
