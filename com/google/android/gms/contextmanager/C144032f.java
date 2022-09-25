package com.google.android.gms.contextmanager;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.contextmanager.internal.C144070l;
import com.google.android.gms.contextmanager.internal.C144071m;
import com.google.android.gms.contextmanager.internal.C144072n;
import com.google.android.gms.contextmanager.internal.C144077s;
import com.google.android.gms.contextmanager.internal.C144079u;
import com.google.android.gms.contextmanager.internal.C144082x;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.p10717f.p10721d.C142629b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.contextmanager.f */
/* compiled from: PG */
final class C144032f extends C144070l {

    /* renamed from: a */
    final /* synthetic */ C144030d f390267a;

    /* renamed from: d */
    final /* synthetic */ ContextDataFilterImpl f390268d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144032f(C143851w wVar, ContextDataFilterImpl contextDataFilterImpl, C144030d dVar) {
        super(wVar);
        this.f390268d = contextDataFilterImpl;
        this.f390267a = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144079u uVar;
        C144072n nVar = (C144072n) bVar;
        ContextDataFilterImpl contextDataFilterImpl = this.f390268d;
        C144030d dVar = this.f390267a;
        C143919bh.m233966i(true ^ (dVar == null));
        nVar.mo119455M();
        C144082x xVar = (C144082x) nVar.mo119451G();
        C144077s sVar = new C144077s(this, (C143825n) null, (C143825n) null, (C143825n) null, (C144071m) null);
        ContextManagerClientInfo contextManagerClientInfo = nVar.f390346b;
        String str = contextManagerClientInfo.f390310b;
        String str2 = contextManagerClientInfo.f390309a;
        String str3 = contextManagerClientInfo.f390312d;
        if (dVar == null) {
            uVar = null;
        } else {
            C142629b m = nVar.mo119620m();
            IInterface iInterface = (IInterface) m.f386960c.get(dVar);
            if (iInterface == null) {
                iInterface = m.f386959b.mo117323a(dVar, m.f386958a);
                m.f386960c.put(dVar, iInterface);
            }
            uVar = (C144079u) iInterface;
        }
        Parcel gA = xVar.mo17260gA();
        C8850c.m23499h(gA, sVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        C8850c.m23497f(gA, contextDataFilterImpl);
        C8850c.m23497f(gA, (Parcelable) null);
        C8850c.m23499h(gA, uVar);
        C8850c.m23497f(gA, (Parcelable) null);
        xVar.mo17262he(5, gA);
    }
}
