package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchInitialRequestContext$1$1$userAgent$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.l */
/* compiled from: PG */
final class C119921l extends C69572j implements C69630p {

    /* renamed from: a */
    int f333965a;

    /* renamed from: b */
    final /* synthetic */ C119927r f333966b;

    /* renamed from: c */
    final /* synthetic */ List f333967c;

    /* renamed from: d */
    final /* synthetic */ boolean f333968d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119921l(C119927r rVar, List list, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333966b = rVar;
        this.f333967c = list;
        this.f333968d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119921l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333965a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119927r rVar = this.f333966b;
            List list = this.f333967c;
            boolean z = this.f333968d;
            this.f333965a = 1;
            obj = rVar.mo104568g(list, z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119921l(this.f333966b, this.f333967c, this.f333968d, gVar);
    }
}
