//---------------------------------------------------------------
// Part: 4
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package SecondPackage;

import FirstPackage.Address;

public class WebPageAddress extends Address {

    String resourceName;
    String domainName;

    /**
     * default constructor
     */
    public WebPageAddress() {
        super();
    }

    /**
     * parameter constructor
     * @param domainName domain name
     * @param resourceName resource name
     * @param validFrom valid from date
     * @param validTO valid to date
     */
    public WebPageAddress(String domainName, String resourceName, String validFrom, String validTO) {

        super(validFrom, validTO);
        this.domainName = domainName;
        this.resourceName = resourceName;
    }

    /**
     * copy constructor
     * @param WebPageAddress web page address object
     */
    public WebPageAddress(WebPageAddress WebPageAddress) {

        super(WebPageAddress.validFrom, WebPageAddress.validTo);
        this.domainName = WebPageAddress.domainName;
        this.resourceName = WebPageAddress.resourceName;
    }

    /**
     * resource name getter
     * @return resource name
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * resource name setter
     * @param resourceName resource name
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * domain name getter
     * @return domain name
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * domain name setter
     * @param domainName domain name
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * returns a string representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "This web page address www." + domainName + "/" + resourceName + " is valid from " + super.getValidFrom() + " to " + super.getValidTo();
    }

    /**
     * equals method to compare 2 objects
     * @param address address object
     * @return true or false if the parameter object is the same as this object
     */
    public Boolean equals(Address address) {
        if (address == null) {
            return false;
        } else if (!(address instanceof WebPageAddress)) {
            return false;
        } else return this.toString().equals(address.toString());
    }
}
