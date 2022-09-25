package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.yf */
/* compiled from: PG */
public enum C8173yf implements C62957cd {
    AT_TIME(5),
    AT_LOCATION(7),
    IN_REGION(8),
    NEARING_LOCATION(10),
    REQUIRED_APP(13),
    UNINSTALLED_APP(14);
    

    /* renamed from: g */
    public final int f28717g;

    private C8173yf(int i) {
        this.f28717g = i;
    }

    /* renamed from: a */
    public static C8173yf m22962a(int i) {
        if (i == 5) {
            return AT_TIME;
        }
        if (i == 10) {
            return NEARING_LOCATION;
        }
        if (i == 7) {
            return AT_LOCATION;
        }
        if (i == 8) {
            return IN_REGION;
        }
        if (i == 13) {
            return REQUIRED_APP;
        }
        if (i != 14) {
            return null;
        }
        return UNINSTALLED_APP;
    }

    /* renamed from: b */
    public static C62959cf m22963b() {
        return C8172ye.f28709a;
    }

    public final int getNumber() {
        return this.f28717g;
    }

    public final String toString() {
        return Integer.toString(this.f28717g);
    }
}
