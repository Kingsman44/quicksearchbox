package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34234aq;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34554c;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71589p;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.consumer.OnDeviceHotwordConsumerFlowDelegate$special$$inlined$flatMapLatest$1", mo61344c = "OnDeviceHotwordConsumerFlow.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.p */
/* compiled from: PG */
public final class C34580p extends C69572j implements C69631q {

    /* renamed from: a */
    int f91863a;

    /* renamed from: b */
    /* synthetic */ Object f91864b;

    /* renamed from: c */
    final /* synthetic */ C34585u f91865c;

    /* renamed from: d */
    private /* synthetic */ Object f91866d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34580p(C69577g gVar, C34585u uVar) {
        super(3, gVar);
        this.f91865c = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34580p pVar = new C34580p((C69577g) obj3, this.f91865c);
        pVar.f91866d = (C71588o) obj;
        pVar.f91864b = obj2;
        return pVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91863a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r7 = this.f91866d;
            C34234aq aqVar = (C34234aq) this.f91864b;
            if (aqVar == null) {
                nVar = new C71589p((Object) null);
            } else {
                C34585u uVar = this.f91865c;
                C34565a aVar = new C34565a(aqVar.f91084b, (C34554c) aqVar.mo39278a());
                if (aVar.f91838b.f91809b == 1) {
                    nVar = new C71589p(aVar);
                } else {
                    nVar = new C34584t(uVar.f91880b.mo39035a(aVar.f91839c).f90066b, aVar);
                }
            }
            this.f91863a = 1;
            if (C71594u.m104516c(r7, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
