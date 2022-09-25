package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.location.z;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.google.C85880bc;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86649bp;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.core.service.p6842a.p6844b.C86602c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.p5294a.C68225k;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.h */
/* compiled from: PG */
public final class C93786h extends C86734a implements C85880bc, C84609a {

    /* renamed from: h */
    private static final C59071e f261730h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ae.h");

    /* renamed from: i */
    private static final long f261731i = Duration.ofSeconds(5).toMillis();

    /* renamed from: A */
    private final C93796r f261732A;

    /* renamed from: a */
    public final C68214a f261733a;

    /* renamed from: b */
    public final C68214a f261734b;

    /* renamed from: c */
    public final C58833ax f261735c;

    /* renamed from: f */
    public final Object f261736f = new Object();

    /* renamed from: g */
    public C90888av f261737g;

    /* renamed from: j */
    private final Context f261738j;

    /* renamed from: k */
    private final C90931ca f261739k;

    /* renamed from: l */
    private final C22871g f261740l;

    /* renamed from: m */
    private final C85881bd f261741m;

    /* renamed from: n */
    private final C86130z f261742n;

    /* renamed from: o */
    private final C68214a f261743o;

    /* renamed from: p */
    private final C84609a f261744p;

    /* renamed from: q */
    private final C21370a f261745q;

    /* renamed from: r */
    private final C86649bp f261746r;

    /* renamed from: s */
    private final z f261747s;

    /* renamed from: t */
    private final C86602c f261748t;

    /* renamed from: u */
    private final C91097g f261749u;

    /* renamed from: v */
    private final C86610af f261750v;

    /* renamed from: w */
    private boolean f261751w;

    /* renamed from: x */
    private boolean f261752x = false;

    /* renamed from: y */
    private final C93803y f261753y = new C93803y();

    /* renamed from: z */
    private final C84466a f261754z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93786h(Context context, C90931ca caVar, C22871g gVar, C85881bd bdVar, C86130z zVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C84466a aVar4, C93796r rVar, C58833ax axVar, C84609a aVar5, C21370a aVar6, C86649bp bpVar, z zVar2, C86602c cVar, C91097g gVar2, C86610af afVar) {
        super(C118575h.WORKER_CONTEXT, "context");
        this.f261738j = context;
        this.f261739k = caVar;
        this.f261740l = gVar;
        this.f261741m = bdVar;
        this.f261742n = zVar;
        this.f261733a = aVar;
        this.f261743o = aVar2;
        this.f261734b = aVar3;
        bdVar.mo79510a(this);
        this.f261754z = aVar4;
        this.f261735c = axVar;
        this.f261732A = rVar;
        this.f261744p = aVar5;
        this.f261745q = aVar6;
        this.f261746r = bpVar;
        this.f261747s = zVar2;
        this.f261748t = cVar;
        this.f261749u = gVar2;
        this.f261750v = afVar;
    }

    /* renamed from: m */
    private final void m154771m() {
        synchronized (this.f261736f) {
            C93783e eVar = new C93783e(this);
            this.f261737g = eVar;
            if (!this.f261751w) {
                this.f261739k.mo85137b(eVar, f261731i);
            } else {
                eVar.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo79518a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        this.f261740l.mo28212l("onUseLocationChanged", new C93768c(this));
    }

    /* renamed from: c */
    public final C60870cx mo78372c(boolean z) {
        return this.f261739k.mo85138c(new C93782d(this, z));
    }

    /* renamed from: e */
    public final C60870cx mo78373e(long j, ImproveLocationRequest improveLocationRequest, C86360a aVar) {
        C93742ba baVar = new C93742ba(j, improveLocationRequest);
        long j2 = mo88171j();
        this.f261753y.mo88176c(baVar, j2);
        if (j2 != 0) {
            mo78376h(j2, aVar);
        }
        return baVar.f261617d;
    }

    /* renamed from: f */
    public final void mo78374f(Pair pair) {
        ((C93731aq) this.f261743o.mo27525b()).mo88165b(((Boolean) pair.first).booleanValue(), (ImproveLocationRequest.ImproveLocationDialogMetrics) pair.second);
    }

    /* renamed from: g */
    public final void mo78375g(long j, boolean z) {
        C93742ba a = this.f261753y.mo88174a(j).mo88152a();
        if (a != null) {
            a.f261617d.mo57356n(Boolean.valueOf(z));
            return;
        }
        C59104x c = f261730h.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ContextWorker");
        ((C59052c) ((C59052c) c).mo56372aa(19038)).mo56388r("resolveOngoingLocationPrompt: no ongoing location prompt in client %d", j);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ContextWorker");
        fVar.mo85285l(this.f261742n);
    }

    /* renamed from: h */
    public final void mo78376h(long j, C86360a aVar) {
        if (this.f261753y.mo88174a(j).mo88157f()) {
            this.f261739k.mo85139d(new C93784f(this, j, aVar));
        }
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        this.f261751w = true;
        this.f261741m.mo79511b(this);
        m154771m();
    }

    /* renamed from: i */
    public final void mo78377i(boolean z) {
        this.f261752x = z;
        this.f261740l.mo28212l("updateAndEnforceMonitoring", new C93741b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final synchronized long mo88171j() {
        C86775r rVar = this.f261750v.f233977l;
        if (rVar == null) {
            return 0;
        }
        return rVar.f234381c;
    }

    /* renamed from: k */
    public final void mo88172k(long j, C86360a aVar) {
        long j2 = j;
        C86360a aVar2 = aVar;
        C90748e.m148224b();
        C93713a a = this.f261753y.mo88174a(j2);
        if (mo88171j() != j2) {
            a.mo88155d();
            return;
        }
        C93742ba b = this.f261753y.mo88175b(j2);
        if (b == null) {
            a.mo88155d();
            return;
        }
        C93796r rVar = this.f261732A;
        C89356b ic = mo80351ic(this.f261754z, "LocationPromptProcessor", C118575h.LOCATION_PROMPT_PROCESSOR);
        ic.getClass();
        rVar.f261883a = ic;
        C93731aq aqVar = (C93731aq) this.f261743o.mo27525b();
        aqVar.getClass();
        rVar.f261884b = aqVar;
        rVar.f261885c = b;
        rVar.f261886d = a;
        C84609a aVar3 = this.f261744p;
        aVar3.getClass();
        rVar.f261887e = aVar3;
        C21370a aVar4 = this.f261745q;
        aVar4.getClass();
        rVar.f261888f = aVar4;
        C86649bp bpVar = this.f261746r;
        bpVar.getClass();
        rVar.f261889g = bpVar;
        C85881bd bdVar = this.f261741m;
        bdVar.getClass();
        rVar.f261890h = bdVar;
        z zVar = this.f261747s;
        zVar.getClass();
        rVar.f261891i = zVar;
        SharedPreferences sharedPreferences = this.f261738j.getSharedPreferences("improve_location", 0);
        sharedPreferences.getClass();
        rVar.f261892j = sharedPreferences;
        aVar.getClass();
        rVar.f261893k = aVar2;
        C86602c cVar = this.f261748t;
        cVar.getClass();
        rVar.f261894l = cVar;
        Context context = this.f261738j;
        context.getClass();
        rVar.f261895m = context;
        C91097g gVar = this.f261749u;
        gVar.getClass();
        rVar.f261896n = gVar;
        C68225k.m98529a(rVar.f261883a, C89356b.class);
        C68225k.m98529a(rVar.f261884b, C93731aq.class);
        C68225k.m98529a(rVar.f261885c, C93742ba.class);
        C68225k.m98529a(rVar.f261886d, C93713a.class);
        C68225k.m98529a(rVar.f261887e, C84609a.class);
        C68225k.m98529a(rVar.f261888f, C21370a.class);
        C68225k.m98529a(rVar.f261889g, C86649bp.class);
        C68225k.m98529a(rVar.f261890h, C85881bd.class);
        C68225k.m98529a(rVar.f261891i, z.class);
        C68225k.m98529a(rVar.f261892j, SharedPreferences.class);
        C68225k.m98529a(rVar.f261893k, C86360a.class);
        C68225k.m98529a(rVar.f261894l, C86602c.class);
        C68225k.m98529a(rVar.f261895m, Context.class);
        C68225k.m98529a(rVar.f261896n, C91097g.class);
        C89356b bVar = rVar.f261883a;
        C93731aq aqVar2 = rVar.f261884b;
        C93742ba baVar = rVar.f261885c;
        C93713a aVar5 = rVar.f261886d;
        C21370a aVar6 = rVar.f261888f;
        C86649bp bpVar2 = rVar.f261889g;
        C85881bd bdVar2 = rVar.f261890h;
        z zVar2 = rVar.f261891i;
        SharedPreferences sharedPreferences2 = rVar.f261892j;
        SharedPreferences sharedPreferences3 = sharedPreferences2;
        this.f261739k.mo85143h(new C93797s(bVar, aqVar2, baVar, aVar5, aVar6, bpVar2, bdVar2, zVar2, sharedPreferences3, rVar.f261893k, rVar.f261894l, rVar.f261895m, rVar.f261896n).f261923a.mo60297gq(), new C93785g(this, j, aVar2));
    }

    /* renamed from: l */
    public final void mo88173l() {
        synchronized (this.f261736f) {
            if (!this.f261752x || !this.f261741m.mo79514e(false) || this.f261751w) {
                m154771m();
            } else {
                this.f261737g = null;
                if (this.f261735c.mo56113h()) {
                    C93728an anVar = (C93728an) this.f261735c.mo56107c();
                    C58976aa aaVar = C58975e.f156826a;
                    anVar.mo84765i(new C93726al(anVar), "observe");
                }
            }
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
