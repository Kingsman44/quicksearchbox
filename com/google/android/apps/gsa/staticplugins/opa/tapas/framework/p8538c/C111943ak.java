package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a.C111890ab;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ak */
/* compiled from: PG */
public final class C111943ak {

    /* renamed from: a */
    public static final C59071e f310985a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.ak");

    /* renamed from: b */
    public static final C121537f f310986b = C121537f.m200840b("Tapas/PrefetchingProvider", C121511c.f337208a);

    /* renamed from: c */
    public final C86124t f310987c;

    /* renamed from: d */
    public final C21370a f310988d;

    /* renamed from: e */
    public final C111971bl f310989e;

    /* renamed from: f */
    public final C22871g f310990f;

    /* renamed from: g */
    public final C111890ab f310991g;

    /* renamed from: h */
    public final C113190cu f310992h;

    /* renamed from: i */
    private final C22871g f310993i;

    public C111943ak(C86124t tVar, C21370a aVar, C111971bl blVar, C22871g gVar, C22871g gVar2, C111890ab abVar, C113190cu cuVar) {
        this.f310987c = tVar;
        this.f310988d = aVar;
        this.f310989e = blVar;
        this.f310990f = gVar;
        this.f310993i = gVar2;
        this.f310991g = abVar;
        this.f310992h = cuVar;
    }

    /* renamed from: a */
    public static C58485gu m185791a(C58485gu guVar) {
        return guVar == null ? C58485gu.m89845m() : guVar;
    }

    /* renamed from: b */
    public final void mo99305b(C60870cx cxVar) {
        new C90873ag(cxVar, this.f310990f, "prefetch issue handling", C111937ae.f310973a).mo85223a(C111938af.f310974a);
    }

    /* renamed from: c */
    public final void mo99306c(C60870cx cxVar, C113405ep epVar) {
        mo99305b(this.f310993i.mo28209i(cxVar, "[Tapas] issue suggestion prefetching", new C111934ab(this, epVar)));
    }
}
