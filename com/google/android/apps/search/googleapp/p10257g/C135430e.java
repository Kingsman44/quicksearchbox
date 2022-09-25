package com.google.android.apps.search.googleapp.p10257g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.g.e */
/* compiled from: PG */
public enum C135430e implements C62957cd {
    UNKNOWN(0),
    HOMESCREEN(1),
    MINUS_ONE(2),
    SAMSUNG_MINUS_ONE(3),
    PIXEL_SPLUS_MINUS_ONE(4),
    SAMSUNG_MINUS_ONE_POST_MVP(5);
    

    /* renamed from: g */
    public final int f368963g;

    private C135430e(int i) {
        this.f368963g = i;
    }

    /* renamed from: a */
    public static C135430e m219591a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return HOMESCREEN;
        }
        if (i == 2) {
            return MINUS_ONE;
        }
        if (i == 3) {
            return SAMSUNG_MINUS_ONE;
        }
        if (i == 4) {
            return PIXEL_SPLUS_MINUS_ONE;
        }
        if (i != 5) {
            return null;
        }
        return SAMSUNG_MINUS_ONE_POST_MVP;
    }

    /* renamed from: b */
    public static C62959cf m219592b() {
        return C135429d.f368955a;
    }

    public final int getNumber() {
        return this.f368963g;
    }

    public final String toString() {
        return Integer.toString(this.f368963g);
    }
}
