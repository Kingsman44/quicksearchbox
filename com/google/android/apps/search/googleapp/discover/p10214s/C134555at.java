package com.google.android.apps.search.googleapp.discover.p10214s;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.discover.s.at */
/* compiled from: PG */
public enum C134555at implements C62957cd {
    UNKNOWN(0),
    SUCCESS(1),
    REQUEST_ERROR(2),
    REQUEST_NO_INTERNET_ERROR(11),
    EMPTY_SESSION(5);
    

    /* renamed from: f */
    public final int f366434f;

    private C134555at(int i) {
        this.f366434f = i;
    }

    /* renamed from: a */
    public static C134555at m218283a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return REQUEST_ERROR;
        }
        if (i == 5) {
            return EMPTY_SESSION;
        }
        if (i != 11) {
            return null;
        }
        return REQUEST_NO_INTERNET_ERROR;
    }

    /* renamed from: b */
    public static C62959cf m218284b() {
        return C134554as.f366427a;
    }

    public final int getNumber() {
        return this.f366434f;
    }

    public final String toString() {
        return Integer.toString(this.f366434f);
    }
}
