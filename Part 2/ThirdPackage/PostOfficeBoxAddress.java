//---------------------------------------------------------------
// Part: 7
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

package ThirdPackage;

import FirstPackage.Address;
import SecondPackage.TelecomAddress;

import java.util.Locale;

public class PostOfficeBoxAddress extends GeographicAddress {


    int boxLobbyDoorCode;

    /**
     * default constructor
     */
    public PostOfficeBoxAddress() {
        super();

    }

    /**
     * Constructor with parameters
     * @param addressLine address line
     * @param city city
     * @param regionOrState region or state
     * @param zipOrPostCode zip or postcode
     * @param locale locale
     * @param boxLobbyDoorCode box lobby door code
     * @param validFrom valid from date
     * @param validTO valid to date
     */
    public PostOfficeBoxAddress(String addressLine, String city, String regionOrState, String zipOrPostCode,
                                Locale locale, int boxLobbyDoorCode, String validFrom, String validTO) {

        super(addressLine, city, regionOrState, zipOrPostCode, locale, validFrom, validTO);
        this.boxLobbyDoorCode = boxLobbyDoorCode;

    }

    /**
     * Copy Contructor
     * @param PostOfficeBoxAddress object to copy contents from
     */
    public PostOfficeBoxAddress(PostOfficeBoxAddress PostOfficeBoxAddress) {


        super(PostOfficeBoxAddress.addressLine, PostOfficeBoxAddress.city, PostOfficeBoxAddress.regionOrState,
                PostOfficeBoxAddress.zipOrPostCode, PostOfficeBoxAddress.locale, PostOfficeBoxAddress.validFrom, PostOfficeBoxAddress.validTo);
        this.boxLobbyDoorCode = PostOfficeBoxAddress.boxLobbyDoorCode;
    }

    /**
     * @return int
     */
    public int getBoxLobbyDoorCode() {
        return boxLobbyDoorCode;
    }

    /**
     * sets the value for box lobby door code
     * @param boxLobbyDoorCode box lobby door code
     */
    public void setBoxLobbyDoorCode(int boxLobbyDoorCode) {
        this.boxLobbyDoorCode = boxLobbyDoorCode;
    }

    /**
     * returns a string representation of the object
     * @return string representation of the object
     */
    @Override
    public String toString() {
        return "This post office box address " + addressLine + ", " + city + ", " + regionOrState + ", " + zipOrPostCode +
                ", " + locale + ", " + boxLobbyDoorCode + " is valid from " + super.getValidFrom() + " to " + super.getValidTo();
    }

    /**
     * equals method to compare 2 objects
     * @param address address object
     * @return true or false if the parameter object is the same as this object
     */
    public Boolean equals(Address address) {
        if (address == null) {
            return false;
        } else if (!(address instanceof PostOfficeBoxAddress)) {
            return false;
        } else return this.toString().equals(address.toString());
    }

}