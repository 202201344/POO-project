import java.util.ArrayList;
import java.util.List;

public class Package{
    private List<Bag> bagList;
/*
 * box list 
 * cardboardbox list
 * pallet list
 */
    public Package(){
        bagList = new ArrayList<>();
    }
    
    public List<Bag> getBags(){
        return bagList;
    }
}