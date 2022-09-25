package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.m */
/* compiled from: PG */
public enum C85698m implements C62957cd {
    UNKNOWN_QUERY_TYPE(0),
    NAV_GAS_STATION(1),
    PLAY_MUSIC(2),
    MAKE_A_CALL(3),
    PLAY_NEWS(4);
    

    /* renamed from: f */
    public final int f231745f;

    private C85698m(int i) {
        this.f231745f = i;
    }

    /* renamed from: a */
    public static C85698m m137663a(int i) {
        if (i == 0) {
            return UNKNOWN_QUERY_TYPE;
        }
        if (i == 1) {
            return NAV_GAS_STATION;
        }
        if (i == 2) {
            return PLAY_MUSIC;
        }
        if (i == 3) {
            return MAKE_A_CALL;
        }
        if (i != 4) {
            return null;
        }
        return PLAY_NEWS;
    }

    public final int getNumber() {
        return this.f231745f;
    }

    public final String toString() {
        return Integer.toString(this.f231745f);
    }
}
