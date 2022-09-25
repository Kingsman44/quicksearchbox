package com.google.android.gms.contextmanager;

import android.app.PendingIntent;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.contextmanager.internal.C144063e;
import com.google.android.gms.contextmanager.internal.C144070l;
import com.google.android.gms.contextmanager.internal.C144071m;
import com.google.android.gms.contextmanager.internal.C144072n;
import com.google.android.gms.contextmanager.internal.C144077s;
import com.google.android.gms.contextmanager.internal.C144082x;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.contextmanager.g */
/* compiled from: PG */
final class C144051g extends C144070l {

    /* renamed from: a */
    final /* synthetic */ C144030d f390300a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144051g(C143851w wVar, C144030d dVar) {
        super(wVar);
        this.f390300a = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* synthetic */ void mo117681h(C143717b bVar) {
        C144072n nVar = (C144072n) bVar;
        C144030d dVar = this.f390300a;
        nVar.mo119455M();
        C144063e eVar = (C144063e) ((IInterface) nVar.mo119620m().f386960c.remove(dVar));
        if (eVar == null) {
            mo117682i(new Status(1, 0, (String) null, (PendingIntent) null, (ConnectionResult) null));
            return;
        }
        C144071m mVar = new C144071m(eVar);
        C144082x xVar = (C144082x) nVar.mo119451G();
        C144077s sVar = new C144077s(this, (C143825n) null, (C143825n) null, (C143825n) null, mVar);
        ContextManagerClientInfo contextManagerClientInfo = nVar.f390346b;
        String str = contextManagerClientInfo.f390310b;
        String str2 = contextManagerClientInfo.f390309a;
        String str3 = contextManagerClientInfo.f390312d;
        Parcel gA = xVar.mo17260gA();
        C8850c.m23499h(gA, sVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        C8850c.m23499h(gA, eVar);
        C8850c.m23497f(gA, (Parcelable) null);
        xVar.mo17262he(6, gA);
    }
}
