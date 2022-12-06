public class HtmlStatement extends Statement {
  
protected String getFirstString(Customer aCustomer) {
  return "<H1>Rentals for <EM>" + aCustomer.getName() +
      "</EM></H1><P>\n";
}
protected String getBodyString(Rental each) {
  return each.getMovie().getTitle()+ ": " +
         String.valueOf(each.getCharge()) + "<BR>\n";
}

protected String getAmountOwed(Customer aCustomer) {
  return "<P>You owe <EM>" +
      String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
}

protected String getAmountEarned(Customer aCustomer) {
  return "On this rental you earned <EM>" + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      "</EM> frequent renter points<P>";
}

}