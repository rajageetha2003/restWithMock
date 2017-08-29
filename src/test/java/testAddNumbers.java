//package test.java;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class testAddNumbers {
    AddNumbers addNums; // = new AddNumbers();

    public testAddNumbers() {
//        addNums = new AddNumbers();
        addNums = mock(AddNumbers.class);
        when(addNums.addTwoNumbers(2,3)).thenReturn(5.0);
        when(addNums.addTwoNumbers(20.78,-13)).thenReturn(7.780000000000001);
        when(addNums.addTwoNumbers(-56,-33)).thenReturn(-89.0);
        when(addNums.addTwoNumbers(1.56,4.01)).thenReturn(5.57);
        when(addNums.addTwoNumbers(87876,0)).thenReturn(87876.0);
        when(addNums.addTwoNumbers(-765676.7056,0)).thenReturn(-765676.7056);
        when(addNums.addTwoNumbers(34567826.2356,5.76346676536E7)).thenReturn(9.22024938892E7);
        when(addNums.addTwoNumbers(-9.2024938892E6,-5.76346676536E7)).thenReturn(-6.68371615428E7);
    }

    public double addTwoNums(double a, double b){
        return addNums.addTwoNumbers(a,b);
    }
}
