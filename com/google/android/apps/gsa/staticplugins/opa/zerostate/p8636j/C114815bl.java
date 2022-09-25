package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import com.google.common.base.C58817ah;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bl */
/* compiled from: PG */
public final /* synthetic */ class C114815bl implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C114816bm f318577a;

    /* renamed from: b */
    public final /* synthetic */ int f318578b;

    public /* synthetic */ C114815bl(C114816bm bmVar, int i) {
        this.f318577a = bmVar;
        this.f318578b = i;
    }

    public final Object apply(Object obj) {
        C114887s sVar;
        C114816bm bmVar = this.f318577a;
        int i = this.f318578b;
        C114889u uVar = (C114889u) obj;
        if (uVar == null) {
            sVar = (C114887s) C114889u.f318756b.createBuilder();
        } else {
            sVar = (C114887s) uVar.toBuilder();
        }
        long b = bmVar.f318579a.mo26870b();
        sVar.copyOnWrite();
        C114889u uVar2 = (C114889u) sVar.instance;
        C62995dn dnVar = uVar2.f318758a;
        if (!dnVar.f170058b) {
            uVar2.f318758a = dnVar.mo58980a();
        }
        uVar2.f318758a.put(Integer.valueOf(i), Long.valueOf(b));
        return (C114889u) sVar.build();
    }
}
