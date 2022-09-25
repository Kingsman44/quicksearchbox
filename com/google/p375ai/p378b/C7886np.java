package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ai.b.np */
/* compiled from: PG */
public enum C7886np implements C62957cd {
    UNKNOWN(0),
    LOCATION_HISTORY_AND_REPORTING(1),
    DEPRECATED_DEVICE_STATE_AND_CONTENT(2),
    WEB_AND_APP_HISTORY(4),
    AUDIO_HISTORY(5),
    WEB_HISTORY(6),
    GOOGLE_NOW_CARDS(7),
    NON_PERSONALIZED_CARDS(8),
    GOOGLE_NOW_ON_TAP(9),
    GOOGLE_NOW_AUTO_ACTIVATION(10),
    DEPRECATED_GOOGLE_NOW_AUTO_ACTIVATION_FOR_NEW_USERS(11),
    GOOGLE_NOW_AUTO_ACTIVATION_FOR_EXISTING_USERS(12),
    DEVICE_APPS(13),
    DEVICE_CONTACTS(14);
    

    /* renamed from: o */
    public final int f27679o;

    private C7886np(int i) {
        this.f27679o = i;
    }

    /* renamed from: a */
    public static C7886np m22886a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return LOCATION_HISTORY_AND_REPORTING;
            case 2:
                return DEPRECATED_DEVICE_STATE_AND_CONTENT;
            case 4:
                return WEB_AND_APP_HISTORY;
            case 5:
                return AUDIO_HISTORY;
            case 6:
                return WEB_HISTORY;
            case 7:
                return GOOGLE_NOW_CARDS;
            case 8:
                return NON_PERSONALIZED_CARDS;
            case 9:
                return GOOGLE_NOW_ON_TAP;
            case 10:
                return GOOGLE_NOW_AUTO_ACTIVATION;
            case 11:
                return DEPRECATED_GOOGLE_NOW_AUTO_ACTIVATION_FOR_NEW_USERS;
            case 12:
                return GOOGLE_NOW_AUTO_ACTIVATION_FOR_EXISTING_USERS;
            case 13:
                return DEVICE_APPS;
            case 14:
                return DEVICE_CONTACTS;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f27679o;
    }

    public final String toString() {
        return Integer.toString(this.f27679o);
    }
}
