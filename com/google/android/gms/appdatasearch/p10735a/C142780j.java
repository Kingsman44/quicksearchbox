package com.google.android.gms.appdatasearch.p10735a;

import android.os.Parcel;
import com.google.android.gms.common.api.C143851w;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.appdatasearch.a.j */
/* compiled from: PG */
public final class C142780j extends C142782l {

    /* renamed from: a */
    final /* synthetic */ String f387575a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C142780j(C143851w wVar, String str) {
        super(wVar);
        this.f387575a = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo117680j(C142772b bVar) {
        C142783m mVar = new C142783m(this);
        String str = this.f387575a;
        Parcel gA = bVar.mo17260gA();
        C8850c.m23499h(gA, mVar);
        gA.writeString((String) null);
        gA.writeString(str);
        bVar.mo17262he(6, gA);
    }
}
