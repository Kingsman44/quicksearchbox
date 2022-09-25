package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.shared.p7066m.C90040cs;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128184p;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128187s;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128190v;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128191w;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.cj */
/* compiled from: PG */
public final /* synthetic */ class C78414cj implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78419co f215863a;

    public /* synthetic */ C78414cj(C78419co coVar) {
        this.f215863a = coVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78419co coVar = this.f215863a;
        C78417cm cmVar = (C78417cm) obj;
        if (coVar.f215894r.mo85405j(C90040cs.f248671j)) {
            C128184p pVar = coVar.f215895s;
            C128190v vVar = (C128190v) C128191w.f352648d.createBuilder();
            C58485gu b = cmVar.mo73365b();
            vVar.copyOnWrite();
            C128191w wVar = (C128191w) vVar.instance;
            C62971cq cqVar = wVar.f352651b;
            if (!cqVar.mo58948c()) {
                wVar.f352651b = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) b, (List) wVar.f352651b);
            C128182n a = cmVar.mo73364a();
            vVar.copyOnWrite();
            C128191w wVar2 = (C128191w) vVar.instance;
            a.getClass();
            wVar2.f352652c = a;
            wVar2.f352650a |= 1;
            new C90873ag(C70876o.m103760a(pVar.f189039a.mo39510a(C128187s.m209273b(), pVar.f189040b), (C128191w) vVar.build()), coVar.f215896t, "[NGA] freSuggestionsService.registerFreSuggestionImpressions", C78398bu.f215847a).mo85223a(C78399bv.f215848a);
        }
    }
}
