package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.am.b.a.v */
/* compiled from: PG */
public enum C8692v implements C62957cd {
    UNKNOWN_MUSIC_PROVIDER(0),
    YOUTUBE(1),
    PANDORA(2),
    SPOTIFY(3),
    APPLE_MUSIC(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f30024g;

    private C8692v(int i) {
        this.f30024g = i;
    }

    /* renamed from: a */
    public static C8692v m23376a(int i) {
        if (i == 0) {
            return UNKNOWN_MUSIC_PROVIDER;
        }
        if (i == 1) {
            return YOUTUBE;
        }
        if (i == 2) {
            return PANDORA;
        }
        if (i == 3) {
            return SPOTIFY;
        }
        if (i != 4) {
            return null;
        }
        return APPLE_MUSIC;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f30024g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
