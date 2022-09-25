package com.google.speech.p5208h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.h.t */
/* compiled from: PG */
public enum C66686t implements C62957cd {
    DEFAULT_INTERVAL_GUEST(0),
    INTERVAL_UNLIKELY_USER(1),
    INTERVAL_USER(2),
    INTERVAL_TRUSTED_USER(3);
    

    /* renamed from: e */
    public final int f181416e;

    private C66686t(int i) {
        this.f181416e = i;
    }

    /* renamed from: a */
    public static C66686t m97300a(int i) {
        if (i == 0) {
            return DEFAULT_INTERVAL_GUEST;
        }
        if (i == 1) {
            return INTERVAL_UNLIKELY_USER;
        }
        if (i == 2) {
            return INTERVAL_USER;
        }
        if (i != 3) {
            return null;
        }
        return INTERVAL_TRUSTED_USER;
    }

    /* renamed from: b */
    public static C62959cf m97301b() {
        return C66685s.f181410a;
    }

    public final int getNumber() {
        return this.f181416e;
    }

    public final String toString() {
        return Integer.toString(this.f181416e);
    }
}
