package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.alf */
/* compiled from: PG */
public enum alf implements C62957cd {
    UNSPECIFIED(0),
    INVARIANT(1),
    NEW_CONTENT(2),
    NEW_TYPE(3);
    

    /* renamed from: e */
    public final int f159025e;

    private alf(int i) {
        this.f159025e = i;
    }

    /* renamed from: a */
    public static alf m92428a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return INVARIANT;
        }
        if (i == 2) {
            return NEW_CONTENT;
        }
        if (i != 3) {
            return null;
        }
        return NEW_TYPE;
    }

    /* renamed from: b */
    public static C62959cf m92429b() {
        return ale.f159019a;
    }

    public final int getNumber() {
        return this.f159025e;
    }

    public final String toString() {
        return Integer.toString(this.f159025e);
    }
}
