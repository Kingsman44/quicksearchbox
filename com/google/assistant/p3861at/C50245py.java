package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.py */
/* compiled from: PG */
public enum C50245py implements C62957cd {
    NO_ERROR(0),
    INVALID_CLIENT_ID(1),
    INVALID_DEVICE_MODEL_ID(2),
    CLIENT_ID_DEVICE_MODEL_ID_MISMATCH(3);
    

    /* renamed from: e */
    private final int f130659e;

    private C50245py(int i) {
        this.f130659e = i;
    }

    /* renamed from: a */
    public static C50245py m85795a(int i) {
        if (i == 0) {
            return NO_ERROR;
        }
        if (i == 1) {
            return INVALID_CLIENT_ID;
        }
        if (i == 2) {
            return INVALID_DEVICE_MODEL_ID;
        }
        if (i != 3) {
            return null;
        }
        return CLIENT_ID_DEVICE_MODEL_ID_MISMATCH;
    }

    /* renamed from: b */
    public static C62959cf m85796b() {
        return C50244px.f130653a;
    }

    public final int getNumber() {
        return this.f130659e;
    }

    public final String toString() {
        return Integer.toString(this.f130659e);
    }
}
