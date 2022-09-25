package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import android.webkit.CookieManager;
import com.google.android.libraries.web.profile.p3431a.C44060h;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69588r;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.cookies.internal.CookieManagerImpl$setCookies$2$1$1$1", mo61344c = "CookieManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.libraries.web.webview.i.a.a.d */
/* compiled from: PG */
final class C44429d extends C69572j implements C69630p {

    /* renamed from: a */
    int f115489a;

    /* renamed from: b */
    final /* synthetic */ C44434i f115490b;

    /* renamed from: c */
    final /* synthetic */ String f115491c;

    /* renamed from: d */
    final /* synthetic */ String f115492d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44429d(C44434i iVar, String str, String str2, C69577g gVar) {
        super(2, gVar);
        this.f115490b = iVar;
        this.f115491c = str;
        this.f115492d = str2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44429d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115489a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            String str = this.f115491c;
            String str2 = this.f115492d;
            this.f115489a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            try {
                CookieManager.getInstance().setCookie(str, str2, new C44433h(rVar));
            } catch (IllegalArgumentException e) {
                rVar.mo61338mb(C69714l.m101133a(new C44060h("Cookie has invalid format", e)));
            }
            Object a = rVar.mo61355a();
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44429d(this.f115490b, this.f115491c, this.f115492d, gVar);
    }
}
