package es.randomco.randomapp.data.datasource.network.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ApiLocation{

    @SerializedName("street")
    @Expose
    private String street;

    @SerializedName("city")
    @Expose
    private String city;

    @SerializedName("state")
    @Expose
    private String state;

    @SerializedName("postcode")
    @Expose
    private String postcode;

    public ApiLocation(String street, String city, String state, String postcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }
}
