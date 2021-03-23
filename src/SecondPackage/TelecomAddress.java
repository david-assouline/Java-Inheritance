//---------------------------------------------------------------
// Part: 3
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package SecondPackage;

import FirstPackage.Address;

public class TelecomAddress extends Address {

    String countryCode;
    String nationalDirectDialingPrefix;
    int areaCode;
    long phoneNumber;
    int extension;
    String physicalType;

    /**
     * default constructor
     */
    public TelecomAddress() {
        super();

    }

    /**
     * parameter constructor
     * @param countryCode code of country
     * @param nationalDirectDialingPrefix national direct dialing prefix
     * @param areaCode area code
     * @param phoneNumber phone number
     * @param extension extension
     * @param physicalType physical type
     * @param validFrom valid from date
     * @param validTo valid to date
     */
    public TelecomAddress(String countryCode, String nationalDirectDialingPrefix, int areaCode, long phoneNumber,
                          int extension, String physicalType, String validFrom, String validTo) {

        super(validFrom, validTo);
        this.countryCode = countryCode;
        this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
        this.extension = extension;
        this.physicalType = physicalType;

    }

    /**
     * copy constructor
     * @param TelecomAddress telecomAddress object
     */
    public TelecomAddress(TelecomAddress TelecomAddress) {

        super(TelecomAddress.validFrom, TelecomAddress.validTo);
        this.countryCode = TelecomAddress.countryCode;
        this.nationalDirectDialingPrefix = TelecomAddress.nationalDirectDialingPrefix;
        this.areaCode = TelecomAddress.areaCode;
        this.phoneNumber = TelecomAddress.phoneNumber;
        this.extension = TelecomAddress.extension;
        this.physicalType = TelecomAddress.physicalType;

    }

    /**
     * countryCode getter
     * @return country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * countryCode getter
     * @param countryCode country code
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * nationalDirectDialingPrefix getter
     * @return national direct dialing prefix
     */
    public String getNationalDirectDialingPrefix() {
        return nationalDirectDialingPrefix;
    }

    /**
     * national direct dialing prefix setter
     * @param nationalDirectDialingPrefix national direct dialing prefix
     */
    public void setNationalDirectDialingPrefix(String nationalDirectDialingPrefix) {
        this.nationalDirectDialingPrefix = nationalDirectDialingPrefix;
    }

    /**
     * area code getter
     * @return area code
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * set area code
     * @param areaCode are code
     */
    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * phone nummber getter
     * @return phone number
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * phone number setter
     * @param phoneNumber phone number
     */
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * extension getter
     * @return extension
     */
    public int getExtension() {
        return extension;
    }

    /**
     * extension setter
     * @param extension extension
     */
    public void setExtension(int extension) {
        this.extension = extension;
    }

    /**
     * physical type getter
     * @return physical type
     */
    public String getPhysicalType() {
        return physicalType;
    }

    /**
     * physical type setter
     * @param physicalType physical type
     */
    public void setPhysicalType(String physicalType) {
        this.physicalType = physicalType;
    }

    /**
     * concatenates all attributes into string format
     * @return string
     */
    public String displayTelecomAddress() {
        return "(" + nationalDirectDialingPrefix + ")" + areaCode + " " + phoneNumber + " ext. " + extension + " " +
                physicalType;
    }

    /**
     * returns a string representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "This telecom address " + displayTelecomAddress() + " is valid from " + super.getValidFrom() + " to " + super.getValidTo();
    }

    /**
     * equals method to compare 2 objects
     * @param address object
     * @return true or false if the parameter object is the same as this object
     */
    public Boolean equals(Address address) {
        if (address == null) {
            return false;
        } else if (!(address instanceof TelecomAddress)) {
            return false;
        }
        else return this.toString().equals(address.toString());

    }
}
