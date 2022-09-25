package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6594bj.C84874a;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6607a.C84921a;
import com.google.android.apps.gsa.search.core.p6519al.p6670cs.C85202a;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85421b;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85423d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6820r.C86380ab;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86355a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86357c;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6822a.C86359e;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86363a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86365c;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86369g;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86371i;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6826e.C86372a;
import com.google.android.apps.gsa.search.core.p6820r.p6833e.C86426f;
import com.google.android.apps.gsa.search.core.p6820r.p6833e.C86427g;
import com.google.android.apps.gsa.search.core.p6820r.p6838j.C86498a;
import com.google.android.apps.gsa.search.shared.media.PlaybackStatus;
import com.google.android.apps.gsa.shared.logger.p7053c.C89880c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60537to;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.state.is */
/* compiled from: PG */
public final class C87151is extends C86898ct {

    /* renamed from: a */
    public static final C59071e f235477a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.is");

    /* renamed from: b */
    public final C68214a f235478b;

    /* renamed from: c */
    public final C68214a f235479c;

    /* renamed from: d */
    public final C87146in f235480d;

    /* renamed from: e */
    public final C68214a f235481e;

    /* renamed from: f */
    public final C68214a f235482f;

    /* renamed from: g */
    public final C85423d f235483g;

    /* renamed from: h */
    public final C86124t f235484h;

    /* renamed from: i */
    public final C84874a f235485i;

    /* renamed from: j */
    public final C58833ax f235486j;

    /* renamed from: k */
    public final boolean f235487k;

    /* renamed from: l */
    public final C84921a f235488l;

    /* renamed from: m */
    public Query f235489m = Query.f252741b;

    /* renamed from: n */
    public boolean f235490n;

    /* renamed from: o */
    public C85421b f235491o;

    /* renamed from: p */
    public C60870cx f235492p;

    /* renamed from: q */
    private final C68214a f235493q;

    /* renamed from: r */
    private final C68214a f235494r;

    /* renamed from: s */
    private final C86427g f235495s;

    /* renamed from: t */
    private final C85005h f235496t;

    /* renamed from: u */
    private final C85202a f235497u;

    /* renamed from: v */
    private final C68214a f235498v;

    /* renamed from: w */
    private final C22871g f235499w;

    /* renamed from: x */
    private final C22871g f235500x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87151is(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C86427g gVar, C87146in inVar, C85423d dVar, C85005h hVar, C85202a aVar8, C68214a aVar9, C22871g gVar2, C22871g gVar3, C86124t tVar, C84874a aVar10, C58833ax axVar, boolean z, C84921a aVar11) {
        super(aVar, 68);
        C68214a aVar12 = aVar;
        this.f235478b = aVar2;
        this.f235479c = aVar3;
        this.f235493q = aVar4;
        this.f235482f = aVar5;
        this.f235481e = aVar6;
        this.f235494r = aVar7;
        this.f235495s = gVar;
        this.f235483g = dVar;
        this.f235496t = hVar;
        this.f235497u = aVar8;
        this.f235498v = aVar9;
        this.f235499w = gVar2;
        this.f235500x = gVar3;
        this.f235484h = tVar;
        this.f235480d = inVar;
        this.f235485i = aVar10;
        this.f235486j = axVar;
        this.f235487k = z;
        this.f235488l = aVar11;
    }

    /* renamed from: e */
    public final void mo80765e(Query query, C60870cx cxVar) {
        C118575h hVar;
        C58833ax axVar;
        if (query.mo84422dC()) {
            hVar = C118575h.GRAPH_OPA_VOICE_SEARCH;
        } else {
            hVar = C118575h.GRAPH_VOICE_SEARCH;
        }
        C89356b b = ((C84466a) this.f235498v.mo27525b()).mo78026b("Voice search graph", hVar, C118575h.WORKER_VOICE_SEARCH);
        Query query2 = this.f235489m;
        if (!query2.mo84435dP() || query2.mo84403cj()) {
            axVar = C58836b.f156633a;
        } else {
            C86982dh dhVar = (C86982dh) this.f235494r.mo27525b();
            PlaybackStatus playbackStatus = dhVar.f234934e;
            dhVar.f234934e = null;
            C86427g gVar = this.f235495s;
            C86355a aVar = (C86355a) gVar.f233582a.mo17428b();
            aVar.getClass();
            C86357c cVar = (C86357c) gVar.f233583b.mo17428b();
            cVar.getClass();
            C86372a aVar2 = (C86372a) gVar.f233584c.mo17428b();
            aVar2.getClass();
            C86359e eVar = (C86359e) gVar.f233585d.mo17428b();
            eVar.getClass();
            C86363a aVar3 = (C86363a) gVar.f233586e.mo17428b();
            aVar3.getClass();
            C86365c cVar2 = (C86365c) gVar.f233587f.mo17428b();
            cVar2.getClass();
            C86360a aVar4 = (C86360a) gVar.f233588g.mo17428b();
            aVar4.getClass();
            C86369g gVar2 = (C86369g) gVar.f233589h.mo17428b();
            gVar2.getClass();
            C86371i iVar = (C86371i) gVar.f233590i.mo17428b();
            iVar.getClass();
            C60870cx b2 = this.f235497u.mo78787b(b, new C86426f(playbackStatus, aVar, cVar, aVar2, eVar, aVar3, cVar2, aVar4, gVar2, iVar));
            if (query2.mo84434dO() && !query2.mo84403cj()) {
                b2 = this.f235496t.mo78618a(new C86380ab(b2), b, this.f235480d);
            }
            axVar = C58833ax.m90834k(b2);
        }
        mo80766g(this.f235483g.mo78928a(this.f235489m, ((C86812ai) this.f235481e.mo27525b()).f234471a, this.f235480d, (C86498a) this.f235493q.mo27525b(), b, axVar, cxVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo80766g(C60870cx cxVar) {
        this.f235492p = cxVar;
        C85421b bVar = this.f235491o;
        if (bVar != null) {
            bVar.mo78931a(C60537to.NO_LONGER_HANDLED, false);
            this.f235491o = null;
        }
        this.f235499w.mo28211k(cxVar, "setControllerListenableFuture", new C87150ir(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("VoiceSearchState");
    }

    /* renamed from: ho */
    public final void mo80748ho() {
        if (this.f235490n) {
            this.f235490n = false;
            Query m = ((C87052fn) this.f235479c.mo27525b()).mo80711m("voicesearch");
            if (m != null) {
                C87148ip ipVar = new C87148ip(this, m);
                this.f235489m = m;
                if (!m.mo84381cN()) {
                    C60870cx cxVar = this.f235492p;
                    if (cxVar == null || cxVar.isDone() || !this.f235492p.cancel(false)) {
                        C85421b bVar = this.f235491o;
                        if (bVar == null || bVar.mo78934d()) {
                            ipVar.run();
                            return;
                        }
                        this.f235499w.mo28211k(C90877ak.m148471e(this.f235491o.mo78931a(C89880c.m146354a(m), false), this.f235484h.mo79743a(C90120fr.f250765E), TimeUnit.MILLISECONDS, this.f235500x), "Complete previous VoiceSearch", new C87149iq(ipVar));
                        return;
                    }
                    ipVar.run();
                }
            }
        }
    }
}
