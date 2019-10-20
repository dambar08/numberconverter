package numberconverter;
class NegativeNumberException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NegativeNumberException() {
    System.out.println("Number is negative");
  }

  public NegativeNumberException(String msg) {
    super(msg);
  }
}