package com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.libraries.search.assistant.n.a.a.g */
/* compiled from: PG */
public enum C34827g implements C62957cd {
    UNKNOWN_EXCEPTION(0),
    CANCELLATION_EXCEPTION(1),
    TIMEOUT_EXCEPTION(2);
    

    /* renamed from: d */
    public static final C62958ce f92389d = null;

    /* renamed from: e */
    private final int f92391e;

    static {
        f92389d = new C34826f();
    }

    private C34827g(int i) {
        this.f92391e = i;
    }

    /* renamed from: a */
    public static C34827g m63589a(int i) {
        if (i == 0) {
            return UNKNOWN_EXCEPTION;
        }
        if (i == 1) {
            return CANCELLATION_EXCEPTION;
        }
        if (i != 2) {
            return null;
        }
        return TIMEOUT_EXCEPTION;
    }

    public final int getNumber() {
        return this.f92391e;
    }

    public final String toString() {
        return Integer.toString(this.f92391e);
    }
}
