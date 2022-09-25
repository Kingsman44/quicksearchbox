package com.google.android.libraries.web.base.p3348b;

import android.support.p031v4.app.Fragment;
import com.google.android.libraries.web.browser.internal.C43304p;
import com.google.android.libraries.web.browser.internal.C43305q;
import com.google.android.libraries.web.browser.internal.C43306r;
import com.google.android.libraries.web.browser.internal.C43308t;
import com.google.android.libraries.web.browser.internal.C43309u;
import com.google.android.libraries.web.browser.internal.p3352a.C43287f;
import com.google.android.libraries.web.coordinator.internal.fragment.C43756o;
import com.google.android.libraries.web.p3353c.C43323b;
import com.google.android.libraries.web.p3420k.C43863i;
import com.google.android.libraries.web.p3420k.C43870p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.base.b.b */
/* compiled from: PG */
final class C43241b implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C43251d f112996a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f112997b;

    /* renamed from: c */
    final /* synthetic */ C43323b f112998c;

    public C43241b(C43251d dVar, C60870cx cxVar, C43323b bVar) {
        this.f112996a = dVar;
        this.f112997b = cxVar;
        this.f112998c = bVar;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        C69664n.m101061g((Fragment) obj, "it");
        C43863i iVar = C43756o.m77265a(this.f112996a.f113024a).f114099h;
        C69664n.m101058d(iVar);
        C60870cx cxVar = this.f112997b;
        C43323b bVar = this.f112998c;
        C69664n.m101061g(cxVar, "loadUrlParamsFuture");
        C69664n.m101061g(bVar, "clientData");
        if (!iVar.mo46872a()) {
            C43870p pVar = iVar.f114310a;
            pVar.f114328j = true;
            C43308t a = C43309u.m76408a(pVar.f114326h.mo46855b());
            C69664n.m101061g(cxVar, "future");
            C69664n.m101061g(bVar, "clientData");
            a.mo46403b();
            C43306r rVar = C43306r.f113149a;
            C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(rVar), C60826bg.f164896a);
            C43287f.m76385a(a.f113152b).mo46399g();
            a.f113155e.mo46944k(new C43304p(bVar, a, g));
            a.mo46402a(g, new C43305q(a, g));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
