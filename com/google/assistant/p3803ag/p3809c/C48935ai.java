package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.ai */
/* compiled from: PG */
public enum C48935ai implements C62957cd {
    UNKNOWN_BLUETOOTH_A2DP_STATUS(0),
    BLUETOOTH_A2DP_ON(1),
    BLUETOOTH_A2DP_OFF(2);
    

    /* renamed from: d */
    public final int f126621d;

    private C48935ai(int i) {
        this.f126621d = i;
    }

    /* renamed from: a */
    public static C48935ai m85311a(int i) {
        if (i == 0) {
            return UNKNOWN_BLUETOOTH_A2DP_STATUS;
        }
        if (i == 1) {
            return BLUETOOTH_A2DP_ON;
        }
        if (i != 2) {
            return null;
        }
        return BLUETOOTH_A2DP_OFF;
    }

    /* renamed from: b */
    public static C62959cf m85312b() {
        return C48934ah.f126616a;
    }

    public final int getNumber() {
        return this.f126621d;
    }

    public final String toString() {
        return Integer.toString(this.f126621d);
    }
}
