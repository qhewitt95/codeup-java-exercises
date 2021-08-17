package practice;


public class Mallard extends Duck implements Quackable{
    private int flightspeed;

    public int getFlightspeed() {
        return flightspeed;
    }

    public void setFlightspeed(int flightspeed) {
        this.flightspeed = flightspeed;
    }

    public Mallard(String name, int age, int flightspeed) {
        super(name, age);
        this.flightspeed = flightspeed;
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
