package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.storage.C114493m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.an */
/* compiled from: PG */
public final /* synthetic */ class C114392an implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C114396ar f317191a;

    /* renamed from: b */
    public final /* synthetic */ int f317192b;

    public /* synthetic */ C114392an(C114396ar arVar, int i) {
        this.f317191a = arVar;
        this.f317192b = i;
    }

    public final C60870cx apply(Object obj) {
        C114396ar arVar = this.f317191a;
        List<C114493m> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        for (C114493m mVar : list) {
            try {
                aas aas = (aas) C62942bv.parseFrom((C62942bv) aas.f134661u, mVar.mo101342c(), C62921ba.m95368a());
                C60870cx c = arVar.mo101313c(aas, C58833ax.m90834k(Long.valueOf(mVar.mo101340a())));
                C114389ak akVar = new C114389ak(arVar, aas);
                arrayList.add(C60922j.m93044g(c, C47810es.m84963c(akVar), arVar.f317204f));
            } catch (C62974ct e) {
                C59104x c2 = C114396ar.f317198a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NotifDelayedTrigger");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(29001)).mo56386p("Could not parse notification.");
            }
        }
        return C47638k.m84750a(arrayList).mo51520a(new C114390al(arVar, arrayList, list), arVar.f317204f);
    }
}
