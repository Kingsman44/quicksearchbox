package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6095g.C77402o;
import com.google.android.apps.gsa.nga.engine.understanding.C78984ak;
import com.google.android.apps.gsa.nga.engine.understanding.C79138g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80373c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82919fh;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C76481aj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C77402o f211665a;

    public /* synthetic */ C76481aj(C77402o oVar) {
        this.f211665a = oVar;
    }

    public final Object apply(Object obj) {
        C77402o oVar = this.f211665a;
        C76526t tVar = (C76526t) obj;
        C80386p c = oVar.mo72542c(tVar.mo72214a());
        C80379i f = tVar.mo72217f();
        int a = C82919fh.m132428a(tVar.mo72215b().f225878c);
        if (a == 0) {
            a = 1;
        }
        C80373c e = oVar.mo72544e(f, a);
        C80371a aVar = (C80371a) c.toBuilder();
        aVar.copyOnWrite();
        e.getClass();
        ((C80386p) aVar.instance).f220580a = e;
        return new C79138g((C80386p) aVar.build(), C78984ak.RUN_FULFILLER_CANDIDATES);
    }
}
