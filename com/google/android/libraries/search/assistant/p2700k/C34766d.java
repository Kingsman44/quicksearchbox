package com.google.android.libraries.search.assistant.p2700k;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.credential.RpcAuthContextModule$authContextOnce$1$1", mo61344c = "RpcAuthContextModule.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.search.assistant.k.d */
/* compiled from: PG */
final class C34766d extends C69572j implements C69630p {

    /* renamed from: a */
    int f92249a;

    /* renamed from: b */
    final /* synthetic */ C46175b f92250b;

    /* renamed from: c */
    final /* synthetic */ AccountId f92251c;

    /* renamed from: d */
    final /* synthetic */ C46128f f92252d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34766d(C46175b bVar, AccountId accountId, C46128f fVar, C69577g gVar) {
        super(2, gVar);
        this.f92250b = bVar;
        this.f92251c = accountId;
        this.f92252d = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34766d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f92249a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C46175b bVar = this.f92250b;
            AccountId accountId = this.f92251c;
            C46128f fVar = this.f92252d;
            this.f92249a = 1;
            obj = C34769g.m63527a(bVar, accountId, fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34766d(this.f92250b, this.f92251c, this.f92252d, gVar);
    }
}
