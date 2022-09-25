package com.google.android.youtube.player;

/* renamed from: com.google.android.youtube.player.f */
public enum C45510f {
    SUCCESS,
    INTERNAL_ERROR,
    UNKNOWN_ERROR,
    SERVICE_MISSING,
    SERVICE_VERSION_UPDATE_REQUIRED,
    SERVICE_DISABLED,
    SERVICE_INVALID,
    ERROR_CONNECTING_TO_SERVICE,
    CLIENT_LIBRARY_UPDATE_REQUIRED,
    NETWORK_ERROR,
    DEVELOPER_KEY_INVALID,
    INVALID_APPLICATION_SIGNATURE;

    /* renamed from: a */
    public static C45510f m81264a(String str) {
        return (C45510f) Enum.valueOf(C45510f.class, str);
    }
}
