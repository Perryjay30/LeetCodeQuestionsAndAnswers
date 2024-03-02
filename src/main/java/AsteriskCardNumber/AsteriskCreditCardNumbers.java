package AsteriskCardNumber;

public class AsteriskCreditCardNumbers {

    public static String encryptCardNumber(String cardNumber) {
        int firstHalfNumbers;
        if(cardNumber.length() % 2 == 0) {
            firstHalfNumbers = cardNumber.length() / 2 - 1;
        } else {
            firstHalfNumbers = cardNumber.length() / 2;
        }
        int secondHalfNumbers = (cardNumber.length() % 2 == 0) ? firstHalfNumbers + 2 : firstHalfNumbers + 1;
        return cardNumber.substring(0, firstHalfNumbers)
                + "***"
                + cardNumber.substring(secondHalfNumbers);
    }

    public static void main(String[] args) {
        String cardNumber = "567843921098674";
        System.out.println(AsteriskCreditCardNumbers.encryptCardNumber(cardNumber));
    }

}
