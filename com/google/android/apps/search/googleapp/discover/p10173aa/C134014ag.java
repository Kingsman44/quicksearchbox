package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.common.util.concurrent.C60870cx;
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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$optOut$1$1", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {165})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.ag */
/* compiled from: PG */
final class C134014ag extends C69572j implements C69630p {

    /* renamed from: a */
    int f365043a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365044b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134014ag(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365044b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134014ag) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365043a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134018ak akVar = this.f365044b;
            C60870cx a = akVar.f365054c.mo50517a(akVar.f365053b, "feed_sync_worker");
            C69664n.m101060f(a, "accountWorkManager.cance…untId, STANDARD_WORK_TAG)");
            this.f365043a = 1;
            if (C71663i.m104690c(a, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134014ag(this.f365044b, gVar);
    }
}
