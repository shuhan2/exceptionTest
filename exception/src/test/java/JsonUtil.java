import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {

    try {
      return objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      return null;
    }
  }
}
