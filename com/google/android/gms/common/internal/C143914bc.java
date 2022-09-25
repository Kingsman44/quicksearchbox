package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143853y;
import com.google.android.gms.common.api.C143854z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146010af;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.bc */
/* compiled from: PG */
final class C143914bc implements C143853y {

    /* renamed from: a */
    final /* synthetic */ C143854z f390108a;

    /* renamed from: b */
    final /* synthetic */ C146010af f390109b;

    /* renamed from: c */
    final /* synthetic */ C143917bf f390110c;

    public C143914bc(C143854z zVar, C146010af afVar, C143917bf bfVar) {
        this.f390108a = zVar;
        this.f390109b = afVar;
        this.f390110c = bfVar;
    }

    /* renamed from: a */
    public final void mo119124a(Status status) {
        if (status.mo119097c()) {
            C143711ad b = this.f390108a.mo117317b(0, TimeUnit.MILLISECONDS);
            C146010af afVar = this.f390109b;
            afVar.f394698a.mo122508v(this.f390110c.mo119425a(b));
            return;
        }
        C146010af afVar2 = this.f390109b;
        afVar2.f394698a.mo122507u(C143879a.m233899a(status));
    }
}
