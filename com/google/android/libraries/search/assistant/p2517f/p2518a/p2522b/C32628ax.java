package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2$1", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {118})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ax */
/* compiled from: PG */
final class C32628ax extends C69572j implements C69630p {

    /* renamed from: a */
    int f87433a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87434b;

    /* renamed from: c */
    final /* synthetic */ List f87435c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32628ax(C32636be beVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f87434b = beVar;
        this.f87435c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32628ax) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87433a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32627aw awVar = new C32627aw(this.f87434b, this.f87435c, (C69577g) null);
            this.f87433a = 1;
            if (C71423ax.m104196a(awVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32628ax(this.f87434b, this.f87435c, gVar);
    }
}
