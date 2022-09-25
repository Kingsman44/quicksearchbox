package com.google.speech.p5208h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.h.eg */
/* compiled from: PG */
public enum C66667eg implements C62957cd {
    UNKNOWN_ENROLLMENT_VALIDATION_RESULT(0),
    ENROLLMENT_VALIDATION_SUCCESS(1),
    ENROLLMENT_VALIDATION_FAILURE(2);
    

    /* renamed from: d */
    public final int f181355d;

    private C66667eg(int i) {
        this.f181355d = i;
    }

    /* renamed from: a */
    public static C66667eg m97298a(int i) {
        if (i == 0) {
            return UNKNOWN_ENROLLMENT_VALIDATION_RESULT;
        }
        if (i == 1) {
            return ENROLLMENT_VALIDATION_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return ENROLLMENT_VALIDATION_FAILURE;
    }

    /* renamed from: b */
    public static C62959cf m97299b() {
        return C66666ef.f181350a;
    }

    public final int getNumber() {
        return this.f181355d;
    }

    public final String toString() {
        return Integer.toString(this.f181355d);
    }
}
