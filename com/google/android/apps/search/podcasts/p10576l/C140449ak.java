package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.podcasts.l.ak */
/* compiled from: PG */
public enum C140449ak implements C62957cd {
    DEFAULT(0),
    LIGHT(1),
    DARK(2),
    SYSTEM_DEFAULT(-1),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f381512f;

    private C140449ak(int i) {
        this.f381512f = i;
    }

    /* renamed from: a */
    public static C140449ak m228147a(int i) {
        if (i == -1) {
            return SYSTEM_DEFAULT;
        }
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return LIGHT;
        }
        if (i != 2) {
            return null;
        }
        return DARK;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f381512f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
