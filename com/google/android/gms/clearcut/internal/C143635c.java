package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.clearcut.internal.c */
/* compiled from: PG */
public final /* synthetic */ class C143635c implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ BatchedLogErrorParcelable f389442a;

    public /* synthetic */ C143635c(BatchedLogErrorParcelable batchedLogErrorParcelable) {
        this.f389442a = batchedLogErrorParcelable;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        BatchedLogErrorParcelable batchedLogErrorParcelable = this.f389442a;
        C143638f fVar = new C143638f((C146010af) obj2);
        C143650r rVar = (C143650r) ((C143642j) obj).mo119451G();
        Parcel gA = rVar.mo17260gA();
        C8850c.m23499h(gA, fVar);
        C8850c.m23497f(gA, batchedLogErrorParcelable);
        rVar.mo17263hf(8, gA);
    }
}
