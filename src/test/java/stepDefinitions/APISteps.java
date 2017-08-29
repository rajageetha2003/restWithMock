//package stepDefinitions;
import org.junit.Before;
import cucumber.api.java.en.Given;

//import com.mathService;

public class APISteps {

    testAddNumbers testAddNums = new testAddNumbers();

    @Before
    public void setup(){
        System.out.print("in Before... STeps");
//        addNums = new AddNumbers();
//        addNums = mock(AddNumbers.class);
//        when(addNums.addTwoNumbers(2,3)).thenReturn(5.0);
    }

    @Given("^Add two numbers (.*) and (.*) - Result should be (.*)$")
    public void addTwoNumbers(String param1, String param2, String result){
        assert((testAddNums.addTwoNums(Double.parseDouble(param1),Double.parseDouble(param2))+"").equals(result));
    }
}
