package com.google.android.libraries.assistant.contexttrigger.p1461e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.e.e */
/* compiled from: PG */
public enum C17691e implements C62957cd {
    UNKNOWN(0),
    WIRED(1),
    GENERIC_BLUETOOTH(2),
    CAR_BLUETOOTH(3);
    

    /* renamed from: e */
    public final int f50857e;

    private C17691e(int i) {
        this.f50857e = i;
    }

    /* renamed from: a */
    public static C17691e m34970a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return WIRED;
        }
        if (i == 2) {
            return GENERIC_BLUETOOTH;
        }
        if (i != 3) {
            return null;
        }
        return CAR_BLUETOOTH;
    }

    /* renamed from: b */
    public static C62959cf m34971b() {
        return C17690d.f50851a;
    }

    public final int getNumber() {
        return this.f50857e;
    }

    public final String toString() {
        return Integer.toString(this.f50857e);
    }
}
