package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122050j;
import com.google.android.libraries.search.assistant.invocation.p2597b.C33559g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsBackendImpl$getForegroundActivityId$1", mo61344c = "ApaDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {50})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.b */
/* compiled from: PG */
final class C121573b extends C69572j implements C69630p {

    /* renamed from: a */
    int f337334a;

    /* renamed from: b */
    final /* synthetic */ C121655l f337335b;

    /* renamed from: c */
    final /* synthetic */ C34053bp f337336c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121573b(C121655l lVar, C34053bp bpVar, C69577g gVar) {
        super(2, gVar);
        this.f337335b = lVar;
        this.f337336c = bpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121573b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f337334a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C122050j jVar = this.f337335b.f337538b;
            C34053bp bpVar = this.f337336c;
            this.f337334a = 1;
            obj = jVar.mo105521a(bpVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = (String) obj;
        if (str != null) {
            C59052c cVar = (C59052c) C121655l.f337537a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.ApaDirectActBack");
            cVar.mo56379ah(new C59094n(35887));
            cVar.mo56389s("DirectActions#foregroundActivityId activityId=%s", str);
            return str;
        }
        throw new C33559g("Activity id was not provided by system.");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121573b(this.f337335b, this.f337336c, gVar);
    }
}
