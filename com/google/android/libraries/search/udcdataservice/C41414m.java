package com.google.android.libraries.search.udcdataservice;

import com.google.android.libraries.search.udcdataservice.facs.C41396f;
import com.google.android.libraries.search.udcdataservice.facs.C41403m;
import com.google.android.libraries.search.udcdataservice.facs.C41404n;
import com.google.android.libraries.search.udcdataservice.facs.C41405o;
import com.google.android.libraries.search.udcdataservice.facs.C41406p;
import com.google.android.libraries.search.udcdataservice.ulr.C41433l;
import com.google.android.libraries.search.udcdataservice.ulr.C41438q;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;

/* renamed from: com.google.android.libraries.search.udcdataservice.m */
/* compiled from: PG */
public final /* synthetic */ class C41414m implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C41418q f108185a;

    public /* synthetic */ C41414m(C41418q qVar) {
        this.f108185a = qVar;
    }

    public final Object apply(Object obj) {
        C41418q qVar = this.f108185a;
        C41387c cVar = (C41387c) obj;
        if (C41406p.f108170a.containsKey(cVar)) {
            C41396f fVar = qVar.f108192a;
            C55912b bVar = (C55912b) C41406p.f108170a.get(cVar);
            C41406p pVar = (C41406p) fVar;
            C60870cx a = pVar.mo43942a();
            C41403m mVar = new C41403m(bVar);
            C60870cx h = C60922j.m93045h(a, C47810es.m84966f(mVar), pVar.f108172c);
            C41404n nVar = new C41404n(bVar);
            C60870cx h2 = C60922j.m93045h(a, C47810es.m84966f(nVar), pVar.f108172c);
            return C47638k.m84753d(h2, h).mo51520a(new C41405o(cVar, h2, h), pVar.f108172c);
        }
        C41438q qVar2 = qVar.f108193b;
        C60870cx d = qVar2.f108225e.mo46042d();
        C41433l lVar = new C41433l(qVar2);
        return C60922j.m93045h(d, C47810es.m84966f(lVar), qVar2.f108221a);
    }
}
