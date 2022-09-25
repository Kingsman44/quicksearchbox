package com.google.android.libraries.web.weblayer.p3460d.p3461a;

import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.web.weblayer.experiments.internal.WebLayerExperiments$store$1", mo61344c = "WebLayerExperiments.kt", mo61345d = "invokeSuspend", mo61346e = {30})
/* renamed from: com.google.android.libraries.web.weblayer.d.a.c */
/* compiled from: PG */
final class C44220c extends C69572j implements C69626l {

    /* renamed from: a */
    int f115008a;

    /* renamed from: b */
    final /* synthetic */ C44221d f115009b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44220c(C44221d dVar, C69577g gVar) {
        super(1, gVar);
        this.f115009b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C44220c(this.f115009b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f115008a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C44221d dVar = this.f115009b;
            C69585o oVar = dVar.f115010a;
            C44219b bVar = new C44219b(dVar, (C69577g) null);
            this.f115008a = 1;
            obj = C71803m.m105040a(oVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
