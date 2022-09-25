package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.fs */
/* compiled from: PG */
public enum C59791fs implements C62957cd {
    UNKNOWN(0),
    RUNNER(1),
    WORKER(2),
    BACKGROUND_TASK(3);
    

    /* renamed from: e */
    public final int f161560e;

    private C59791fs(int i) {
        this.f161560e = i;
    }

    /* renamed from: a */
    public static C59791fs m92505a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return RUNNER;
        }
        if (i == 2) {
            return WORKER;
        }
        if (i != 3) {
            return null;
        }
        return BACKGROUND_TASK;
    }

    /* renamed from: b */
    public static C62959cf m92506b() {
        return C59790fr.f161554a;
    }

    public final int getNumber() {
        return this.f161560e;
    }

    public final String toString() {
        return Integer.toString(this.f161560e);
    }
}
