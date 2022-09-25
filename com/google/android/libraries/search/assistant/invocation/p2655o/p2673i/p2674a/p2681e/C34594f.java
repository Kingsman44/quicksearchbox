package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39264an;
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
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.external.ExternalHotwordVerificationClient$verify$1", mo61344c = "ExternalHotwordVerification.kt", mo61345d = "invokeSuspend", mo61346e = {56})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.f */
/* compiled from: PG */
public final class C34594f extends C69572j implements C69630p {

    /* renamed from: a */
    int f91901a;

    /* renamed from: b */
    final /* synthetic */ C39264an f91902b;

    /* renamed from: c */
    final /* synthetic */ C34596h f91903c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34594f(C39264an anVar, C34596h hVar, C69577g gVar) {
        super(2, gVar);
        this.f91902b = anVar;
        this.f91903c = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34594f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91901a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (C34600l e) {
                C59052c cVar = (C59052c) C34597i.f91909a.mo56224b();
                cVar.mo56378ag(C58975e.f156826a, "TRG.HotwordExternal");
                String c = C33914a.m62568c(this.f91902b);
                cVar.mo56379ah(new C59094n(51413));
                cVar.mo56389s("External hotword verification was rejected for params(%s).", c);
                throw e;
            } catch (Throwable th) {
                C59052c cVar2 = (C59052c) C34597i.f91909a.mo56226d();
                cVar2.mo56378ag(C58975e.f156826a, "TRG.HotwordExternal");
                C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
                String c2 = C33914a.m62568c(this.f91902b);
                cVar3.mo56379ah(new C59094n(51414));
                cVar3.mo56389s("External hotword verification failed for params(%s).", c2);
                throw th;
            }
        } else {
            C69714l.m101134b(obj);
            C59052c cVar4 = (C59052c) C34597i.f91909a.mo56224b();
            cVar4.mo56378ag(C58975e.f156826a, "TRG.HotwordExternal");
            String c3 = C33914a.m62568c(this.f91902b);
            cVar4.mo56379ah(new C59094n(51411));
            cVar4.mo56389s("Starting external hotword verification for params(%s).", c3);
            C34596h hVar = this.f91903c;
            C39264an anVar = this.f91902b;
            this.f91901a = 1;
            obj = hVar.mo39445a(anVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C39264an anVar2 = this.f91902b;
        C39260aj ajVar = (C39260aj) obj;
        C59052c cVar5 = (C59052c) C34597i.f91909a.mo56224b();
        cVar5.mo56378ag(C58975e.f156826a, "TRG.HotwordExternal");
        String c4 = C33914a.m62568c(anVar2);
        cVar5.mo56379ah(new C59094n(51412));
        cVar5.mo56389s("External hotword verification passed for params(%s).", c4);
        return ajVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34594f(this.f91902b, this.f91903c, gVar);
    }
}
