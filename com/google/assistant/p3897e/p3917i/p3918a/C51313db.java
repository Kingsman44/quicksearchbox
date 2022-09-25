package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.db */
/* compiled from: PG */
public enum C51313db implements C62957cd {
    UNKNOWN(0),
    OPA(1),
    SEARCH(2),
    ALWAYS_SRP(3),
    EYES(4),
    LENS_INTENT(5),
    GMM(6),
    GHA(7),
    WAZE(8),
    SEARCH_LITE(9),
    MAESTRO_PROACTIVE(10),
    NGA(11),
    IGSA(12),
    MAPS_TINY(13),
    YT_MWEB(14),
    CHROME(15),
    YT_APP_INTEGRATION(16),
    IOS_BUBBLE_CHARACTERS(17);
    

    /* renamed from: s */
    public final int f133603s;

    private C51313db(int i) {
        this.f133603s = i;
    }

    /* renamed from: a */
    public static C51313db m86123a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OPA;
            case 2:
                return SEARCH;
            case 3:
                return ALWAYS_SRP;
            case 4:
                return EYES;
            case 5:
                return LENS_INTENT;
            case 6:
                return GMM;
            case 7:
                return GHA;
            case 8:
                return WAZE;
            case 9:
                return SEARCH_LITE;
            case 10:
                return MAESTRO_PROACTIVE;
            case 11:
                return NGA;
            case 12:
                return IGSA;
            case 13:
                return MAPS_TINY;
            case 14:
                return YT_MWEB;
            case 15:
                return CHROME;
            case 16:
                return YT_APP_INTEGRATION;
            case 17:
                return IOS_BUBBLE_CHARACTERS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86124b() {
        return C51312da.f133583a;
    }

    public final int getNumber() {
        return this.f133603s;
    }

    public final String toString() {
        return Integer.toString(this.f133603s);
    }
}
