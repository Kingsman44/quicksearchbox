package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.WorkerParameters;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$startWork$futureResult$1", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {84})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bn */
/* compiled from: PG */
final class C134048bn extends C69572j implements C69630p {

    /* renamed from: a */
    int f365126a;

    /* renamed from: b */
    final /* synthetic */ C134053bs f365127b;

    /* renamed from: c */
    final /* synthetic */ WorkerParameters f365128c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134048bn(C134053bs bsVar, WorkerParameters workerParameters, C69577g gVar) {
        super(2, gVar);
        this.f365127b = bsVar;
        this.f365128c = workerParameters;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134048bn) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365126a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134053bs bsVar = this.f365127b;
            WorkerParameters workerParameters = this.f365128c;
            this.f365126a = 1;
            obj = C71803m.m105040a(bsVar.f365152k, new C134050bp(workerParameters, bsVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134048bn(this.f365127b, this.f365128c, gVar);
    }
}
