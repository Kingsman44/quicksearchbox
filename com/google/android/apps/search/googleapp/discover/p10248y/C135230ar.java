package com.google.android.apps.search.googleapp.discover.p10248y;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$loadDataSuspend$2$1$2", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {167})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.ar */
/* compiled from: PG */
final class C135230ar extends C69572j implements C69630p {

    /* renamed from: a */
    int f368363a;

    /* renamed from: b */
    final /* synthetic */ C135241bb f368364b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135230ar(C135241bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368364b = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135230ar) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368363a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135241bb bbVar = this.f368364b;
            this.f368363a = 1;
            if (C71423ax.m104196a(new C135236ax(bbVar, (C69577g) null), this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135230ar(this.f368364b, gVar);
    }
}
