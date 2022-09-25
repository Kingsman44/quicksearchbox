package com.google.android.libraries.web.profile.p3431a.p3434b.p3435a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.profile.cookies.gaia.internal.GaiaCookieManagerImpl$sequencedVerifyCookies$doVerifyCookies$verifyResult$1$hasLoginCookieDeferred$1", mo61344c = "GaiaCookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {193})
/* renamed from: com.google.android.libraries.web.profile.a.b.a.u */
/* compiled from: PG */
final class C44033u extends C69572j implements C69630p {

    /* renamed from: a */
    int f114636a;

    /* renamed from: b */
    final /* synthetic */ C44037y f114637b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44033u(C44037y yVar, C69577g gVar) {
        super(2, gVar);
        this.f114637b = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44033u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f114636a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44037y yVar = this.f114637b;
            this.f114636a = 1;
            obj = yVar.mo46998f(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44033u(this.f114637b, gVar);
    }
}
