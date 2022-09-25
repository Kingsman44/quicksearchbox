package com.google.android.libraries.search.udcdataservice;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.udcdataservice.c */
/* compiled from: PG */
public enum C41387c implements C62957cd {
    DEFAULT(0),
    AUDIO_HISTORY(1),
    DEVICE_APPS(2),
    DEVICE_CONTACTS(3),
    LOCATION_HISTORY_AND_REPORTING(4),
    WEB_HISTORY(5),
    WEB_AND_APP_HISTORY(6);
    

    /* renamed from: h */
    public final int f108142h;

    private C41387c(int i) {
        this.f108142h = i;
    }

    /* renamed from: a */
    public static C41387c m72380a(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return AUDIO_HISTORY;
            case 2:
                return DEVICE_APPS;
            case 3:
                return DEVICE_CONTACTS;
            case 4:
                return LOCATION_HISTORY_AND_REPORTING;
            case 5:
                return WEB_HISTORY;
            case 6:
                return WEB_AND_APP_HISTORY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m72381b() {
        return C41386b.f108133a;
    }

    public final int getNumber() {
        return this.f108142h;
    }

    public final String toString() {
        return Integer.toString(this.f108142h);
    }
}
