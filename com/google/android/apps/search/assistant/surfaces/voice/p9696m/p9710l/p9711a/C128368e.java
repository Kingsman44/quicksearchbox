package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9710l.p9711a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.l.a.e */
/* compiled from: PG */
public enum C128368e implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    ERROR(2),
    TIMED_OUT(3);
    

    /* renamed from: e */
    public final int f353044e;

    private C128368e(int i) {
        this.f353044e = i;
    }

    /* renamed from: a */
    public static C128368e m209480a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return ERROR;
        }
        if (i != 3) {
            return null;
        }
        return TIMED_OUT;
    }

    /* renamed from: b */
    public static C62959cf m209481b() {
        return C128367d.f353038a;
    }

    public final int getNumber() {
        return this.f353044e;
    }

    public final String toString() {
        return Integer.toString(this.f353044e);
    }
}
