package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ay.d.a.a.a.a.ag */
/* compiled from: PG */
public enum C64288ag implements C62957cd {
    UNSPECIFIED(0),
    EXECUTION(1),
    QUERY(2),
    SYNC(3);
    

    /* renamed from: e */
    public final int f173825e;

    private C64288ag(int i) {
        this.f173825e = i;
    }

    /* renamed from: a */
    public static C64288ag m96376a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return EXECUTION;
        }
        if (i == 2) {
            return QUERY;
        }
        if (i != 3) {
            return null;
        }
        return SYNC;
    }

    /* renamed from: b */
    public static C62959cf m96377b() {
        return C64287af.f173819a;
    }

    public final int getNumber() {
        return this.f173825e;
    }

    public final String toString() {
        return Integer.toString(this.f173825e);
    }
}
