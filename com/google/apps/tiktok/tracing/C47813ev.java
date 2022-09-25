package com.google.apps.tiktok.tracing;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.apps.tiktok.tracing.ev */
/* compiled from: PG */
public enum C47813ev implements C62957cd {
    UNKNOWN(0),
    REALTIME(1),
    UPTIME(2);
    

    /* renamed from: d */
    public final int f123829d;

    private C47813ev(int i) {
        this.f123829d = i;
    }

    /* renamed from: a */
    public static C47813ev m84986a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return REALTIME;
        }
        if (i != 2) {
            return null;
        }
        return UPTIME;
    }

    /* renamed from: b */
    public static C62959cf m84987b() {
        return C47812eu.f123824a;
    }

    public final int getNumber() {
        return this.f123829d;
    }

    public final String toString() {
        return Integer.toString(this.f123829d);
    }
}
