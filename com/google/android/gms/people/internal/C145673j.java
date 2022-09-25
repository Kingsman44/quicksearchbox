package com.google.android.gms.people.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.p10855b.C145642a;

/* renamed from: com.google.android.gms.people.internal.j */
/* compiled from: PG */
final class C145673j extends C145656a {

    /* renamed from: a */
    private final C143825n f393912a;

    public C145673j(C143825n nVar) {
        this.f393912a = nVar;
    }

    /* renamed from: a */
    public final void mo121711a(int i, Bundle bundle, DataHolder dataHolder) {
        C145642a aVar;
        Status q = C145679p.m236798q(i, bundle);
        if (dataHolder == null) {
            aVar = null;
        } else {
            aVar = new C145642a(dataHolder);
        }
        this.f393912a.mo117682i(new C145671h(q, aVar));
    }
}
