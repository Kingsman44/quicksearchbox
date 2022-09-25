package com.google.android.libraries.search.rendering.xuikit.p3130c;

import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57711j;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.rendering.xuikit.prefetch.Prefetcher$prefetchFont$putResult$1", mo61344c = "Prefetcher.kt", mo61345d = "invokeSuspend", mo61346e = {67})
/* renamed from: com.google.android.libraries.search.rendering.xuikit.c.aj */
/* compiled from: PG */
public final class C40270aj extends C69572j implements C69626l {

    /* renamed from: a */
    int f105779a;

    /* renamed from: b */
    final /* synthetic */ C40272al f105780b;

    /* renamed from: c */
    final /* synthetic */ C57711j f105781c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40270aj(C40272al alVar, C57711j jVar, C69577g gVar) {
        super(1, gVar);
        this.f105780b = alVar;
        this.f105781c = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C40270aj(this.f105780b, this.f105781c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f105779a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C40272al alVar = this.f105780b;
            String str = this.f105781c.f154183b;
            C69664n.m101060f(str, "resource.url");
            this.f105779a = 1;
            obj = alVar.mo42368a(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
