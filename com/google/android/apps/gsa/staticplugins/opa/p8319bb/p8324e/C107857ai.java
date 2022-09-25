package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85003f;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85006i;
import com.google.android.apps.gsa.search.core.p6519al.p6735h.C85493j;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88102pf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88103pg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88104ph;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88136qm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88137qn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88138qo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88139qp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88140qq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88141qr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88142qs;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88143qt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88144qu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107507aa;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107546y;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107547z;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3980n.p3981a.p3982a.C52999b;
import com.google.assistant.p3980n.p3981a.p3982a.C53003f;
import com.google.assistant.p3980n.p3986d.p3987a.C53030d;
import com.google.assistant.p3994s.p3995a.C53346km;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.assistant.p4008y.p4010b.C53623e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.ai */
/* compiled from: PG */
final class C107857ai extends C85493j {

    /* renamed from: a */
    public final C85003f f300133a;

    /* renamed from: b */
    private final C85006i f300134b;

    /* renamed from: c */
    private final C68214a f300135c;

    /* renamed from: d */
    private final C22871g f300136d;

    public C107857ai(C85006i iVar, C68214a aVar, C22871g gVar, C85003f fVar) {
        this.f300134b = iVar;
        this.f300135c = aVar;
        this.f300136d = gVar;
        this.f300133a = fVar;
    }

    /* renamed from: a */
    public final void mo96321a(C53422nh nhVar) {
        C58976aa aaVar = C58975e.f156826a;
        C88143qt qtVar = (C88143qt) C88144qu.f238267c.createBuilder();
        C63088z byteString = nhVar.toByteString();
        qtVar.copyOnWrite();
        C88144qu quVar = (C88144qu) qtVar.instance;
        byteString.getClass();
        quVar.f238269a |= 1;
        quVar.f238270b = byteString;
        C87684al alVar = new C87684al(C88244um.OPA_ZERO_STATE_RESPONSE);
        alVar.mo81965b(C88142qs.f238266a, (C88144qu) qtVar.build());
        ((C107932g) this.f300135c.mo27525b()).mo96337a(alVar.mo81964a());
    }

    /* renamed from: d */
    public final void mo79005d(C53003f fVar) {
        int size = fVar.f138938a.size();
        if (size > 0) {
            C88103pg pgVar = (C88103pg) C88104ph.f238195b.createBuilder();
            for (int i = 0; i < size; i++) {
                pgVar.mo81986a(((C52999b) fVar.f138938a.get(i)).f138930b);
            }
            C87684al alVar = new C87684al(C88244um.OPA_DELETE_HISTORY_ENTRIES);
            alVar.mo81965b(C88102pf.f238194a, (C88104ph) pgVar.build());
            ((C107932g) this.f300135c.mo27525b()).mo96337a(alVar.mo81964a());
        }
    }

    /* renamed from: f */
    public final void mo79007f(C53623e eVar) {
        C107547z zVar = (C107547z) C107507aa.f299122c.createBuilder();
        zVar.copyOnWrite();
        C107507aa aaVar = (C107507aa) zVar.instance;
        eVar.getClass();
        aaVar.f299125b = eVar;
        aaVar.f299124a |= 1;
        C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
        dVar.copyOnWrite();
        C107556e eVar2 = (C107556e) dVar.instance;
        eVar2.f299213b = 2;
        eVar2.f299212a |= 1;
        dVar.mo58885m(C107546y.f299196a, (C107507aa) zVar.build());
        C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
        alVar.mo81965b(C107505a.f299120a, (C107556e) dVar.build());
        ((C107932g) this.f300135c.mo27525b()).mo96337a(alVar.mo81964a());
    }

    /* renamed from: l */
    public final void mo79013l(C53030d dVar) {
        C88137qn qnVar = (C88137qn) C88138qo.f238257c.createBuilder();
        C63088z zVar = dVar.f138994a;
        qnVar.copyOnWrite();
        C88138qo qoVar = (C88138qo) qnVar.instance;
        zVar.getClass();
        qoVar.f238259a |= 1;
        qoVar.f238260b = zVar;
        C87684al alVar = new C87684al(C88244um.WEB_ANSWER_HISTORY_RESPONSE);
        alVar.mo81965b(C88136qm.f238256a, (C88138qo) qnVar.build());
        ((C107932g) this.f300135c.mo27525b()).mo96337a(alVar.mo81964a());
    }

    /* renamed from: m */
    public final void mo79014m(C53346km kmVar) {
        C58976aa aaVar = C58975e.f156826a;
        C88140qq qqVar = (C88140qq) C88141qr.f238262c.createBuilder();
        qqVar.copyOnWrite();
        C88141qr qrVar = (C88141qr) qqVar.instance;
        kmVar.getClass();
        qrVar.f238265b = kmVar;
        qrVar.f238264a |= 1;
        C87684al alVar = new C87684al(C88244um.OPA_ZERO_STATE_ASYNC_UPDATE_RESPONSE);
        alVar.mo81965b(C88139qp.f238261a, (C88141qr) qqVar.build());
        ((C107932g) this.f300135c.mo27525b()).mo96337a(alVar.mo81964a());
    }

    /* renamed from: n */
    public final void mo79015n(C53422nh nhVar) {
        C58976aa aaVar = C58975e.f156826a;
        new C90873ag(this.f300134b.mo78643b(nhVar, false), this.f300136d, "onZeroStateResponse", new C107855ag(this)).mo85223a(new C107856ah(this, nhVar));
    }
}
