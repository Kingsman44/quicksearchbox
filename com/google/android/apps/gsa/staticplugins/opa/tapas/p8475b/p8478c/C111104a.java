package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8478c;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48654o;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48655p;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48656q;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4985f.p5030q.p5032b.C65039ax;
import com.google.protos.p4985f.p5030q.p5032b.C65042b;
import com.google.protos.p4985f.p5030q.p5032b.C65057d;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C111104a implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111110g f309345a;

    public /* synthetic */ C111104a(C111110g gVar) {
        this.f309345a = gVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C65057d dVar;
        C65039ax axVar = (C65039ax) obj;
        long b = this.f309345a.f309355d.mo26870b();
        if (axVar.f176128a.size() == 0) {
            C59104x b2 = C111110g.f309352a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "AssistantHistoryFetcher");
            ((C59052c) ((C59052c) b2).mo56372aa(27103)).mo56386p("No snapshot from geller is available yet.");
            C48633bv bvVar = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar.copyOnWrite();
            ((C48635bx) bvVar.instance).f125708c = b;
            return (C48635bx) bvVar.build();
        } else if (axVar.f176128a.size() > 1) {
            C59104x d = C111110g.f309352a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AssistantHistoryFetcher");
            ((C59052c) ((C59052c) d).mo56372aa(27102)).mo56387q("exactly 1 corpus snapshot is expected, got %d", axVar.f176128a.size());
            C48633bv bvVar2 = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar2.copyOnWrite();
            ((C48635bx) bvVar2.instance).f125708c = b;
            return (C48635bx) bvVar2.build();
        } else {
            C59104x b3 = C111110g.f309352a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AssistantHistoryFetcher");
            ((C59052c) ((C59052c) b3).mo56372aa(27101)).mo56386p("Successfully fetched assistant history snapshot.");
            C48633bv bvVar3 = (C48633bv) C48635bx.f125704d.createBuilder();
            bvVar3.copyOnWrite();
            ((C48635bx) bvVar3.instance).f125708c = b;
            C65042b bVar = (C65042b) axVar.f176128a.get(0);
            if (bVar.f176139a == 2) {
                dVar = (C65057d) bVar.f176140b;
            } else {
                dVar = C65057d.f176173d;
            }
            Optional empty = Optional.empty();
            if (dVar.f176175a.size() != 0) {
                empty = Collection.EL.stream(dVar.f176175a).max(Comparator.CC.comparing(C111106c.f309348a));
            }
            C48655p pVar = (C48655p) C48656q.f125749c.createBuilder();
            if (empty.isPresent()) {
                C48654o d2 = C111110g.m184884d((C65768az) empty.get());
                pVar.copyOnWrite();
                d2.getClass();
                ((C48656q) pVar.instance).f125751a = d2;
                C65139d dVar2 = ((C65768az) empty.get()).f178796b;
                if (dVar2 == null) {
                    dVar2 = C65139d.f176307e;
                }
                Collection.EL.stream(dVar.f176176b).filter(new C111107d(dVar2.f176310b)).forEach(new C111108e(pVar));
            } else {
                Collection.EL.stream(dVar.f176176b).forEach(new C111109f(pVar));
            }
            C48656q qVar = (C48656q) pVar.build();
            bvVar3.copyOnWrite();
            C48635bx bxVar = (C48635bx) bvVar3.instance;
            qVar.getClass();
            bxVar.f125707b = qVar;
            bxVar.f125706a = 18;
            return (C48635bx) bvVar3.build();
        }
    }
}
