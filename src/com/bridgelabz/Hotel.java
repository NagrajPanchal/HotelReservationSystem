package com.bridgelabz;

public class Hotel
{
    String Name;
    int weekdayDatesRegularCustomer;
    int weekendRatesRegularCustomer;

    public Hotel() {
    }

    public Hotel(String name, int weekdayDatesRegularCustomer, int weekendRatesRegularCustomer) {
        Name = name;
        this.weekdayDatesRegularCustomer = weekdayDatesRegularCustomer;
        this.weekendRatesRegularCustomer = weekendRatesRegularCustomer;
    }

    @Override
    public String toString() {
        return "HotelDetails =>" +
                " Name of the Hotel : " + Name + '\t' +
                ", weekdayDatesRegularCustomer : " + weekdayDatesRegularCustomer +
                ", weekendRatesRegularCustomer : " + weekendRatesRegularCustomer;
    }
}
