package javagh;

public class Dog {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }


    String getObjectAddress(){
        return super.toString();
    }
}
