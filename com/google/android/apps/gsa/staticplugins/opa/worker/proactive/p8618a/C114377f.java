package com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8618a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114392an;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114396ar;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114405b;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114435c;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114462d;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.C114469h;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.a.f */
/* compiled from: PG */
public final class C114377f implements C118549h {

    /* renamed from: a */
    private final C114396ar f317118a;

    /* renamed from: b */
    private final C114469h f317119b;

    public C114377f(C114396ar arVar, C114469h hVar) {
        this.f317118a = arVar;
        this.f317119b = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C114469h hVar = this.f317119b;
        C58976aa aaVar = C58975e.f156826a;
        C60870cx b = hVar.f317417i.mo57305b(new C114405b(hVar), hVar.f317418j);
        hVar.f317417i.mo57305b(new C114462d(hVar, b, hVar.f317417i.mo57305b(new C114435c(hVar, b), hVar.f317418j)), hVar.f317418j);
        C62940bt r0 = C62942bv.checkIsLite(C114376e.f317117a);
        akVar.mo58887l(r0);
        Object l = akVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C114375d dVar = (C114375d) obj;
        if (dVar == null) {
            return C118826c.f331423b;
        }
        C114396ar arVar = this.f317118a;
        int a = C114374c.m189681a(dVar.f317116b);
        if (a == 0) {
            a = 1;
        }
        if (a == 1) {
            return C118826c.f331423b;
        }
        C60870cx a2 = arVar.f317200b.mo101347a();
        C114392an anVar = new C114392an(arVar, a);
        return C60922j.m93045h(a2, C47810es.m84966f(anVar), arVar.f317204f);
    }
}
