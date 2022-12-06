public class TextStatement extends Statement {
  
  protected String getFirstString(Customer aCustomer) {
    return "Rental Record for " + aCustomer.getName() + "\n";
  }
  protected String getBodyString(Rental each) {
    return "\t" + each.getMovie().getTitle()+ "\t" +
      String.valueOf(each.getCharge()) + "\n";
  }

  protected String getAmountOwed(Customer aCustomer) {
    return "Amount owed is " +
        String.valueOf(aCustomer.getTotalCharge()) + "\n";
  }

  protected String getAmountEarned(Customer aCustomer) {
    return "You earned " +
        String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
        " frequent renter points";
  }
  
}