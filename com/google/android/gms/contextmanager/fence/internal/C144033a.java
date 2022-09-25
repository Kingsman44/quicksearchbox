package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import com.google.android.gms.awareness.fence.C142932a;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.internal.C143825n;
import com.google.android.gms.contextmanager.internal.C144070l;
import com.google.android.gms.contextmanager.internal.C144071m;
import com.google.android.gms.contextmanager.internal.C144072n;
import com.google.android.gms.contextmanager.internal.C144077s;
import com.google.android.gms.contextmanager.internal.C144082x;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.p10717f.p10721d.C142629b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.a */
/* compiled from: PG */
final class C144033a extends C144070l {

    /* renamed from: a */
    final /* synthetic */ FenceUpdateRequestImpl f390294a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144033a(C143851w wVar, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        super(wVar);
        this.f390294a = fenceUpdateRequestImpl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C144072n nVar = (C144072n) bVar;
        FenceUpdateRequestImpl fenceUpdateRequestImpl = this.f390294a;
        nVar.mo119455M();
        if (nVar.f390347c == null) {
            nVar.f390347c = new C142629b(nVar.f390345a, C144038f.f390297a);
        }
        C142629b bVar2 = nVar.f390347c;
        ArrayList arrayList = fenceUpdateRequestImpl.f390285a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            UpdateFenceOperation updateFenceOperation = (UpdateFenceOperation) arrayList.get(i);
            if (updateFenceOperation.f390288c == null) {
                C142932a aVar = updateFenceOperation.f390289d;
            }
        }
        C144082x xVar = (C144082x) nVar.mo119451G();
        C144077s sVar = new C144077s(this, (C143825n) null, (C143825n) null, (C143825n) null, (C144071m) null);
        ContextManagerClientInfo contextManagerClientInfo = nVar.f390346b;
        String str = contextManagerClientInfo.f390310b;
        String str2 = contextManagerClientInfo.f390309a;
        String str3 = contextManagerClientInfo.f390312d;
        Parcel gA = xVar.mo17260gA();
        C8850c.m23499h(gA, sVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeString(str3);
        C8850c.m23497f(gA, fenceUpdateRequestImpl);
        xVar.mo17262he(13, gA);
    }
}
