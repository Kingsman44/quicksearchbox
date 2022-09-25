package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.am */
/* compiled from: PG */
public enum C121830am implements C62957cd {
    UNKNOWN(0),
    VIS_NOT_IN_PROGRESS(1),
    ANDROID_SECURITY_EXCEPTION(2),
    INVALID_INVOCATION_TOKEN(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: f */
    private final int f338062f;

    private C121830am(int i) {
        this.f338062f = i;
    }

    /* renamed from: a */
    public static C121830am m201261a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return VIS_NOT_IN_PROGRESS;
        }
        if (i == 2) {
            return ANDROID_SECURITY_EXCEPTION;
        }
        if (i != 3) {
            return null;
        }
        return INVALID_INVOCATION_TOKEN;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f338062f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
