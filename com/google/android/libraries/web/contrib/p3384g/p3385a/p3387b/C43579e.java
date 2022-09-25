package com.google.android.libraries.web.contrib.p3384g.p3385a.p3387b;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.web.contrib.prewarm.internal.webview.WebViewProfilePrewarmer$prewarmProfileForJava$1", mo61344c = "WebViewProfilePrewarmer.kt", mo61345d = "invokeSuspend", mo61346e = {29})
/* renamed from: com.google.android.libraries.web.contrib.g.a.b.e */
/* compiled from: PG */
final class C43579e extends C69572j implements C69630p {

    /* renamed from: a */
    int f113768a;

    /* renamed from: b */
    final /* synthetic */ C43580f f113769b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43579e(C43580f fVar, C69577g gVar) {
        super(2, gVar);
        this.f113769b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43579e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113768a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C43580f fVar = this.f113769b;
        this.f113768a = 1;
        C60870cx a = fVar.f113770a.mo46627a();
        C69664n.m101060f(a, "webViewPrewarmer.prewarmNativeCode()");
        Object c = C71663i.m104690c(a, this);
        if (c != C69554a.COROUTINE_SUSPENDED) {
            c = C69788q.f186170a;
        }
        if (c == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43579e(this.f113769b, gVar);
    }
}
