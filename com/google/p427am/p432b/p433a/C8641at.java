package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.am.b.a.at */
/* compiled from: PG */
public enum C8641at implements C62957cd {
    UNKNOWN_VIDEO_PROVIDER(0),
    YOUTUBE(1),
    YOUTUBE_TV(2),
    YOUTUBE_KIDS(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f29921f;

    private C8641at(int i) {
        this.f29921f = i;
    }

    /* renamed from: a */
    public static C8641at m23359a(int i) {
        if (i == 0) {
            return UNKNOWN_VIDEO_PROVIDER;
        }
        if (i == 1) {
            return YOUTUBE;
        }
        if (i == 2) {
            return YOUTUBE_TV;
        }
        if (i != 3) {
            return null;
        }
        return YOUTUBE_KIDS;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f29921f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
