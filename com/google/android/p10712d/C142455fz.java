package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.fz */
/* compiled from: PG */
public enum C142455fz implements C62957cd {
    OTA_UNKNOWN(0),
    OTA_DATA(1),
    OTA_STATE(4),
    OTA_GETSTATE(5),
    OTA_RESPONSE(6),
    OTA_ABORT(7),
    OTA_BEGIN(8),
    OTA_APPLY(9),
    OTA_NACK(10),
    OTA_ACTIVATE_FEATURE(11);
    

    /* renamed from: k */
    public final int f386567k;

    private C142455fz(int i) {
        this.f386567k = i;
    }

    /* renamed from: a */
    public static C142455fz m231083a(int i) {
        if (i == 0) {
            return OTA_UNKNOWN;
        }
        if (i == 1) {
            return OTA_DATA;
        }
        switch (i) {
            case 4:
                return OTA_STATE;
            case 5:
                return OTA_GETSTATE;
            case 6:
                return OTA_RESPONSE;
            case 7:
                return OTA_ABORT;
            case 8:
                return OTA_BEGIN;
            case 9:
                return OTA_APPLY;
            case 10:
                return OTA_NACK;
            case 11:
                return OTA_ACTIVATE_FEATURE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m231084b() {
        return C142454fy.f386555a;
    }

    public final int getNumber() {
        return this.f386567k;
    }

    public final String toString() {
        return Integer.toString(this.f386567k);
    }
}
