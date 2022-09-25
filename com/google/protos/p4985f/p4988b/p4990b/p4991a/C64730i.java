package com.google.protos.p4985f.p4988b.p4990b.p4991a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.b.b.a.i */
/* compiled from: PG */
public enum C64730i implements C62957cd {
    UNDEFINED(0),
    REQUIRE_KEYBOARD_UP(1),
    BRING_KEYBOARD_UP_IF_FIELD_IS_FOCUSED(2),
    FOCUS_FIELD_AND_BRING_KEYBOARD_UP(4),
    WAIT_FOR_KEYBOARD_UP(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f175463g;

    private C64730i(int i) {
        this.f175463g = i;
    }

    /* renamed from: a */
    public static C64730i m96446a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return REQUIRE_KEYBOARD_UP;
        }
        if (i == 2) {
            return BRING_KEYBOARD_UP_IF_FIELD_IS_FOCUSED;
        }
        if (i == 3) {
            return WAIT_FOR_KEYBOARD_UP;
        }
        if (i != 4) {
            return null;
        }
        return FOCUS_FIELD_AND_BRING_KEYBOARD_UP;
    }

    /* renamed from: b */
    public static C62959cf m96447b() {
        return C64729h.f175455a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f175463g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
