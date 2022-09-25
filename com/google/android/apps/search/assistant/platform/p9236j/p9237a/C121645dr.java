package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.Set;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.VisibleActivitiesTracker$shareIn$3", mo61344c = "VisibleActivitiesTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.dr */
/* compiled from: PG */
final class C121645dr extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f337502a;

    public C121645dr(C69577g gVar) {
        super(2, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121645dr) mo5194c((Set) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) C121647dt.f337504a.mo56224b();
        cVar.mo56379ah(new C59094n(35909));
        cVar.mo56389s("Visible activities have been updated: %s.", (Set) this.f337502a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121645dr drVar = new C121645dr(gVar);
        drVar.f337502a = obj;
        return drVar;
    }
}
