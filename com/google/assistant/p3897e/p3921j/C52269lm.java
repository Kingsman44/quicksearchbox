package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.lm */
/* compiled from: PG */
public enum C52269lm implements C62957cd {
    NO_TRANSACTIONS(0),
    TRANSACTIONS_INITIAL_LAUNCH(1),
    TRANSACTIONS_V2(2),
    TRANSACTIONS_V3(3);
    

    /* renamed from: e */
    public final int f137213e;

    private C52269lm(int i) {
        this.f137213e = i;
    }

    /* renamed from: a */
    public static C52269lm m86559a(int i) {
        if (i == 0) {
            return NO_TRANSACTIONS;
        }
        if (i == 1) {
            return TRANSACTIONS_INITIAL_LAUNCH;
        }
        if (i == 2) {
            return TRANSACTIONS_V2;
        }
        if (i != 3) {
            return null;
        }
        return TRANSACTIONS_V3;
    }

    /* renamed from: b */
    public static C62959cf m86560b() {
        return C52268ll.f137207a;
    }

    public final int getNumber() {
        return this.f137213e;
    }

    public final String toString() {
        return Integer.toString(this.f137213e);
    }
}
