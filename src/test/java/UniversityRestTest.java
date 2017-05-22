import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by Evgen on 21.05.2017.
 */
public class UniversityRestTest extends FunctionalTest {
    @Test
    public void basicPingTest() {
        given().when().get("").then().statusCode(200);
    }

    @Test
    public void invalidUrlTest() {
        given().when().get("/city=che").then().statusCode(404);
    }

    @Test
    public void verifyNameOfUniversity() {
        given().when().get("search?name=middle").then().body(containsString("middle"));
    }

    @Test
    public void verifyCountry() {
        given().when().get("search?name=national&country=ukraine").then().body(containsString("Ukraine"));
    }


}
