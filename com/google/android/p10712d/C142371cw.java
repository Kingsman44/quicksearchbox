package com.google.android.p10712d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.d.cw */
/* compiled from: PG */
public enum C142371cw implements C62957cd {
    ROLE_CHANGE_NONE(0),
    ROLE_CHANGE_REQUEST(1),
    ROLE_CHANGE_PERFORM(2),
    ROLE_CHANGE_FORCE(3),
    ROLE_CHANGE_CANCEL(4);
    

    /* renamed from: f */
    private final int f386323f;

    private C142371cw(int i) {
        this.f386323f = i;
    }

    /* renamed from: a */
    public static C142371cw m231070a(int i) {
        if (i == 0) {
            return ROLE_CHANGE_NONE;
        }
        if (i == 1) {
            return ROLE_CHANGE_REQUEST;
        }
        if (i == 2) {
            return ROLE_CHANGE_PERFORM;
        }
        if (i == 3) {
            return ROLE_CHANGE_FORCE;
        }
        if (i != 4) {
            return null;
        }
        return ROLE_CHANGE_CANCEL;
    }

    /* renamed from: b */
    public static C62959cf m231071b() {
        return C142370cv.f386316a;
    }

    public final int getNumber() {
        return this.f386323f;
    }

    public final String toString() {
        return Integer.toString(this.f386323f);
    }
}
