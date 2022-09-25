package com.google.android.libraries.assistant.p1467d.p1471b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.d.b.k */
/* compiled from: PG */
public enum C17825k implements C62957cd {
    NIGHT_MODE_STATUS_UNKNOWN(0),
    NIGHT_MODE_STATUS_DAY(1),
    NIGHT_MODE_STATUS_NIGHT(2);
    

    /* renamed from: d */
    private final int f51150d;

    private C17825k(int i) {
        this.f51150d = i;
    }

    /* renamed from: a */
    public static C17825k m35071a(int i) {
        if (i == 0) {
            return NIGHT_MODE_STATUS_UNKNOWN;
        }
        if (i == 1) {
            return NIGHT_MODE_STATUS_DAY;
        }
        if (i != 2) {
            return null;
        }
        return NIGHT_MODE_STATUS_NIGHT;
    }

    /* renamed from: b */
    public static C62959cf m35072b() {
        return C17824j.f51145a;
    }

    public final int getNumber() {
        return this.f51150d;
    }

    public final String toString() {
        return Integer.toString(this.f51150d);
    }
}
