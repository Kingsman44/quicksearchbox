package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.bh */
/* compiled from: PG */
public enum C39359bh implements C62957cd {
    DEFAULT_UNKNOWN(0),
    AUDIO_EVENT_END_OF_DATA(1);
    

    /* renamed from: c */
    public final int f103653c;

    private C39359bh(int i) {
        this.f103653c = i;
    }

    /* renamed from: a */
    public static C39359bh m68763a(int i) {
        if (i == 0) {
            return DEFAULT_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return AUDIO_EVENT_END_OF_DATA;
    }

    /* renamed from: b */
    public static C62959cf m68764b() {
        return C39358bg.f103649a;
    }

    public final int getNumber() {
        return this.f103653c;
    }

    public final String toString() {
        return Integer.toString(this.f103653c);
    }
}
