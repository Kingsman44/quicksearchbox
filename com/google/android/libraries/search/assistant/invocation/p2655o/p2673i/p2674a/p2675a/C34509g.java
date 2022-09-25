package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b.C120135k;
import com.google.android.libraries.search.assistant.invocation.p2615e.p2616a.C33707a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.AgsaLegacyOnDeviceHotwordConsumerFlowDelegate$special$$inlined$flatMapLatest$1", mo61344c = "AgsaLegacyOnDeviceHotwordConsumer.kt", mo61345d = "invokeSuspend", mo61346e = {218})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.g */
/* compiled from: PG */
public final class C34509g extends C69572j implements C69631q {

    /* renamed from: a */
    int f91718a;

    /* renamed from: b */
    /* synthetic */ Object f91719b;

    /* renamed from: c */
    final /* synthetic */ C33707a f91720c;

    /* renamed from: d */
    final /* synthetic */ C46175b f91721d;

    /* renamed from: e */
    final /* synthetic */ C120135k f91722e;

    /* renamed from: f */
    private /* synthetic */ Object f91723f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34509g(C69577g gVar, C33707a aVar, C120135k kVar, C46175b bVar) {
        super(3, gVar);
        this.f91720c = aVar;
        this.f91722e = kVar;
        this.f91721d = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34509g gVar = new C34509g((C69577g) obj3, this.f91720c, this.f91722e, this.f91721d);
        gVar.f91723f = (C71588o) obj;
        gVar.f91719b = obj2;
        return gVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f91718a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r8 = this.f91723f;
            AccountId accountId = (AccountId) this.f91719b;
            C71587n a = C71546cw.m104399a(this.f91720c.mo39035a(accountId).f90066b, this.f91722e.f334376c, new C34508f(this.f91721d, accountId, (C69577g) null));
            this.f91718a = 1;
            if (C71594u.m104516c(r8, a, this) == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }
}
