package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.k */
/* compiled from: PG */
public enum C64126k implements C62957cd {
    TIMESTAMP_FORMAT_UNKNOWN(0),
    TIMESTAMP_FORMAT_RELATIVE(1),
    TIMESTAMP_FORMAT_DURATION(2);
    

    /* renamed from: d */
    private final int f173370d;

    private C64126k(int i) {
        this.f173370d = i;
    }

    /* renamed from: a */
    public static C64126k m96360a(int i) {
        if (i == 0) {
            return TIMESTAMP_FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return TIMESTAMP_FORMAT_RELATIVE;
        }
        if (i != 2) {
            return null;
        }
        return TIMESTAMP_FORMAT_DURATION;
    }

    /* renamed from: b */
    public static C62959cf m96361b() {
        return C64125j.f173365a;
    }

    public final int getNumber() {
        return this.f173370d;
    }

    public final String toString() {
        return Integer.toString(this.f173370d);
    }
}
