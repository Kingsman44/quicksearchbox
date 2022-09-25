package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.dn */
/* compiled from: PG */
public enum C51325dn implements C62957cd {
    UNSPECIFIED_TECHNOLOGY(0),
    ANDROID_AUTO(1),
    CARPLAY(2);
    

    /* renamed from: d */
    public final int f133632d;

    private C51325dn(int i) {
        this.f133632d = i;
    }

    /* renamed from: a */
    public static C51325dn m86131a(int i) {
        if (i == 0) {
            return UNSPECIFIED_TECHNOLOGY;
        }
        if (i == 1) {
            return ANDROID_AUTO;
        }
        if (i != 2) {
            return null;
        }
        return CARPLAY;
    }

    /* renamed from: b */
    public static C62959cf m86132b() {
        return C51324dm.f133627a;
    }

    public final int getNumber() {
        return this.f133632d;
    }

    public final String toString() {
        return Integer.toString(this.f133632d);
    }
}
