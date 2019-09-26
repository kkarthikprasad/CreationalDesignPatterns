package creational.builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import creational.builder.ModelToBeBuilt.Builder;
import junit.framework.Assert;

class ModelToBeBuiltTest {

  @Test
  void test() {
    ModelToBeBuilt myModel = new ModelToBeBuilt.Builder().member1("value").member2(4).build();
    assertEquals(myModel.getMember1(), "value");
    assertEquals(myModel.getMember2(), 4);
  }

}
