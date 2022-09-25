package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.y.a.at */
/* compiled from: PG */
public enum C53560at implements C62957cd {
    UNKNOWN(0),
    HOME_SCREEN(1),
    IN_APP(2),
    TIMEOUT_HOMESCREEN(3),
    TIMEOUT_IN_APP(4);
    

    /* renamed from: f */
    private final int f140567f;

    private C53560at(int i) {
        this.f140567f = i;
    }

    /* renamed from: a */
    public static C53560at m86868a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return HOME_SCREEN;
        }
        if (i == 2) {
            return IN_APP;
        }
        if (i == 3) {
            return TIMEOUT_HOMESCREEN;
        }
        if (i != 4) {
            return null;
        }
        return TIMEOUT_IN_APP;
    }

    /* renamed from: b */
    public static C62959cf m86869b() {
        return C53559as.f140560a;
    }

    public final int getNumber() {
        return this.f140567f;
    }

    public final String toString() {
        return Integer.toString(this.f140567f);
    }
}
