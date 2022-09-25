package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bt */
/* compiled from: PG */
public enum C124477bt implements C62957cd {
    UNKNOWN_REQUEST(0),
    START_REQUEST(1),
    STOP_REQUEST(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f343523e;

    private C124477bt(int i) {
        this.f343523e = i;
    }

    /* renamed from: a */
    public static C124477bt m203948a(int i) {
        if (i == 0) {
            return UNKNOWN_REQUEST;
        }
        if (i == 1) {
            return START_REQUEST;
        }
        if (i != 2) {
            return null;
        }
        return STOP_REQUEST;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f343523e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
