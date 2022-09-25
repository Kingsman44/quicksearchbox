package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.dr */
/* compiled from: PG */
public enum C57317dr implements C62957cd {
    UNKNOWN_ARCHITECTURE(0),
    ARM(1),
    ARM64(2),
    MIPS(3),
    MIPS64(4),
    X86(5),
    X86_64(6);
    

    /* renamed from: h */
    public final int f153000h;

    private C57317dr(int i) {
        this.f153000h = i;
    }

    /* renamed from: a */
    public static C57317dr m88310a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ARCHITECTURE;
            case 1:
                return ARM;
            case 2:
                return ARM64;
            case 3:
                return MIPS;
            case 4:
                return MIPS64;
            case 5:
                return X86;
            case 6:
                return X86_64;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88311b() {
        return C57316dq.f152991a;
    }

    public final int getNumber() {
        return this.f153000h;
    }

    public final String toString() {
        return Integer.toString(this.f153000h);
    }
}
