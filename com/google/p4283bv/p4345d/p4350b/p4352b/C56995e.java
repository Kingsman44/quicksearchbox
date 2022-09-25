package com.google.p4283bv.p4345d.p4350b.p4352b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.d.b.b.e */
/* compiled from: PG */
public enum C56995e implements C62957cd {
    CONTEXT_FENCE_TYPE_UNSPECIFIED(0),
    AND(1),
    OR(2),
    NOT(3),
    LOCATION_FENCE(5);
    

    /* renamed from: f */
    private final int f152142f;

    private C56995e(int i) {
        this.f152142f = i;
    }

    /* renamed from: a */
    public static C56995e m88250a(int i) {
        if (i == 0) {
            return CONTEXT_FENCE_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return AND;
        }
        if (i == 2) {
            return OR;
        }
        if (i == 3) {
            return NOT;
        }
        if (i != 5) {
            return null;
        }
        return LOCATION_FENCE;
    }

    /* renamed from: b */
    public static C62959cf m88251b() {
        return C56994d.f152135a;
    }

    public final int getNumber() {
        return this.f152142f;
    }

    public final String toString() {
        return Integer.toString(this.f152142f);
    }
}
