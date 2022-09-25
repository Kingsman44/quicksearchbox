package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.apps.tiktok.account.AccountId;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69632r;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.LegacyExternalHotwordConsumerConfigurationFlowDelegate$flow$1$1", mo61344c = "LegacyExternalHotwordConsumer.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.u */
/* compiled from: PG */
final class C34487u extends C69572j implements C69632r {

    /* renamed from: a */
    /* synthetic */ Object f91646a;

    /* renamed from: b */
    /* synthetic */ Object f91647b;

    /* renamed from: c */
    /* synthetic */ boolean f91648c;

    /* renamed from: d */
    final /* synthetic */ AccountId f91649d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34487u(AccountId accountId, C69577g gVar) {
        super(4, gVar);
        this.f91649d = accountId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C34487u uVar = new C34487u(this.f91649d, (C69577g) obj4);
        uVar.f91646a = (String) obj;
        uVar.f91647b = (C34462ae) obj2;
        uVar.f91648c = booleanValue;
        return uVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f91646a;
        Object obj3 = this.f91647b;
        return new C34485s(this.f91649d, (String) obj2, (C34462ae) obj3, this.f91648c);
    }
}
