
/**
 * Write a description of class Shoe here.
 *
 * @author Emma Jeppesen
 * @version 1/23/24
 */
public class Shoe
{
    // instance variables - replace the example below with your own
    private int size;
    private String brand;

    
    public static void main(String[] args){
        //Initialize an array of shoes with a size of 5
        Shoe[] shoes = new Shoe[5];
        
        //Fill the array with shoes
        for(int i = 0; i < shoes.length; i++){
            if(i<2){
                shoes[i] = new Shoe();
            }
            if(i==2){
                shoes[i] = null;
            }
            if(i==3){
               shoes[i] = new Shoe(12, "Nike");
            }
            if(i==4){
               shoes[i] = new Shoe(7, "Adidas"); 
            }
        }
        
        //Just here for an extra bit of padding between lists.
        System.out.println("");
        
        
        //Sets size of shoes based on setSize method
        shoes[0].setSize(16);
        shoes[1].setSize(-5);
        shoes[3].setSize(47);
        shoes[4].setSize(55);
        
        for(int i = 0; i < shoes.length; i++){
            //Print out the array, unless null
            if(shoes[i] != null){
                System.out.println(shoes[i].toString());
            }
        }
        
        //Test
        Shoe bob = new Shoe();
        bob.setSize(2);
        
    }
    
    /**
     * Constructor for objects of class Shoe
     */
    public Shoe()
    {
        size = 1;
        brand = "Robeez";
        
    }

    /**
     */
    public Shoe(int size, String brand)
    {
        this.size = size;
        this.brand = brand;
            
    }
    
    @Override
    public String toString(){
        String info = "Size: " + size + ", " + brand;
        return info;
    }
    
    public void setSize(int size){
        if(size < 1 || size > 50){
            
        }
        
        if(size >= 1 && size <= 16){
            this.size = size;
        }
        
        if(size >= 17 && size <= 50){
            this.size = (size/(int)4.19);
        }
        
    }
    
    public int getSize(){
        return size;
    }
    
    public String getBrand(){
        return brand;
    }
}
