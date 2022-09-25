package com.google.speech.p5224k.p5225a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.k.a.g */
/* compiled from: PG */
public enum C67229g implements C62957cd {
    UNKNOWN(0),
    AOHD_OK_GOOGLE(1),
    AOHD_X_GOOGLE(2),
    AOHD_T_GOOGLE(3);
    

    /* renamed from: e */
    public final int f182718e;

    private C67229g(int i) {
        this.f182718e = i;
    }

    /* renamed from: a */
    public static C67229g m97439a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AOHD_OK_GOOGLE;
        }
        if (i == 2) {
            return AOHD_X_GOOGLE;
        }
        if (i != 3) {
            return null;
        }
        return AOHD_T_GOOGLE;
    }

    /* renamed from: b */
    public static C62959cf m97440b() {
        return C67228f.f182712a;
    }

    public final int getNumber() {
        return this.f182718e;
    }

    public final String toString() {
        return Integer.toString(this.f182718e);
    }
}
