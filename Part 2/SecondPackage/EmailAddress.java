//---------------------------------------------------------------
// Part: 2
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package SecondPackage;

import FirstPackage.Address;

public class EmailAddress extends Address {

    String userName;
    String domainName;
    String TLD;

    /**
     * default constructor
     */
    public EmailAddress() {
        super();

    }

    /**
     * parameter constructor
     * @param userName name of user
     * @param domainName name of domain
     * @param TLD top level domain
     * @param validFrom valid from date "xxxx-xx-xx"
     * @param validTO valid to date in "xxxx-xx-xx" format
     */
    public EmailAddress(String userName, String domainName, String TLD, String validFrom, String validTO) {
        super(validFrom, validTO);
        this.userName = userName;
        this.domainName = domainName;
        this.TLD = TLD;


    }

    /**
     * copy constructor
     * @param EmailAddress EmailAddress object
     */
    public EmailAddress(EmailAddress EmailAddress) {

        super(EmailAddress.validFrom, EmailAddress.validTo);
        this.userName = EmailAddress.userName;
        this.domainName = EmailAddress.domainName;
        this.TLD = EmailAddress.TLD;
    }

    /**
     * useName getter
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * userName setter
     * @param userName name of user
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * domainName getter
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * domainName setter
     * @param domainName name of domain
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Top level domain getter
     * @return top level domain TLD
     */
    public String getTLD() {
        return TLD;
    }

    /**
     * top level domain setter
     * @param TLD top level domain
     */
    public void setTLD(String TLD) {
        this.TLD = TLD;
    }

    /**
     * concatenates username domain name and told to return userName@domainName.TLD
     * @return userName@domainName.TLD String
     */
    public String displayEmail() {
        return userName + "@" + domainName + "." + TLD;
    }

    /**
     * returns a string representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "This email address " + displayEmail() + " is valid from " + super.getValidFrom() + " to " + super.getValidTo();
    }

    /**
     * equals method to compare 2 objects
     * @param address address object
     * @return true or false if the parameter object is the same as this object
     */
    public Boolean equals(Address address) {
        if (address == null) {
            return false;
        } else if (!(address instanceof EmailAddress)) {
            return false;
        }
        else return this.toString().equals(address.toString());

    }
}
