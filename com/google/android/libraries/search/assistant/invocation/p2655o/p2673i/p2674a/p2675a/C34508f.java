package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9058b.C120125a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34553b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34554c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34556e;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34574j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.AgsaLegacyOnDeviceHotwordConsumerFlowDelegate$flow$1$1", mo61344c = "AgsaLegacyOnDeviceHotwordConsumer.kt", mo61345d = "invokeSuspend", mo61346e = {46})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.f */
/* compiled from: PG */
final class C34508f extends C69572j implements C69631q {

    /* renamed from: a */
    int f91713a;

    /* renamed from: b */
    /* synthetic */ Object f91714b;

    /* renamed from: c */
    /* synthetic */ Object f91715c;

    /* renamed from: d */
    final /* synthetic */ C46175b f91716d;

    /* renamed from: e */
    final /* synthetic */ AccountId f91717e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34508f(C46175b bVar, AccountId accountId, C69577g gVar) {
        super(3, gVar);
        this.f91716d = bVar;
        this.f91717e = accountId;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C34508f fVar = new C34508f(this.f91716d, this.f91717e, (C69577g) obj3);
        fVar.f91714b = (String) obj;
        fVar.f91715c = (C120125a) obj2;
        return fVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        boolean z = true;
        if (this.f91713a != 0) {
            obj3 = this.f91715c;
            obj2 = this.f91714b;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            obj2 = this.f91714b;
            Object obj4 = this.f91715c;
            C60870cx c = this.f91716d.mo50246c(this.f91717e);
            C69664n.m101060f(c, "accountDataService.getAccount(accountId)");
            this.f91714b = obj2;
            this.f91715c = obj4;
            this.f91713a = 1;
            Object c2 = C71663i.m104690c(c, this);
            if (c2 == aVar) {
                return aVar;
            }
            obj3 = obj4;
            obj = c2;
        }
        AccountId accountId = this.f91717e;
        String str = ((C46108a) obj).mo50210b().f121165j;
        C69664n.m101060f(str, "account.info().type");
        C34553b bVar = (C34553b) C34554c.f91805e.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        C34556e a = C69664n.m101061g(bVar, "builder");
        a.mo39412b((String) obj2);
        C34554c a2 = a.mo39411a();
        if (obj3 != C120125a.NAVIGATION) {
            z = false;
        }
        return new C34574j(accountId, str, a2, z);
    }
}
