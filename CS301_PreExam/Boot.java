
/**
 * Write a description of class Boot here.
 *
 * @author Emma Jeppesen
 * @version 1/23/24
 */
public class Boot extends Shoe
{
    // instance variables 
    private boolean isHiking;
    private String brand;
    private int size;

    public static void main(String[] args){
        Shoe[] boots = new Shoe[4];

        boots[0] = new Shoe();
        boots[1] = new Boot("Danner", 10, true);
        boots[2] = null;
        boots[3] = new Boot("Dalbello", 14, false);

        //Just here for an extra bit of padding between lists.
        System.out.println("");

        //Go through array, set size, then print
        for(int i = 0; i < boots.length; i++){
            if(boots[i] != null){
                boots[i].setSize(20);
            }

            //Print out the array, unless null
            if(boots[i] != null){
                System.out.println(boots[i]);
            }
        }

    }

    /**
     * Constructor for objects of class Boot
     */
    public Boot(String brand, int size, boolean isHiking)
    {
        this.size = size;
        this.brand = brand;
        this.isHiking = isHiking;
    }

    @Override
    public void setSize(int size){
        if(size >= 17 || size <= 30){

        }else{
            size = super.getSize();
        }

    }

    @Override
    public String toString(){
        String info = size + ", " + brand;
        return info;
    }
}
