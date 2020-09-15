public class Car
{
    public void fullThrottle()
    {
        System.out.println("Car is going in full Throttle!");
    }
    public void speed(int maxSpeed)
    {
        System.out.println("Max speed: "+ maxSpeed);
    }
    public static void main(String[] args)
    {
        Car myCar=new Car();
        myCar.fullThrottle();
        myCar.speed(200);
    }
}
