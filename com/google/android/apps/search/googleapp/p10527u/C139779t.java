package com.google.android.apps.search.googleapp.p10527u;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.u.t */
/* compiled from: PG */
public enum C139779t implements C62957cd {
    UNSPECIFIED(0),
    HOME_SCREEN(1),
    SEARCH(2),
    COLLECTIONS(6),
    TABS(7),
    INCOGNITO_SETTINGS(8),
    GOOGLE_APP_BROWSER(9),
    INBOX(11);
    

    /* renamed from: i */
    public final int f379907i;

    private C139779t(int i) {
        this.f379907i = i;
    }

    /* renamed from: a */
    public static C139779t m227245a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return HOME_SCREEN;
        }
        if (i == 2) {
            return SEARCH;
        }
        if (i == 11) {
            return INBOX;
        }
        switch (i) {
            case 6:
                return COLLECTIONS;
            case 7:
                return TABS;
            case 8:
                return INCOGNITO_SETTINGS;
            case 9:
                return GOOGLE_APP_BROWSER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m227246b() {
        return C139778s.f379897a;
    }

    public final int getNumber() {
        return this.f379907i;
    }

    public final String toString() {
        return Integer.toString(this.f379907i);
    }
}
