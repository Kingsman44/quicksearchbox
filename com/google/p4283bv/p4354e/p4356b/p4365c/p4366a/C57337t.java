package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.t */
/* compiled from: PG */
public enum C57337t implements C62957cd {
    UNKNOWN_PLATFORM(0),
    ANDROID(1),
    IOS(2);
    

    /* renamed from: d */
    public final int f153179d;

    private C57337t(int i) {
        this.f153179d = i;
    }

    /* renamed from: a */
    public static C57337t m88327a(int i) {
        if (i == 0) {
            return UNKNOWN_PLATFORM;
        }
        if (i == 1) {
            return ANDROID;
        }
        if (i != 2) {
            return null;
        }
        return IOS;
    }

    /* renamed from: b */
    public static C62959cf m88328b() {
        return C57336s.f153174a;
    }

    public final int getNumber() {
        return this.f153179d;
    }

    public final String toString() {
        return Integer.toString(this.f153179d);
    }
}
