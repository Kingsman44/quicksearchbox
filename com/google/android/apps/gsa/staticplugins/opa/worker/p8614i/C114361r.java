package com.google.android.apps.gsa.staticplugins.opa.worker.p8614i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6701dg.C85360a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88343yd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88344ye;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111708as;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112131q;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112474as;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113164bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113372dm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9232a.C121491a;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d.C121535i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.i.r */
/* compiled from: PG */
public final class C114361r extends C86734a implements C85360a {

    /* renamed from: a */
    public static final C59071e f317083a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.i.r");

    /* renamed from: b */
    public final C68214a f317084b;

    /* renamed from: c */
    public final C68214a f317085c;

    /* renamed from: f */
    public final C22871g f317086f;

    /* renamed from: g */
    public final C68214a f317087g;

    /* renamed from: h */
    private final C68214a f317088h;

    /* renamed from: i */
    private final C68214a f317089i;

    /* renamed from: j */
    private final C68214a f317090j;

    /* renamed from: k */
    private final Executor f317091k;

    /* renamed from: l */
    private final C68214a f317092l;

    /* renamed from: m */
    private final C68214a f317093m;

    /* renamed from: n */
    private final C68214a f317094n;

    /* renamed from: o */
    private final C68214a f317095o;

    /* renamed from: p */
    private final C21370a f317096p;

    /* renamed from: q */
    private C114350g f317097q;

    public C114361r(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar, C90851k kVar, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C21370a aVar11) {
        super(C118575h.WORKER_TAPAS_SEARCH, "tapassearch");
        this.f317088h = aVar;
        this.f317084b = aVar2;
        this.f317089i = aVar3;
        this.f317085c = aVar4;
        this.f317090j = aVar5;
        this.f317086f = gVar;
        this.f317091k = kVar.mo85210c("Background executor for Tapas");
        this.f317092l = aVar6;
        this.f317093m = aVar7;
        this.f317094n = aVar8;
        this.f317087g = aVar9;
        this.f317095o = aVar10;
        this.f317096p = aVar11;
        if (((C86124t) aVar4.mo27525b()).mo79746e(C90063do.f249394ch)) {
            C121491a.m200750b();
        }
    }

    /* renamed from: a */
    public final C60870cx mo78889a() {
        if (((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249454do)) {
            ((C121535i) this.f317092l.mo27525b()).mo105231a();
        }
        C60870cx b = ((C112127m) this.f317090j.mo27525b()).mo99402b(false);
        C114360q qVar = C114360q.f317082a;
        return C60922j.m93044g(b, C47810es.m84963c(qVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo78890c() {
        if (!((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249422dI)) {
            return C60856cj.m92898g();
        }
        if (((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249426dM) && ((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249372cL)) {
            long a = ((C112131q) this.f317093m.mo27525b()).mo99409a();
            if (a == -1) {
                return C60856cj.m92898g();
            }
            if (this.f317096p.mo26870b() - a > Duration.ofHours(((C86124t) this.f317085c.mo27525b()).mo79743a(C90063do.f249598gZ)).toMillis()) {
                return C60856cj.m92898g();
            }
        } else if (!((C112131q) this.f317093m.mo27525b()).mo99412d("tapas_setting_first_run_tapas_server")) {
            return C60856cj.m92898g();
        }
        if (((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249424dK)) {
            return this.f317086f.mo28210j(((C113425ff) this.f317089i.mo27525b()).mo100137c(), "Load PR", new C114357n(this));
        }
        return mo101301i(((C86124t) this.f317085c.mo27525b()).mo79743a(C90063do.f249630he));
    }

    /* renamed from: d */
    public final C60870cx mo78891d() {
        if (!((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249361cA)) {
            return C60856cj.m92898g();
        }
        if (!((C112131q) this.f317093m.mo27525b()).mo99412d("tapas_setting_first_show_ui")) {
            return C60856cj.m92898g();
        }
        if (((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249362cB)) {
            this.f317086f.mo28201a("preloadAllAndroidShortcuts", new C114356m(this));
        }
        return C118826c.f331423b;
    }

    /* renamed from: e */
    public final C60870cx mo78892e() {
        C60870cx b = ((C112474as) this.f317094n.mo27525b()).mo99548b(C113164bv.m187180a(((C86124t) this.f317085c.mo27525b()).mo79745c(C90063do.f249288ah)));
        C114355l lVar = C114355l.f317076a;
        return C60922j.m93044g(b, C47810es.m84963c(lVar), this.f317091k);
    }

    /* renamed from: f */
    public final C60870cx mo78893f() {
        if (!((C112131q) this.f317093m.mo27525b()).mo99412d("tapas_setting_first_show_ui")) {
            return C118826c.f331423b;
        }
        return mo78892e();
    }

    /* renamed from: g */
    public final C60870cx mo78894g(C88344ye yeVar) {
        C114351h hVar = (C114351h) this.f317088h.mo27525b();
        yeVar.getClass();
        C84466a aVar = (C84466a) hVar.f317069a.mo17428b();
        aVar.getClass();
        C68214a a = C68219e.m98518a(((C68226l) hVar.f317070b).f184585a);
        a.getClass();
        C114350g gVar = new C114350g(yeVar, aVar, a);
        this.f317097q = gVar;
        return gVar.mo101300a();
    }

    /* renamed from: h */
    public final C60870cx mo78895h(boolean z) {
        if (!((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249434dU)) {
            return C60866ct.f164955a;
        }
        if (((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249433dT) && ((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249372cL)) {
            long a = ((C112131q) this.f317093m.mo27525b()).mo99409a();
            if (a == -1) {
                return C60866ct.f164955a;
            }
            if (this.f317096p.mo26870b() - a > Duration.ofHours(((C86124t) this.f317085c.mo27525b()).mo79743a(C90063do.f249627hb)).toMillis()) {
                return C60866ct.f164955a;
            }
        } else if (!((C112131q) this.f317093m.mo27525b()).mo99412d("tapas_setting_first_run_tapas_server")) {
            return C60866ct.f164955a;
        }
        if (((C86124t) this.f317085c.mo27525b()).mo79746e(C90063do.f249430dQ)) {
            new C90873ag(((C113425ff) this.f317089i.mo27525b()).mo100137c(), this.f317086f, "handle failure", new C114358o(this, z)).mo85223a(C114359p.f317081a);
            return C60866ct.f164955a;
        }
        ((C111708as) this.f317084b.mo27525b()).mo99209a(z);
        return C60866ct.f164955a;
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C89356b bVar;
        C114350g gVar = this.f317097q;
        if (gVar != null && (bVar = gVar.f317065a) != null) {
            bVar.mo83286e().mo54566a();
            gVar.f317065a = null;
        }
    }

    /* renamed from: i */
    public final C60870cx mo101301i(long j) {
        C88343yd ydVar = (C88343yd) C88344ye.f238913h.createBuilder();
        ydVar.copyOnWrite();
        C88344ye yeVar = (C88344ye) ydVar.instance;
        yeVar.f238915a |= 1;
        yeVar.f238916b = BuildConfig.FLAVOR;
        long a = ((C113372dm) this.f317095o.mo27525b()).mo100146a();
        ydVar.copyOnWrite();
        C88344ye yeVar2 = (C88344ye) ydVar.instance;
        yeVar2.f238915a |= 2;
        yeVar2.f238917c = a;
        C51331dt dtVar = C51331dt.FULLY_TRUSTED;
        ydVar.copyOnWrite();
        C88344ye yeVar3 = (C88344ye) ydVar.instance;
        yeVar3.f238919e = dtVar.f133647e;
        yeVar3.f238915a |= 8;
        C60870cx g = mo78894g((C88344ye) ydVar.build());
        new C90873ag(g, this.f317086f, "handle GenericClientEvent TAPAS_SEARCH_START", new C114353j(this, j)).mo85223a(C114354k.f317075a);
        return g;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
