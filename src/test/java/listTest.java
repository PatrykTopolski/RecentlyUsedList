import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class listTest {

    RecentlyUsedList<Integer> list;

    @BeforeEach
    void init(){
        list = new RecentlyUsedList<>(1);}

    @Test
    @DisplayName("list init test")
    void listInitTest(){
        assertEquals(1,list.getList().get(0));
    }

    @Test
    @DisplayName("test Add value")
    void addValuesTest(){
        list.add(5);
        assertEquals(5,list.getList().get(1));
    }

    @Test
    @DisplayName("test Add over stack")
    void addValuesOverStackTest(){
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(10);

        assertEquals(10,list.getList().get(1));
    }

}
