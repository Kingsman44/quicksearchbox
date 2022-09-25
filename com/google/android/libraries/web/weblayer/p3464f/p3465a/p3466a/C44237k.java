package com.google.android.libraries.web.weblayer.p3464f.p3465a.p3466a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.profile.cookies.internal.WLCookieManager$getCookiesForJava$1", mo61344c = "WLCookieManager.kt", mo61345d = "invokeSuspend", mo61346e = {110})
/* renamed from: com.google.android.libraries.web.weblayer.f.a.a.k */
/* compiled from: PG */
final class C44237k extends C69572j implements C69630p {

    /* renamed from: a */
    int f115039a;

    /* renamed from: b */
    final /* synthetic */ C44247u f115040b;

    /* renamed from: c */
    final /* synthetic */ String f115041c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44237k(C44247u uVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f115040b = uVar;
        this.f115041c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44237k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115039a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44247u uVar = this.f115040b;
            String str = this.f115041c;
            this.f115039a = 1;
            obj = uVar.mo47015d(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44237k(this.f115040b, this.f115041c, gVar);
    }
}
