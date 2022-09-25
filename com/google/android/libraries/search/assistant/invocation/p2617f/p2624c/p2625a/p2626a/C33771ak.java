package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.core.voiceinteraction.session.callbacks.ApaVoiceInteractionSessionServiceCallbacksImpl$logGrpcFailuresFuture$1", mo61344c = "ApaVoiceInteractionSessionServiceCallbacksImpl.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.ak */
/* compiled from: PG */
public final class C33771ak extends C69572j implements C69630p {

    /* renamed from: a */
    int f90201a;

    /* renamed from: b */
    final /* synthetic */ String f90202b = "onSessionProcessDied";

    /* renamed from: c */
    final /* synthetic */ C69626l f90203c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33771ak(C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f90203c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33771ak) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90201a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (StatusException e) {
                C59052c cVar = (C59052c) C33775ao.f90214a.mo56225c();
                cVar.mo56378ag(C58975e.f156826a, "VIS.ServiceCallbacks");
                C59052c cVar2 = (C59052c) cVar.mo56382g(e);
                String str = this.f90202b;
                cVar2.mo56379ah(new C59094n(51294));
                cVar2.mo56389s("%s failed", str);
            }
        } else {
            C69714l.m101134b(obj);
            C59052c cVar3 = (C59052c) C33775ao.f90214a.mo56224b();
            cVar3.mo56378ag(C58975e.f156826a, "VIS.ServiceCallbacks");
            String str2 = this.f90202b;
            cVar3.mo56379ah(new C59094n(51293));
            cVar3.mo56389s("%s", str2);
            C69626l lVar = this.f90203c;
            this.f90201a = 1;
            if (lVar.mo5761a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33771ak(this.f90203c, gVar);
    }
}
