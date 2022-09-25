package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.l */
/* compiled from: PG */
final class C146512l extends C146509i {

    /* renamed from: a */
    final /* synthetic */ String f395708a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146512l(C143851w wVar, String str) {
        super(wVar);
        this.f395708a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146513m(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        String str = this.f395708a;
        C146452bj bjVar = (C146452bj) ((C146499dc) bVar).mo119451G();
        C146494cy cyVar = new C146494cy(this);
        Parcel gA = bjVar.mo17260gA();
        C8850c.m23499h(gA, cyVar);
        gA.writeString(str);
        bjVar.mo17262he(47, gA);
    }
}
