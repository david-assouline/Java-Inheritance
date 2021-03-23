//---------------------------------------------------------------
// Part: 5
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package ThirdPackage;

import FirstPackage.Address;
import SecondPackage.TelecomAddress;

import java.util.Locale;

public class GeneralDeliveryAddress extends GeographicAddress {


    TelecomAddress telecomAddress;

    /**
     * default constructor
     */
    public GeneralDeliveryAddress() {
        super();
    }

    /**
     * parameter constructor
     * @param addressLine address line
     * @param city city
     * @param regionOrState region or state
     * @param zipOrPostCode zip or postal code
     * @param locale locale object
     * @param telecomAddress telecomAddress object
     * @param validFrom valid from date
     * @param validTo valid to date
     */
    public GeneralDeliveryAddress(String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale, TelecomAddress telecomAddress
            , String validFrom, String validTo) {

        super(addressLine, city, regionOrState, zipOrPostCode, locale, validFrom, validTo);
        this.telecomAddress = telecomAddress;
    }

    /**
     * copy constructor
     * @param generalDeliveryAddress general delivery address object
     */
    public GeneralDeliveryAddress(GeneralDeliveryAddress generalDeliveryAddress) {

        super(generalDeliveryAddress.addressLine, generalDeliveryAddress.city, generalDeliveryAddress.regionOrState, generalDeliveryAddress.zipOrPostCode, generalDeliveryAddress.locale,
                generalDeliveryAddress.validFrom, generalDeliveryAddress.validTo);

        this.telecomAddress = generalDeliveryAddress.telecomAddress;
    }


    /**
     * telecom address getter
     * @return telecomAddress object
     */
    public TelecomAddress getTelecomAddress() {
        return telecomAddress;
    }

    /**
     * telecomAddress setter
     * @param telecomAddress telecomAddress object
     */
    public void setTelecomAddress(TelecomAddress telecomAddress) {
        this.telecomAddress = telecomAddress;
    }

    /**
     * returns a string representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "This general delivery address " + addressLine + ", " + city + ", " + regionOrState + ", " + zipOrPostCode +
                ", " + telecomAddress + " is valid from " + super.getValidFrom() + " to " + super.getValidTo();
    }

    /**
     * equals method to compare 2 objects
     * @param address address object
     * @return true or false if the parameter object is the same as this object
     */
    public Boolean equals(Address address) {
        if (address == null) {
            return false;
        } else if (!(address instanceof GeneralDeliveryAddress)) {
            return false;
        } else return this.toString().equals(address.toString());
    }
}
