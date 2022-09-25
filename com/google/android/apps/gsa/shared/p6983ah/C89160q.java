package com.google.android.apps.gsa.shared.p6983ah;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ah.q */
/* compiled from: PG */
public enum C89160q implements C62957cd {
    UNKNOWN(0),
    HISTORY_STATE(1),
    DEMAND_STATE(2),
    ZERO_STATE(3),
    CLIENT_OP_EXCLUSIVE_STATE(4);
    

    /* renamed from: f */
    public final int f241727f;

    private C89160q(int i) {
        this.f241727f = i;
    }

    /* renamed from: a */
    public static C89160q m145040a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return HISTORY_STATE;
        }
        if (i == 2) {
            return DEMAND_STATE;
        }
        if (i == 3) {
            return ZERO_STATE;
        }
        if (i != 4) {
            return null;
        }
        return CLIENT_OP_EXCLUSIVE_STATE;
    }

    /* renamed from: b */
    public static C62959cf m145041b() {
        return C89159p.f241720a;
    }

    public final int getNumber() {
        return this.f241727f;
    }

    public final String toString() {
        return Integer.toString(this.f241727f);
    }
}
