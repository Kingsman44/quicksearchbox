package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.contextmanager.internal.C144069k;
import com.google.android.gms.contextmanager.internal.C144071m;
import com.google.android.gms.contextmanager.internal.C144072n;
import com.google.android.gms.contextmanager.internal.C144077s;
import com.google.android.gms.contextmanager.internal.C144082x;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.awareness.snapshot.internal.i */
/* compiled from: PG */
public final class C142946i extends C144069k {
    public C142946i(C143851w wVar) {
        super(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144072n nVar = (C144072n) bVar;
        SnapshotRequest snapshotRequest = new SnapshotRequest();
        nVar.mo119455M();
        C144082x xVar = (C144082x) nVar.mo119451G();
        C144077s sVar = new C144077s((C143825n) null, (C143825n) null, this, (C143825n) null, (C144071m) null);
        ContextManagerClientInfo contextManagerClientInfo = nVar.f390346b;
        String str = contextManagerClientInfo.f390310b;
        String str2 = contextManagerClientInfo.f390309a;
        String str3 = contextManagerClientInfo.f390312d;
        Parcel gA = xVar.mo17260gA();
        C8850c.m23499h(gA, sVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        C8850c.m23497f(gA, snapshotRequest);
        xVar.mo17262he(15, gA);
    }
}
