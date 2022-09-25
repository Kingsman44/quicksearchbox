package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.eb */
/* compiled from: PG */
public enum C50832eb implements C62957cd {
    UNDEFINED(0),
    NEVER_PRESENT(1),
    SOMETIMES_PRESENT(2),
    ALWAYS_PRESENT(3),
    NOT_READ_YET(4);
    

    /* renamed from: f */
    public static final C62958ce f132346f = null;

    /* renamed from: g */
    public final int f132348g;

    static {
        f132346f = new C50829dz();
    }

    private C50832eb(int i) {
        this.f132348g = i;
    }

    /* renamed from: a */
    public static C50832eb m85963a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return NEVER_PRESENT;
        }
        if (i == 2) {
            return SOMETIMES_PRESENT;
        }
        if (i == 3) {
            return ALWAYS_PRESENT;
        }
        if (i != 4) {
            return null;
        }
        return NOT_READ_YET;
    }

    /* renamed from: b */
    public static C62959cf m85964b() {
        return C50831ea.f132340a;
    }

    public final int getNumber() {
        return this.f132348g;
    }

    public final String toString() {
        return Integer.toString(this.f132348g);
    }
}
