import java.util.Enumeration;

public class TextStatement extends Statement {
  private String getFirstString(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }
  private String getBodyString(Rental each) {
    return "\t" + each.getMovie().getTitle()+ "\t" +
      String.valueOf(each.getCharge()) + "\n";
  }

  private String getAmountOwed(Customer aCustomer) {
    return "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
  }

  private String getAmountEarned(Customer aCustomer) {
    return "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
  }
  
  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();

    String result = getFirstString(aCustomer);
      while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           //show figures for this rental
           result += getBodyString(each);
        }
        //add footer lines
        result += getAmountOwed(aCustomer);
        result += getAmountEarned(aCustomer);
        return result;
  }
}