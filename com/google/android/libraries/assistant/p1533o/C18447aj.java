package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.libraries.assistant.o.aj */
/* compiled from: PG */
public enum C18447aj implements C62957cd {
    UNKNOWN(0),
    S3_NATIVE(1),
    S3_ENDPOINTER_FALLBACK(2),
    S3_TRUE_EOQ(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f52352f;

    private C18447aj(int i) {
        this.f52352f = i;
    }

    /* renamed from: a */
    public static C18447aj m35924a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return S3_NATIVE;
        }
        if (i == 2) {
            return S3_ENDPOINTER_FALLBACK;
        }
        if (i != 3) {
            return null;
        }
        return S3_TRUE_EOQ;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f52352f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
