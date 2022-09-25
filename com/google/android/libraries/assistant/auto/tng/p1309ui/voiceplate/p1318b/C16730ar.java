package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.ar */
/* compiled from: PG */
public enum C16730ar implements C62957cd {
    ASSUMING_GOOD_NETWORK(0),
    OFFLINE(1),
    POOR_SIGNAL_STRENGTH(3),
    SLOW_CONNECTION(4);
    

    /* renamed from: e */
    public final int f48937e;

    private C16730ar(int i) {
        this.f48937e = i;
    }

    /* renamed from: a */
    public static C16730ar m33788a(int i) {
        if (i == 0) {
            return ASSUMING_GOOD_NETWORK;
        }
        if (i == 1) {
            return OFFLINE;
        }
        if (i == 3) {
            return POOR_SIGNAL_STRENGTH;
        }
        if (i != 4) {
            return null;
        }
        return SLOW_CONNECTION;
    }

    /* renamed from: b */
    public static C62959cf m33789b() {
        return C16729aq.f48931a;
    }

    public final int getNumber() {
        return this.f48937e;
    }

    public final String toString() {
        return Integer.toString(this.f48937e);
    }
}
