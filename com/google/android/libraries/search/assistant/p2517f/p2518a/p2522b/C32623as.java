package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2$1$1$1$2", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {125})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.as */
/* compiled from: PG */
final class C32623as extends C69572j implements C69630p {

    /* renamed from: a */
    int f87417a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87418b;

    /* renamed from: c */
    final /* synthetic */ List f87419c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32623as(C32636be beVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f87418b = beVar;
        this.f87419c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32623as) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87417a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32636be beVar = this.f87418b;
            List list = this.f87419c;
            this.f87417a = 1;
            if (beVar.mo38189b(list, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32623as(this.f87418b, this.f87419c, gVar);
    }
}
