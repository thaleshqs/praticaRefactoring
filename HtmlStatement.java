import java.util.Enumeration;

public class HtmlStatement extends Statement {
private String getFirstString(Customer aCustomer) {
  return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
}
private String getBodyString(Rental each) {
  return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
}

private String getAmountOwed(Customer aCustomer) {
  return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
}

private String getAmountEarned(Customer aCustomer) {
  return "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
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