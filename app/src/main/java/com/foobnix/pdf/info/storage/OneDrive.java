package com.foobnix.pdf.info.storage;

public class OneDrive implements CloudProvider {
    public static final String PREFIX_PROVIDER = PREFIX_CLOUD + "onedrive:";

    @Override
    public void init() {

    }

    @Override
    public String getPrefixProvider() {
        return PREFIX_PROVIDER;
    }

    @Override
    public String getTypeName() {
        return null;
    }

    @Override
    public String getPrefix() {
        return null;
    }

    @Override
    public boolean isResonsible(String url) {
        return false;
    }

    @Override
    public String getLogin() {
        return null;
    }

    @Override
    public boolean isRegistered() {
        return false;
    }
}
