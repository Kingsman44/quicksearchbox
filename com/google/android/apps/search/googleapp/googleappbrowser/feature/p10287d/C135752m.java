package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10287d;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.feature.firstrun.GaiaCookieRefresher$isCookieRefreshComplete$1", mo61344c = "GaiaCookieRefresher.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.d.m */
/* compiled from: PG */
final class C135752m extends C69572j implements C69630p {

    /* renamed from: a */
    int f369765a;

    /* renamed from: b */
    final /* synthetic */ C135755p f369766b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135752m(C135755p pVar, C69577g gVar) {
        super(2, gVar);
        this.f369766b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135752m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369765a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C69626l lVar = this.f369766b.f369774d;
        this.f369765a = 1;
        if (lVar.mo5761a(this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135752m(this.f369766b, gVar);
    }
}
