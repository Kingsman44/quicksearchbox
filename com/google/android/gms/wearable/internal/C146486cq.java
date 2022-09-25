package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.wearable.internal.cq */
/* compiled from: PG */
final class C146486cq implements C143825n {

    /* renamed from: a */
    final C146010af f395676a;

    public C146486cq(C146010af afVar) {
        this.f395676a = afVar;
    }

    /* renamed from: a */
    public final void mo117682i(Status status) {
        int i = status.f389621g;
        if (i == 0 || i == 4001) {
            this.f395676a.f394698a.mo122508v((Object) null);
            return;
        }
        C146010af afVar = this.f395676a;
        afVar.f394698a.mo122507u(new C143842n(status));
    }
}
