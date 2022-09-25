package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.LegacyExternalHotwordConsumerFlowDelegate$special$$inlined$flatMapLatest$1", mo61344c = "LegacyExternalHotwordConsumer.kt", mo61345d = "invokeSuspend", mo61346e = {216})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.x */
/* compiled from: PG */
public final class C34490x extends C69572j implements C69631q {

    /* renamed from: a */
    int f91657a;

    /* renamed from: b */
    /* synthetic */ Object f91658b;

    /* renamed from: c */
    final /* synthetic */ C34486t f91659c;

    /* renamed from: d */
    private /* synthetic */ Object f91660d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34490x(C69577g gVar, C34486t tVar) {
        super(3, gVar);
        this.f91659c = tVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34490x xVar = new C34490x((C69577g) obj3, this.f91659c);
        xVar.f91660d = (C71588o) obj;
        xVar.f91658b = obj2;
        return xVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71587n nVar;
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91657a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r4 = this.f91660d;
            if (((Boolean) this.f91658b).booleanValue()) {
                nVar = this.f91659c;
            } else {
                nVar = new C71589p((Object) null);
            }
            this.f91657a = 1;
            if (C71594u.m104516c(r4, nVar, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
