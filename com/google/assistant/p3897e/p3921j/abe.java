package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.abe */
/* compiled from: PG */
public enum abe implements C62957cd {
    UNSPECIFIED(0),
    UPDATE(1),
    REMOVE(2);
    

    /* renamed from: d */
    public final int f134714d;

    private abe(int i) {
        this.f134714d = i;
    }

    /* renamed from: a */
    public static abe m86274a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return UPDATE;
        }
        if (i != 2) {
            return null;
        }
        return REMOVE;
    }

    /* renamed from: b */
    public static C62959cf m86275b() {
        return abd.f134709a;
    }

    public final int getNumber() {
        return this.f134714d;
    }

    public final String toString() {
        return Integer.toString(this.f134714d);
    }
}
