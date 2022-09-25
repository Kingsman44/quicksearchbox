package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ba.a.b.a.af */
/* compiled from: PG */
public enum C54813af implements C62957cd {
    UNKNOWN(0),
    ASSISTANT_FOOTPRINTS(1),
    ASSISTANT_CORPUS(2),
    SEARCH_CORPUS(3),
    CHALKBOARD(8),
    OFFLINE_CLIENT(9),
    APPS(6),
    APP_SHORTCUT_DYNAMIC(10),
    APP_SHORTCUT_STATIC(11),
    CONTACTS(12),
    APP_ACTION(4),
    APP_ACTION_SHORTCUT(7);
    

    /* renamed from: m */
    public final int f143813m;

    private C54813af(int i) {
        this.f143813m = i;
    }

    /* renamed from: a */
    public static C54813af m87536a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ASSISTANT_FOOTPRINTS;
            case 2:
                return ASSISTANT_CORPUS;
            case 3:
                return SEARCH_CORPUS;
            case 4:
                return APP_ACTION;
            case 6:
                return APPS;
            case 7:
                return APP_ACTION_SHORTCUT;
            case 8:
                return CHALKBOARD;
            case 9:
                return OFFLINE_CLIENT;
            case 10:
                return APP_SHORTCUT_DYNAMIC;
            case 11:
                return APP_SHORTCUT_STATIC;
            case 12:
                return CONTACTS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87537b() {
        return C54812ae.f143799a;
    }

    public final int getNumber() {
        return this.f143813m;
    }

    public final String toString() {
        return Integer.toString(this.f143813m);
    }
}
