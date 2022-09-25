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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchInitialRequestContext$1$1$conversationParams$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {100})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.j */
/* compiled from: PG */
final class C119919j extends C69572j implements C69630p {

    /* renamed from: a */
    int f333957a;

    /* renamed from: b */
    final /* synthetic */ C119927r f333958b;

    /* renamed from: c */
    final /* synthetic */ List f333959c;

    /* renamed from: d */
    final /* synthetic */ boolean f333960d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119919j(C119927r rVar, List list, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333958b = rVar;
        this.f333959c = list;
        this.f333960d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119919j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333957a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119927r rVar = this.f333958b;
            List list = this.f333959c;
            boolean z = this.f333960d;
            this.f333957a = 1;
            obj = rVar.mo104565d(list, z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119919j(this.f333958b, this.f333959c, this.f333960d, gVar);
    }
}
