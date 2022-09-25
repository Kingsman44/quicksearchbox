package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import kotlinx.coroutines.p5574b.C71506bj;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.consumer.OnDeviceHotwordConsumerFlowDelegate$special$$inlined$flatMapLatest$2", mo61344c = "OnDeviceHotwordConsumerFlow.kt", mo61345d = "invokeSuspend", mo61346e = {219})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.q */
/* compiled from: PG */
public final class C34581q extends C69572j implements C69631q {

    /* renamed from: a */
    int f91867a;

    /* renamed from: b */
    /* synthetic */ Object f91868b;

    /* renamed from: c */
    final /* synthetic */ C34585u f91869c;

    /* renamed from: d */
    final /* synthetic */ C34575k f91870d;

    /* renamed from: e */
    private /* synthetic */ Object f91871e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34581q(C69577g gVar, C34585u uVar, C34575k kVar) {
        super(3, gVar);
        this.f91869c = uVar;
        this.f91870d = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34581q qVar = new C34581q((C69577g) obj3, this.f91869c, this.f91870d);
        qVar.f91871e = (C71588o) obj;
        qVar.f91868b = obj2;
        return qVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91867a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r6 = this.f91871e;
            if (!((Boolean) this.f91868b).booleanValue()) {
                nVar = new C71589p((Object) null);
            } else {
                nVar = C71506bj.m104339e(this.f91869c.f91881c, new C34579o((C69577g) null, this.f91870d));
            }
            this.f91867a = 1;
            if (C71594u.m104516c(r6, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
