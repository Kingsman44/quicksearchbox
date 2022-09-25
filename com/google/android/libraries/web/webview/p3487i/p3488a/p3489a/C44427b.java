package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.cookies.internal.CookieManagerImpl$getCookiesForJava$1", mo61344c = "CookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {76})
/* renamed from: com.google.android.libraries.web.webview.i.a.a.b */
/* compiled from: PG */
final class C44427b extends C69572j implements C69630p {

    /* renamed from: a */
    int f115482a;

    /* renamed from: b */
    final /* synthetic */ C44434i f115483b;

    /* renamed from: c */
    final /* synthetic */ String f115484c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44427b(C44434i iVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f115483b = iVar;
        this.f115484c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44427b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115482a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44434i iVar = this.f115483b;
            String str = this.f115484c;
            this.f115482a = 1;
            obj = iVar.mo47015d(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44427b(this.f115483b, this.f115484c, gVar);
    }
}
