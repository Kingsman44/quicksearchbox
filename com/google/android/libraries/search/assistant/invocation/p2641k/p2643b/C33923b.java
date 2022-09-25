package com.google.android.libraries.search.assistant.invocation.p2641k.p2643b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.libraries.search.assistant.invocation.k.b.b */
/* compiled from: PG */
public enum C33923b implements C62957cd {
    UNKNOWN(0),
    AUTHENTICATION_ERROR(1),
    CLIENT_DISCONNECT(2),
    CANCELED(3),
    TIMED_OUT(4);
    

    /* renamed from: f */
    public static final C62958ce f90480f = null;

    /* renamed from: g */
    private final int f90482g;

    static {
        f90480f = new C33922a();
    }

    private C33923b(int i) {
        this.f90482g = i;
    }

    /* renamed from: a */
    public static C33923b m62575a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return AUTHENTICATION_ERROR;
        }
        if (i == 2) {
            return CLIENT_DISCONNECT;
        }
        if (i == 3) {
            return CANCELED;
        }
        if (i != 4) {
            return null;
        }
        return TIMED_OUT;
    }

    public final int getNumber() {
        return this.f90482g;
    }

    public final String toString() {
        return Integer.toString(this.f90482g);
    }
}
