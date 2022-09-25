package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bx */
/* compiled from: PG */
public enum C80230bx implements C62957cd {
    TRIGGER_CONDITION_EVALUATION_UNKNOWN(0),
    ON_DEMAND_SIGNALS_NOT_SATISFIED(1),
    ON_DEMAND_SIGNALS_SATISFIED(2),
    ALL_SIGNALS_SATISFIED(3);
    

    /* renamed from: e */
    private final int f220119e;

    private C80230bx(int i) {
        this.f220119e = i;
    }

    public final int getNumber() {
        return this.f220119e;
    }

    public final String toString() {
        return Integer.toString(this.f220119e);
    }
}
