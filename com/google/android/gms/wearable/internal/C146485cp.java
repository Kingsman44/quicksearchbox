package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.wearable.internal.cp */
/* compiled from: PG */
final class C146485cp implements C143825n {

    /* renamed from: a */
    final C146010af f395675a;

    public C146485cp(C146010af afVar) {
        this.f395675a = afVar;
    }

    /* renamed from: a */
    public final void mo117682i(Status status) {
        int i = status.f389621g;
        if (i == 0) {
            this.f395675a.f394698a.mo122508v(true);
        } else if (i == 4002) {
            this.f395675a.f394698a.mo122508v(false);
        } else {
            C146010af afVar = this.f395675a;
            afVar.f394698a.mo122507u(new C143842n(status));
        }
    }
}
