package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import java.util.Set;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69514bd;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.VisibleActivitiesTracker$onForegroundActivityUpdated$1$1$subscription$2", mo61344c = "VisibleActivitiesTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.dk */
/* compiled from: PG */
final class C121638dk extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f337488a;

    /* renamed from: b */
    final /* synthetic */ C33884b f337489b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121638dk(C33884b bVar, C69577g gVar) {
        super(2, gVar);
        this.f337489b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121638dk) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C69685i iVar = (C69685i) this.f337488a;
        Set set = (Set) iVar.f186052a;
        Set set2 = (Set) iVar.f186053b;
        for (String a : C69514bd.m100889c(set, set2)) {
            this.f337489b.mo39111a(a);
        }
        for (String b : C69514bd.m100889c(set2, set)) {
            this.f337489b.mo39112b(b);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C121638dk dkVar = new C121638dk(this.f337489b, gVar);
        dkVar.f337488a = obj;
        return dkVar;
    }
}
