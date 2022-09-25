package com.google.speech.p5208h;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.h.ch */
/* compiled from: PG */
public enum C66610ch implements C62957cd {
    IN_PROGRESS(0),
    DONE_SUCCESS(1),
    DONE_ERROR(2),
    NOT_STARTED(3);
    

    /* renamed from: e */
    public final int f181205e;

    private C66610ch(int i) {
        this.f181205e = i;
    }

    /* renamed from: a */
    public static C66610ch m97260a(int i) {
        if (i == 0) {
            return IN_PROGRESS;
        }
        if (i == 1) {
            return DONE_SUCCESS;
        }
        if (i == 2) {
            return DONE_ERROR;
        }
        if (i != 3) {
            return null;
        }
        return NOT_STARTED;
    }

    /* renamed from: b */
    public static C62959cf m97261b() {
        return C66609cg.f181199a;
    }

    public final int getNumber() {
        return this.f181205e;
    }

    public final String toString() {
        return Integer.toString(this.f181205e);
    }
}
