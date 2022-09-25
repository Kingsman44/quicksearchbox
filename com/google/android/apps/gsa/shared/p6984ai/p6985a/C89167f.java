package com.google.android.apps.gsa.shared.p6984ai.p6985a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ai.a.f */
/* compiled from: PG */
public enum C89167f implements C62957cd {
    UNKNOWN_MECHANISM(0),
    FINGERPRINT(1),
    PASSWORD(2);
    

    /* renamed from: d */
    public final int f241757d;

    private C89167f(int i) {
        this.f241757d = i;
    }

    /* renamed from: a */
    public static C89167f m145045a(int i) {
        if (i == 0) {
            return UNKNOWN_MECHANISM;
        }
        if (i == 1) {
            return FINGERPRINT;
        }
        if (i != 2) {
            return null;
        }
        return PASSWORD;
    }

    /* renamed from: b */
    public static C62959cf m145046b() {
        return C89166e.f241752a;
    }

    public final int getNumber() {
        return this.f241757d;
    }

    public final String toString() {
        return Integer.toString(this.f241757d);
    }
}
