package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.dm */
/* compiled from: PG */
public enum C59728dm implements C62957cd {
    UNKNOWN_SHOW_MORRIS_UI_RESULT(0),
    SUCCESS(1),
    FAILURE_INVALID_HOSTING_APP(2),
    FAILURE_CAR_MODE_NOT_SET_BY_MORRIS(3);
    

    /* renamed from: e */
    public final int f160316e;

    private C59728dm(int i) {
        this.f160316e = i;
    }

    /* renamed from: a */
    public static C59728dm m92493a(int i) {
        if (i == 0) {
            return UNKNOWN_SHOW_MORRIS_UI_RESULT;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return FAILURE_INVALID_HOSTING_APP;
        }
        if (i != 3) {
            return null;
        }
        return FAILURE_CAR_MODE_NOT_SET_BY_MORRIS;
    }

    /* renamed from: b */
    public static C62959cf m92494b() {
        return C59727dl.f160310a;
    }

    public final int getNumber() {
        return this.f160316e;
    }

    public final String toString() {
        return Integer.toString(this.f160316e);
    }
}
