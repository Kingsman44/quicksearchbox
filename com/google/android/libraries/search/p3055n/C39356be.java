package com.google.android.libraries.search.p3055n;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.be */
/* compiled from: PG */
public enum C39356be implements C62957cd {
    DEFAULT_PERSONAL(0),
    NAVIGATION(1),
    COMMUNAL(2),
    GUEST(3),
    EXTERNAL(4);
    

    /* renamed from: f */
    public final int f103643f;

    private C39356be(int i) {
        this.f103643f = i;
    }

    /* renamed from: a */
    public static C39356be m68761a(int i) {
        if (i == 0) {
            return DEFAULT_PERSONAL;
        }
        if (i == 1) {
            return NAVIGATION;
        }
        if (i == 2) {
            return COMMUNAL;
        }
        if (i == 3) {
            return GUEST;
        }
        if (i != 4) {
            return null;
        }
        return EXTERNAL;
    }

    /* renamed from: b */
    public static C62959cf m68762b() {
        return C39355bd.f103636a;
    }

    public final int getNumber() {
        return this.f103643f;
    }

    public final String toString() {
        return Integer.toString(this.f103643f);
    }
}
