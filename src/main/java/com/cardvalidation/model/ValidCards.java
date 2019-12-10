package com.cardvalidation.model;

public class ValidCards
{
    public String validCardNumber;

    public String getValidCardNumber() {
        return validCardNumber;
    }

    public void setValidCardNumber(String validCardNumber) {
        this.validCardNumber = validCardNumber;
    }

    @Override
    public String toString() {
        return "ValidCards{" +
                "validCardNumber='" + validCardNumber + '\'' +
                '}';
    }
}
