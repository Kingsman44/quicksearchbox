package com.google.android.apps.gsa.staticplugins.messages.monet.p8034a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.a.b */
/* compiled from: PG */
public enum C102721b implements C62957cd {
    UNKNOWN_BUTTON(0),
    GET_NOTIFIED(2),
    INSTALL_LANGUAGE_PACK(3),
    MANAGE_PENDING_SEARCHES(4),
    OPEN_AIRPLANE_MODE_SETTINGS(5),
    OPEN_DATA_ROAMING_SETTINGS(6),
    OPEN_DATA_USAGE_SETTINGS(7),
    OPEN_DATETIME_SETTINGS(8),
    OPEN_PERMISSIONS_DIALOG(10),
    RETRY(11),
    SELECT_WIFI_NETWORK(12),
    SIGN_IN_TO_NETWORK(13),
    TRIGGER_NEXT_MESSAGE(15),
    TURN_ON_WIFI(14);
    

    /* renamed from: o */
    public final int f286769o;

    private C102721b(int i) {
        this.f286769o = i;
    }

    /* renamed from: a */
    public static C102721b m170317a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUTTON;
            case 2:
                return GET_NOTIFIED;
            case 3:
                return INSTALL_LANGUAGE_PACK;
            case 4:
                return MANAGE_PENDING_SEARCHES;
            case 5:
                return OPEN_AIRPLANE_MODE_SETTINGS;
            case 6:
                return OPEN_DATA_ROAMING_SETTINGS;
            case 7:
                return OPEN_DATA_USAGE_SETTINGS;
            case 8:
                return OPEN_DATETIME_SETTINGS;
            case 10:
                return OPEN_PERMISSIONS_DIALOG;
            case 11:
                return RETRY;
            case 12:
                return SELECT_WIFI_NETWORK;
            case 13:
                return SIGN_IN_TO_NETWORK;
            case 14:
                return TURN_ON_WIFI;
            case 15:
                return TRIGGER_NEXT_MESSAGE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m170318b() {
        return C102720a.f286753a;
    }

    public final int getNumber() {
        return this.f286769o;
    }

    public final String toString() {
        return Integer.toString(this.f286769o);
    }
}
