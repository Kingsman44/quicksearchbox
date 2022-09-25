package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.jk */
/* compiled from: PG */
public enum C51484jk implements C62957cd {
    UNKNOWN(0),
    NGA(1),
    OPA(2);
    

    /* renamed from: d */
    public final int f134148d;

    private C51484jk(int i) {
        this.f134148d = i;
    }

    /* renamed from: a */
    public static C51484jk m86198a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NGA;
        }
        if (i != 2) {
            return null;
        }
        return OPA;
    }

    /* renamed from: b */
    public static C62959cf m86199b() {
        return C51483jj.f134143a;
    }

    public final int getNumber() {
        return this.f134148d;
    }

    public final String toString() {
        return Integer.toString(this.f134148d);
    }
}
