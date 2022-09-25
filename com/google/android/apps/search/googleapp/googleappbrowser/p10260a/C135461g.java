package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.g */
/* compiled from: PG */
public enum C135461g implements C62957cd {
    UNKNOWN(0),
    SRP(1),
    NOW(2),
    AMP(3),
    AMP_NOW(4),
    GOC(5),
    GAB(6),
    SUGGEST(7),
    COLLECTIONS(8),
    DOODLE(9),
    MENU(10),
    TABS_MANAGER(11),
    GAB_NEW_TAB_CREATION(12),
    SETTINGS(13),
    PROMO_MANAGER(15);
    

    /* renamed from: p */
    public final int f369058p;

    private C135461g(int i) {
        this.f369058p = i;
    }

    /* renamed from: a */
    public static C135461g m219650a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SRP;
            case 2:
                return NOW;
            case 3:
                return AMP;
            case 4:
                return AMP_NOW;
            case 5:
                return GOC;
            case 6:
                return GAB;
            case 7:
                return SUGGEST;
            case 8:
                return COLLECTIONS;
            case 9:
                return DOODLE;
            case 10:
                return MENU;
            case 11:
                return TABS_MANAGER;
            case 12:
                return GAB_NEW_TAB_CREATION;
            case 13:
                return SETTINGS;
            case 15:
                return PROMO_MANAGER;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m219651b() {
        return C135460f.f369041a;
    }

    public final int getNumber() {
        return this.f369058p;
    }

    public final String toString() {
        return Integer.toString(this.f369058p);
    }
}
