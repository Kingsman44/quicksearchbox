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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.streamdataservice.RenderableStreamDataSource$fetchAndStoreData$fetchResult$1", mo61344c = "RenderableStreamDataSource.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.apps.search.googleapp.discover.y.al */
/* compiled from: PG */
final class C135224al extends C69572j implements C69630p {

    /* renamed from: a */
    int f368341a;

    /* renamed from: b */
    final /* synthetic */ C135241bb f368342b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135224al(C135241bb bbVar, C69577g gVar) {
        super(2, gVar);
        this.f368342b = bbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135224al) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368341a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135241bb bbVar = this.f368342b;
            this.f368341a = 1;
            obj = C71423ax.m104196a(new C135225am(bbVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135224al(this.f368342b, gVar);
    }
}
