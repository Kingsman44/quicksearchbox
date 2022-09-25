package com.google.android.libraries.web.webview.p3471a;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.base.p3348b.p3351c.C43246b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.account.WebViewDataOwnershipControllerImpl$claimOwnership$2", mo61344c = "WebViewDataOwnershipControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.libraries.web.webview.a.s */
/* compiled from: PG */
final class C44335s extends C69572j implements C69630p {

    /* renamed from: a */
    int f115288a;

    /* renamed from: b */
    final /* synthetic */ C44342z f115289b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44335s(C44342z zVar, C69577g gVar) {
        super(2, gVar);
        this.f115289b = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44335s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115288a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C43246b bVar = this.f115289b.f115314c;
            C43271v vVar = C43271v.WEB_VIEW;
            C44334r rVar = new C44334r(this.f115289b, (C69577g) null);
            this.f115288a = 1;
            Object a = bVar.mo46329a(C69540x.m100944b(vVar), rVar, this);
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
        return new C44335s(this.f115289b, gVar);
    }
}
