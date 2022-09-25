package com.google.android.apps.gsa.search.core.p6519al.p6735h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.assistant.p3803ag.p3804a.p3805a.C48787g;
import com.google.assistant.p3803ag.p3804a.p3805a.C48791k;
import com.google.assistant.p3980n.p3981a.p3982a.C53003f;
import com.google.assistant.p3980n.p3983b.p3984a.C53008d;
import com.google.assistant.p3980n.p3986d.p3987a.C53030d;
import com.google.assistant.p3994s.p3995a.C53111bu;
import com.google.assistant.p3994s.p3995a.C53113bw;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53346km;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.assistant.p4008y.p4010b.C53623e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59574ad;
import com.google.common.p4552o.C59576ae;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4985f.p5036r.C65329o;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.al.h.g */
/* compiled from: PG */
public final class C85490g implements C85491h {

    /* renamed from: a */
    public final C68214a f231330a;

    /* renamed from: b */
    public final SettableFuture f231331b = new SettableFuture();

    /* renamed from: c */
    public final SettableFuture f231332c = new SettableFuture();

    /* renamed from: d */
    public final SettableFuture f231333d = new SettableFuture();

    /* renamed from: e */
    public final C22871g f231334e;

    /* renamed from: f */
    public final C86124t f231335f;

    /* renamed from: g */
    public final C53306j f231336g;

    /* renamed from: h */
    public final C53270hr f231337h;

    /* renamed from: i */
    private final C85491h f231338i;

    public C85490g(C85491h hVar, C68214a aVar, C22871g gVar, C86124t tVar, C53306j jVar, C53270hr hrVar) {
        this.f231338i = hVar;
        this.f231330a = aVar;
        this.f231334e = gVar;
        this.f231335f = tVar;
        this.f231336g = jVar;
        this.f231337h = hrVar;
    }

    /* renamed from: a */
    public static C31164au m137107a(C53306j jVar, C53270hr hrVar) {
        C31164au a = C31164au.m58091a(C31164au.m58091a(C31164au.m58093c((String) null, jVar), C31164au.m58092b("_")), C31164au.m58093c((String) null, hrVar));
        return C31164au.m58091a(C31164au.m58092b("SnapshotClientSyncRequest_"), a);
    }

    /* renamed from: b */
    public final void mo79003b(C89849ae aeVar, String str, C58833ax axVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("rId", str);
        if (axVar.mo56113h()) {
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            C59574ad adVar = (C59574ad) C59576ae.f158430c.createBuilder();
            int intValue = ((Integer) axVar.mo56107c()).intValue();
            adVar.copyOnWrite();
            C59576ae aeVar2 = (C59576ae) adVar.instance;
            aeVar2.f158432a |= 1;
            aeVar2.f158433b = intValue;
            C59576ae aeVar3 = (C59576ae) adVar.build();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            aeVar3.getClass();
            cbVar.f160082aT = aeVar3;
            cbVar.f160123d |= 8192;
            fVar.f246203c = (C59687cb) ajVar.build();
        }
        ((C89859i) this.f231330a.mo27525b()).mo74236a(fVar.mo83699a());
    }

    /* renamed from: c */
    public final void mo79004c(C53606o oVar) {
        this.f231338i.mo79004c(oVar);
    }

    /* renamed from: d */
    public final void mo79005d(C53003f fVar) {
        this.f231338i.mo79005d(fVar);
    }

    /* renamed from: e */
    public final void mo79006e(C53008d dVar) {
        this.f231338i.mo79006e(dVar);
    }

    /* renamed from: f */
    public final void mo79007f(C53623e eVar) {
        if (this.f231335f.mo79746e(C90053de.f248939F)) {
            this.f231338i.mo79007f(eVar);
        }
    }

    /* renamed from: g */
    public final void mo79008g(C65329o oVar) {
        this.f231338i.mo79008g(oVar);
    }

    /* renamed from: h */
    public final void mo79009h(C53111bu buVar) {
        this.f231338i.mo79009h(buVar);
    }

    /* renamed from: i */
    public final void mo79010i(C53113bw bwVar) {
        this.f231338i.mo79010i(bwVar);
    }

    /* renamed from: j */
    public final void mo79011j(C48787g gVar) {
        this.f231338i.mo79011j(gVar);
    }

    /* renamed from: k */
    public final void mo79012k(C48791k kVar) {
        this.f231338i.mo79012k(kVar);
    }

    /* renamed from: l */
    public final void mo79013l(C53030d dVar) {
        this.f231338i.mo79013l(dVar);
    }

    /* renamed from: m */
    public final void mo79014m(C53346km kmVar) {
        this.f231331b.mo57356n(C58836b.f156633a);
        this.f231338i.mo79014m(kmVar);
    }

    /* renamed from: n */
    public final void mo79015n(C53422nh nhVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f231331b.mo57356n(C58833ax.m90834k(Integer.valueOf(nhVar.getSerializedSize())));
        this.f231332c.mo57356n(C118826c.f331422a);
        this.f231338i.mo79015n(nhVar);
    }
}
