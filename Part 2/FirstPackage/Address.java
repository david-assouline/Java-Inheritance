//---------------------------------------------------------------
// Part: 1
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package FirstPackage;

import SecondPackage.EmailAddress;
import SecondPackage.TelecomAddress;
import SecondPackage.WebPageAddress;
import ThirdPackage.GeneralDeliveryAddress;
import ThirdPackage.GeographicAddress;
import ThirdPackage.PostOfficeBoxAddress;

public class Address {

    public String validFrom = "YYYY-MM-DD";
    public String validTo = "YYYY-MM-DD";

    /**
     * default constructor
     */
    public Address() {
    }

    /**
     * Parameter constructor
     * @param validFrom valid from date in "xxxx-xx-xx" format
     * @param validTo valid to date in "xxxx-xx-xx" format
     */
    public Address(String validFrom, String validTo) {

        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Address(Address address) {
        this.validFrom = address.validFrom;
        this.validTo = address.validTo;
    }



    /**
     * valid from date getter
     * @return valid from date
     */
    public String getValidFrom() {
        return validFrom;
    }

    /**
     * valid from date setter
     * @param validFrom valid from date
     */
    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    /**
     * valid to date getter
     * @return valid from date
     */
    public String getValidTo() {
        return validTo;
    }

    /**
     * valid to date setter
     * @param validTo valid to date
     */
    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }
}
