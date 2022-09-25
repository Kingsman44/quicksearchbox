package com.google.android.libraries.gsa.monet.tools.recycling.p1927c;

import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a.C105738q;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.recycling.shared.RecyclingChildCoordinator$RecyclingChildData;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.monet.tools.recycling.c.k */
/* compiled from: PG */
public final class C23295k {

    /* renamed from: a */
    public final /* synthetic */ C23296l f63785a;

    public C23295k(C23296l lVar) {
        this.f63785a = lVar;
    }

    /* renamed from: a */
    public final void mo28788a(int i, RecyclingChildCoordinator$RecyclingChildData recyclingChildCoordinator$RecyclingChildData) {
        C105738q qVar;
        C23296l lVar = (C23296l) this.f63785a.mo28775W(i);
        if (lVar != null) {
            C23296l lVar2 = this.f63785a;
            C23289e T = lVar2.mo28772T(i);
            C23067b.m43236i(T, "Remove attempted on an untracked child");
            C23290f fVar = T.f63761a;
            C23067b.m43236i(fVar, "Not a container child, please call removeChild()");
            fVar.f63765E = null;
            int R = lVar2.mo28770R(T.f63762b);
            lVar2.mo28774V(i);
            C23286b bVar = lVar2.f63765E;
            if (bVar != null) {
                bVar.mo28766f(lVar2.f63126Q.mo28342l(), R, T.mo28767a());
            }
            C23296l lVar3 = this.f63785a;
            lVar3.mo28796s(i, recyclingChildCoordinator$RecyclingChildData.f63675b, lVar);
            for (C105738q qVar2 : lVar3.f63788I) {
                Map map = qVar2.f295096b;
                if (!(map == null || (qVar = (C105738q) map.remove(lVar)) == null)) {
                    qVar.mo95024b();
                }
            }
            this.f63785a.f63126Q.mo28308v(lVar);
            this.f63785a.f63126Q.mo28307r(lVar);
            return;
        }
        C23296l lVar4 = this.f63785a;
        C23289e T2 = lVar4.mo28772T(i);
        C23067b.m43236i(T2, "Remove attempted on an untracked child");
        C23067b.m43233f(T2.f63761a == null, "Container child, please call removeContainerChild()");
        int R2 = lVar4.mo28770R(T2.f63762b);
        lVar4.mo28774V(i);
        C23286b bVar2 = lVar4.f63765E;
        if (bVar2 != null) {
            bVar2.mo28763c(lVar4.f63126Q.mo28342l(), R2);
        }
        C23296l lVar5 = this.f63785a;
        String str = recyclingChildCoordinator$RecyclingChildData.f63675b;
        lVar5.mo28794jn(i);
        for (C105738q qVar3 : lVar5.f63788I) {
        }
    }
}
