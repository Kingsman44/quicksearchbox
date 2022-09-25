package com.google.android.gms.people.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.p10855b.C145643b;

/* renamed from: com.google.android.gms.people.internal.l */
/* compiled from: PG */
final class C145675l extends C145656a {

    /* renamed from: a */
    private final C143825n f393914a;

    public C145675l(C143825n nVar) {
        this.f393914a = nVar;
    }

    /* renamed from: a */
    public final void mo121711a(int i, Bundle bundle, DataHolder dataHolder) {
        C145643b bVar;
        Status q = C145679p.m236798q(i, bundle);
        if (dataHolder == null) {
            bVar = null;
        } else {
            bVar = new C145643b(dataHolder);
        }
        this.f393914a.mo117682i(new C145677n(q, bVar));
    }
}
