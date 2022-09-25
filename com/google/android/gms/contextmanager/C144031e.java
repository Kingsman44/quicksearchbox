package com.google.android.gms.contextmanager;

import android.os.Parcel;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.contextmanager.internal.C144065g;
import com.google.android.gms.contextmanager.internal.C144071m;
import com.google.android.gms.contextmanager.internal.C144072n;
import com.google.android.gms.contextmanager.internal.C144077s;
import com.google.android.gms.contextmanager.internal.C144082x;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.contextmanager.e */
/* compiled from: PG */
final class C144031e extends C144065g {

    /* renamed from: a */
    final /* synthetic */ ContextDataFilterImpl f390266a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144031e(C143851w wVar, ContextDataFilterImpl contextDataFilterImpl) {
        super(wVar);
        this.f390266a = contextDataFilterImpl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144072n nVar = (C144072n) bVar;
        ContextDataFilterImpl contextDataFilterImpl = this.f390266a;
        nVar.mo119455M();
        C144082x xVar = (C144082x) nVar.mo119451G();
        C144077s sVar = new C144077s((C143825n) null, this, (C143825n) null, (C143825n) null, (C144071m) null);
        ContextManagerClientInfo contextManagerClientInfo = nVar.f390346b;
        String str = contextManagerClientInfo.f390310b;
        String str2 = contextManagerClientInfo.f390309a;
        String str3 = contextManagerClientInfo.f390312d;
        Parcel gA = xVar.mo17260gA();
        C8850c.m23499h(gA, sVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        C8850c.m23497f(gA, contextDataFilterImpl);
        xVar.mo17262he(14, gA);
    }
}
