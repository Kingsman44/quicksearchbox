package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ou */
/* compiled from: PG */
public enum C88090ou implements C62957cd {
    DEFAULT(0),
    SEND_PARTIAL_RESULTS(1),
    FINISH_EXECUTION(2);
    

    /* renamed from: d */
    public final int f238168d;

    private C88090ou(int i) {
        this.f238168d = i;
    }

    /* renamed from: a */
    public static C88090ou m142782a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return SEND_PARTIAL_RESULTS;
        }
        if (i != 2) {
            return null;
        }
        return FINISH_EXECUTION;
    }

    /* renamed from: b */
    public static C62959cf m142783b() {
        return C88089ot.f238163a;
    }

    public final int getNumber() {
        return this.f238168d;
    }

    public final String toString() {
        return Integer.toString(this.f238168d);
    }
}
