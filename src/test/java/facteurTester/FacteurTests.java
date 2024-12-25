package facteurTester;
import java.util.ArrayList;
import java.util.List;
import facteursPremier.FacteurPremier;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.stream.DoubleStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FacteurTests {
    List<Integer> expected;
    List<Integer> actual_veleur;
    @BeforeEach
    void setUp(){
        expected=new ArrayList<Integer>();
        actual_veleur=new ArrayList<Integer>();
    }
    @AfterEach
    void tearDown(){
        expected=null;
        actual_veleur=null;
    }
    @Test
    public  void test_1_devrait_retourne_liste_vide(){
        //given

       //when
     actual_veleur=FacteurPremier.generate(1);
        //then
     assertThat(actual_veleur).isEqualTo(expected);
    }
    @Test
    public void test_2_devrait_retourne_2(){
        expected.add(2);
        actual_veleur=FacteurPremier.generate(2);
        assertThat(actual_veleur).isEqualTo(expected);
    }
    @Test
    public void test_3_devrait_retourne_3(){
        expected.add(3);
        actual_veleur=FacteurPremier.generate(3);
        assertThat(actual_veleur).isEqualTo(expected);
    }
}
