package com.google.p4242bp.p4253e.p4254a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.e.a.h */
/* compiled from: PG */
public enum C56188h implements C62957cd {
    THUMBNAIL_UNSPECIFIED(0),
    NONE(1),
    STANDARD(2),
    LARGE(3),
    UNKNOWN(4);
    

    /* renamed from: f */
    public final int f149709f;

    private C56188h(int i) {
        this.f149709f = i;
    }

    /* renamed from: a */
    public static C56188h m87918a(int i) {
        if (i == 0) {
            return THUMBNAIL_UNSPECIFIED;
        }
        if (i == 1) {
            return NONE;
        }
        if (i == 2) {
            return STANDARD;
        }
        if (i == 3) {
            return LARGE;
        }
        if (i != 4) {
            return null;
        }
        return UNKNOWN;
    }

    /* renamed from: b */
    public static C62959cf m87919b() {
        return C56187g.f149702a;
    }

    public final int getNumber() {
        return this.f149709f;
    }

    public final String toString() {
        return Integer.toString(this.f149709f);
    }
}
