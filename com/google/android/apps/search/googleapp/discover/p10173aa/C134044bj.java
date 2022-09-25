package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$markTaskAsFinishedAndEnqueueNextTask$1", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {155})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bj */
/* compiled from: PG */
final class C134044bj extends C69572j implements C69630p {

    /* renamed from: a */
    int f365116a;

    /* renamed from: b */
    final /* synthetic */ C134053bs f365117b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134044bj(C134053bs bsVar, C69577g gVar) {
        super(2, gVar);
        this.f365117b = bsVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134044bj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365116a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134074r rVar = this.f365117b.f365148g;
            this.f365116a = 1;
            if (rVar.mo111513b(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134044bj(this.f365117b, gVar);
    }
}
