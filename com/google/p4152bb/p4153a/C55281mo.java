package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.mo */
/* compiled from: PG */
public enum C55281mo implements C62957cd {
    UNKNOWN(0),
    GOOGLE_NOW(1),
    GOOGLE_NOW_NOTIFICATIONS(2),
    DEVICE_APPS(7),
    DEVICE_CONTACTS(8),
    DEVICE_STATE_AND_CONTENT(3),
    WEB_HISTORY(5),
    WEB_AND_APP_HISTORY(4),
    SIGNED_IN(6);
    

    /* renamed from: j */
    public final int f145615j;

    private C55281mo(int i) {
        this.f145615j = i;
    }

    /* renamed from: a */
    public static C55281mo m87651a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return GOOGLE_NOW;
            case 2:
                return GOOGLE_NOW_NOTIFICATIONS;
            case 3:
                return DEVICE_STATE_AND_CONTENT;
            case 4:
                return WEB_AND_APP_HISTORY;
            case 5:
                return WEB_HISTORY;
            case 6:
                return SIGNED_IN;
            case 7:
                return DEVICE_APPS;
            case 8:
                return DEVICE_CONTACTS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87652b() {
        return C55280mn.f145604a;
    }

    public final int getNumber() {
        return this.f145615j;
    }

    public final String toString() {
        return Integer.toString(this.f145615j);
    }
}
