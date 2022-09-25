package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10245w.p10246a.C135209c;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60866ct;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$commit$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {171})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.i */
/* compiled from: PG */
final class C135189i extends C69572j implements C69630p {

    /* renamed from: a */
    int f368242a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368243b;

    /* renamed from: c */
    final /* synthetic */ C135182c f368244c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135189i(C135200t tVar, C135182c cVar, C69577g gVar) {
        super(2, gVar);
        this.f368243b = tVar;
        this.f368244c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135189i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C47633f fVar;
        C47633f f;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368242a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135200t tVar = this.f368243b;
            C135155b bVar = tVar.f368287a;
            C135182c cVar = this.f368244c;
            C135171bp bpVar = tVar.f368289c;
            C69664n.m101061g(bpVar, "sessionManager");
            if (cVar.f368224c.isEmpty()) {
                fVar = C47633f.m84733g(C60866ct.f164955a);
                C69664n.m101060f(fVar, "from(Futures.immediateVoidFuture())");
            } else {
                synchronized (bVar.f368128b) {
                    if (!bVar.f368130d.remove(cVar)) {
                        f = C47633f.m84733g(C60866ct.f164955a);
                        C69664n.m101060f(f, "from(Futures.immediateVoidFuture())");
                    } else {
                        C134755f fVar2 = cVar.f368223b;
                        String str = bVar.f368129c;
                        C58485gu guVar = cVar.f368224c;
                        C69664n.m101061g(fVar2, "streamStorageKey");
                        C69664n.m101061g(str, "currentSessionId");
                        C69664n.m101061g(guVar, "streamDataOperations");
                        f = C135209c.m219302a(C135209c.m219302a(C71663i.m104692e(bpVar.f368192b, (C71424ay) null, new C135163bh(bpVar, fVar2, str, guVar, (C69577g) null), 3))).mo51514f(Exception.class, C135128a.f368046a, bVar.f368127a);
                    }
                }
                fVar = f;
            }
            this.f368242a = 1;
            obj = C71663i.m104690c(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135189i(this.f368243b, this.f368244c, gVar);
    }
}
