package com.google.android.apps.search.assistant.platform.p9080f.p9092d.p9093a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119893l;
import com.google.android.apps.search.assistant.platform.p9080f.p9092d.C120531a;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120691f;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120693h;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120695j;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120697l;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120702q;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120703r;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120809b;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120812e;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120813f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.d.a.b */
/* compiled from: PG */
public final class C120533b implements C120531a {

    /* renamed from: a */
    private static final C59071e f335205a = C59071e.m91331h();

    /* renamed from: b */
    private final C120691f f335206b;

    /* renamed from: c */
    private final C120695j f335207c;

    /* renamed from: d */
    private final AtomicReference f335208d = new AtomicReference(C120535d.f335210a);

    public C120533b(C120691f fVar, C120695j jVar) {
        C69664n.m101061g(fVar, "currentInitialRequestData");
        C69664n.m101061g(jVar, "currentInteractionStart");
        this.f335206b = fVar;
        this.f335207c = jVar;
    }

    /* renamed from: a */
    public final Optional mo104806a() {
        C120532a.m199648a(this.f335208d, C120535d.f335210a, C120534c.f335209a);
        return ((C120537f) this.f335208d.get()).mo104811a();
    }

    /* renamed from: b */
    public final void mo104807b() {
        C120703r rVar;
        C58976aa aaVar = C58975e.f156826a;
        C120693h hVar = (C120693h) C120695j.f335679k.createBuilder();
        C69664n.m101060f(hVar, "newBuilder()");
        C120697l a = C69664n.m101061g(hVar, "builder");
        C120702q qVar = (C120702q) C120703r.f335705e.createBuilder();
        C69664n.m101060f(qVar, "newBuilder()");
        C69664n.m101061g(qVar, "builder");
        C120695j jVar = this.f335207c;
        if (jVar.f335682b == 2) {
            rVar = (C120703r) jVar.f335683c;
        } else {
            rVar = C120703r.f335705e;
        }
        C119893l lVar = rVar.f335710d;
        if (lVar == null) {
            lVar = C119893l.f333893e;
        }
        C69664n.m101060f(lVar, "currentInteractionStart.speech.switchedAsrConfig");
        C69664n.m101061g(lVar, "value");
        qVar.copyOnWrite();
        C120703r rVar2 = (C120703r) qVar.instance;
        lVar.getClass();
        rVar2.f335710d = lVar;
        rVar2.f335707a |= 1;
        C62942bv build = qVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C120703r rVar3 = (C120703r) build;
        C69664n.m101061g(rVar3, "value");
        C120693h hVar2 = a.f335692a;
        hVar2.copyOnWrite();
        C120695j jVar2 = (C120695j) hVar2.instance;
        rVar3.getClass();
        jVar2.f335683c = rVar3;
        jVar2.f335682b = 2;
        C120693h hVar3 = a.f335692a;
        hVar3.copyOnWrite();
        C120695j jVar3 = (C120695j) hVar3.instance;
        jVar3.f335681a |= 1;
        jVar3.f335685e = true;
        a.mo104900b(this.f335206b);
        a.mo104901c(C119836cd.QUERY_FOLLOW_ON);
        if (!C120532a.m199648a(this.f335208d, C120535d.f335210a, new C120536e(a.mo104899a()))) {
            C59052c cVar = (C59052c) f335205a.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, "DialogNextStepRequester");
            cVar.mo56380ai(C58979ad.FULL);
            Object obj = this.f335208d.get();
            cVar.mo56379ah(new C59094n(35480));
            cVar.mo56389s("#reopenTheMic, can not update, current status: %S", obj);
        }
    }

    /* renamed from: c */
    public final void mo104808c(C58485gu guVar) {
        C69664n.m101061g(guVar, "results");
        C58976aa aaVar = C58975e.f156826a;
        C120693h hVar = (C120693h) C120695j.f335679k.createBuilder();
        C69664n.m101060f(hVar, "newBuilder()");
        C120697l a = C69664n.m101061g(hVar, "builder");
        C120809b bVar = (C120809b) C120811d.f335965c.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C69664n.m101061g(bVar, "builder");
        C120812e eVar = (C120812e) C120813f.f335969b.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        C69664n.m101061g(eVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C120813f) eVar.instance).f335971a);
        C69664n.m101060f(unmodifiableList, "_builder.getInteractionsList()");
        new C62883b(unmodifiableList);
        C69664n.m101061g(guVar, "values");
        eVar.copyOnWrite();
        C120813f fVar = (C120813f) eVar.instance;
        fVar.mo104939a();
        C62947c.addAll((Iterable) guVar, (List) fVar.f335971a);
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C120813f fVar2 = (C120813f) build;
        C69664n.m101061g(fVar2, "value");
        bVar.copyOnWrite();
        C120811d dVar = (C120811d) bVar.instance;
        fVar2.getClass();
        dVar.f335968b = fVar2;
        dVar.f335967a = 2;
        C62942bv build2 = bVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C120811d dVar2 = (C120811d) build2;
        C69664n.m101061g(dVar2, "value");
        C120693h hVar2 = a.f335692a;
        hVar2.copyOnWrite();
        C120695j jVar = (C120695j) hVar2.instance;
        dVar2.getClass();
        jVar.f335683c = dVar2;
        jVar.f335682b = 3;
        a.mo104900b(this.f335206b);
        a.mo104901c(C119836cd.CLIENT_OP_RESULT);
        if (!C120532a.m199648a(this.f335208d, C120535d.f335210a, new C120536e(a.mo104899a()))) {
            C59052c cVar = (C59052c) f335205a.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, "DialogNextStepRequester");
            cVar.mo56380ai(C58979ad.FULL);
            Object obj = this.f335208d.get();
            cVar.mo56379ah(new C59094n(35482));
            cVar.mo56389s("#sendClientOpResults, can not update, current status: %s", obj);
        }
    }
}
