package com.foobnix.pdf.info.storage;

public interface CloudProvider {
    public static final String PREFIX_CLOUD = "cloud-";

    public void init();

    public String getPrefixProvider();

    public String getTypeName();

    public String getPrefix();

    public boolean isResonsible(String url);

    public String getLogin();

    public boolean isRegistered();

}
