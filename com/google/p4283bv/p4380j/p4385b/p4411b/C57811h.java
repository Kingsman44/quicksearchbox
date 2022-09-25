package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.j.b.b.h */
/* compiled from: PG */
public enum C57811h implements C62957cd {
    PLATFORM_UNSPECIFIED(0),
    PLATFORM_ANDROID(1),
    PLATFORM_IOS(2);
    

    /* renamed from: d */
    public final int f154465d;

    private C57811h(int i) {
        this.f154465d = i;
    }

    /* renamed from: a */
    public static C57811h m88534a(int i) {
        if (i == 0) {
            return PLATFORM_UNSPECIFIED;
        }
        if (i == 1) {
            return PLATFORM_ANDROID;
        }
        if (i != 2) {
            return null;
        }
        return PLATFORM_IOS;
    }

    /* renamed from: b */
    public static C62959cf m88535b() {
        return C57810g.f154460a;
    }

    public final int getNumber() {
        return this.f154465d;
    }

    public final String toString() {
        return Integer.toString(this.f154465d);
    }
}
