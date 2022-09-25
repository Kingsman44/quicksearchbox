package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.ai */
/* compiled from: PG */
public enum C37344ai implements C62957cd {
    UNKNOWN_RELEASING_STATUS(0),
    RELEASED(1),
    FAILED_RELEASING_PLATFORM_ERROR(2),
    FAILED_RELEASING_DUE_TO_INACTIVE_SESSION(4),
    FAILED_GETTING_STATUS_FUTURE(5);
    

    /* renamed from: f */
    public static final C62958ce f99194f = null;

    /* renamed from: g */
    public final int f99196g;

    static {
        f99194f = new C37342ag();
    }

    private C37344ai(int i) {
        this.f99196g = i;
    }

    /* renamed from: a */
    public static C37344ai m66353a(int i) {
        if (i == 0) {
            return UNKNOWN_RELEASING_STATUS;
        }
        if (i == 1) {
            return RELEASED;
        }
        if (i == 2) {
            return FAILED_RELEASING_PLATFORM_ERROR;
        }
        if (i == 4) {
            return FAILED_RELEASING_DUE_TO_INACTIVE_SESSION;
        }
        if (i != 5) {
            return null;
        }
        return FAILED_GETTING_STATUS_FUTURE;
    }

    /* renamed from: b */
    public static C62959cf m66354b() {
        return C37343ah.f99188a;
    }

    public final int getNumber() {
        return this.f99196g;
    }

    public final String toString() {
        return Integer.toString(this.f99196g);
    }
}
