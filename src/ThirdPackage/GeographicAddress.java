//---------------------------------------------------------------
// Part: 6
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package ThirdPackage;

import FirstPackage.Address;
import SecondPackage.TelecomAddress;

import java.util.Locale;

public class GeographicAddress extends Address {

    String addressLine;
    String city;
    String regionOrState;
    String zipOrPostCode;
    Locale locale;

    /**
     * default constructor
     */
    public GeographicAddress() {
        super();

    }

    /**
     * parameter constructor
     * @param addressLine adress line
     * @param city city
     * @param regionOrState region or state
     * @param zipOrPostCode zip or postal code
     * @param locale locale object
     * @param validFrom valid from date
     * @param validTo valid to date
     */
    public GeographicAddress(String addressLine, String city, String regionOrState, String zipOrPostCode, Locale locale,
                             String validFrom, String validTo) {

        super(validFrom, validTo);
        this.addressLine = addressLine;
        this.city = city;
        this.regionOrState = regionOrState;
        this.zipOrPostCode = zipOrPostCode;
        this.locale = locale;
    }

    /**
     * copy constructor
     * @param GeographicAddress geographicAddress object
     */
    public GeographicAddress(GeographicAddress GeographicAddress) {

        super(GeographicAddress.validFrom, GeographicAddress.validTo);
        this.addressLine = GeographicAddress.addressLine;
        this.city = GeographicAddress.city;
        this.regionOrState = GeographicAddress.regionOrState;
        this.zipOrPostCode = GeographicAddress.zipOrPostCode;
        this.locale = GeographicAddress.locale;
    }

    /**
     * address line getter
     * @return addressLine
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * address line setter
     * @param addressLine address line
     */
    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * city getter
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * city setter
     * @param city city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * regionOrState getter
     * @return region or state
     */
    public String getRegionOrState() {
        return regionOrState;
    }

    /**
     * region or state setter
     * @param regionOrState region or state
     */
    public void setRegionOrState(String regionOrState) {
        this.regionOrState = regionOrState;
    }

    /**
     * zipOrPostCode getter
     * @return zip or post code
     */
    public String getZipOrPostCode() {
        return zipOrPostCode;
    }

    /**
     * zip or post code setter
     * @param zipOrPostCode zip or post code
     */
    public void setZipOrPostCode(String zipOrPostCode) {
        this.zipOrPostCode = zipOrPostCode;
    }

    /**
     * locale getter
     * @return locale object
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * locale setter
     * @param locale locale object
     */
    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    /**
     * returns a string representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "This geographic address " + addressLine + ", " + city + ", " + regionOrState + ", " + zipOrPostCode +
                ", " + locale + " is valid from " + super.getValidFrom() + " to " + super.getValidTo();
    }

    /**
     * equals method to compare 2 objects
     * @param address address object
     * @return true or false if the parameter object is the same as this object
     */
    public Boolean equals(Address address) {
        if (address == null) {
            return false;
        } else if (!(address instanceof GeographicAddress)) {
            return false;
        } else return this.toString().equals(address.toString());
    }
}
