// UC1 : Add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem
{
    public static void main(String[] args)
    {
        List<Hotel> hotelList = new ArrayList<>();
        Hotel lakewood = new Hotel();
        lakewood.Name = "LakeWood";
        lakewood.weekdayDatesRegularCustomer = 110;
        lakewood.weekendRatesRegularCustomer = 90;
        Hotel bridgewood = new Hotel();
        bridgewood.Name = "Bridgewood";
        bridgewood.weekdayDatesRegularCustomer = 160;
        bridgewood.weekendRatesRegularCustomer = 60;
        Hotel ridgewood = new Hotel();
        ridgewood.Name = "Ridgewood";
        ridgewood.weekdayDatesRegularCustomer = 220;
        ridgewood.weekendRatesRegularCustomer = 150;
        hotelList.add(lakewood);
        hotelList.add(bridgewood);
        hotelList.add(ridgewood);
        System.out.println(lakewood);
        System.out.println(bridgewood);
        System.out.println(ridgewood);

    }
}
