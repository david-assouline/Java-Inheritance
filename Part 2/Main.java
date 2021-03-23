//---------------------------------------------------------------
// Part: 8
// Written by: David-Raphael Assouline 40082595
//---------------------------------------------------------------

import FirstPackage.Address;
import SecondPackage.EmailAddress;
import SecondPackage.TelecomAddress;
import SecondPackage.WebPageAddress;
import ThirdPackage.GeneralDeliveryAddress;
import ThirdPackage.GeographicAddress;
import ThirdPackage.PostOfficeBoxAddress;

import java.sql.SQLOutput;
import java.util.Locale;


public class Main {

    /**
     * this method takes in an array of Address objects and returns an array of a copy of the same objects
     * @param listOfAddresses a list of various address objects
     * @return copied list of address
     */
    public static Address[] copyAddresseObjects(Address[] listOfAddresses) {

        Address[] newListOfAddresses = new Address[listOfAddresses.length];
        for (int i = 0; i < listOfAddresses.length; i += 1) {

            newListOfAddresses[i] = new Address(listOfAddresses[i]);

        }
        return newListOfAddresses;
    }

    public static void main(String[] args) {
        EmailAddress email1 = new EmailAddress("david.assouline", "hotmail", "com", "2010-01-01", "2022-01-01");
        EmailAddress email2 = new EmailAddress("chiara.bettan", "hotmail", "com", "2012-01-01", "2015-01-01");
        EmailAddress email3 = new EmailAddress("mitch.marner", "hotmail", "com", "2022-01-01", "2024-01-01");

        TelecomAddress telecom1 = new TelecomAddress("1", "0", 514, 8240228, 222, "landline", "2008-01-01", "2009-01-01");
        TelecomAddress telecom2 = new TelecomAddress("2", "22", 438, 4582802, 911, "mobile", "2019-01-01", "2022-01-01");
        TelecomAddress telecom3 = new TelecomAddress("3", "24", 416, 2959513, 411, "fax", "2017-01-01", "2020-01-01");

        WebPageAddress webPageAddress1 = new WebPageAddress("google", "images", "2015-01-01", "2025-01-01");
        WebPageAddress webPageAddress2 = new WebPageAddress("facebook", "profile", "2016-01-01", "2024-01-01");
        WebPageAddress webPageAddress3 = new WebPageAddress("instagram", "story", "2017-01-01", "2023-01-01");

        GeographicAddress geographicAddress1 = new GeographicAddress("5140 avenue macdonald", "Cote-Saint-Luc", "Quebec", "H3X 3Z1", new Locale("en", "CA"), "2018-01-01", "2022-01-01");
        GeographicAddress geographicAddress2 = new GeographicAddress("2365 rue de l'acajou", "ville saint-laurent", "Quebec", "H2R 2B8", new Locale("en", "CA"), "2019-01-01", "2021-01-01");
        GeographicAddress geographicAddress3 = new GeographicAddress("787 rue bertrand", "ville saint-laurent", "Quebec", "H4M 1W1", new Locale("en", "CA"), "2020-01-01", "2020-01-02");

        GeneralDeliveryAddress generalDeliveryAddress1 = new GeneralDeliveryAddress("69 albion road", "hampstead", "quebec", "H3X 2Z1", new Locale("en", "CA"), telecom1, "2010-01-01", "2030-01-01");
        GeneralDeliveryAddress generalDeliveryAddress2 = new GeneralDeliveryAddress("420 moon avenue", "san fransisco", "california", "44332", new Locale("en", "CA"), telecom2, "2015-01-01", "2025-01-01");
        GeneralDeliveryAddress generalDeliveryAddress3 = new GeneralDeliveryAddress("99 gretzy way", "edmonton", "alberta", "T7N 7T7", new Locale("en", "CA"), telecom3, "2017-01-01", "2018-01-01");

        PostOfficeBoxAddress postOfficeBoxAddress1 = new PostOfficeBoxAddress("545 chamberlain", "cote saint luc", "quebec", "h6t t8t", new Locale("en", "CA"), 313, "2018-01-01", "2019-01-01");
        PostOfficeBoxAddress postOfficeBoxAddress2 = new PostOfficeBoxAddress("1 microsoft way", "vancouver", "british columbia", "k9k 9k9", new Locale("en", "CA"), 514, "2019-01-01", "2020-01-01");
        PostOfficeBoxAddress postOfficeBoxAddress3 = new PostOfficeBoxAddress("2 shopify way", "toronto", "ontario", "j0j 0j0", new Locale("en", "CA"), 888, "2020-01-01", "2021-01-01");

        Address[] listOfAddresses = {email1, email2, email3, telecom1, telecom2, telecom3, webPageAddress1, webPageAddress2, webPageAddress3, geographicAddress1, geographicAddress2, geographicAddress3,
                generalDeliveryAddress1, generalDeliveryAddress2, generalDeliveryAddress3, postOfficeBoxAddress1, postOfficeBoxAddress2, postOfficeBoxAddress3};

       Address[] copiedListOfAddresses = copyAddresseObjects(listOfAddresses);

        for (Address listOfAddress : listOfAddresses) {
            System.out.println(listOfAddress);
        }

        for (Address copiedListOfAddress : copiedListOfAddresses) {
            System.out.println(copiedListOfAddress);
        }

        System.out.println("\nThe copying process did not work as intended. because the passed array was an array of " +
                "Address objects, the copy constructor used was the one found in the address class, and not the copy " +
                "constructor located in the subclass. \n\nNow terminating the program, goodbye!");



    }

    /**
     * Compares the validFrom and validTo of each address in the list of addresses to the date passed into the method as
     * parameters, and prints to the console every address which is obsolete
     * @param listOfAddresses a list of address objects
     * @param year a 4 digit integer representing a year
     * @param month a 2 digit integer representing a month
     * @param day a 2 digit integer representing a day
     */
    public static void traceObsoleteAddresses(Address[] listOfAddresses, int year, int month, int day) {
        for (int i = 0; i < listOfAddresses.length; i += 1) {
            String validFrom = listOfAddresses[i].getValidFrom();
            int validFromYear = Integer.parseInt(validFrom.substring(0, 4));
            int validFromMonth = Integer.parseInt(validFrom.substring(5, 7));
            int validFromDay = Integer.parseInt(validFrom.substring(8, 10));
            String validTo = listOfAddresses[i].getValidTo();
            int validToYear = Integer.parseInt(validTo.substring(0, 4));
            int validToMonth = Integer.parseInt(validTo.substring(5, 7));
            int validToDay = Integer.parseInt(validTo.substring(8, 10));
            if (validFromYear < year && validToYear > year){
                continue;
            }
            if (validFromYear > year || validToYear < year) {
                System.out.println("The Address at index " + i + " is obsolete!");
            } else if (validToMonth < month) {
                System.out.println("The Address at index " + i + " is obsolete!");
            } else if (validToDay < day) {
                System.out.println("The Address at index " + i + " is obsolete!");
            }
        }
    }
}
