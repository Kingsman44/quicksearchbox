package com.google.android.play.core.install.p3543a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.play.core.install.a.a */
/* compiled from: PG */
public final class C45198a {

    /* renamed from: a */
    public static final Map f117957a;

    /* renamed from: b */
    public static final Map f117958b;

    static {
        HashMap hashMap = new HashMap();
        f117957a = hashMap;
        HashMap hashMap2 = new HashMap();
        f117958b = hashMap2;
        hashMap.put(-2, "An unknown error occurred.");
        hashMap.put(-3, "The API is not available on this device.");
        hashMap.put(-4, "The request that was sent by the app is malformed.");
        hashMap.put(-5, "The install is unavailable to this user or device.");
        hashMap.put(-6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).");
        hashMap.put(-7, "The install/update has not been (fully) downloaded yet.");
        hashMap.put(-8, "The install is already in progress and there is no UI flow to resume.");
        hashMap.put(-9, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        hashMap.put(-100, "An internal error happened in the Play Store.");
        hashMap2.put(-2, "ERROR_UNKNOWN");
        hashMap2.put(-3, "ERROR_API_NOT_AVAILABLE");
        hashMap2.put(-4, "ERROR_INVALID_REQUEST");
        hashMap2.put(-5, "ERROR_INSTALL_UNAVAILABLE");
        hashMap2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap2.put(-7, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        hashMap2.put(-100, "ERROR_INTERNAL_ERROR");
        hashMap2.put(-9, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap2.put(-10, "ERROR_APP_NOT_OWNED");
        hashMap2.put(-100, "ERROR_INTERNAL_ERROR");
    }
}
