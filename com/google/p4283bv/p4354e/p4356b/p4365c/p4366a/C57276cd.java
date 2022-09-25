package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.cd */
/* compiled from: PG */
public enum C57276cd implements C62957cd {
    UNKNOWN_CONDITION(0),
    AGSA_MAIN_APP(1),
    AGSA_MINUS_ONE(2);
    

    /* renamed from: d */
    public final int f152907d;

    private C57276cd(int i) {
        this.f152907d = i;
    }

    /* renamed from: a */
    public static C57276cd m88295a(int i) {
        if (i == 0) {
            return UNKNOWN_CONDITION;
        }
        if (i == 1) {
            return AGSA_MAIN_APP;
        }
        if (i != 2) {
            return null;
        }
        return AGSA_MINUS_ONE;
    }

    /* renamed from: b */
    public static C62959cf m88296b() {
        return C57275cc.f152902a;
    }

    public final int getNumber() {
        return this.f152907d;
    }

    public final String toString() {
        return Integer.toString(this.f152907d);
    }
}
