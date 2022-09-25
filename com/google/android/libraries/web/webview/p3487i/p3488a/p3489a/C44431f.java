package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.cookies.internal.CookieManagerImpl$setCookies$2", mo61344c = "CookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.libraries.web.webview.i.a.a.f */
/* compiled from: PG */
final class C44431f extends C69572j implements C69630p {

    /* renamed from: a */
    int f115498a;

    /* renamed from: b */
    final /* synthetic */ Iterable f115499b;

    /* renamed from: c */
    final /* synthetic */ C44434i f115500c;

    /* renamed from: d */
    final /* synthetic */ String f115501d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44431f(Iterable iterable, C44434i iVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f115499b = iterable;
        this.f115500c = iVar;
        this.f115501d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44431f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115498a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44430e eVar = new C44430e(this.f115499b, this.f115500c, this.f115501d, (C69577g) null);
            this.f115498a = 1;
            if (C71423ax.m104196a(eVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44431f(this.f115499b, this.f115500c, this.f115501d, gVar);
    }
}
