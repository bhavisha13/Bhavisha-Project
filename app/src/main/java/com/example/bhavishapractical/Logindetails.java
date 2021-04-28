package com.example.bhavishapractical;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Logindetails {
    @SerializedName("userID")
    @Expose
    private String userID;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;
    @SerializedName("birthDay")
    @Expose
    private String birthDay;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("showGenderIdentity")
    @Expose
    private String showGenderIdentity;
    @SerializedName("datesFor")
    @Expose
    private Object datesFor;
    @SerializedName("identifyAs")
    @Expose
    private Object identifyAs;
    @SerializedName("lookingFor")
    @Expose
    private Object lookingFor;
    @SerializedName("visibleTo")
    @Expose
    private Object visibleTo;
    @SerializedName("iamInto")
    @Expose
    private Object iamInto;
    @SerializedName("relationship")
    @Expose
    private String relationship;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("aboutUser")
    @Expose
    private String aboutUser;
    @SerializedName("socialID")
    @Expose
    private String socialID;
    @SerializedName("loginType")
    @Expose
    private String loginType;
    @SerializedName("stateID")
    @Expose
    private String stateID;
    @SerializedName("countryID")
    @Expose
    private String countryID;
    @SerializedName("dogPlayStyle")
    @Expose
    private Object dogPlayStyle;
    @SerializedName("dogTemperament")
    @Expose
    private Object dogTemperament;
    @SerializedName("introduction")
    @Expose
    private Object introduction;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("onlineStatus")
    @Expose
    private String onlineStatus;
    @SerializedName("isDeleted")
    @Expose
    private String isDeleted;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("ipAddress")
    @Expose
    private String ipAddress;
    @SerializedName("age")
    @Expose
    private String age;
    @SerializedName("userAvatar")
    @Expose
    private List<UserAvatar> userAvatar = null;
    @SerializedName("accessToken")
    @Expose
    private String accessToken;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getShowGenderIdentity() {
        return showGenderIdentity;
    }

    public void setShowGenderIdentity(String showGenderIdentity) {
        this.showGenderIdentity = showGenderIdentity;
    }

    public Object getDatesFor() {
        return datesFor;
    }

    public void setDatesFor(Object datesFor) {
        this.datesFor = datesFor;
    }

    public Object getIdentifyAs() {
        return identifyAs;
    }

    public void setIdentifyAs(Object identifyAs) {
        this.identifyAs = identifyAs;
    }

    public Object getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(Object lookingFor) {
        this.lookingFor = lookingFor;
    }

    public Object getVisibleTo() {
        return visibleTo;
    }

    public void setVisibleTo(Object visibleTo) {
        this.visibleTo = visibleTo;
    }

    public Object getIamInto() {
        return iamInto;
    }

    public void setIamInto(Object iamInto) {
        this.iamInto = iamInto;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAboutUser() {
        return aboutUser;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }

    public String getSocialID() {
        return socialID;
    }

    public void setSocialID(String socialID) {
        this.socialID = socialID;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getStateID() {
        return stateID;
    }

    public void setStateID(String stateID) {
        this.stateID = stateID;
    }

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public Object getDogPlayStyle() {
        return dogPlayStyle;
    }

    public void setDogPlayStyle(Object dogPlayStyle) {
        this.dogPlayStyle = dogPlayStyle;
    }

    public Object getDogTemperament() {
        return dogTemperament;
    }

    public void setDogTemperament(Object dogTemperament) {
        this.dogTemperament = dogTemperament;
    }

    public Object getIntroduction() {
        return introduction;
    }

    public void setIntroduction(Object introduction) {
        this.introduction = introduction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOnlineStatus() {
        return onlineStatus;
    }

    public void setOnlineStatus(String onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<UserAvatar> getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(List<UserAvatar> userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }


}
