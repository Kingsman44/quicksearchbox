package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33707a;
import com.google.apps.tiktok.account.AccountId;
import kotlinx.coroutines.p5574b.C71546cw;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.LegacyExternalHotwordConsumerConfigurationFlowDelegate$special$$inlined$flatMapLatest$1", mo61344c = "LegacyExternalHotwordConsumer.kt", mo61345d = "invokeSuspend", mo61346e = {219})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.v */
/* compiled from: PG */
public final class C34488v extends C69572j implements C69631q {

    /* renamed from: a */
    int f91650a;

    /* renamed from: b */
    /* synthetic */ Object f91651b;

    /* renamed from: c */
    final /* synthetic */ C33707a f91652c;

    /* renamed from: d */
    final /* synthetic */ C34467aj f91653d;

    /* renamed from: e */
    final /* synthetic */ C34484r f91654e;

    /* renamed from: f */
    private /* synthetic */ Object f91655f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34488v(C69577g gVar, C33707a aVar, C34467aj ajVar, C34484r rVar) {
        super(3, gVar);
        this.f91652c = aVar;
        this.f91653d = ajVar;
        this.f91654e = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34488v vVar = new C34488v((C69577g) obj3, this.f91652c, this.f91653d, this.f91654e);
        vVar.f91655f = (C71588o) obj;
        vVar.f91651b = obj2;
        return vVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91650a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r8 = this.f91655f;
            AccountId accountId = (AccountId) this.f91651b;
            C71587n b = C71546cw.m104400b(this.f91652c.mo39035a(accountId).f90066b, this.f91653d.f91584e, this.f91654e.f91638d, new C34487u(accountId, (C69577g) null));
            this.f91650a = 1;
            if (C71594u.m104516c(r8, b, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
