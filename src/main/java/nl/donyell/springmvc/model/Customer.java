package nl.donyell.springmvc.model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;
    @NotNull(message = "Not allowed to be null")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "Not allowed to be empty.")
    @Min(value = 0, message = "Must be equal to or greater than 0.")
    @Max(value = 10, message = "Must be equal to or less than 10.")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only five digits or characters.")
    private String postalCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
