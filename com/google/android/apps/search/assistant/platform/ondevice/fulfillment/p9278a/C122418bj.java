package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.a.bj */
/* compiled from: PG */
public enum C122418bj implements C62957cd {
    UNKNOWN(0),
    NGA(1),
    DICTATION(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f339391e;

    private C122418bj(int i) {
        this.f339391e = i;
    }

    /* renamed from: a */
    public static C122418bj m201890a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NGA;
        }
        if (i != 2) {
            return null;
        }
        return DICTATION;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f339391e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
