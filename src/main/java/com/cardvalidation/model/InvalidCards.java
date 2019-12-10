package com.cardvalidation.model;

public class InvalidCards {
    public String invalidCardNumber;

    @Override
    public String toString() {
        return "InvalidCards{" +
                "invalidCardNumber='" + invalidCardNumber + '\'' +
                '}';
    }

    public String getInvalidCardNumber() {
        return invalidCardNumber;
    }

    public void setInvalidCardNumber(String invalidCardNumber) {
        this.invalidCardNumber = invalidCardNumber;
    }
}
