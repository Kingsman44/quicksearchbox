package com.google.android.libraries.search.assistant.p2486aa.p2487a.p2488a;

import com.google.android.libraries.search.assistant.p2486aa.p2487a.p2489b.C32253a;
import com.google.android.libraries.search.assistant.p2486aa.p2487a.p2489b.C32254b;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32336e;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32337f;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32339h;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32350s;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.p5219a.C66722az;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.api.impl.SpeechBiasingContextAccessorImpl$fetchSpeechBiasingContext$1", mo61344c = "SpeechBiasingContextAccessorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {41})
/* renamed from: com.google.android.libraries.search.assistant.aa.a.a.a */
/* compiled from: PG */
public final class C32249a extends C69572j implements C69630p {

    /* renamed from: a */
    int f86467a;

    /* renamed from: b */
    final /* synthetic */ C32250b f86468b;

    /* renamed from: c */
    final /* synthetic */ C32849cq f86469c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32249a(C32250b bVar, C32849cq cqVar, C69577g gVar) {
        super(2, gVar);
        this.f86468b = bVar;
        this.f86469c = cqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32249a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86467a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32350s sVar = this.f86468b.f86471b;
            C32849cq cqVar = this.f86469c;
            C32336e eVar = (C32336e) C32337f.f86678b.createBuilder();
            C69664n.m101060f(eVar, "newBuilder()");
            C69664n.m101061g(eVar, "builder");
            C69664n.m101061g(cqVar, "value");
            eVar.copyOnWrite();
            cqVar.getClass();
            ((C32337f) eVar.instance).f86680a = cqVar;
            C62942bv build = eVar.build();
            C69664n.m101060f(build, "_builder.build()");
            this.f86467a = 1;
            obj = sVar.mo38045b((C32337f) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C59052c cVar = (C59052c) C32250b.f86470a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String b = C32941s.m60951b(this.f86469c);
        cVar.mo56379ah(new C59094n(52526));
        cVar.mo56389s("fetchSpeechBiasingContext call finished for session token: %s", b);
        C32253a aVar2 = (C32253a) C32254b.f86479c.createBuilder();
        C69664n.m101060f(aVar2, "newBuilder()");
        C69664n.m101061g(aVar2, "builder");
        C66722az azVar = ((C32339h) obj).f86684b;
        if (azVar == null) {
            azVar = C66722az.f181493f;
        }
        C69664n.m101060f(azVar, "response.recognitionContext");
        C69664n.m101061g(azVar, "value");
        aVar2.copyOnWrite();
        C32254b bVar = (C32254b) aVar2.instance;
        azVar.getClass();
        bVar.f86482b = azVar;
        bVar.f86481a |= 1;
        C62942bv build2 = aVar2.build();
        C69664n.m101060f(build2, "_builder.build()");
        return (C32254b) build2;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32249a(this.f86468b, this.f86469c, gVar);
    }
}
