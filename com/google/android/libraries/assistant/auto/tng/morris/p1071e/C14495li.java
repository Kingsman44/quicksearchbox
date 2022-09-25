package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.li */
/* compiled from: PG */
public enum C14495li implements C62957cd {
    STATUS_UNKNOWN(0),
    STATUS_INSTANTIATED(1),
    STATUS_RUNNING(2),
    STATUS_STOPPED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f43816f;

    private C14495li(int i) {
        this.f43816f = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f43816f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
