package com.google.android.libraries.web.browser.internal;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.browser.internal.d */
/* compiled from: PG */
public final class C43292d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C43308t f113103a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f113104b;

    /* renamed from: c */
    final /* synthetic */ C69626l f113105c;

    public C43292d(C43308t tVar, C60870cx cxVar, C69626l lVar) {
        this.f113103a = tVar;
        this.f113104b = cxVar;
        this.f113105c = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C43308t.f113151a.mo56224b()).mo56382g(th);
        cVar.mo56379ah(new C59094n(54069));
        cVar.mo56386p("LoadUrlFuture failed, dropping the request.");
        if (C69664n.m101066l(this.f113103a.f113158h, this.f113104b)) {
            C43308t tVar = this.f113103a;
            tVar.f113155e.mo46944k(new C43290b(th, tVar));
        }
        C43308t tVar2 = this.f113103a;
        if (tVar2.f113157g) {
            tVar2.f113155e.mo46944k(new C43291c(this.f113104b));
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        if (!C69664n.m101066l(this.f113103a.f113158h, this.f113104b)) {
            C59052c cVar = (C59052c) C43308t.f113151a.mo56224b();
            cVar.mo56379ah(new C59094n(54071));
            cVar.mo56386p("LoadUrlFuture got cancelled due to another request.");
        } else if (this.f113103a.f113152b.mo46410c().mo46899e()) {
            C59052c cVar2 = (C59052c) C43308t.f113151a.mo56224b();
            cVar2.mo56379ah(new C59094n(54070));
            cVar2.mo56386p("LoadUrlFuture got cancelled due to model destruction.");
        } else {
            this.f113105c.mo5761a(obj);
        }
    }
}
