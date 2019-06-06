
package com.example.aakash.apiandroid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseBody {

    @SerializedName("business_partner_id")
    @Expose
    private Integer businessPartnerId;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("middle_name")
    @Expose
    private String middleName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("organization_name")
    @Expose
    private String organizationName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("mobile_number")
    @Expose
    private String mobileNumber;
    @SerializedName("alternate_number")
    @Expose
    private String alternateNumber;
    @SerializedName("GSTIN")
    @Expose
    private Object GSTIN;
    @SerializedName("area")
    @Expose
    private Area area;
    @SerializedName("city")
    @Expose
    private City city;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("date_of_birth")
    @Expose
    private String date_of_birth;
    @SerializedName("outstanding_balance")
    @Expose
    private String outstanding_balance;

    public Integer getBusinessPartnerId() {
        return businessPartnerId;
    }

    public void setBusinessPartnerId(Integer businessPartnerId) {
        this.businessPartnerId = businessPartnerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternateNumber() {
        return alternateNumber;
    }

    public void setAlternateNumber(String alternateNumber) {
        this.alternateNumber = alternateNumber;
    }

    public Object getGSTIN() {
        return GSTIN;
    }

    public void setGSTIN(Object GSTIN) {
        this.GSTIN = GSTIN;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getOutstanding_balance() {
        return outstanding_balance;
    }

    public void setOutstanding_balance(String outstanding_balance) {
        this.outstanding_balance = outstanding_balance;
    }
}
