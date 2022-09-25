package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$enqueueNextPeriodicJobUsingRefreshSchedule$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {80})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.v */
/* compiled from: PG */
final class C134078v extends C69572j implements C69630p {

    /* renamed from: a */
    int f365234a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365235b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134078v(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365235b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134078v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365234a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C134018ak.f365052a.mo56224b();
            Boolean valueOf = Boolean.valueOf(this.f365235b.f365062k.get());
            cVar.mo56379ah(new C59094n(40552));
            cVar.mo56389s("#enqueueNextPeriodicJobUsingRefreshSchedule: running = %b", valueOf);
            C134018ak akVar = this.f365235b;
            this.f365234a = 1;
            if (akVar.mo111521j(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134078v(this.f365235b, gVar);
    }
}
