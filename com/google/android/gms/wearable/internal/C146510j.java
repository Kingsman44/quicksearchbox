package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.C146410e;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.wearable.internal.j */
/* compiled from: PG */
final class C146510j extends C146509i {

    /* renamed from: a */
    final /* synthetic */ String f395705a;

    /* renamed from: d */
    final /* synthetic */ int f395706d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C146510j(C143851w wVar, String str, int i) {
        super(wVar);
        this.f395705a = str;
        this.f395706d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new C146515o(status, (C146410e) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        String str = this.f395705a;
        int i = this.f395706d;
        C146452bj bjVar = (C146452bj) ((C146499dc) bVar).mo119451G();
        C146490cu cuVar = new C146490cu(this);
        Parcel gA = bjVar.mo17260gA();
        C8850c.m23499h(gA, cuVar);
        gA.writeString(str);
        gA.writeInt(i);
        bjVar.mo17262he(42, gA);
    }
}
