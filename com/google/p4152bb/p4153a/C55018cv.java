package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bb.a.cv */
/* compiled from: PG */
public enum C55018cv implements C62957cd {
    UNKNOWN_SOURCE(0),
    SERVER(1),
    CLIENT(2),
    COMPANION(3);
    

    /* renamed from: e */
    public static final C62958ce f144749e = null;

    /* renamed from: f */
    public final int f144751f;

    static {
        f144749e = new C55016ct();
    }

    private C55018cv(int i) {
        this.f144751f = i;
    }

    /* renamed from: a */
    public static C55018cv m87558a(int i) {
        if (i == 0) {
            return UNKNOWN_SOURCE;
        }
        if (i == 1) {
            return SERVER;
        }
        if (i == 2) {
            return CLIENT;
        }
        if (i != 3) {
            return null;
        }
        return COMPANION;
    }

    /* renamed from: b */
    public static C62959cf m87559b() {
        return C55017cu.f144744a;
    }

    public final int getNumber() {
        return this.f144751f;
    }

    public final String toString() {
        return Integer.toString(this.f144751f);
    }
}
