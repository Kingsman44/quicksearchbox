package com.google.android.libraries.search.assistant.p2783s.p2785b;

import android.telephony.TelephonyManager;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.network.infoproviders.MobileInfoProvider$mobileUserInfo$2$1$telephonyManagerAsync$1", mo61344c = "MobileInfoProvider.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.s.b.l */
/* compiled from: PG */
final class C36393l extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C36395n f95032a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36393l(C36395n nVar, C69577g gVar) {
        super(2, gVar);
        this.f95032a = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36393l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return (TelephonyManager) this.f95032a.f95041a.getSystemService("phone");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36393l(this.f95032a, gVar);
    }
}
