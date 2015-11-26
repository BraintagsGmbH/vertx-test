package de.braintags.testpackage.json;

import io.vertx.core.json.Json;

public class JsonTest {

  public JsonTest() {
  }

  public static void main(String[] args) {
    Settings settings = new Settings("testsettings");
    String str = Json.encode(settings);

    Object ob = Json.decodeValue(str, Settings.class);
    if (!(ob instanceof Settings)) {
      throw new IllegalArgumentException(ob.getClass().getName());
    }

  }

}
