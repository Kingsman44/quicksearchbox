package com.google.android.gms.reminders.internal.p10862a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143811de;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.internal.C145781a;
import com.google.android.gms.reminders.model.C145854z;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.reminders.internal.a.g */
/* compiled from: PG */
final class C145788g extends C145781a {

    /* renamed from: a */
    final /* synthetic */ C146010af f394153a;

    public C145788g(C146010af afVar) {
        this.f394153a = afVar;
    }

    /* renamed from: a */
    public final void mo121955a(DataHolder dataHolder, Status status) {
        C145854z zVar;
        if (dataHolder == null) {
            zVar = null;
        } else {
            zVar = new C145854z(dataHolder);
        }
        C143811de.m233724a(status, zVar, this.f394153a);
    }
}
