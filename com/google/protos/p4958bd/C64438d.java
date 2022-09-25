package com.google.protos.p4958bd;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.bd.d */
/* compiled from: PG */
public enum C64438d implements C62957cd {
    DEFAULT(0),
    EYES_FREE(1),
    EYES_FREE_NAVIGATING(2),
    CAR(3),
    WATCH(4),
    AT_HOME(5);
    

    /* renamed from: g */
    public final int f174811g;

    private C64438d(int i) {
        this.f174811g = i;
    }

    /* renamed from: a */
    public static C64438d m96405a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return EYES_FREE;
        }
        if (i == 2) {
            return EYES_FREE_NAVIGATING;
        }
        if (i == 3) {
            return CAR;
        }
        if (i == 4) {
            return WATCH;
        }
        if (i != 5) {
            return null;
        }
        return AT_HOME;
    }

    /* renamed from: b */
    public static C62959cf m96406b() {
        return C64437c.f174803a;
    }

    public final int getNumber() {
        return this.f174811g;
    }

    public final String toString() {
        return Integer.toString(this.f174811g);
    }
}
