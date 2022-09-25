package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.c.b.f */
/* compiled from: PG */
public enum C34679f implements C62957cd {
    UNKNOWN(0),
    ACTIVE(1),
    INACTIVE_SODA_NOT_LISTENING(2);
    

    /* renamed from: d */
    public final int f92074d;

    private C34679f(int i) {
        this.f92074d = i;
    }

    /* renamed from: a */
    public static C34679f m63414a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACTIVE;
        }
        if (i != 2) {
            return null;
        }
        return INACTIVE_SODA_NOT_LISTENING;
    }

    /* renamed from: b */
    public static C62959cf m63415b() {
        return C34678e.f92069a;
    }

    public final int getNumber() {
        return this.f92074d;
    }

    public final String toString() {
        return Integer.toString(this.f92074d);
    }
}
