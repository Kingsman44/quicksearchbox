package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.w */
/* compiled from: PG */
public enum C60603w implements C62957cd {
    UNSPECIFIED(0),
    CONTEXTUAL(1),
    VOICE(2),
    SCREENSHOT(3),
    LIGHTWEIGHT(4);
    

    /* renamed from: f */
    public final int f164407f;

    private C60603w(int i) {
        this.f164407f = i;
    }

    /* renamed from: a */
    public static C60603w m92626a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONTEXTUAL;
        }
        if (i == 2) {
            return VOICE;
        }
        if (i == 3) {
            return SCREENSHOT;
        }
        if (i != 4) {
            return null;
        }
        return LIGHTWEIGHT;
    }

    /* renamed from: b */
    public static C62959cf m92627b() {
        return C60576v.f164318a;
    }

    public final int getNumber() {
        return this.f164407f;
    }

    public final String toString() {
        return Integer.toString(this.f164407f);
    }
}
