package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.LazyGaiaCookieManager$refreshCookiesForJava$1", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {449})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.an */
/* compiled from: PG */
final class C44001an extends C69572j implements C69630p {

    /* renamed from: a */
    int f114536a;

    /* renamed from: b */
    final /* synthetic */ C44006as f114537b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44001an(C44006as asVar, C69577g gVar) {
        super(2, gVar);
        this.f114537b = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44001an) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114536a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44006as asVar = this.f114537b;
            this.f114536a = 1;
            obj = asVar.mo46991c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44001an(this.f114537b, gVar);
    }
}
