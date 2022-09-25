package com.google.android.apps.gsa.search.core.service.p6852g.p6853a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.service.p6842a.C86593a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86723c;
import com.google.android.apps.gsa.search.core.service.p6852g.C86727g;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.p6854a.C86701a;
import com.google.android.apps.gsa.search.core.service.p6852g.p6853a.p6854a.C86703c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86744b;
import com.google.android.apps.gsa.search.core.service.p6856h.C86746c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86747d;
import com.google.android.apps.gsa.search.core.service.p6856h.p6857a.C86740f;
import com.google.android.apps.gsa.search.core.service.p6856h.p6857a.C86741g;
import com.google.android.apps.gsa.search.core.service.p6856h.p6858b.C86745a;
import com.google.android.apps.gsa.search.core.service.p6859i.C86749a;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7055e.C89909c;
import com.google.android.apps.gsa.shared.logger.p7055e.C89910d;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7159c.C90948n;
import com.google.android.apps.gsa.shared.util.p7159c.C90949o;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59791fs;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Collections;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.search.core.service.g.a.h */
/* compiled from: PG */
public final class C86710h implements C86727g {

    /* renamed from: a */
    public static final C59071e f234215a = C59071e.m91332i("com.google.android.apps.gsa.search.core.service.g.a.h");

    /* renamed from: b */
    final C86712j f234216b;
    @Deprecated

    /* renamed from: c */
    public final C68214a f234217c;

    /* renamed from: d */
    public final C68214a f234218d;

    /* renamed from: e */
    public final C68214a f234219e;

    /* renamed from: f */
    public final C86700a f234220f;

    /* renamed from: g */
    public final C21370a f234221g;

    /* renamed from: h */
    public final Set f234222h = C58758qx.m90653k();

    /* renamed from: i */
    public boolean f234223i;

    /* renamed from: j */
    public volatile boolean f234224j;

    /* renamed from: k */
    private final C22871g f234225k;

    /* renamed from: l */
    private final C68214a f234226l;

    /* renamed from: m */
    private final C86723c f234227m;

    /* renamed from: n */
    private final C86713k f234228n;

    /* renamed from: o */
    private final C86741g f234229o;

    /* renamed from: p */
    private final C89910d f234230p;

    /* renamed from: q */
    private final C86746c f234231q;

    /* renamed from: r */
    private final C86706d f234232r;

    public C86710h(C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar, C68214a aVar4, C86723c cVar, C86700a aVar5, C86712j jVar, C86713k kVar, C21370a aVar6, C86741g gVar2, C89910d dVar) {
        C86705c cVar2 = new C86705c(this);
        this.f234231q = cVar2;
        C86706d dVar2 = new C86706d(this);
        this.f234232r = dVar2;
        this.f234224j = false;
        this.f234219e = aVar2;
        this.f234218d = aVar3;
        this.f234225k = gVar;
        this.f234227m = cVar;
        this.f234217c = aVar;
        this.f234226l = aVar4;
        this.f234220f = aVar5;
        this.f234216b = jVar;
        this.f234228n = kVar;
        this.f234221g = aVar6;
        this.f234229o = gVar2;
        this.f234230p = dVar;
        ((C86747d) aVar.mo27525b()).mo80359f(cVar2);
        cVar.mo80331c(dVar2);
    }

    /* renamed from: c */
    public static Set m139667c(Set set) {
        return set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
    }

    /* renamed from: a */
    public final void mo80257a() {
        this.f234224j = true;
        C86703c cVar = this.f234216b.f234235b;
        cVar.f234202b.clear();
        cVar.f234203c = null;
        ((C86749a) this.f234218d.mo27525b()).mo80257a();
    }

    /* renamed from: b */
    public final void mo80313b(C86731k kVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f234224j) {
            C59104x b = f234215a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "WorkController");
            ((C59052c) ((C59052c) b).mo56372aa(8503)).mo56389s("WorkProxy is not enqueued because WorkController is disposed: %s", kVar);
            return;
        }
        kVar.f234286b.mo80343h(this.f234221g.mo26870b());
        C86712j jVar = this.f234216b;
        C86703c cVar = jVar.f234235b;
        cVar.f234202b.add(kVar);
        C86701a aVar = cVar.f234203c;
        if (aVar != null && aVar.f234198b.mo5941a(kVar)) {
            aVar.f234199c.add(kVar);
        }
        C86703c cVar2 = jVar.f234235b;
        jVar.f234234a.set(true);
        C86713k kVar2 = this.f234228n;
        kVar2.f234237a.add(kVar.f234286b);
        Queue queue = kVar2.f234237a;
        mo80316g();
    }

    /* renamed from: e */
    public final void mo80314e(String str, C22869e eVar) {
        if (C22872h.m42744d(C86593a.class)) {
            eVar.run();
        } else {
            this.f234225k.mo28212l(str, eVar);
        }
    }

    /* renamed from: f */
    public final void mo80315f(C86744b bVar) {
        if (this.f234220f.mo80311a(bVar.mo80349ia())) {
            ((C86749a) this.f234218d.mo27525b()).mo80362c(bVar);
        }
    }

    /* renamed from: g */
    public final void mo80316g() {
        mo80314e("Perform queued work", new C86704b(this));
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("WorkControllerImpl");
        fVar.mo85279c("mPerformingQueuedWork").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f234223i)));
        fVar.mo85285l(this.f234216b);
        fVar.mo85285l((C90964a) this.f234218d.mo27525b());
        fVar.mo85285l(this.f234228n);
    }

    /* renamed from: h */
    public final void mo80317h(C86731k kVar, C86744b bVar) {
        C60870cx cxVar;
        this.f234216b.mo80319c(kVar);
        try {
            if (!kVar.isCancelled()) {
                C58976aa aaVar = C58975e.f156826a;
                C86744b e = bVar instanceof C86745a ? ((C86745a) bVar).mo79106e() : bVar;
                C89909c b = this.f234230p.mo83749b(kVar.mo80346h(), C59791fs.WORKER);
                C60856cj.m92911t(kVar, new C86709g(this, kVar, b, bVar), C60826bg.f164896a);
                C118831d g = this.f234229o.f234313b.mo77944g(C118569b.WORKER_LATENCY_MICROS, e.mo80348hZ());
                if (g == null) {
                    ((C59052c) ((C59052c) C86741g.f234312a.mo56225c()).mo56372aa(8537)).mo56389s("Tracker for worker [%s] not found", e.mo80349ia());
                } else {
                    C60856cj.m92911t(kVar, new C86740f(g, g.mo104019a()), C60826bg.f164896a);
                }
                b.mo83746d();
                kVar.f234286b.mo80342g(this.f234221g.mo26870b());
                C90948n nVar = new C90948n(Thread.currentThread());
                AtomicReference atomicReference = kVar.f234285a;
                C90949o oVar = C90949o.f254151a;
                while (!atomicReference.compareAndSet(oVar, nVar)) {
                    if (atomicReference.get() != oVar) {
                        return;
                    }
                }
                try {
                    cxVar = kVar.mo78371g(e);
                } catch (Throwable th) {
                    nVar.mo85243a();
                    throw th;
                }
                kVar.mo57358p(cxVar);
                nVar.mo85243a();
                return;
            }
            mo80315f(bVar);
        } catch (Error | RuntimeException e2) {
            ((C89911f) this.f234226l.mo27525b()).mo83755a(e2, 63457782, 29).mo83721a();
            throw e2;
        }
    }
}
