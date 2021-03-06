package gatech.cs2340.shelterme.models;

import android.os.StrictMode;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Created by danielholliday on 3/7/18.
 */

public class Shelter {

    private String _id;
    private int unique_key;
    private String shelter_name;
    private String capacity;
    private String restrictions;
    private double longitude;
    private double latitude;
    private String address;
    private String special_notes;
    private String phone_number;
    private int __v;

    public Shelter(String _id, int unique_key, String shelter_name, String capacity,
                   String restrictions, double longitude, double latitude,
                   String address, String special_notes, String phone_number, int __v) {
        this._id = _id;
        this.unique_key = unique_key;
        this.shelter_name = shelter_name;
        this.capacity = capacity;
        this.restrictions = restrictions;
        this.longitude = longitude;
        this.latitude = latitude;
        this.address = address;
        this.special_notes = special_notes;
        this.phone_number = phone_number;
        this.__v = __v;
    }

    /**
     * dummy constructor
     */
    public Shelter() {

    }

    @JsonGetter("_id")
    public String get_id() {
        return _id;
    }
    @JsonSetter("_id")
    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonGetter("unique_key")
    public int getUnique_key() {
        return unique_key;
    }
    @JsonSetter("unique_key")
    public void setUnique_key(int unique_key) {
        this.unique_key = unique_key;
    }

    public String getShelter_name() {
        return shelter_name;
    }
    @JsonSetter("_id")
    public void setShelter_name(String shelter_name) {
        this.shelter_name = shelter_name;
    }

    @JsonGetter("capacity")
    public String getCapacity() {
        return capacity;
    }
    @JsonSetter("capacity")
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @JsonGetter("restrictions")
    public String getRestrictions() {
        return restrictions;
    }
    @JsonSetter("restrictions")
    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    @JsonGetter("longitude")
    public double getLongitude() {
        return longitude;
    }
    @JsonSetter("longitude")
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @JsonGetter("latitude")
    public double getLatitude() {
        return latitude;
    }
    @JsonSetter("latitude")
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @JsonGetter("address")
    public String getAddress() {
        return address;
    }
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonGetter("special_notes")
    public String getSpecial_notes() {
        return special_notes;
    }
    @JsonSetter("special_notes")
    public void setSpecial_notes(String special_notes) {
        this.special_notes = special_notes;
    }

    @JsonGetter("phone_number")
    public String getPhone_number() {
        return phone_number;
    }
    @JsonSetter("phone_number")
    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    @JsonGetter("__v")
    public int get__v() {
        return __v;
    }
    @JsonSetter("__v")
    public void set_v(int __v) {
        this.__v = __v;
    }

    @Override
    public String toString() {
        String info = String.format("Shelter Info: uniqueKey = %d, shelterName = %s, " +
                        "capacity = %s, restrictions = %s, longitude = %d, latitude = %d, " +
                        "address = %s, specialNotes = %s, phoneNumber = %s", unique_key, shelter_name,
                capacity, restrictions, longitude, latitude, address, special_notes, phone_number);
        return "hi";
    }
}
