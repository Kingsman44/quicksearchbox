package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.af */
/* compiled from: PG */
public enum C37341af implements C62957cd {
    UNKNOWN_ACQUIRING_STATUS(0),
    ACQUIRED(1),
    FAILED_ACQUIRING_PLATFORM_ERROR(3),
    FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE(5);
    

    /* renamed from: e */
    public static final C62958ce f99185e = null;

    /* renamed from: f */
    public final int f99187f;

    static {
        f99185e = new C37339ad();
    }

    private C37341af(int i) {
        this.f99187f = i;
    }

    /* renamed from: a */
    public static C37341af m66350a(int i) {
        if (i == 0) {
            return UNKNOWN_ACQUIRING_STATUS;
        }
        if (i == 1) {
            return ACQUIRED;
        }
        if (i == 3) {
            return FAILED_ACQUIRING_PLATFORM_ERROR;
        }
        if (i != 5) {
            return null;
        }
        return FAILED_ACQUIRING_ERROR_GETTING_STATUS_FUTURE;
    }

    /* renamed from: b */
    public static C62959cf m66351b() {
        return C37340ae.f99180a;
    }

    public final int getNumber() {
        return this.f99187f;
    }

    public final String toString() {
        return Integer.toString(this.f99187f);
    }
}
