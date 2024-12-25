package facteursPremier;

import java.util.ArrayList;
import java.util.List;

public class FacteurPremier {

public static List<Integer> generate(int nbre){
    List<Integer> obj=new ArrayList<Integer>();
 int i=2 ;
    while(nbre>1){
        while(nbre%i==0){
            obj.add(i);
            nbre=nbre/i;
        }
        i++;
    }
    if(nbre>1){
        obj.add(nbre);
    }




    return  obj;


}
}
