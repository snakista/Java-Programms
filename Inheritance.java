
class Vehical
{
    protected String brand="Forde";
    public void honk()
    {
        System.out.println("Tutt, tutt");
    }
}
public class Main extends Vehical
{
    private String modelName="Mustang";
	public static void main(String[] args) {
		Main car=new Main();
		car.honk();
		System.out.println(car.brand+" and "+car.modelName);
	}
}
