package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9596c;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.c.k */
/* compiled from: PG */
public enum C127434k implements C62957cd {
    UNKNOWN(0),
    YOUTUBE(1),
    GOOGLE_MAPS_FOR_MOBILE(2),
    GOOGLE_HOME_APP(3),
    MOSAIC_DEVAPP(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f350883g;

    private C127434k(int i) {
        this.f350883g = i;
    }

    /* renamed from: a */
    public static C127434k m208380a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return YOUTUBE;
        }
        if (i == 2) {
            return GOOGLE_MAPS_FOR_MOBILE;
        }
        if (i == 3) {
            return GOOGLE_HOME_APP;
        }
        if (i != 4) {
            return null;
        }
        return MOSAIC_DEVAPP;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f350883g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
