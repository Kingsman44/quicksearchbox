package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af */
/* compiled from: PG */
public enum C138171af implements C62957cd {
    ENTRY_POINT_UNKNOWN(0),
    ENTRY_POINT_QSB(1),
    ENTRY_POINT_ALL_APPS(2);
    

    /* renamed from: d */
    public final int f375943d;

    private C138171af(int i) {
        this.f375943d = i;
    }

    /* renamed from: a */
    public static C138171af m224536a(int i) {
        if (i == 0) {
            return ENTRY_POINT_UNKNOWN;
        }
        if (i == 1) {
            return ENTRY_POINT_QSB;
        }
        if (i != 2) {
            return null;
        }
        return ENTRY_POINT_ALL_APPS;
    }

    /* renamed from: b */
    public static C62959cf m224537b() {
        return C138170ae.f375938a;
    }

    public final int getNumber() {
        return this.f375943d;
    }

    public final String toString() {
        return Integer.toString(this.f375943d);
    }
}
