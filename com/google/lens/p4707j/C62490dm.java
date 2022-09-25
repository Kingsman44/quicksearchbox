package com.google.lens.p4707j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.lens.j.dm */
/* compiled from: PG */
public enum C62490dm implements C62957cd {
    VERTEX_ORDERING_UNSPECIFIED(0),
    CLOCKWISE(1),
    COUNTER_CLOCKWISE(2);
    

    /* renamed from: d */
    public final int f168709d;

    private C62490dm(int i) {
        this.f168709d = i;
    }

    /* renamed from: a */
    public static C62490dm m94786a(int i) {
        if (i == 0) {
            return VERTEX_ORDERING_UNSPECIFIED;
        }
        if (i == 1) {
            return CLOCKWISE;
        }
        if (i != 2) {
            return null;
        }
        return COUNTER_CLOCKWISE;
    }

    /* renamed from: b */
    public static C62959cf m94787b() {
        return C62489dl.f168704a;
    }

    public final int getNumber() {
        return this.f168709d;
    }

    public final String toString() {
        return Integer.toString(this.f168709d);
    }
}
