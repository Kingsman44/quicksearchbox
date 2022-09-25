package com.google.android.apps.search.googleapp.p10544z.p10545a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.z.a.f */
/* compiled from: PG */
public enum C139905f implements C62957cd {
    UNKNOWN(0),
    EXPIRED(1);
    

    /* renamed from: c */
    public static final C62958ce f380322c = null;

    /* renamed from: d */
    public final int f380324d;

    static {
        f380322c = new C139903d();
    }

    private C139905f(int i) {
        this.f380324d = i;
    }

    /* renamed from: a */
    public static C139905f m227513a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return EXPIRED;
    }

    /* renamed from: b */
    public static C62959cf m227514b() {
        return C139904e.f380319a;
    }

    public final int getNumber() {
        return this.f380324d;
    }

    public final String toString() {
        return Integer.toString(this.f380324d);
    }
}
