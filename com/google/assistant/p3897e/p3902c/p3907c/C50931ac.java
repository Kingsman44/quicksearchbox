package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.c.c.ac */
/* compiled from: PG */
public enum C50931ac implements C62957cd {
    DEFAULT(0),
    CANCEL(1),
    CONFIRM(2),
    REFRESH(3),
    EMOJI(4),
    FULL_WIDTH(5);
    

    /* renamed from: g */
    public final int f132590g;

    private C50931ac(int i) {
        this.f132590g = i;
    }

    /* renamed from: a */
    public static C50931ac m85981a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return CANCEL;
        }
        if (i == 2) {
            return CONFIRM;
        }
        if (i == 3) {
            return REFRESH;
        }
        if (i == 4) {
            return EMOJI;
        }
        if (i != 5) {
            return null;
        }
        return FULL_WIDTH;
    }

    /* renamed from: b */
    public static C62959cf m85982b() {
        return C50930ab.f132582a;
    }

    public final int getNumber() {
        return this.f132590g;
    }

    public final String toString() {
        return Integer.toString(this.f132590g);
    }
}
