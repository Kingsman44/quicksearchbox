package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.firstrun.FirstRunFragmentPeer$onViewCreated$2", mo61344c = "FirstRunFragmentPeer.kt", mo61345d = "invokeSuspend", mo61346e = {190})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.j */
/* compiled from: PG */
final class C135747j extends C69572j implements C69630p {

    /* renamed from: a */
    int f369740a;

    /* renamed from: b */
    final /* synthetic */ C135748k f369741b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135747j(C135748k kVar, C69577g gVar) {
        super(2, gVar);
        this.f369741b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135747j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369740a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C135748k.f369742a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(40607));
                cVar.mo56386p("Unable to refresh Cookies");
            }
        } else {
            C69714l.m101134b(obj);
            C135755p pVar = this.f369741b.f369748g;
            this.f369740a = 1;
            if (pVar.f369774d.mo5761a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135747j(this.f369741b, gVar);
    }
}
