package numberconverter;
import java.math.BigInteger;

enum Words {
    ZERO(new BigInteger("0")), ONE(new BigInteger("1")), TWO(new BigInteger("2")), THREE(new BigInteger("3")),
    FOUR(new BigInteger("4")), FIVE(new BigInteger("5")), SIX(new BigInteger("6")), SEVEN(new BigInteger("7")),
    EIGHT(new BigInteger("8")), NINE(new BigInteger("9")), TEN(new BigInteger("10")), ELEVEN(new BigInteger("11")),
    TWELVE(new BigInteger("12")), THIRTEEN(new BigInteger("13")), FOURTEEN(new BigInteger("14")),
    FIFTEEN(new BigInteger("15")), SIXTEEN(new BigInteger("16")), SEVENTEEN(new BigInteger("17")),
    EIGHTEEN(new BigInteger("18")), NINETEEN(new BigInteger("19")), TWENTY(new BigInteger("20")),
    THIRTY(new BigInteger("30")), FOURTY(new BigInteger("40")), FIFTY(new BigInteger("50")),
    SIXTY(new BigInteger("60")), SEVENTY(new BigInteger("70")), EIGHTY(new BigInteger("80")),
    NINETY(new BigInteger("90")), HUNDRED(new BigInteger("100")), THOUSAND(new BigInteger("1000")),
    MILLION(new BigInteger("1000000")), BILLION(new BigInteger("1000000000"));

    private final BigInteger number;

    private Words(BigInteger number) {
        this.number = number;
    }

    public BigInteger getNumber() {
        return this.number;
    }
}
