package com.google.android.libraries.search.rendering.xuikit.p3145f.p3156d;

import com.google.frameworks.client.data.android.C61365ag;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.xblend.network.RetryingHttpClient$makeRequest$1", mo61344c = "RetryingHttpClient.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.d.e */
/* compiled from: PG */
final class C40519e extends C69572j implements C69630p {

    /* renamed from: a */
    int f106334a;

    /* renamed from: b */
    final /* synthetic */ C40524j f106335b;

    /* renamed from: c */
    final /* synthetic */ C61365ag f106336c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40519e(C40524j jVar, C61365ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f106335b = jVar;
        this.f106336c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C40519e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f106334a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C40524j jVar = this.f106335b;
            C61365ag agVar = this.f106336c;
            this.f106334a = 1;
            obj = jVar.mo42487b(agVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C40519e(this.f106335b, this.f106336c, gVar);
    }
}
