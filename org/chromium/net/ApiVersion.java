package org.chromium.net;

/* compiled from: PG */
public class ApiVersion {
    private static final int API_LEVEL = 16;
    private static final String CRONET_VERSION = "105.0.5195.17";
    private static final String LAST_CHANGE = "df3477733517f5c39c12025f19b2a8e606b34061-refs/branch-heads/5195@{#160}";
    private static final int MIN_COMPATIBLE_API_LEVEL = 3;

    private ApiVersion() {
    }

    public static int getApiLevel() {
        return 3;
    }

    public static String getCronetVersion() {
        return CRONET_VERSION;
    }

    public static String getCronetVersionWithLastChange() {
        return "105.0.5195.17@".concat("df347773");
    }

    public static String getLastChange() {
        return LAST_CHANGE;
    }

    public static int getMaximumAvailableApiLevel() {
        return 16;
    }
}
