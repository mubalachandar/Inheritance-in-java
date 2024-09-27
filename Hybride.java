public class Hybride {
    public static void main(String[] args) 
    {
        Car car=new Car("yamato","wew",4);
        car.displaycar();
        Bike bike=new Bike("bmw","er","sport");
        bike.displaybike(); 
        
    }
    
}
 abstract class  Vehical
{
    String make;
    String model;
    public Vehical(String make,String model)
    {
        this.make=make;
        this.model=model;
    }

}
abstract class Fourweeler extends Vehical
{
    int numdoors;
    public Fourweeler(String make, String model, int numdoors)
    {
        super(make,model);
        this.numdoors=numdoors;
    }

}
abstract class Twoweeler extends Vehical
{
    String type;
    public Twoweeler(String make,String model,String type)
    {
        super(make,model);
        this.type=type;
    }

}
class Bike extends Twoweeler
{
    public Bike(String make,String model,String type)
    {
        super(make,model,type);

    }
    public void displaybike()
    {
        System.out.println("make "+make);
        System.out.println("model"+ model);
        System.out.println("type"+type);
    }

}
class Car extends Fourweeler
{
    public Car(String make,String model,int numdoors)
    {
        super(make,model,numdoors);

    }
    public void displaycar()
    {
        System.out.println("make "+make);
        System.out.println("model "+ model);
        System.out.println("number of doors"+numdoors);
    }

}