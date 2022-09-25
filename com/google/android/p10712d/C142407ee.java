package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.ee */
/* compiled from: PG */
public enum C142407ee implements C62957cd {
    HFP_STATE_UNSPECIFIED(0),
    HFP_STATE_INACTIVE(1),
    HFP_STATE_ACTIVE(2);
    

    /* renamed from: d */
    public final int f386418d;

    private C142407ee(int i) {
        this.f386418d = i;
    }

    /* renamed from: a */
    public static C142407ee m231077a(int i) {
        if (i == 0) {
            return HFP_STATE_UNSPECIFIED;
        }
        if (i == 1) {
            return HFP_STATE_INACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return HFP_STATE_ACTIVE;
    }

    /* renamed from: b */
    public static C62959cf m231078b() {
        return C142406ed.f386413a;
    }

    public final int getNumber() {
        return this.f386418d;
    }

    public final String toString() {
        return Integer.toString(this.f386418d);
    }
}
