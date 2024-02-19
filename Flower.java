
/**
 * Program description: To define the attributes and behaviours of the flower
 *
 * Programmer: Nur Athirah Bt M.Faslee
 * Date: 19 February 2024
 */
public class Flower{

    //Attributes
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    //Constructor without param
    public Flower(){
        //default constructor
    }
    //Constructor with param
    public Flower(String name, String color, double price, int quantity){
        this.name=name;
        this.color=color;
        this.price=price;
        this.quantity=quantity;
    }
    //Mutator methods
    public void setName(String name){
        this.name=name;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    // Acessor/getter methods
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
      //toString() method that displays all information about the flower
    public String toString(){
        return "name:" + name+ "\ncolor:" + color + "\nprice:" + price + "\nquantity: " + quantity;
    }
    
}
       