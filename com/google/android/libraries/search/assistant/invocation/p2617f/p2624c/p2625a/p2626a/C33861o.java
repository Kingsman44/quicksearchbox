package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.StatusException;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionCallbacksImpl$logGrpcFailuresFuture$1$1", mo61344c = "ApaVoiceInteractionSessionCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {180})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.o */
/* compiled from: PG */
final class C33861o extends C69572j implements C69630p {

    /* renamed from: a */
    int f90365a;

    /* renamed from: b */
    final /* synthetic */ String f90366b;

    /* renamed from: c */
    final /* synthetic */ C69626l f90367c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33861o(String str, C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f90366b = str;
        this.f90367c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33861o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90365a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (StatusException e) {
                C59052c cVar = (C59052c) ((C59052c) C33768ah.f90184a.mo56225c()).mo56382g(e);
                String str = this.f90366b;
                cVar.mo56379ah(new C59094n(51286));
                cVar.mo56389s("%s failed", str);
            }
        } else {
            C69714l.m101134b(obj);
            C59052c cVar2 = (C59052c) C33768ah.f90184a.mo56224b();
            String str2 = this.f90366b;
            cVar2.mo56379ah(new C59094n(51285));
            cVar2.mo56389s("%s", str2);
            C69626l lVar = this.f90367c;
            this.f90365a = 1;
            if (lVar.mo5761a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33861o(this.f90366b, this.f90367c, gVar);
    }
}
