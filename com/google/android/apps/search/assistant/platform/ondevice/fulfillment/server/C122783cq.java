package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122382aa;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122399ar;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122405ax;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122408b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122411bc;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122423bo;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122463r;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122470y;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122471z;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122554d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122563m;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122564n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122869n;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123002aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123030bx;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123052cs;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123054cu;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123137b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9302c.C123141a;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17593c;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17594d;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17595e;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17596f;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17602l;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.nlp.p4730a.C62799s;
import com.google.protos.p4985f.p5030q.C65275ia;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.function.Function;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cq */
/* compiled from: PG */
public final class C122783cq extends C122411bc {

    /* renamed from: a */
    public final C123054cu f340105a;

    /* renamed from: b */
    public final C123141a f340106b;

    /* renamed from: c */
    private final C122871eb f340107c;

    /* renamed from: d */
    private final C122721av f340108d;

    /* renamed from: e */
    private final C122565aa f340109e;

    /* renamed from: f */
    private final C123082n f340110f;

    /* renamed from: g */
    private final C122564n f340111g;

    /* renamed from: h */
    private final C123137b f340112h;

    /* renamed from: i */
    private final C122828c f340113i;

    /* renamed from: j */
    private final C60887da f340114j;

    /* renamed from: k */
    private final AtomicLong f340115k = new AtomicLong(0);

    public C122783cq(C122871eb ebVar, C122721av avVar, C122565aa aaVar, C123082n nVar, C122564n nVar2, C123137b bVar, C122828c cVar, C123141a aVar, C123054cu cuVar, C60887da daVar) {
        this.f340107c = ebVar;
        this.f340108d = avVar;
        this.f340109e = aaVar;
        this.f340110f = nVar;
        this.f340111g = nVar2;
        this.f340112h = bVar;
        this.f340113i = cVar;
        this.f340106b = aVar;
        this.f340105a = cuVar;
        this.f340114j = daVar;
    }

    /* renamed from: o */
    private final C122859d m202119o() {
        return C122869n.m202191a(C122859d.m202176b(), this.f340115k.incrementAndGet());
    }

    /* renamed from: p */
    private final void m202120p(C60870cx cxVar, C70862aj ajVar, Function function, C122859d dVar, String str) {
        C122782cp cpVar = new C122782cp(this, dVar, ajVar, function, str);
        C60856cj.m92911t(cxVar, C47810es.m84974n(cpVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C70862aj mo105608b(C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34825)).mo56386p("Opening RPC stream processCallIgdp");
        C17602l lVar = new C17602l(this.f340114j, ajVar);
        C17595e eVar = new C17595e(new C17594d(C122722aw.f340034a, lVar));
        C17594d dVar = new C17594d(C122741bh.f340056a, lVar);
        C122563m a = this.f340111g.mo105674a(eVar, o);
        C122554d dVar2 = new C122554d(a);
        C122565aa aaVar = this.f340109e;
        C123033c cVar = (C123033c) aaVar.f339712a.mo17428b();
        cVar.getClass();
        C122594e eVar2 = (C122594e) aaVar.f339713b.mo17428b();
        eVar2.getClass();
        C122828c cVar2 = (C122828c) aaVar.f339714c.mo17428b();
        cVar2.getClass();
        C123030bx bxVar = (C123030bx) aaVar.f339715d.mo17428b();
        bxVar.getClass();
        C123002aw awVar = (C123002aw) aaVar.f339716e.mo17428b();
        awVar.getClass();
        C123054cu cuVar = (C123054cu) aaVar.f339717f.mo17428b();
        cuVar.getClass();
        C60887da daVar = (C60887da) aaVar.f339718g.mo17428b();
        daVar.getClass();
        C123562z zVar = new C123562z(dVar2, dVar, o, cVar, eVar2, cVar2, bxVar, awVar, cuVar, daVar);
        return new C17596f(Arrays.asList(new C70862aj[]{new C17593c(C122770cd.f340088a, new C17594d(C122752bs.f340068a, a)), new C17593c(C122777ck.f340095a, new C17594d(C122776cj.f340094a, zVar))}));
    }

    /* renamed from: c */
    public final C70862aj mo105609c(C70862aj ajVar) {
        C122859d o = m202119o();
        C122859d dVar = o;
        ((C59052c) o.mo105764c().mo56372aa(34826)).mo56386p("Opening RPC stream processClientInteraction");
        C17602l lVar = new C17602l(this.f340114j, ajVar);
        C17595e eVar = new C17595e(new C17594d(C122737bd.f340052a, lVar));
        C17594d dVar2 = r7;
        C17594d dVar3 = new C17594d(C122738be.f340053a, lVar);
        C122563m a = this.f340111g.mo105674a(eVar, o);
        C122554d dVar4 = r1;
        C122554d dVar5 = new C122554d(a);
        C122871eb ebVar = this.f340107c;
        Boolean bool = (Boolean) ebVar.f340322a.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = (Boolean) ebVar.f340323b.mo17428b();
        bool2.getClass();
        boolean booleanValue2 = bool2.booleanValue();
        Boolean bool3 = (Boolean) ebVar.f340324c.mo17428b();
        bool3.getClass();
        boolean booleanValue3 = bool3.booleanValue();
        C123033c cVar = (C123033c) ebVar.f340325d.mo17428b();
        C123033c cVar2 = cVar;
        cVar.getClass();
        C122594e eVar2 = (C122594e) ebVar.f340326e.mo17428b();
        C122594e eVar3 = eVar2;
        eVar2.getClass();
        C122828c cVar3 = (C122828c) ebVar.f340327f.mo17428b();
        C122828c cVar4 = cVar3;
        cVar3.getClass();
        C123030bx bxVar = (C123030bx) ebVar.f340328g.mo17428b();
        C123030bx bxVar2 = bxVar;
        bxVar.getClass();
        C123002aw awVar = (C123002aw) ebVar.f340329h.mo17428b();
        C123002aw awVar2 = awVar;
        awVar.getClass();
        C123052cs csVar = (C123052cs) ebVar.f340330i.mo17428b();
        C122870ea eaVar = r1;
        C123052cs csVar2 = csVar;
        csVar.getClass();
        C123054cu cuVar = (C123054cu) ebVar.f340331j.mo17428b();
        C122871eb ebVar2 = ebVar;
        C123054cu cuVar2 = cuVar;
        cuVar.getClass();
        C39141kp kpVar = (C39141kp) ebVar2.f340332k.mo17428b();
        C122563m mVar = a;
        C39141kp kpVar2 = kpVar;
        kpVar.getClass();
        String str = (String) ebVar2.f340333l.mo17428b();
        String str2 = str;
        str.getClass();
        C60887da daVar = (C60887da) ebVar2.f340334m.mo17428b();
        daVar.getClass();
        C122870ea eaVar2 = new C122870ea(dVar4, dVar2, dVar, booleanValue, booleanValue2, booleanValue3, cVar2, eVar3, cVar4, bxVar2, awVar2, csVar2, cuVar2, kpVar2, str2, daVar);
        return new C17596f(Arrays.asList(new C70862aj[]{new C17593c(C122740bg.f340055a, new C17594d(C122739bf.f340054a, mVar)), new C17593c(C122742bi.f340057a, eaVar)}));
    }

    /* renamed from: d */
    public final C70862aj mo105610d(C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34827)).mo56386p("Opening RPC stream processConversationStream");
        C17602l lVar = new C17602l(this.f340114j, ajVar);
        C17595e eVar = new C17595e(new C17594d(C122768cb.f340086a, lVar));
        C17594d dVar = new C17594d(C122769cc.f340087a, lVar);
        C122563m a = this.f340111g.mo105674a(eVar, o);
        C122554d dVar2 = new C122554d(a);
        C123082n nVar = this.f340110f;
        C122828c cVar = (C122828c) nVar.f340659a.mo17428b();
        cVar.getClass();
        C123002aw awVar = (C123002aw) nVar.f340660b.mo17428b();
        awVar.getClass();
        C60887da daVar = (C60887da) nVar.f340661c.mo17428b();
        daVar.getClass();
        C123081m mVar = new C123081m(dVar2, dVar, o, cVar, awVar, daVar);
        return new C17596f(Arrays.asList(new C70862aj[]{new C17593c(C122772cf.f340090a, new C17594d(C122771ce.f340089a, a)), new C17593c(C122774ch.f340092a, new C17594d(C122773cg.f340091a, mVar))}));
    }

    /* renamed from: e */
    public final C70862aj mo105611e(C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34828)).mo56386p("Opening RPC stream processGetIntent");
        C17602l lVar = new C17602l(this.f340114j, ajVar);
        C17595e eVar = new C17595e(new C17594d(C122781co.f340099a, lVar));
        C17594d dVar = new C17594d(C122723ax.f340035a, lVar);
        C122563m a = this.f340111g.mo105674a(eVar, o);
        C122554d dVar2 = new C122554d(a);
        C122721av avVar = this.f340108d;
        Boolean bool = (Boolean) avVar.f340026a.mo17428b();
        bool.getClass();
        boolean booleanValue = bool.booleanValue();
        C123033c cVar = (C123033c) avVar.f340027b.mo17428b();
        cVar.getClass();
        C122594e eVar2 = (C122594e) avVar.f340028c.mo17428b();
        eVar2.getClass();
        C122828c cVar2 = (C122828c) avVar.f340029d.mo17428b();
        cVar2.getClass();
        C123030bx bxVar = (C123030bx) avVar.f340030e.mo17428b();
        bxVar.getClass();
        C123002aw awVar = (C123002aw) avVar.f340031f.mo17428b();
        awVar.getClass();
        C123054cu cuVar = (C123054cu) avVar.f340032g.mo17428b();
        cuVar.getClass();
        C60887da daVar = (C60887da) avVar.f340033h.mo17428b();
        daVar.getClass();
        C122720au auVar = new C122720au(dVar2, dVar, o, booleanValue, cVar, eVar2, cVar2, bxVar, awVar, cuVar, daVar);
        return new C17596f(Arrays.asList(new C70862aj[]{new C17593c(C122725az.f340037a, new C17594d(C122724ay.f340036a, a)), new C17593c(C122735bb.f340050a, new C17594d(C122734ba.f340049a, auVar))}));
    }

    /* renamed from: f */
    public final void mo105612f(C122408b bVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34829)).mo56386p("Incoming RPC annotate");
        m202120p(C47633f.m84733g(this.f340113i.mo105754a(bVar.f339360c)).mo51516i(C122758by.f340074a, C60826bg.f164896a).mo51516i(new C122759bz(bVar), this.f340114j), ajVar, C122767ca.f340085a, o, "annotate");
    }

    /* renamed from: g */
    public final void mo105613g(C122470y yVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34830)).mo56386p("Incoming RPC checkEligibility");
        C122471z zVar = (C122471z) C122382aa.f339293b.createBuilder();
        boolean a = this.f340112h.mo105893a(yVar.f339531a);
        zVar.copyOnWrite();
        ((C122382aa) zVar.instance).f339295a = a;
        m202120p(C60856cj.m92900i((C122382aa) zVar.build()), ajVar, C122775ci.f340093a, o, "eligibility");
    }

    /* renamed from: h */
    public final void mo105614h(C122405ax axVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34831)).mo56386p("Incoming RPC lookupMid");
        m202120p(C47633f.m84733g(this.f340113i.mo105754a(axVar.f339352b)).mo51516i(C122778cl.f340096a, C60826bg.f164896a).mo51516i(new C122779cm(axVar), this.f340114j), ajVar, C122780cn.f340098a, o, "lookupMid");
    }

    /* renamed from: i */
    public final void mo105615i(C65275ia iaVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34832)).mo56386p("Incoming RPC lookupProvider");
        m202120p(C47633f.m84733g(this.f340113i.mo105754a(iaVar.f176585a)).mo51516i(C122744bk.f340059a, C60826bg.f164896a).mo51516i(new C122745bl(iaVar), this.f340114j), ajVar, C122746bm.f340061a, o, "lookupProvider");
    }

    /* renamed from: j */
    public final void mo105616j(C122463r rVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34833)).mo56386p("Incoming RPC ngaOnlyConfigure");
        C122749bp bpVar = new C122749bp(this, rVar);
        C70862aj ajVar2 = ajVar;
        m202120p(C60856cj.m92904m(C47810es.m84978r(bpVar), C60826bg.f164896a), ajVar2, C122750bq.f340066a, o, "configure");
    }

    /* renamed from: k */
    public final void mo105617k(C122423bo boVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34834)).mo56389s("Incoming RPC prewarm for locale %s", boVar.f339408a);
        C60870cx a = this.f340113i.mo105754a(boVar.f339408a);
        C122747bn bnVar = C122747bn.f340062a;
        C70862aj ajVar2 = ajVar;
        m202120p(C60922j.m93045h(a, C47810es.m84966f(bnVar), C60826bg.f164896a), ajVar2, C122748bo.f340063a, o, "preWarm");
    }

    /* renamed from: l */
    public final void mo105618l(C62799s sVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34835)).mo56386p("Incoming RPC realize");
        m202120p(C47633f.m84733g(this.f340113i.mo105754a(sVar.f169591b)).mo51516i(C122744bk.f340059a, C60826bg.f164896a).mo51516i(new C122754bu(sVar), this.f340114j), ajVar, C122755bv.f340071a, o, "realize");
    }

    /* renamed from: m */
    public final void mo105619m(C122399ar arVar, C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34837)).mo56386p("Incoming RPC updateGellerData");
        C60870cx b = this.f340113i.mo105755b();
        C122751br brVar = new C122751br(arVar);
        C70862aj ajVar2 = ajVar;
        m202120p(C60922j.m93045h(b, C47810es.m84966f(brVar), C60826bg.f164896a), ajVar2, C122753bt.f340069a, o, "updateGellerData");
    }

    /* renamed from: n */
    public final void mo105620n(C70862aj ajVar) {
        C122859d o = m202119o();
        ((C59052c) o.mo105764c().mo56372aa(34836)).mo56386p("Incoming RPC tearDown");
        m202120p(this.f340113i.mo105756c(), ajVar, C122743bj.f340058a, o, "tearDown");
    }
}
