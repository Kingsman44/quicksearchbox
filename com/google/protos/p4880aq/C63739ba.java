package com.google.protos.p4880aq;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aq.ba */
/* compiled from: PG */
public enum C63739ba implements C62957cd {
    UNSET_TAB_TYPE(0),
    HOME_SCREEN(1),
    SEARCH(2),
    COLLECTIONS(5),
    TABS(6),
    INCOGNITO_SETTINGS(7),
    MINUS_ONE(8),
    GOOGLE_APP_BROWSER(9);
    

    /* renamed from: i */
    public final int f172434i;

    private C63739ba(int i) {
        this.f172434i = i;
    }

    /* renamed from: a */
    public static C63739ba m96294a(int i) {
        if (i == 0) {
            return UNSET_TAB_TYPE;
        }
        if (i == 1) {
            return HOME_SCREEN;
        }
        if (i == 2) {
            return SEARCH;
        }
        switch (i) {
            case 5:
                return COLLECTIONS;
            case 6:
                return TABS;
            case 7:
                return INCOGNITO_SETTINGS;
            case 8:
                return MINUS_ONE;
            case 9:
                return GOOGLE_APP_BROWSER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96295b() {
        return C63737az.f172423a;
    }

    public final int getNumber() {
        return this.f172434i;
    }

    public final String toString() {
        return Integer.toString(this.f172434i);
    }
}
