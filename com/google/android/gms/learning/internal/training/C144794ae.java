package com.google.android.gms.learning.internal.training;

import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143772bt;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.learning.internal.training.ae */
/* compiled from: PG */
final class C144794ae extends C143772bt {

    /* renamed from: a */
    final /* synthetic */ C146010af f391636a;

    /* renamed from: b */
    final /* synthetic */ C144811o f391637b;

    public C144794ae(C146010af afVar, C144811o oVar) {
        this.f391636a = afVar;
        this.f391637b = oVar;
    }

    /* renamed from: a */
    public final void mo117762a(Status status) {
        if (status.f389621g == 0) {
            C146010af afVar = this.f391636a;
            afVar.f394698a.mo122508v(new C144796ag(this.f391637b));
            return;
        }
        C146010af afVar2 = this.f391636a;
        afVar2.f394698a.mo122507u(new C143842n(status));
    }
}
