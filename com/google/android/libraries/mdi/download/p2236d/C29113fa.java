package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.fa */
/* compiled from: PG */
public final /* synthetic */ class C29113fa implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78960a;

    public /* synthetic */ C29113fa(C29117fe feVar) {
        this.f78960a = feVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78960a;
        C28816c cVar = (C28816c) obj;
        C29334dr a = cVar.mo34483a();
        for (C29328dl dlVar : a.f79512n) {
            int a2 = C29332dp.m54217a(a.f79507i);
            if (a2 == 0) {
                a2 = 1;
            }
            C29398ev a3 = C29292lr.m54176a(dlVar, a2);
            C29290lp lpVar = feVar.f78976e;
            C29670b i = C29670b.m54719g(lpVar.mo34642f(a3)).mo34822i(new C29273kz(lpVar, a3, dlVar), lpVar.f79395k);
            C28837at atVar = new C28837at(feVar, a, cVar);
            C60846c.m92879h(i, C29291lq.class, C47810es.m84966f(atVar), feVar.f78980i);
        }
        return C60866ct.f164955a;
    }
}
