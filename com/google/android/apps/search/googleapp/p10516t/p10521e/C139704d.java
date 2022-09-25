package com.google.android.apps.search.googleapp.p10516t.p10521e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.t.e.d */
/* compiled from: PG */
public enum C139704d implements C62957cd {
    UNKNOWN(0),
    WIDGET(1),
    HOME_SCREEN(2),
    SEARCH_TAB(3),
    SEARCH_RESULTS(4),
    INCOGNITO(5),
    PIXEL_LAUNCHER(6),
    PIXEL_LAUNCHER_ALL_APPS(7),
    COLLECTIONS(8),
    ONE_SEARCH_QSB(9),
    ONE_SEARCH_ALL_APPS(10),
    ONE_SEARCH_UNKNOWN(11),
    VOICE_SEARCH(12),
    GOOGLE_APP_BROWSER(13),
    SRP_BACKPRESS(14);
    

    /* renamed from: p */
    public final int f379715p;

    private C139704d(int i) {
        this.f379715p = i;
    }

    /* renamed from: a */
    public static C139704d m227141a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return WIDGET;
            case 2:
                return HOME_SCREEN;
            case 3:
                return SEARCH_TAB;
            case 4:
                return SEARCH_RESULTS;
            case 5:
                return INCOGNITO;
            case 6:
                return PIXEL_LAUNCHER;
            case 7:
                return PIXEL_LAUNCHER_ALL_APPS;
            case 8:
                return COLLECTIONS;
            case 9:
                return ONE_SEARCH_QSB;
            case 10:
                return ONE_SEARCH_ALL_APPS;
            case 11:
                return ONE_SEARCH_UNKNOWN;
            case 12:
                return VOICE_SEARCH;
            case 13:
                return GOOGLE_APP_BROWSER;
            case 14:
                return SRP_BACKPRESS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m227142b() {
        return C139703c.f379698a;
    }

    public final int getNumber() {
        return this.f379715p;
    }

    public final String toString() {
        return Integer.toString(this.f379715p);
    }
}
