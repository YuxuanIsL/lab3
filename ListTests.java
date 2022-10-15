import org.junit.*;
import java.util.ArrayList;
import static org.junit.Assert.*;

class equalChecker implements StringChecker{
    @Override
    public boolean checkString(String s){
        return s.length() == 5;
    }
}


public class ListTests{
    @Test
    public void testFilter(){
        ArrayList<String> toTest = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        StringChecker sc = new equalChecker();
        String toCheck = "apple";
        toTest.add("apple");
        toTest.add("pineapples");
        toTest.add("pears");
        result.add("apples");
        result.add("pears");
        assertEquals(true, result.equals(ListExamples.filter(toTest, sc)));      
    }


    
}