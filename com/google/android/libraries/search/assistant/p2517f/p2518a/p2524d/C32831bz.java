package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.bz */
/* compiled from: PG */
public enum C32831bz implements C62957cd {
    UNKNOWN_INVOCATION_TYPE(0),
    ASSIST_DATA(1),
    SCREENSHOT(2);
    

    /* renamed from: d */
    public final int f88035d;

    private C32831bz(int i) {
        this.f88035d = i;
    }

    /* renamed from: a */
    public static C32831bz m60796a(int i) {
        if (i == 0) {
            return UNKNOWN_INVOCATION_TYPE;
        }
        if (i == 1) {
            return ASSIST_DATA;
        }
        if (i != 2) {
            return null;
        }
        return SCREENSHOT;
    }

    /* renamed from: b */
    public static C62959cf m60797b() {
        return C32830by.f88030a;
    }

    public final int getNumber() {
        return this.f88035d;
    }

    public final String toString() {
        return Integer.toString(this.f88035d);
    }
}
