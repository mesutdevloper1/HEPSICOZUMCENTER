import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class restAPI {

    @Test
    public void Name(){
        when().get("http://generator.swagger.io/api/swagger.json").then().statusCode(200);
      int deger=get().statusCode(200);
      if (deger!=200){
          System.out.println("hatalı response");
      }
    }


}
