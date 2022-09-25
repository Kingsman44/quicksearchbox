package com.google.assistant.p4003x.p4004a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.x.a.k */
/* compiled from: PG */
public enum C53534k implements C62957cd {
    UNKNOWN(0),
    ACTIVE(1),
    WORK_PROFILE(2);
    

    /* renamed from: d */
    public final int f140494d;

    private C53534k(int i) {
        this.f140494d = i;
    }

    /* renamed from: a */
    public static C53534k m86856a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return WORK_PROFILE;
    }

    /* renamed from: b */
    public static C62959cf m86857b() {
        return C53533j.f140489a;
    }

    public final int getNumber() {
        return this.f140494d;
    }

    public final String toString() {
        return Integer.toString(this.f140494d);
    }
}
