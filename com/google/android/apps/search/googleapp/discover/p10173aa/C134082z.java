package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$enqueuePeriodicJobWithRefreshSchedule$2$eligibilityStatus$1", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.z */
/* compiled from: PG */
final class C134082z extends C69572j implements C69630p {

    /* renamed from: a */
    int f365243a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365244b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134082z(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365244b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134082z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365243a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134069m mVar = this.f365244b.f365057f;
            this.f365243a = 1;
            obj = mVar.mo111550a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134082z(this.f365244b, gVar);
    }
}
