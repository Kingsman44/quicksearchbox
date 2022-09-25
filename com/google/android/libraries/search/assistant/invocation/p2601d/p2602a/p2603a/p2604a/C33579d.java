package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2603a.p2604a;

import com.google.android.libraries.search.assistant.invocation.p2597b.C33553a;
import com.google.android.libraries.search.assistant.invocation.p2597b.C33559g;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33595ab;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33603aj;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33616j;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33617k;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33629w;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33630x;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import com.google.protobuf.C62942bv;
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

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.focus.api.impl.AudioFocusReleaserImpl$release$1", mo61344c = "AudioFocusReleaserImpl.kt", mo61345d = "invokeSuspend", mo61346e = {42})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.a.a.d */
/* compiled from: PG */
final class C33579d extends C69572j implements C69630p {

    /* renamed from: a */
    int f89769a;

    /* renamed from: b */
    final /* synthetic */ C33580e f89770b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33579d(C33580e eVar, C69577g gVar) {
        super(2, gVar);
        this.f89770b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33579d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C33617k kVar;
        Throwable th;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89769a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C33580e.f89771a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Releaser");
            C61301b a = C34711b.m63445a(this.f89770b.f89772b);
            cVar.mo56379ah(new C59094n(51229));
            cVar.mo56389s("Releasing the audio focus session with invocation token (%s)...", a);
            C33580e eVar = this.f89770b;
            C33629w wVar = (C33629w) C33630x.f89865b.createBuilder();
            C69664n.m101060f(wVar, "newBuilder()");
            C69664n.m101061g(wVar, "builder");
            C34053bp bpVar = eVar.f89772b;
            C69664n.m101061g(bpVar, "value");
            wVar.copyOnWrite();
            bpVar.getClass();
            ((C33630x) wVar.instance).f89867a = bpVar;
            C62942bv build = wVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C33603aj ajVar = this.f89770b.f89773c;
            this.f89769a = 1;
            obj = ajVar.mo39002b((C33630x) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C33595ab abVar = (C33595ab) obj;
        C33580e eVar2 = this.f89770b;
        if (abVar.f89815a == 2) {
            String str = ((C33617k) abVar.f89816b).f89847b;
            C69664n.m101060f(str, "releaseSessionResponse.exception.msg");
            if (abVar.f89815a == 2) {
                kVar = (C33617k) abVar.f89816b;
            } else {
                kVar = C33617k.f89844c;
            }
            C33616j a2 = C33616j.m62214a(kVar.f89846a);
            if (a2 == null) {
                a2 = C33616j.UNRECOGNIZED;
            }
            int ordinal = a2.ordinal();
            if (ordinal == 1) {
                th = new C33553a(str);
            } else if (ordinal != 2) {
                th = new RuntimeException(str);
            } else {
                th = new C33559g(str);
            }
            if (th instanceof C33553a) {
                C58976aa aaVar = C58975e.f156826a;
                C34711b.m63445a(eVar2.f89772b);
            } else {
                C59052c cVar2 = (C59052c) C33580e.f89771a.mo56226d();
                cVar2.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Releaser");
                C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
                C61301b a3 = C34711b.m63445a(eVar2.f89772b);
                cVar3.mo56379ah(new C59094n(51231));
                cVar3.mo56389s("A failure happened on the internal audio focus service when releasing the audio focus session with invocation token (%s).", a3);
            }
            throw th;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C34711b.m63445a(this.f89770b.f89772b);
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33579d(this.f89770b, gVar);
    }
}
