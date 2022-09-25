package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.n.c.a.i.p */
/* compiled from: PG */
public enum C39624p implements C62957cd {
    UNSPECIFIED(0),
    STARTED(1),
    ENDED(2);
    

    /* renamed from: d */
    public final int f104302d;

    private C39624p(int i) {
        this.f104302d = i;
    }

    /* renamed from: a */
    public static C39624p m69074a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return STARTED;
        }
        if (i != 2) {
            return null;
        }
        return ENDED;
    }

    /* renamed from: b */
    public static C62959cf m69075b() {
        return C39623o.f104297a;
    }

    public final int getNumber() {
        return this.f104302d;
    }

    public final String toString() {
        return Integer.toString(this.f104302d);
    }
}
