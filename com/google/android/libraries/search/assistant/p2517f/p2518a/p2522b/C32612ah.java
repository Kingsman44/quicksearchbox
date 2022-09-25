package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$fetchContextFromSourceAsync$1", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {269})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ah */
/* compiled from: PG */
final class C32612ah extends C69572j implements C69630p {

    /* renamed from: a */
    int f87353a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87354b;

    /* renamed from: c */
    final /* synthetic */ C32785ag f87355c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32612ah(C32636be beVar, C32785ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f87354b = beVar;
        this.f87355c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32612ah) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87353a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32870p pVar = this.f87354b.f87464e;
            C32785ag agVar = this.f87355c;
            this.f87353a = 1;
            obj = pVar.mo38327b(agVar, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32612ah(this.f87354b, this.f87355c, gVar);
    }
}
