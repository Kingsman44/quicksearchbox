package com.google.android.libraries.web.webview.p3478d.p3479a;

import com.google.android.libraries.web.webview.p3480e.C44407f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.browser.internal.WVCoreBrowserModel$1", mo61344c = "WVCoreBrowserModel.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.libraries.web.webview.d.a.a */
/* compiled from: PG */
final class C44395a extends C69572j implements C69630p {

    /* renamed from: a */
    int f115408a;

    /* renamed from: b */
    final /* synthetic */ C44407f f115409b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44395a(C44407f fVar, C69577g gVar) {
        super(2, gVar);
        this.f115409b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44395a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115408a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44407f fVar = this.f115409b;
            this.f115408a = 1;
            Object a = fVar.f115446e.mo5761a(this);
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
        return new C44395a(this.f115409b, gVar);
    }
}
