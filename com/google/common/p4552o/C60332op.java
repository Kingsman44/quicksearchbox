package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.op */
/* compiled from: PG */
public enum C60332op implements C62957cd {
    UNKNOWN_STATE(0),
    PENDING(1),
    COMPLETE(2),
    ERROR(3),
    CANCELLED(4);
    

    /* renamed from: f */
    public final int f163276f;

    private C60332op(int i) {
        this.f163276f = i;
    }

    /* renamed from: a */
    public static C60332op m92569a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return COMPLETE;
        }
        if (i == 3) {
            return ERROR;
        }
        if (i != 4) {
            return null;
        }
        return CANCELLED;
    }

    /* renamed from: b */
    public static C62959cf m92570b() {
        return C60331oo.f163269a;
    }

    public final int getNumber() {
        return this.f163276f;
    }

    public final String toString() {
        return Integer.toString(this.f163276f);
    }
}
