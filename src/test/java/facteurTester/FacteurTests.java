package facteurTester;
import java.util.ArrayList;
import java.util.List;
import facteursPremier.FacteurPremier;
import org.junit.jupiter.api.Test;
import java.util.stream.DoubleStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FacteurTests {
    @Test
    public  void test_1_devrait_retourne_liste_vide(){
        //given
    List<Integer> expected= new ArrayList<Integer>();
       //when
    List<Integer> actual_veleur=FacteurPremier.generate(1);
        //then
     assertThat(actual_veleur).isEqualTo(expected);
    }
}
