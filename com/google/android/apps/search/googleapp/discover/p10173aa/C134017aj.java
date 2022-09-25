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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$userIsNotInIncognito$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {207})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.aj */
/* compiled from: PG */
final class C134017aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f365050a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365051b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134017aj(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365051b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134017aj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365050a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f365051b.f365055d.mo50251a();
            this.f365050a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134017aj(this.f365051b, gVar);
    }
}
