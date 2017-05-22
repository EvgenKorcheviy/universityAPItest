import com.jayway.restassured.RestAssured;
import org.junit.BeforeClass;

/**
 * Created by Evgen on 21.05.2017.
 */
public class FunctionalTest {
    @BeforeClass
    public static void setup() {
        String baseHost = System.getProperty("server.host");
        if(baseHost==null){
            baseHost = "http://universities.hipolabs.com";
        }
        RestAssured.baseURI = baseHost;

    }
}
