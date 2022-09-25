package com.google.android.libraries.search.assistant.p2783s.p2785b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.UserInfoProvider$getAuthTokens$2$2$1", mo61344c = "UserInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.libraries.search.assistant.s.b.r */
/* compiled from: PG */
final class C36399r extends C69572j implements C69630p {

    /* renamed from: a */
    int f95051a;

    /* renamed from: b */
    final /* synthetic */ C36404w f95052b;

    /* renamed from: c */
    final /* synthetic */ C46108a f95053c;

    /* renamed from: d */
    final /* synthetic */ boolean f95054d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36399r(C36404w wVar, C46108a aVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f95052b = wVar;
        this.f95053c = aVar;
        this.f95054d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36399r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f95051a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36404w wVar = this.f95052b;
            AccountId a = this.f95053c.mo50209a();
            C69664n.m101060f(a, "it.id()");
            boolean z = this.f95054d;
            this.f95051a = 1;
            obj = wVar.mo40158a(a, z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36399r(this.f95052b, this.f95053c, this.f95054d, gVar);
    }
}
