package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ag.c.at */
/* compiled from: PG */
public enum C48946at implements C62957cd {
    UNSPECIFIED(0),
    NOT_CONNECTED(1),
    CONNECTED(2);
    

    /* renamed from: d */
    private final int f126649d;

    private C48946at(int i) {
        this.f126649d = i;
    }

    /* renamed from: a */
    public static C48946at m85317a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return NOT_CONNECTED;
        }
        if (i != 2) {
            return null;
        }
        return CONNECTED;
    }

    /* renamed from: b */
    public static C62959cf m85318b() {
        return C48945as.f126644a;
    }

    public final int getNumber() {
        return this.f126649d;
    }

    public final String toString() {
        return Integer.toString(this.f126649d);
    }
}
