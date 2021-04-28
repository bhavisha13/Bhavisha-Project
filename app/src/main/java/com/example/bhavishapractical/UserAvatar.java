package com.example.bhavishapractical;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAvatar {
    @SerializedName("userAvatar")
    @Expose
    private String userAvatar;
    @SerializedName("userAvatarID")
    @Expose
    private String userAvatarID;

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserAvatarID() {
        return userAvatarID;
    }

    public void setUserAvatarID(String userAvatarID) {
        this.userAvatarID = userAvatarID;
    }

}
