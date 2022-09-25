package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.C122579a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.C122695c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122761a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122762b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.o */
/* compiled from: PG */
public final class C122659o implements C122579a, C122761a, C122695c {

    /* renamed from: a */
    public static final C59071e f339898a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.o");

    /* renamed from: b */
    public final TextClassifierLib f339899b;

    /* renamed from: c */
    public final C122762b f339900c;

    /* renamed from: d */
    public volatile boolean f339901d = false;

    /* renamed from: e */
    public volatile Runnable f339902e = null;

    /* renamed from: f */
    public final C122644ax f339903f;

    /* renamed from: g */
    public final C122669y f339904g;

    /* renamed from: h */
    private final C60887da f339905h;

    /* renamed from: i */
    private final C60887da f339906i;

    public C122659o(TextClassifierLib textClassifierLib, C122644ax axVar, C122669y yVar, C122762b bVar, C60887da daVar, C60887da daVar2) {
        this.f339899b = textClassifierLib;
        this.f339903f = axVar;
        this.f339904g = yVar;
        this.f339900c = bVar;
        this.f339905h = daVar;
        this.f339906i = daVar2;
    }

    /* renamed from: a */
    public final C60870cx mo105677a(String str) {
        C122655k kVar = new C122655k(this, str);
        return C60856cj.m92904m(C47810es.m84978r(kVar), this.f339905h);
    }

    /* renamed from: b */
    public final void mo105716b(Runnable runnable) {
        this.f339902e = runnable;
    }

    /* renamed from: c */
    public final C60870cx mo105717c() {
        C60870cx j = C60856cj.m92901j(this.f339899b.mo58301b());
        C122656l lVar = new C122656l(this);
        return C60922j.m93044g(j, C47810es.m84963c(lVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo105718d(C65753ak akVar) {
        if (akVar.equals(C65753ak.PKG_ENTITIES) && !this.f339901d) {
            C122657m mVar = new C122657m(this);
            C60870cx n = C60856cj.m92905n(C47810es.m84965e(mVar), this.f339906i);
            C122658n nVar = new C122658n();
            C60856cj.m92911t(n, C47810es.m84974n(nVar), C60826bg.f164896a);
        }
    }
}
