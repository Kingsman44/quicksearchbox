package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.bl */
/* compiled from: PG */
public enum C51269bl implements C62957cd {
    UNKNOWN_REASON(0),
    INSUFFICIENT_PERMISSIONS(1),
    SIM_STATE_ABSENT(2),
    INVALID_SIM_STATE(3),
    UDC_DI_OPTED_OUT(4);
    

    /* renamed from: f */
    public final int f133475f;

    private C51269bl(int i) {
        this.f133475f = i;
    }

    /* renamed from: a */
    public static C51269bl m86102a(int i) {
        if (i == 0) {
            return UNKNOWN_REASON;
        }
        if (i == 1) {
            return INSUFFICIENT_PERMISSIONS;
        }
        if (i == 2) {
            return SIM_STATE_ABSENT;
        }
        if (i == 3) {
            return INVALID_SIM_STATE;
        }
        if (i != 4) {
            return null;
        }
        return UDC_DI_OPTED_OUT;
    }

    /* renamed from: b */
    public static C62959cf m86103b() {
        return C51268bk.f133468a;
    }

    public final int getNumber() {
        return this.f133475f;
    }

    public final String toString() {
        return Integer.toString(this.f133475f);
    }
}
