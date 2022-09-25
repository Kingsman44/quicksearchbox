package com.google.assistant.p3897e.p3912f;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.f.f */
/* compiled from: PG */
public enum C51211f implements C62957cd {
    UNKNOWN_SOURCE(0),
    MANUAL(1),
    SUGGESTION_CHIP(2),
    SHORT_TAP(3),
    LONG_TAP(4),
    UNDERLINE(5),
    EDIT_HINT(6),
    CLIENT_OP(7),
    INVISIBLE_UNDERLINE(8);
    

    /* renamed from: j */
    public final int f133335j;

    private C51211f(int i) {
        this.f133335j = i;
    }

    /* renamed from: a */
    public static C51211f m86088a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SOURCE;
            case 1:
                return MANUAL;
            case 2:
                return SUGGESTION_CHIP;
            case 3:
                return SHORT_TAP;
            case 4:
                return LONG_TAP;
            case 5:
                return UNDERLINE;
            case 6:
                return EDIT_HINT;
            case 7:
                return CLIENT_OP;
            case 8:
                return INVISIBLE_UNDERLINE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86089b() {
        return C51210e.f133324a;
    }

    public final int getNumber() {
        return this.f133335j;
    }

    public final String toString() {
        return Integer.toString(this.f133335j);
    }
}
