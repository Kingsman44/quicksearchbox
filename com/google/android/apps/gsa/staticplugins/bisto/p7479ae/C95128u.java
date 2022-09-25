package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95294af;
import com.google.android.apps.gsa.staticplugins.bisto.p7490h.C95455a;
import com.google.android.apps.gsa.staticplugins.bisto.p7496n.p7497a.C95498a;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.u */
/* compiled from: PG */
public final class C95128u implements AutoCloseable, C95064aa {

    /* renamed from: a */
    public static final C59071e f266138a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ae.u");

    /* renamed from: b */
    static final long f266139b = TimeUnit.SECONDS.toMillis(20);

    /* renamed from: c */
    private final C60888db f266140c;

    /* renamed from: d */
    private C60870cx f266141d;

    /* renamed from: e */
    private final C95097bg f266142e;

    /* renamed from: f */
    private final C95109bs f266143f;

    static {
        TimeUnit.SECONDS.toMillis(60);
    }

    public C95128u(C95097bg bgVar, C95109bs bsVar, C60888db dbVar, C95850a aVar) {
        this.f266140c = dbVar;
        this.f266142e = bgVar;
        this.f266143f = bsVar;
        C58976aa aaVar = C58975e.f156826a;
        aVar.f268408a.add(this);
    }

    /* renamed from: m */
    private final void m157227m() {
        mo89053d();
        if (this.f266142e.mo89020h() || this.f266143f.f266088i) {
            C58976aa aaVar = C58975e.f156826a;
            C60888db dbVar = this.f266140c;
            C95123p pVar = new C95123p(this);
            int i = C95873a.f268446a;
            this.f266141d = dbVar.mo29164d(pVar, f266139b, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final void mo89051a(C95455a aVar, C95065ab abVar, C95498a aVar2) {
        C95124q qVar = new C95124q(abVar);
        C95109bs bsVar = this.f266143f;
        C95125r rVar = new C95125r(this, qVar);
        C59104x b = C95109bs.f266079a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18089)).mo56386p("startTranscription");
        bsVar.f266096q = aVar2;
        bsVar.f266095p = rVar;
        bsVar.mo89038g(aVar);
    }

    /* renamed from: b */
    public final void mo88987b() {
        this.f266142e.f266034f.f266164f.mo89056a();
    }

    /* renamed from: c */
    public final void mo88988c() {
        C58976aa aaVar = C58975e.f156826a;
        mo89053d();
        this.f266142e.mo89014a();
        C95109bs bsVar = this.f266143f;
        C59104x b = C95109bs.f266079a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18071)).mo56386p("cancel");
        if (bsVar.f266088i) {
            bsVar.mo89037f();
            bsVar.f266089j = false;
            if (bsVar.f266087h.mo89153b() == null || bsVar.f266092m != bsVar.f266087h.mo89153b()) {
                bsVar.mo89036e();
            } else {
                bsVar.f266087h.mo89159g((C95294af) null);
            }
        }
    }

    public final void close() {
        C58976aa aaVar = C58975e.f156826a;
        mo88988c();
        if (this.f266143f.f266088i || this.f266142e.mo89020h()) {
            C59104x d = f266138a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VoiceQueryHandler");
            ((C59052c) ((C59052c) d).mo56372aa(17946)).mo56386p("Still in query or transcription after destroy!");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: d */
    public final void mo89053d() {
        C60870cx cxVar = this.f266141d;
        if (cxVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            cxVar.cancel(false);
            this.f266141d = null;
        }
    }

    /* renamed from: e */
    public final void mo88989e(C95455a aVar, C95127t tVar, PlaybackStatus playbackStatus, C95832d dVar) {
        C95097bg bgVar = this.f266142e;
        C95125r rVar = new C95125r(this, tVar);
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18054)).mo56386p("startQuery()");
        bgVar.f266026J = rVar;
        bgVar.f266052x = dVar;
        bgVar.f266021E = true;
        boolean z = bgVar.f266018B;
        boolean z2 = false;
        bgVar.f266053y = z || aVar.f267099b;
        if (!z && (!aVar.f267099b || !aVar.mo89372a().mo56113h())) {
            z2 = true;
        }
        bgVar.f266054z = z2;
        if (!aVar.mo89372a().mo56113h()) {
            C60870cx c = bgVar.f266045q.mo89124c();
            if (bgVar.f266053y && ((bgVar.f266054z || bgVar.f266040l.mo89026d()) && !bgVar.f266039k.mo83555j(173))) {
                C59104x b2 = C95097bg.f266015a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) b2).mo56372aa(18050)).mo56386p("About to play start sound");
                C60856cj.m92911t(c, new C95080aq(bgVar), C60826bg.f164896a);
            }
        }
        if (!bgVar.f266029M.f266012d.equals("IDLE") && !bgVar.f266029M.f266012d.equals("DONE")) {
            C59104x b3 = C95097bg.f266015a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) b3).mo56372aa(18055)).mo56389s("Current state: %s; cancelling current query", bgVar.f266029M.f266012d);
            bgVar.f266017A = true;
            bgVar.f266029M.mo89006d();
        }
        bgVar.mo89017d();
        bgVar.f266032d.mo28212l("startQueryInternalWithMinorDelay", new C95079ap(bgVar, aVar, playbackStatus));
    }

    /* renamed from: f */
    public final void mo88990f(String str) {
        C58976aa aaVar = C58975e.f156826a;
        m157227m();
        C95097bg bgVar = this.f266142e;
        bgVar.mo89017d();
        C95133z zVar = bgVar.f266034f;
        long j = bgVar.f266027K;
        boolean z = bgVar.f266018B;
        zVar.f266164f.mo89056a();
        C90498f i = Query.f252741b.mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(amo.BISTO).mo84480i();
        i.mo84573e(0, 2);
        i.mo84561T(QueryTriggerType.BISTO);
        i.mo84572d(0, 16384);
        i.mo84564W(0);
        i.mo84572d(0, 1024);
        i.mo84572d(0, 4503599627370496L);
        i.mo84546E(str);
        Query G = i.mo84568a().mo84244G(true);
        if (z) {
            G = G.mo84286aW(QueryTriggerType.FOLLOW_ON);
        }
        Query aH = G.mo84271aH(j);
        zVar.f266161c.mo81937i(new C88489j(C87739bu.OPA_CANCEL_CONVERSATION).mo82013a());
        zVar.f266161c.mo81931b(aH);
        long j2 = aH.f252749G;
        bgVar.mo89018e("FETCHING");
    }

    /* renamed from: g */
    public final void mo88991g() {
        C58976aa aaVar = C58975e.f156826a;
        m157227m();
        C95097bg bgVar = this.f266142e;
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18057)).mo56386p("stopQueryInput()");
        if (bgVar.f266021E) {
            bgVar.f266025I = bgVar.f266033e.mo26870b();
            bgVar.f266024H = bgVar.f266038j.mo89222a();
            bgVar.f266053y = false;
            bgVar.f266054z = false;
            bgVar.f266021E = false;
            bgVar.f266029M.mo89007e();
        }
        C95109bs bsVar = this.f266143f;
        C59104x b2 = C95109bs.f266079a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TranscriptionHandler");
        ((C59052c) ((C59052c) b2).mo56372aa(18090)).mo56386p("stopTranscriptionInput");
        if (bsVar.f266088i) {
            bsVar.mo89037f();
            bsVar.f266093n = bsVar.f266083d.mo89222a();
            bsVar.f266090k = false;
        }
    }

    /* renamed from: h */
    public final void mo88992h() {
        C95133z zVar = this.f266142e.f266034f;
        C58976aa aaVar = C58975e.f156826a;
        zVar.f266164f.mo89057b();
    }

    /* renamed from: i */
    public final boolean mo88993i() {
        return this.f266143f.f266088i;
    }

    /* renamed from: j */
    public final boolean mo88994j() {
        return this.f266142e.mo89020h();
    }

    /* renamed from: k */
    public final boolean mo88995k() {
        return this.f266142e.f266053y;
    }

    /* renamed from: l */
    public final boolean mo88996l() {
        return this.f266142e.f266021E || this.f266143f.f266090k;
    }
}
