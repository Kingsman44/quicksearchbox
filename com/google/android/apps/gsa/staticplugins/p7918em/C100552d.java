package com.google.android.apps.gsa.staticplugins.p7918em;

import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89427c;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89428d;
import com.google.common.base.C58817ah;
import com.google.p4479cg.C58075g;

/* renamed from: com.google.android.apps.gsa.staticplugins.em.d */
/* compiled from: PG */
public final /* synthetic */ class C100552d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58075g f281138a;

    public /* synthetic */ C100552d(C58075g gVar) {
        this.f281138a = gVar;
    }

    public final Object apply(Object obj) {
        C58075g gVar = this.f281138a;
        C89428d dVar = (C89428d) obj;
        C89427c cVar = (C89427c) dVar.toBuilder();
        int i = dVar.f242421c;
        cVar.copyOnWrite();
        C89428d dVar2 = (C89428d) cVar.instance;
        dVar2.f242419a |= 2;
        dVar2.f242421c = i + 1;
        cVar.copyOnWrite();
        C89428d dVar3 = (C89428d) cVar.instance;
        gVar.getClass();
        dVar3.f242422d = gVar;
        dVar3.f242419a |= 4;
        return (C89428d) cVar.build();
    }
}
