package com.google.android.apps.search.googleapp.googleappbrowser.p10262c;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.googleappbrowser.firstrundataservice.FirstRunSharedDataService$recordFirstRunExperienceOpenedByAnyAccount$2$1", mo61344c = "FirstRunSharedDataService.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.c.aj */
/* compiled from: PG */
final class C135536aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f369221a;

    /* renamed from: b */
    final /* synthetic */ C135538al f369222b;

    /* renamed from: c */
    private /* synthetic */ Object f369223c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135536aj(C135538al alVar, C69577g gVar) {
        super(2, gVar);
        this.f369222b = alVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135536aj) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f369221a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f369222b.f369226a.mo46039a(C135533ag.f369217a, C60826bg.f164896a);
            C69664n.m101060f(a, "firstRunOpenedUpdateFuture");
            C71604be c = C71803m.m105042c((C71422aw) this.f369223c, (C69585o) null, (C71424ay) null, new C135534ah(a, (C69577g) null), 3);
            c.mo62873s(new C135535ai(a));
            this.f369221a = 1;
            obj = c.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C135536aj ajVar = new C135536aj(this.f369222b, gVar);
        ajVar.f369223c = obj;
        return ajVar;
    }
}
