package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchConversationParamsFromClient$2$2$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {243})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.h */
/* compiled from: PG */
final class C119917h extends C69572j implements C69630p {

    /* renamed from: a */
    int f333948a;

    /* renamed from: b */
    final /* synthetic */ C119927r f333949b;

    /* renamed from: c */
    final /* synthetic */ C32796ar f333950c;

    /* renamed from: d */
    final /* synthetic */ boolean f333951d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119917h(C119927r rVar, C32796ar arVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333949b = rVar;
        this.f333950c = arVar;
        this.f333951d = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119917h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f333948a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C119927r rVar = this.f333949b;
            C32796ar arVar = this.f333950c;
            boolean z = this.f333951d;
            this.f333948a = 1;
            obj = rVar.mo104567f(arVar, z, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C119917h(this.f333949b, this.f333950c, this.f333951d, gVar);
    }
}
