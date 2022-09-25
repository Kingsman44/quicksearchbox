package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.c.c.aw */
/* compiled from: PG */
public enum C50951aw implements C62957cd {
    DEFAULT_STATUS(0),
    HIGHLIGHT(2),
    ERROR(3),
    HIDDEN(4),
    DISABLED(5);
    

    /* renamed from: f */
    public final int f132637f;

    private C50951aw(int i) {
        this.f132637f = i;
    }

    /* renamed from: a */
    public static C50951aw m85988a(int i) {
        if (i == 0) {
            return DEFAULT_STATUS;
        }
        if (i == 2) {
            return HIGHLIGHT;
        }
        if (i == 3) {
            return ERROR;
        }
        if (i == 4) {
            return HIDDEN;
        }
        if (i != 5) {
            return null;
        }
        return DISABLED;
    }

    /* renamed from: b */
    public static C62959cf m85989b() {
        return C50950av.f132630a;
    }

    public final int getNumber() {
        return this.f132637f;
    }

    public final String toString() {
        return Integer.toString(this.f132637f);
    }
}
