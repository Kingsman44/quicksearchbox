package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$maybeEnqueueEagerPeriodicFeedSync$1", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {139})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.ad */
/* compiled from: PG */
final class C134011ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f365035a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365036b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134011ad(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365036b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134011ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365035a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134018ak akVar = this.f365036b;
            this.f365035a = 1;
            Object a = C71803m.m105040a(akVar.f365061j, new C134013af(akVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134011ad(this.f365036b, gVar);
    }
}
