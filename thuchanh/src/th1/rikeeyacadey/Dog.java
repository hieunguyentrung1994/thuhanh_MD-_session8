package th1.rikeeyacadey;

public class Dog extends Animal {
    private String color;
    public Dog(){

    }
    public Dog (String name, String color){
        super();
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setColor() {
        this.color = color;
    }

    @Override
    public String makeSound(){
        return "Gâu gâu";
    }
}
