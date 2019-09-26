package creational.builder;

/**
 * @author PRASKAR
 *
 *         Note : Here the ModelToBeBulit and Builder classes can be separated out and Builder class
 *         can be a non static class in this case. Doing this enables us to have different
 *         implementation of the Builders by having Abstract builder classes. Refer the SourceMaking
 *         website for more details and example.
 *
 */
public class ModelToBeBuilt {

  private String member1;
  private int member2;

  private ModelToBeBuilt(Builder builder) {
    this.member1 = builder.member1;
    this.member2 = builder.member2;
  }


  public String getMember1() {
    return member1;
  }

  public int getMember2() {
    return member2;
  }


  public static class Builder {
    private String member1;
    private int member2;

    public ModelToBeBuilt build() {
      return new ModelToBeBuilt(this);
    }

    public Builder member1(String value) {
      this.member1 = value;
      return this;
    }

    public Builder member2(int value) {
      this.member2 = value;
      return this;
    }
  }

}
