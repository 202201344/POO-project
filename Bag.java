public class Bag extends Package{
    public static int nextBag;
    public final int number;
    public String bagId;
    public double weight;
    
    public Bag(String bagId, double weight){
        number = ++nextBag;
        this.bagId = "Bag" + number; 
        this.weight = weight;
    }
    
    public String getId(){
        return bagId;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        if(weight > 0){
            this.weight = weight;
        }
    }

    public String toString (){
        return bagId + "\t\t" + weight;
    }
}