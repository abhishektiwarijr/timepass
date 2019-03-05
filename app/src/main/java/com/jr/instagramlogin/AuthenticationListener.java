package com.jr.instagramlogin;

public interface AuthenticationListener {
    void onTokenReceived(String auth_token);
}