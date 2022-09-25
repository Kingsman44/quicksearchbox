package com.google.android.apps.gsa.sidekick.main.trigger.service;

import android.location.Location;
import com.google.android.apps.gsa.sidekick.main.trigger.C91628e;
import com.google.android.apps.gsa.sidekick.main.trigger.C91630g;
import com.google.android.apps.gsa.sidekick.main.trigger.C91631h;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.sidekick.shared.util.C91966aq;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.libraries.gcoreclient.p1788q.p1789a.C21617d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7805kp;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.service.g */
/* compiled from: PG */
public final /* synthetic */ class C91639g implements C118549h {

    /* renamed from: a */
    public final /* synthetic */ C91635c f255592a;

    public /* synthetic */ C91639g(C91635c cVar) {
        this.f255592a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        long j;
        Location location;
        C91635c cVar = this.f255592a;
        C58976aa aaVar = C58975e.f156826a;
        C118522by byVar = C118522by.UNKNOWN;
        C62940bt r1 = C62942bv.checkIsLite(C91631h.f255576a);
        akVar.mo58887l(r1);
        Object l = akVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C91630g gVar = (C91630g) obj;
        C91628e eVar = gVar.f255575d;
        if (eVar == null) {
            eVar = C91628e.f255567b;
        }
        TriggerConditionEvaluator.APriori aPriori = new TriggerConditionEvaluator.APriori((List) eVar.f255569a);
        if ((gVar.f255572a & 1) != 0) {
            C7805kp kpVar = gVar.f255573b;
            if (kpVar == null) {
                kpVar = C7805kp.f27284h;
            }
            location = C91966aq.m150921a(kpVar);
            j = gVar.f255574c;
        } else {
            location = cVar.mo86013c((C21617d) null, true);
            j = TimeUnit.MILLISECONDS.toSeconds(cVar.f255582a.mo26870b());
        }
        return cVar.f255583b.mo85589a(location, j, aPriori);
    }
}
