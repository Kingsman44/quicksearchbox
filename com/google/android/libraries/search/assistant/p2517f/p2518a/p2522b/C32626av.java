package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2$1$1$3", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {131})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.av */
/* compiled from: PG */
final class C32626av extends C69572j implements C69630p {

    /* renamed from: a */
    int f87427a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87428b;

    /* renamed from: c */
    final /* synthetic */ List f87429c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32626av(C32636be beVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f87428b = beVar;
        this.f87429c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32626av) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87427a != 0) {
            C69714l.m101134b(obj);
            Object obj2 = ((C69702k) obj).f186073a;
        } else {
            C69714l.m101134b(obj);
            C32636be beVar = this.f87428b;
            List list = this.f87429c;
            this.f87427a = 1;
            if (beVar.mo38196j(list, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32626av(this.f87428b, this.f87429c, gVar);
    }
}
