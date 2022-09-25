package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.b.b */
/* compiled from: PG */
public enum C127415b implements C62957cd {
    UNKNOWN(0),
    DEEPLINK(1),
    UNRECOGNIZED(-1);
    

    /* renamed from: d */
    private final int f350844d;

    private C127415b(int i) {
        this.f350844d = i;
    }

    /* renamed from: a */
    public static C127415b m208370a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return DEEPLINK;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f350844d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
