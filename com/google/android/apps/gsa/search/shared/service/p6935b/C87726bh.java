package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bh */
/* compiled from: PG */
public enum C87726bh implements C62957cd {
    IDLE(0),
    ONGOING(1),
    STOPPED(2);
    

    /* renamed from: d */
    public final int f237207d;

    private C87726bh(int i) {
        this.f237207d = i;
    }

    /* renamed from: a */
    public static C87726bh m142759a(int i) {
        if (i == 0) {
            return IDLE;
        }
        if (i == 1) {
            return ONGOING;
        }
        if (i != 2) {
            return null;
        }
        return STOPPED;
    }

    /* renamed from: b */
    public static C62959cf m142760b() {
        return C87725bg.f237202a;
    }

    public final int getNumber() {
        return this.f237207d;
    }

    public final String toString() {
        return Integer.toString(this.f237207d);
    }
}
