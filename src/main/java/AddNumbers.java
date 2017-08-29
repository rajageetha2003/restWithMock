import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("/add/{a}/{b}")
public class AddNumbers{

    public void AddNumbers() {
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public double addTwoNumbers(double a, double b) {
        return (a + b);
    }
}
