package com.google.android.apps.gsa.staticplugins.p7815dk;

import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.assistant.p3861at.acz;
import com.google.assistant.p3861at.aet;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66531b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dk.k */
/* compiled from: PG */
final class C99637k extends k {

    /* renamed from: a */
    final /* synthetic */ C73894n f278808a;

    /* renamed from: b */
    final /* synthetic */ C99641o f278809b;

    public C99637k(C99641o oVar, C73894n nVar) {
        this.f278809b = oVar;
        this.f278808a = nVar;
    }

    /* renamed from: gn */
    public final void mo91525gn(Throwable th) {
        this.f278808a.mo65390a().gn(th);
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo91526go(Object obj) {
        Object obj2;
        C66611ci ciVar = (C66611ci) obj;
        C99641o oVar = this.f278809b;
        k a = this.f278808a.mo65390a();
        C62940bt r2 = C62942bv.checkIsLite(C66531b.f180948f);
        ciVar.mo58887l(r2);
        if (ciVar.f169962ag.mo58857o(r2.f169971d)) {
            C62940bt r22 = C62942bv.checkIsLite(C66531b.f180948f);
            ciVar.mo58887l(r22);
            Object l = ciVar.f169962ag.mo58854l(r22.f169971d);
            if (l == null) {
                obj2 = r22.f169969b;
            } else {
                obj2 = r22.mo58889c(l);
            }
            aet aet = (aet) obj2;
            if ((aet.f129132a & 1) != 0) {
                oVar.f278815b = aet.f129133b;
                C58976aa aaVar = C58975e.f156826a;
            }
            acz acz = aet.f129134c;
            if (acz == null) {
                acz = acz.f129010n;
            }
            C58976aa aaVar2 = C58975e.f156826a;
            a.go(acz);
        }
    }
}
