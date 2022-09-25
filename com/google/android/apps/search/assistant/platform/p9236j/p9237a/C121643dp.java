package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.VisibleActivitiesTracker$shareIn$1", mo61344c = "VisibleActivitiesTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.dp */
/* compiled from: PG */
final class C121643dp extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C121647dt f337500a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121643dp(C121647dt dtVar, C69577g gVar) {
        super(2, gVar);
        this.f337500a = dtVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121643dp) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C121647dt.f337504a.mo56224b();
        String c = C33914a.m62568c(this.f337500a.f337505b);
        cVar.mo56379ah(new C59094n(35907));
        cVar.mo56389s("Subscribing for activities updates in %s.", c);
        C121647dt dtVar = this.f337500a;
        dtVar.f337505b.registerVisibleActivityCallback(dtVar.f337510g, dtVar.f337508e);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121643dp(this.f337500a, gVar);
    }
}
