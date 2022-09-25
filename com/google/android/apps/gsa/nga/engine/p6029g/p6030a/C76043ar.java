package com.google.android.apps.gsa.nga.engine.p6029g.p6030a;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.as.k;
import com.google.android.apps.gsa.nga.engine.ax.e.c;
import com.google.android.apps.gsa.nga.engine.ax.e.d;
import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.engine.p6029g.C76024a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76089e;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76091g;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6029g.C76093i;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6260x.C79850ah;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.nga.shared.p6345h.C81252aq;
import com.google.android.apps.gsa.nga.shared.p6345h.p6346a.C81214fi;
import com.google.android.apps.gsa.nga.shared.p6363s.C81453b;
import com.google.android.apps.gsa.nga.shared.p6363s.C81456e;
import com.google.android.apps.gsa.nga.shared.p6407v.C82267b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120111b;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120112c;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120119j;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32150a;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.android.libraries.search.p2476a.p2479c.C32204e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.g.a.ar */
/* compiled from: PG */
public final class C76043ar implements C76092h, C76093i, C76091g, C75042j, C32150a, k, C90991b, C120111b {

    /* renamed from: a */
    public static final C58974d f210894a = C58974d.m91136j();

    /* renamed from: A */
    private final C81453b f210895A;

    /* renamed from: B */
    private final C68214a f210896B;

    /* renamed from: C */
    private Optional f210897C = Optional.empty();

    /* renamed from: D */
    private final C82267b f210898D;

    /* renamed from: E */
    private final C79851ai f210899E;

    /* renamed from: F */
    private C60870cx f210900F;

    /* renamed from: b */
    public final Object f210901b = new Object();

    /* renamed from: c */
    public final C32160b f210902c;

    /* renamed from: d */
    public final C79359i f210903d;

    /* renamed from: e */
    public final C22871g f210904e;

    /* renamed from: f */
    public final C81453b f210905f;

    /* renamed from: g */
    public final C46194e f210906g;

    /* renamed from: h */
    public final C32204e f210907h;

    /* renamed from: i */
    public final C120112c f210908i;

    /* renamed from: j */
    public final C78007b f210909j;

    /* renamed from: k */
    public final C47770dh f210910k;

    /* renamed from: l */
    public final Executor f210911l;

    /* renamed from: m */
    public final AtomicReference f210912m = new AtomicReference(new C76025a(Optional.empty(), Optional.empty()));

    /* renamed from: n */
    public final AtomicBoolean f210913n = new AtomicBoolean(false);

    /* renamed from: o */
    public final AtomicBoolean f210914o = new AtomicBoolean(false);

    /* renamed from: p */
    public final AtomicReference f210915p;

    /* renamed from: q */
    public final AtomicBoolean f210916q;

    /* renamed from: r */
    public final AtomicBoolean f210917r;

    /* renamed from: s */
    public boolean f210918s;

    /* renamed from: t */
    public Optional f210919t;

    /* renamed from: u */
    public C120119j f210920u;

    /* renamed from: v */
    private final C60836bq f210921v = new C60836bq();

    /* renamed from: w */
    private final Context f210922w;

    /* renamed from: x */
    private final C81252aq f210923x;

    /* renamed from: y */
    private final C91142g f210924y;

    /* renamed from: z */
    private final C22871g f210925z;

    public C76043ar(Context context, C32160b bVar, C81252aq aqVar, C79359i iVar, C91142g gVar, C22871g gVar2, C22871g gVar3, C81456e eVar, C68214a aVar, C82267b bVar2, C78007b bVar3, C79851ai aiVar, C46194e eVar2, C32204e eVar3, C47770dh dhVar, Executor executor, C120112c cVar) {
        C81456e eVar4 = eVar;
        C76089e h = C76090f.m122663h();
        h.mo72011d(false);
        h.mo72012e(false);
        h.mo72014g(Locale.getDefault());
        h.mo72009b(C58485gu.m89846n(Locale.getDefault()));
        h.mo72013f(Optional.empty());
        ((C76024a) h).f210867a = new c();
        h.mo72010c(C120124o.CLASSIC);
        this.f210915p = new AtomicReference(h.mo72045h());
        this.f210916q = new AtomicBoolean(false);
        this.f210917r = new AtomicBoolean(false);
        this.f210900F = null;
        this.f210918s = false;
        this.f210919t = Optional.empty();
        this.f210920u = null;
        this.f210922w = context;
        this.f210902c = bVar;
        this.f210923x = aqVar;
        this.f210903d = iVar;
        this.f210924y = gVar;
        this.f210904e = gVar2;
        this.f210925z = gVar3;
        this.f210896B = aVar;
        this.f210898D = bVar2;
        this.f210895A = eVar.mo75087a(C76070v.f210957a);
        this.f210905f = eVar.mo75087a(C76032ag.f210883a);
        this.f210909j = bVar3;
        this.f210899E = aiVar;
        this.f210906g = eVar2;
        this.f210907h = eVar3;
        this.f210910k = dhVar;
        this.f210911l = executor;
        this.f210908i = cVar;
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        if (apVar == C81251ap.NGA_STARTUP_PREFERENCES) {
            mo72028i(C76062n.f210949a);
        }
    }

    /* renamed from: a */
    public final C60870cx mo72020a(boolean z) {
        this.f210917r.set(z);
        return mo72028i(new C76039an(this));
    }

    /* renamed from: b */
    public final C76090f mo72021b() {
        if (!this.f210916q.get()) {
            C58970a aVar = (C58970a) f210894a.mo56225c();
            aVar.mo56380ai(C58979ad.MEDIUM);
            ((C58970a) aVar.mo56372aa(3109)).mo56386p("Calling getConfiguration() before NgaConfigurationManager is initialized.");
        }
        return (C76090f) this.f210915p.get();
    }

    /* renamed from: c */
    public final C60870cx mo72022c() {
        return mo72028i(new C76040ao(this));
    }

    /* renamed from: e */
    public final C76090f mo72023e() {
        d dVar;
        C120124o oVar;
        boolean z = this.f210913n.get();
        Optional b = ((C76042aq) this.f210912m.get()).mo72016b();
        Optional a = ((C76042aq) this.f210912m.get()).mo72015a();
        C58485gu f = mo72024f(b);
        boolean z2 = false;
        if (mo72030l(f) && this.f210914o.get()) {
            z2 = true;
        }
        C81252aq aqVar = this.f210923x;
        Objects.requireNonNull(aqVar);
        Locale locale = (Locale) b.flatMap(new C76072x(aqVar)).orElse(this.f210923x.mo74954o());
        C76089e h = C76090f.m122663h();
        h.mo72011d(z);
        h.mo72013f(b);
        if (a.isPresent()) {
            dVar = new d(this.f210922w, (AccountId) a.get());
        } else {
            dVar = new c();
        }
        ((C76024a) h).f210867a = dVar;
        h.mo72009b(f);
        h.mo72014g(locale);
        h.mo72012e(z2);
        if (this.f210908i.mo104672a().f334336a.isEmpty()) {
            oVar = C120124o.CLASSIC;
        } else {
            oVar = C120124o.APA;
        }
        h.mo72010c(oVar);
        return h.mo72045h();
    }

    /* renamed from: f */
    public final C58485gu mo72024f(Optional optional) {
        C81252aq aqVar = this.f210923x;
        Objects.requireNonNull(aqVar);
        C58485gu guVar = (C58485gu) optional.flatMap(new C76068t(aqVar)).map(C76069u.f210956a).orElse(C58485gu.m89846n(this.f210923x.mo74954o()));
        return guVar.isEmpty() ? C58485gu.m89846n(Locale.getDefault()) : guVar;
    }

    /* renamed from: g */
    public final synchronized C58485gu mo72025g() {
        if (this.f210897C.isEmpty()) {
            C79850ah b = this.f210899E.mo74251b(81);
            try {
                this.f210897C = Optional.m71637of((C58485gu) this.f210896B.mo27525b());
                if (b != null) {
                    b.mo74255b();
                }
            } catch (Throwable th) {
                C76059k.m122629a(th, th);
            }
        }
        return (C58485gu) this.f210897C.get();
        throw th;
    }

    /* renamed from: gE */
    public final void mo72026gE(C58528ij ijVar) {
        if (ijVar.contains(Integer.valueOf(C90126fx.f251641me.f251802a))) {
            mo72028i(C76026aa.f210877a);
        }
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NGA Configuration");
        fVar.mo85278b("NGA enabled components").mo85276a(C90752i.m148229c((String) Collection.EL.stream((C58485gu) this.f210896B.mo27525b()).filter(C76027ab.f210878a).map(C76028ac.f210879a).collect(Collectors.joining(","))));
        fVar.mo85278b("NGA primary locale").mo85276a(C90752i.m148231e(((C76090f) this.f210915p.get()).mo72039e()));
        fVar.mo85278b("NGA locales").mo85276a(C90752i.m148231e(((C76090f) this.f210915p.get()).mo72037c()));
    }

    /* renamed from: h */
    public final C60870cx mo72027h() {
        return this.f210921v.mo57305b(new C76074z(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo72028i(Supplier supplier) {
        C60870cx cxVar;
        C60870cx cxVar2;
        this.f210898D.mo75572a(new C76064p(this));
        synchronized (this.f210901b) {
            if (this.f210900F == null) {
                this.f210902c.mo37975c(this);
                this.f210900F = C60922j.m93044g(C60846c.m92878g(C60838bs.m92859i(C118826c.m197212b(C58485gu.m89847o(mo72027h(), this.f210895A.mo75085a()))), Exception.class, C76065q.f210952a, C60826bg.f164896a), new C76066r(this), C60826bg.f164896a);
            }
            cxVar = this.f210900F;
        }
        if (cxVar.isDone()) {
            cxVar2 = (C60870cx) supplier.get();
        } else {
            cxVar2 = this.f210904e.mo28210j(cxVar, "[NGA] NgaConfigurationManager.initializeAndThen", new C76030ae(supplier));
        }
        new C90873ag(cxVar2, this.f210904e, "[NGA] NgaConfigurationManager.updateInternalConfiguration.log", C76031af.f210882a).mo85223a(C76033ah.f210884a);
        return this.f210904e.mo28210j(cxVar2, "[NGA] NgaConfigurationManager.updateInternalConfiguration", new C76034ai(this));
    }

    /* renamed from: j */
    public final void mo37969j() {
        mo72028i(new C76029ad(this));
    }

    /* renamed from: k */
    public final void mo72029k() {
        this.f210925z.mo28212l("[NGA] NgaConfigurationManager.updateConfiguration", new C76073y(this));
    }

    /* renamed from: l */
    public final boolean mo72030l(C58485gu guVar) {
        return this.f210913n.get() && C81214fi.m129201a(guVar, this.f210924y.mo85403h(C90126fx.f251641me));
    }
}
