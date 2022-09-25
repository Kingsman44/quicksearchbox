package com.google.android.libraries.search.assistant.p2486aa.p2487a.p2488a;

import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32340i;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32341j;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32343l;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32350s;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.api.impl.SpeechBiasingContextClientManagerImpl$registerSpeechBiasingContextSession$1", mo61344c = "SpeechBiasingContextClientManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {30})
/* renamed from: com.google.android.libraries.search.assistant.aa.a.a.c */
/* compiled from: PG */
public final class C32251c extends C69572j implements C69630p {

    /* renamed from: a */
    int f86473a;

    /* renamed from: b */
    final /* synthetic */ C32252d f86474b;

    /* renamed from: c */
    final /* synthetic */ C32849cq f86475c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32251c(C32252d dVar, C32849cq cqVar, C69577g gVar) {
        super(2, gVar);
        this.f86474b = dVar;
        this.f86475c = cqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32251c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86473a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32350s sVar = this.f86474b.f86477b;
            C32849cq cqVar = this.f86475c;
            C32340i iVar = (C32340i) C32341j.f86686b.createBuilder();
            C69664n.m101060f(iVar, "newBuilder()");
            C69664n.m101061g(iVar, "builder");
            C69664n.m101061g(cqVar, "value");
            iVar.copyOnWrite();
            cqVar.getClass();
            ((C32341j) iVar.instance).f86688a = cqVar;
            C62942bv build = iVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f86473a = 1;
            obj = sVar.mo38046c((C32341j) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C32343l lVar = (C32343l) obj;
        C59052c cVar = (C59052c) C32252d.f86476a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        C63088z zVar = this.f86475c.f88062b;
        cVar.mo56379ah(new C59094n(52529));
        cVar.mo56389s("registerSpeechBiasingContextSession call finished for session token: %s", zVar);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32251c(this.f86474b, this.f86475c, gVar);
    }
}
