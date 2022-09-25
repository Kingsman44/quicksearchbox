package com.google.android.libraries.search.p2904c.p2916e.p2917a.p2919b.p2921b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.e.a.b.b.d */
/* compiled from: PG */
public enum C37531d implements C62957cd {
    UNKNOWN_EVENT(0),
    STARTED_RECORDING(1),
    STOPPED_RECORDING(2),
    START_RECORDING_FAILED(3),
    STOP_RECORDING_FAILED(4);
    

    /* renamed from: f */
    public final int f99714f;

    private C37531d(int i) {
        this.f99714f = i;
    }

    /* renamed from: a */
    public static C37531d m66537a(int i) {
        if (i == 0) {
            return UNKNOWN_EVENT;
        }
        if (i == 1) {
            return STARTED_RECORDING;
        }
        if (i == 2) {
            return STOPPED_RECORDING;
        }
        if (i == 3) {
            return START_RECORDING_FAILED;
        }
        if (i != 4) {
            return null;
        }
        return STOP_RECORDING_FAILED;
    }

    /* renamed from: b */
    public static C62959cf m66538b() {
        return C37530c.f99707a;
    }

    public final int getNumber() {
        return this.f99714f;
    }

    public final String toString() {
        return Integer.toString(this.f99714f);
    }
}
