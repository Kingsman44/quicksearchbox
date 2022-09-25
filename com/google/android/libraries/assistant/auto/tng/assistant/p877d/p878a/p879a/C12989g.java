package com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.g */
/* compiled from: PG */
public enum C12989g implements C62957cd {
    UNKNOWN(0),
    AUTO_EMBEDDED(1),
    AUTO_PROJECTED(2),
    MORRIS(3);
    

    /* renamed from: e */
    public final int f40378e;

    private C12989g(int i) {
        this.f40378e = i;
    }

    /* renamed from: a */
    public static C12989g m29225a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUTO_EMBEDDED;
        }
        if (i == 2) {
            return AUTO_PROJECTED;
        }
        if (i != 3) {
            return null;
        }
        return MORRIS;
    }

    /* renamed from: b */
    public static C62959cf m29226b() {
        return C12988f.f40372a;
    }

    public final int getNumber() {
        return this.f40378e;
    }

    public final String toString() {
        return Integer.toString(this.f40378e);
    }
}
