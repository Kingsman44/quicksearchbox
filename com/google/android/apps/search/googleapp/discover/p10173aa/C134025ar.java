package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncTracker$getDebuggableFeatureSuspend$2", mo61344c = "FeedSyncTracker.kt", mo61345d = "invokeSuspend", mo61346e = {125})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.ar */
/* compiled from: PG */
final class C134025ar extends C69572j implements C69630p {

    /* renamed from: a */
    int f365076a;

    /* renamed from: b */
    final /* synthetic */ C134029av f365077b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134025ar(C134029av avVar, C69577g gVar) {
        super(2, gVar);
        this.f365077b = avVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134025ar) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365076a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx d = this.f365077b.f365085b.mo46042d();
            C69664n.m101060f(d, "dataStore.data");
            this.f365076a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C134036bb bbVar = (C134036bb) obj;
        C134284d dVar = new C134284d();
        C62971cq cqVar = bbVar.f365097a;
        C69664n.m101060f(cqVar, "data.enqueuedSyncDataList");
        C134268c.m217847b(C134029av.m217409e("previouslyEnqueuedTasks", cqVar), dVar);
        C62971cq cqVar2 = bbVar.f365098b;
        C69664n.m101060f(cqVar2, "data.startedSyncDataList");
        C134268c.m217847b(C134029av.m217409e("previouslyStartedTasks", cqVar2), dVar);
        C62971cq cqVar3 = bbVar.f365099c;
        C69664n.m101060f(cqVar3, "data.finishedSyncDataList");
        C134268c.m217847b(C134029av.m217409e("previouslyFinishedTasks", cqVar3), dVar);
        return C134268c.m217846a("FeedSyncTracker", dVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134025ar(this.f365077b, gVar);
    }
}
