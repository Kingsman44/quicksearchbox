package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.akp */
/* compiled from: PG */
public enum akp implements C62957cd {
    UNKNOWN_AMBIENT_SCREEN(0),
    PHOTO_SCREEN(1),
    CLOCK_SCREEN(2);
    

    /* renamed from: d */
    public final int f158982d;

    private akp(int i) {
        this.f158982d = i;
    }

    /* renamed from: a */
    public static akp m92422a(int i) {
        if (i == 0) {
            return UNKNOWN_AMBIENT_SCREEN;
        }
        if (i == 1) {
            return PHOTO_SCREEN;
        }
        if (i != 2) {
            return null;
        }
        return CLOCK_SCREEN;
    }

    /* renamed from: b */
    public static C62959cf m92423b() {
        return ako.f158977a;
    }

    public final int getNumber() {
        return this.f158982d;
    }

    public final String toString() {
        return Integer.toString(this.f158982d);
    }
}
