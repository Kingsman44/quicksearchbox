package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.C145781a;
import com.google.android.gms.reminders.model.C145854z;

/* renamed from: com.google.android.gms.reminders.internal.a.j */
/* compiled from: PG */
final class C145791j extends C145781a {

    /* renamed from: a */
    final /* synthetic */ C145796o f394159a;

    public C145791j(C145796o oVar) {
        this.f394159a = oVar;
    }

    /* renamed from: a */
    public final void mo121955a(DataHolder dataHolder, Status status) {
        C145854z zVar;
        if (dataHolder == null) {
            zVar = null;
        } else {
            zVar = new C145854z(dataHolder);
        }
        this.f394159a.mo119112p(new C145803v(zVar, status));
    }
}
