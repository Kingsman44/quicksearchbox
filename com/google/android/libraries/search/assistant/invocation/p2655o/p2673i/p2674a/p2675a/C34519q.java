package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a;

import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.LegacyHotwordConsumerAccountFlowDelegate$flow$1", mo61344c = "LegacyHotwordConsumerAccountFlow.kt", mo61345d = "invokeSuspend", mo61346e = {42, 43, 44})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.q */
/* compiled from: PG */
final class C34519q extends C69572j implements C69626l {

    /* renamed from: a */
    int f91747a;

    /* renamed from: b */
    final /* synthetic */ C34524v f91748b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34519q(C34524v vVar, C69577g gVar) {
        super(1, gVar);
        this.f91748b = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34519q(this.f91748b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91747a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C60870cx b = this.f91748b.f91754a.mo37974b();
            C69664n.m101060f(b, "accountManager.primaryAccountName");
            this.f91747a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            C69714l.m101134b(obj);
        } else if (i != 2) {
            C69714l.m101134b(obj);
            return (AccountId) obj;
        } else {
            C69714l.m101134b(obj);
            return (AccountId) obj;
        }
        C58833ax axVar = (C58833ax) obj;
        String str = axVar != null ? (String) axVar.mo56111f() : null;
        if (str == null) {
            C60870cx a = this.f91748b.f91756c.mo50254a();
            this.f91747a = 2;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
            return (AccountId) obj;
        }
        C60870cx c = this.f91748b.f91755b.mo50216c(str);
        this.f91747a = 3;
        obj = C71663i.m104690c(c, this);
        if (obj == aVar) {
            return aVar;
        }
        return (AccountId) obj;
    }
}
