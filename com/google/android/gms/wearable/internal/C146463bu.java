package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.internal.C143879a;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.wearable.internal.bu */
/* compiled from: PG */
final class C146463bu implements C143825n {

    /* renamed from: a */
    final /* synthetic */ C146010af f395667a;

    public C146463bu(C146010af afVar) {
        this.f395667a = afVar;
    }

    /* renamed from: i */
    public final /* synthetic */ void mo117682i(Object obj) {
        C146464bv bvVar = (C146464bv) obj;
        Status status = bvVar.f395668a;
        if (status.mo119097c()) {
            C146010af afVar = this.f395667a;
            afVar.f394698a.mo122508v(bvVar.f395669b);
            return;
        }
        C146010af afVar2 = this.f395667a;
        afVar2.f394698a.mo122507u(C143879a.m233899a(status));
    }
}
