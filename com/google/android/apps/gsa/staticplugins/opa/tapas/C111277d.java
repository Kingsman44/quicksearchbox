package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.d */
/* compiled from: PG */
public enum C111277d implements C62957cd {
    ACTIVE(0),
    ZERO_PREFIX(1),
    COMMS(2),
    MEDIA(3),
    VIDEO(4),
    NAV(5),
    APPS(6),
    APP_ACTIONS(7),
    HOME_AUTOMATION(12),
    COMPLETE_SERVER(9),
    DEVICE_WIDGET(11),
    OTHER(10);
    

    /* renamed from: m */
    private final int f309671m;

    private C111277d(int i) {
        this.f309671m = i;
    }

    /* renamed from: a */
    public static C111277d m185039a(int i) {
        switch (i) {
            case 0:
                return ACTIVE;
            case 1:
                return ZERO_PREFIX;
            case 2:
                return COMMS;
            case 3:
                return MEDIA;
            case 4:
                return VIDEO;
            case 5:
                return NAV;
            case 6:
                return APPS;
            case 7:
                return APP_ACTIONS;
            case 9:
                return COMPLETE_SERVER;
            case 10:
                return OTHER;
            case 11:
                return DEVICE_WIDGET;
            case 12:
                return HOME_AUTOMATION;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f309671m;
    }

    public final String toString() {
        return Integer.toString(this.f309671m);
    }
}
