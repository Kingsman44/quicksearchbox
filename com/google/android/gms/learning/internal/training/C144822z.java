package com.google.android.gms.learning.internal.training;

import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143772bt;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.learning.internal.training.z */
/* compiled from: PG */
final class C144822z extends C143772bt {

    /* renamed from: a */
    final /* synthetic */ C146010af f391652a;

    /* renamed from: b */
    final /* synthetic */ C144814r f391653b;

    public C144822z(C146010af afVar, C144814r rVar) {
        this.f391652a = afVar;
        this.f391653b = rVar;
    }

    /* renamed from: a */
    public final void mo117762a(Status status) {
        if (status.f389621g == 0) {
            C146010af afVar = this.f391652a;
            afVar.f394698a.mo122508v(new C144791ab(this.f391653b));
            return;
        }
        C146010af afVar2 = this.f391652a;
        afVar2.f394698a.mo122507u(new C143842n(status));
    }
}
