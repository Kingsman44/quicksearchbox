package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.o */
/* compiled from: PG */
public enum C39811o implements C62957cd {
    PHRASE_UNKNOWN(0),
    OK_GOOGLE(1),
    OK_HEY_GOOGLE(2);
    

    /* renamed from: d */
    private final int f104691d;

    private C39811o(int i) {
        this.f104691d = i;
    }

    /* renamed from: a */
    public static C39811o m69225a(int i) {
        if (i == 0) {
            return PHRASE_UNKNOWN;
        }
        if (i == 1) {
            return OK_GOOGLE;
        }
        if (i != 2) {
            return null;
        }
        return OK_HEY_GOOGLE;
    }

    /* renamed from: b */
    public static C62959cf m69226b() {
        return C39810n.f104686a;
    }

    public final int getNumber() {
        return this.f104691d;
    }

    public final String toString() {
        return Integer.toString(this.f104691d);
    }
}
