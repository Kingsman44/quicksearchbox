package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.by */
/* compiled from: PG */
final class C146467by extends C146509i {
    public C146467by(C143851w wVar) {
        super(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146468bz(status, (NodeParcelable) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C146452bj bjVar = (C146452bj) ((C146499dc) bVar).mo119451G();
        C146491cv cvVar = new C146491cv(this);
        Parcel gA = bjVar.mo17260gA();
        C8850c.m23499h(gA, cvVar);
        bjVar.mo17262he(14, gA);
    }
}
