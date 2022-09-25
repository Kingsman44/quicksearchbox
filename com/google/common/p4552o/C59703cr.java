package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.cr */
/* compiled from: PG */
public enum C59703cr implements C62957cd {
    NOTED_OP_TYPE_UNKNOWN(0),
    SYNC(1),
    SELF(2),
    ASYNC(3);
    

    /* renamed from: e */
    public final int f160186e;

    private C59703cr(int i) {
        this.f160186e = i;
    }

    /* renamed from: a */
    public static C59703cr m92489a(int i) {
        if (i == 0) {
            return NOTED_OP_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return SYNC;
        }
        if (i == 2) {
            return SELF;
        }
        if (i != 3) {
            return null;
        }
        return ASYNC;
    }

    /* renamed from: b */
    public static C62959cf m92490b() {
        return C59702cq.f160180a;
    }

    public final int getNumber() {
        return this.f160186e;
    }

    public final String toString() {
        return Integer.toString(this.f160186e);
    }
}
