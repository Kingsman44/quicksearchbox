package com.google.android.libraries.search.assistant.p2783s.p2785b;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.UserInfoProvider$userInfo$2$1$getAuthTokensAsync$1", mo61344c = "UserInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {51})
/* renamed from: com.google.android.libraries.search.assistant.s.b.u */
/* compiled from: PG */
final class C36402u extends C69572j implements C69630p {

    /* renamed from: a */
    int f95062a;

    /* renamed from: b */
    final /* synthetic */ C36404w f95063b;

    /* renamed from: c */
    final /* synthetic */ boolean f95064c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36402u(C36404w wVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f95063b = wVar;
        this.f95064c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36402u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f95062a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36404w wVar = this.f95063b;
            boolean z = this.f95064c;
            this.f95062a = 1;
            obj = C71423ax.m104196a(new C36400s(wVar, z, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36402u(this.f95063b, this.f95064c, gVar);
    }
}
