package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6519al.p6650ci.C85124d;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88640m;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88641n;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.d */
/* compiled from: PG */
public final /* synthetic */ class C88553d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C88555f f239332a;

    public /* synthetic */ C88553d(C88555f fVar) {
        this.f239332a = fVar;
    }

    public final Object apply(Object obj) {
        C88555f fVar = this.f239332a;
        C88641n nVar = (C88641n) obj;
        int a = C85124d.m136376a(nVar.f239633b);
        if (a != 0 && a == 2 && !nVar.f239634c) {
            ((C118831d) fVar.f239338e.mo6453a()).mo104025g(1);
        }
        C88640m mVar = (C88640m) nVar.toBuilder();
        mVar.copyOnWrite();
        C88641n nVar2 = (C88641n) mVar.instance;
        nVar2.f239632a |= 2;
        nVar2.f239634c = true;
        return (C88641n) mVar.build();
    }
}
