package com.google.android.libraries.web.webview.p3483g.p3484a;

import androidx.p201w.C4372p;
import androidx.p201w.p202a.C4325ab;
import com.evernote.android.state.BuildConfig;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.webview.experiments.internal.WebViewExperiments$store$1$1", mo61344c = "WebViewExperiments.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.web.webview.g.a.a */
/* compiled from: PG */
final class C44409a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C44411c f115449a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44409a(C44411c cVar, C69577g gVar) {
        super(2, gVar);
        this.f115449a = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44409a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return C4325ab.m12423b("GET_VARIATIONS_HEADER") ? C4372p.m12523b() : BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44409a(this.f115449a, gVar);
    }
}
