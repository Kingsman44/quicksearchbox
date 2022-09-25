package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.uw */
/* compiled from: PG */
public enum C60572uw implements C62957cd {
    STATUS_UNKNOWN(0),
    STATUS_CANCEL(1),
    STATUS_FINISHED(2),
    STATUS_CONFIRM(3),
    STATUS_NOT_LAUNCHED(4);
    

    /* renamed from: f */
    public final int f164316f;

    private C60572uw(int i) {
        this.f164316f = i;
    }

    /* renamed from: a */
    public static C60572uw m92620a(int i) {
        if (i == 0) {
            return STATUS_UNKNOWN;
        }
        if (i == 1) {
            return STATUS_CANCEL;
        }
        if (i == 2) {
            return STATUS_FINISHED;
        }
        if (i == 3) {
            return STATUS_CONFIRM;
        }
        if (i != 4) {
            return null;
        }
        return STATUS_NOT_LAUNCHED;
    }

    /* renamed from: b */
    public static C62959cf m92621b() {
        return C60571uv.f164309a;
    }

    public final int getNumber() {
        return this.f164316f;
    }

    public final String toString() {
        return Integer.toString(this.f164316f);
    }
}
