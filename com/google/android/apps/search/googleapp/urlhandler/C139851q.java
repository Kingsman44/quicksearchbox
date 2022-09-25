package com.google.android.apps.search.googleapp.urlhandler;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.q */
/* compiled from: PG */
public enum C139851q implements C62957cd {
    UNKNOWN(0),
    SRP(1),
    SUGGEST(2),
    DISCOVER(9),
    AMP_SRP(7),
    AMP_DISCOVER(8),
    COLLECTIONS(5),
    DOODLE(6),
    MENU(10),
    TABS_MANAGER(11),
    SETTINGS(12),
    PROMO_MANAGER(13);
    

    /* renamed from: m */
    public final int f380143m;

    private C139851q(int i) {
        this.f380143m = i;
    }

    /* renamed from: a */
    public static C139851q m227396a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SRP;
        }
        if (i == 2) {
            return SUGGEST;
        }
        switch (i) {
            case 5:
                return COLLECTIONS;
            case 6:
                return DOODLE;
            case 7:
                return AMP_SRP;
            case 8:
                return AMP_DISCOVER;
            case 9:
                return DISCOVER;
            case 10:
                return MENU;
            case 11:
                return TABS_MANAGER;
            case 12:
                return SETTINGS;
            case 13:
                return PROMO_MANAGER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m227397b() {
        return C139850p.f380129a;
    }

    public final int getNumber() {
        return this.f380143m;
    }

    public final String toString() {
        return Integer.toString(this.f380143m);
    }
}
