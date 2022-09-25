package com.google.android.libraries.web.weblayer.p3460d.p3461a;

import com.evernote.android.state.BuildConfig;
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

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.experiments.internal.WebLayerExperiments$store$1$1", mo61344c = "WebLayerExperiments.kt", mo61345d = "invokeSuspend", mo61346e = {32})
/* renamed from: com.google.android.libraries.web.weblayer.d.a.b */
/* compiled from: PG */
final class C44219b extends C69572j implements C69630p {

    /* renamed from: a */
    int f115006a;

    /* renamed from: b */
    final /* synthetic */ C44221d f115007b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44219b(C44221d dVar, C69577g gVar) {
        super(2, gVar);
        this.f115007b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C44219b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115006a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f115007b.f115011b.mo47210a() < 101) {
                return BuildConfig.FLAVOR;
            }
            C44221d dVar = this.f115007b;
            this.f115006a = 1;
            C69588r rVar = new C69588r(C69555b.m100961b(this));
            dVar.f115011b.mo47218i(new C44218a(rVar));
            obj = rVar.mo61355a();
            if (obj == aVar) {
                return aVar;
            }
        }
        return (String) obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C44219b(this.f115007b, gVar);
    }
}
