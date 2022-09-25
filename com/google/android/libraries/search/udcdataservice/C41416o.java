package com.google.android.libraries.search.udcdataservice;

import com.google.android.libraries.search.udcdataservice.facs.C41396f;
import com.google.android.libraries.search.udcdataservice.facs.C41398h;
import com.google.android.libraries.search.udcdataservice.facs.C41399i;
import com.google.android.libraries.search.udcdataservice.facs.C41400j;
import com.google.android.libraries.search.udcdataservice.facs.C41406p;
import com.google.android.libraries.search.udcdataservice.ulr.C41434m;
import com.google.android.libraries.search.udcdataservice.ulr.C41438q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;

/* renamed from: com.google.android.libraries.search.udcdataservice.o */
/* compiled from: PG */
public final /* synthetic */ class C41416o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C41418q f108188a;

    public /* synthetic */ C41416o(C41418q qVar) {
        this.f108188a = qVar;
    }

    public final Object apply(Object obj) {
        C41418q qVar = this.f108188a;
        C41387c cVar = (C41387c) obj;
        if (C41406p.f108170a.containsKey(cVar)) {
            C41396f fVar = qVar.f108192a;
            C55912b bVar = (C55912b) C41406p.f108170a.get(cVar);
            C41406p pVar = (C41406p) fVar;
            C60870cx a = pVar.mo43942a();
            C41398h hVar = new C41398h(bVar);
            C60870cx g = C60922j.m93044g(a, C47810es.m84963c(hVar), pVar.f108172c);
            C41399i iVar = new C41399i(bVar);
            C60870cx g2 = C60922j.m93044g(a, C47810es.m84963c(iVar), pVar.f108172c);
            return C47638k.m84753d(g2, g).mo51520a(new C41400j(pVar, g2, g, cVar), pVar.f108172c);
        }
        C41438q qVar2 = qVar.f108193b;
        C60870cx d = qVar2.f108225e.mo46042d();
        C41434m mVar = new C41434m(qVar2);
        return C60922j.m93044g(d, C47810es.m84963c(mVar), qVar2.f108221a);
    }
}
