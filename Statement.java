import java.util.Enumeration;

public abstract class Statement {
  protected abstract String getFirstString(Customer aCustomer);
  protected abstract String getBodyString(Rental each);
  protected abstract String getAmountOwed(Customer aCustomer);
  protected abstract String getAmountEarned(Customer aCustomer);

  //template method
  protected String value(Customer aCustomer) {
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