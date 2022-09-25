package com.google.assistant.p3886c.p3888b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.b.g */
/* compiled from: PG */
public enum C50722g implements C62957cd {
    UNSPECIFIED(0),
    START(1),
    MIDDLE(2),
    END(3);
    

    /* renamed from: e */
    public final int f131998e;

    private C50722g(int i) {
        this.f131998e = i;
    }

    /* renamed from: a */
    public static C50722g m85893a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return START;
        }
        if (i == 2) {
            return MIDDLE;
        }
        if (i != 3) {
            return null;
        }
        return END;
    }

    /* renamed from: b */
    public static C62959cf m85894b() {
        return C50721f.f131992a;
    }

    public final int getNumber() {
        return this.f131998e;
    }

    public final String toString() {
        return Integer.toString(this.f131998e);
    }
}
