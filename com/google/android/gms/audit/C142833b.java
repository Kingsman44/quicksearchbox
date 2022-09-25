package com.google.android.gms.audit;

import android.os.Parcel;
import com.google.android.gms.audit.p10736a.C142831a;
import com.google.android.gms.audit.p10736a.C142832b;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.audit.b */
/* compiled from: PG */
public final /* synthetic */ class C142833b implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ LogAuditRecordsRequest f387630a;

    public /* synthetic */ C142833b(LogAuditRecordsRequest logAuditRecordsRequest) {
        this.f387630a = logAuditRecordsRequest;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        LogAuditRecordsRequest logAuditRecordsRequest = this.f387630a;
        C142835d dVar = new C142835d((C146010af) obj2);
        C142832b bVar = (C142832b) ((C142831a) obj).mo119451G();
        Parcel gA = bVar.mo17260gA();
        C8850c.m23497f(gA, logAuditRecordsRequest);
        C8850c.m23499h(gA, dVar);
        bVar.mo17262he(1, gA);
    }
}
