package facteursPremier;

import java.util.ArrayList;
import java.util.List;

public class FacteurPremier {

public static List<Integer> generate(int nbre){
    List<Integer> obj=new ArrayList<Integer>();
    if(nbre%2==0){
        obj.add(2);
        nbre=nbre/2;

    }
    if(nbre>1){
        obj.add(nbre);
    }




    return  obj;


}
}
