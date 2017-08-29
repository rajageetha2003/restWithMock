import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Path("/add/{a}/{b}")
public class AddNumbers{

    public void AddNumbers() {
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public double addTwoNumbers(double a, double b) {
        return (a + b);
    }

    @Test
    public void testAddPositiveNumbers()
    {
        int x  = 11 ; int y = 21;
        assert(32.0 == addTwoNumbers(x,y));
    }

    @Test
    public void testAddNegativeNumbers()
    {
        int x  = -51 ; int y = -7;
        assert(-58.0 == addTwoNumbers(x,y));
    }

    @Test
    public void testAddFloatNumbers()
    {
        double x  = 679.767 ; double y = 45344.56;
        assert(46024.327 == addTwoNumbers(x,y));
    }
}
