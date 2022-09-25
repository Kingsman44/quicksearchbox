package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.ek */
/* compiled from: PG */
public enum C142413ek implements C62957cd {
    UNKNOWN(0),
    OHD_DISABLED(1),
    OHD_UNKNOWN_DUE_TO_ERROR(2),
    OHD_NONE_DETECTED(3),
    OHD_LEFT_DETECTED(4),
    OHD_RIGHT_DETECTED(5),
    OHD_BOTH_DETECTED(6),
    OHD_SINGULAR_DETECTED(7),
    OHD_UNSUPPORTED(8);
    

    /* renamed from: j */
    public final int f386436j;

    private C142413ek(int i) {
        this.f386436j = i;
    }

    /* renamed from: a */
    public static C142413ek m231079a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OHD_DISABLED;
            case 2:
                return OHD_UNKNOWN_DUE_TO_ERROR;
            case 3:
                return OHD_NONE_DETECTED;
            case 4:
                return OHD_LEFT_DETECTED;
            case 5:
                return OHD_RIGHT_DETECTED;
            case 6:
                return OHD_BOTH_DETECTED;
            case 7:
                return OHD_SINGULAR_DETECTED;
            case 8:
                return OHD_UNSUPPORTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m231080b() {
        return C142412ej.f386425a;
    }

    public final int getNumber() {
        return this.f386436j;
    }

    public final String toString() {
        return Integer.toString(this.f386436j);
    }
}
