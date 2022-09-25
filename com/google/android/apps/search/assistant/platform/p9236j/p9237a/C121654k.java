package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.utils.ParcelableList;
import com.google.common.p4522b.C58485gu;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61541e;
import com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g;
import com.google.p4238bo.p4239a.p4240a.p4241a.C56125i;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5526f.C70736b;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.directactions.ApaDirectActionsBackendImpl$requestDirectActions$1", mo61344c = "ApaDirectActionsBackendImpl.kt", mo61345d = "invokeSuspend", mo61346e = {61, 62})
/* renamed from: com.google.android.apps.search.assistant.platform.j.a.k */
/* compiled from: PG */
final class C121654k extends C69572j implements C69630p {

    /* renamed from: a */
    Object f337533a;

    /* renamed from: b */
    int f337534b;

    /* renamed from: c */
    final /* synthetic */ C121655l f337535c;

    /* renamed from: d */
    final /* synthetic */ String f337536d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121654k(C121655l lVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f337535c = lVar;
        this.f337536d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C121654k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f337534b;
        if (i == 0) {
            C69714l.m101134b(obj);
            C121655l lVar = this.f337535c;
            this.f337533a = lVar;
            this.f337534b = 1;
            obj = lVar.mo105282g(this);
            obj2 = lVar;
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            C61541e eVar = C121596bw.f337378c;
            C69664n.m101060f(eVar, "DIRECT_ACTION_LIST_KEYS");
            C58485gu guVar = ((ParcelableList) C61543g.m94279f((C56125i) obj, eVar)).f92135a;
            C69664n.m101060f(guVar, "activityId: String\n  ): …T_KEYS)\n        .toList()");
            return guVar;
        } else {
            Object obj3 = this.f337533a;
            C69714l.m101134b(obj);
            obj2 = obj3;
        }
        C121653j jVar = new C121653j(this.f337536d, (C69577g) null);
        this.f337533a = null;
        this.f337534b = 2;
        obj = ((C121655l) obj2).mo105281f((C70736b) obj, jVar, this);
        if (obj == aVar) {
            return aVar;
        }
        C61541e eVar2 = C121596bw.f337378c;
        C69664n.m101060f(eVar2, "DIRECT_ACTION_LIST_KEYS");
        C58485gu guVar2 = ((ParcelableList) C61543g.m94279f((C56125i) obj, eVar2)).f92135a;
        C69664n.m101060f(guVar2, "activityId: String\n  ): …T_KEYS)\n        .toList()");
        return guVar2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C121654k(this.f337535c, this.f337536d, gVar);
    }
}
