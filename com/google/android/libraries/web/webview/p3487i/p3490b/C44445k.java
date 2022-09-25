package com.google.android.libraries.web.webview.p3487i.p3490b;

import android.webkit.CookieManager;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.contrib.p3715k.C47747a;
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

@C69567e(mo61343b = "com.google.android.libraries.web.webview.profile.internal.ProfileManagerImpl$clearCookiesAndStorageOnUiThread$2", mo61344c = "ProfileManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {111})
/* renamed from: com.google.android.libraries.web.webview.i.b.k */
/* compiled from: PG */
final class C44445k extends C69572j implements C69630p {

    /* renamed from: a */
    int f115529a;

    /* renamed from: b */
    final /* synthetic */ CookieManager f115530b;

    /* renamed from: c */
    final /* synthetic */ C44447m f115531c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44445k(CookieManager cookieManager, C44447m mVar, C69577g gVar) {
        super(2, gVar);
        this.f115530b = cookieManager;
        this.f115531c = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44445k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115529a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            CookieManager cookieManager = this.f115530b;
            C44447m mVar = this.f115531c;
            this.f115529a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            cookieManager.removeAllCookies(new C47747a(C47831fm.m85011f(), new C44444j(rVar, mVar, cookieManager)));
            if (rVar.mo61355a() == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44445k(this.f115530b, this.f115531c, gVar);
    }
}
