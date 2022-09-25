package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$1$1$5", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {131})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.f */
/* compiled from: PG */
final class C32739f extends C69572j implements C69630p {

    /* renamed from: a */
    int f87803a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87804b;

    /* renamed from: c */
    final /* synthetic */ C71422aw f87805c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32739f(C32607ac acVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f87804b = acVar;
        this.f87805c = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32739f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69731k q;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87803a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            long incrementAndGet = this.f87804b.f87317h.incrementAndGet();
            C32762o oVar = this.f87804b.f87322m;
            C71587n f = C32870p.m60832f(oVar.f87906a, oVar.mo38285a(incrementAndGet));
            C32712e eVar = new C32712e(this.f87804b);
            this.f87803a = 1;
            if (f.mo38165mp(eVar, this) == aVar) {
                return aVar;
            }
        }
        C69585o lZ = this.f87805c.mo5702lZ();
        C69664n.m101061g(lZ, "<this>");
        C71643cp cpVar = (C71643cp) lZ.get(C71643cp.f191083c);
        if (!(cpVar == null || (q = cpVar.mo62871q()) == null)) {
            Iterator a = q.mo5191a();
            while (a.hasNext()) {
                ((C71643cp) a.next()).mo62723u((CancellationException) null);
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32739f(this.f87804b, this.f87805c, gVar);
    }
}
