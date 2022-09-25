package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.p5219a.C66708al;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66724ba;
import com.google.speech.p5218j.p5219a.C66725bb;
import com.google.speech.p5218j.p5219a.C66730bg;
import com.google.speech.p5218j.p5219a.C66731bh;
import com.google.speech.p5218j.p5219a.C66737d;
import com.google.speech.p5218j.p5219a.C66739f;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.l */
/* compiled from: PG */
public final class C32291l implements C32287h {

    /* renamed from: a */
    public static final C59071e f86521a = C59071e.m91331h();

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        C52081en a = C32290k.m60078a(cqVar, empty, awVar);
        C59052c cVar = (C59052c) f86521a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String str = a == null ? "No updates for" : "Adding";
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52578));
        cVar.mo56359L("%s DialogStateParams to contextUpdate. SessionToken: %s, RequestId: %s", str, b, (Object) null);
        if (a == null) {
            C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
            C69664n.m101060f(alVar, "newBuilder()");
            return C69664n.m101061g(alVar, "builder").mo59727a();
        }
        C66708al alVar2 = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar2, "newBuilder()");
        C66737d a2 = C69664n.m101061g(alVar2, "builder");
        C66724ba baVar = (C66724ba) C66725bb.f181502c.createBuilder();
        C69664n.m101060f(baVar, "newBuilder()");
        C69664n.m101061g(baVar, "builder");
        C66721ay ayVar = (C66721ay) C66722az.f181493f.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C69664n.m101061g(ayVar, "builder");
        C62940bt btVar = C66731bh.f181516d;
        C69664n.m101060f(btVar, "id");
        C66730bg bgVar = (C66730bg) C66731bh.f181515c.createBuilder();
        C69664n.m101060f(bgVar, "newBuilder()");
        C66739f a3 = C69664n.m101061g(bgVar, "builder");
        a3.mo59732b(a);
        C66731bh a4 = a3.mo59731a();
        C69664n.m101061g(btVar, "extension");
        C69664n.m101061g(a4, "value");
        ayVar.mo58885m(btVar, a4);
        C62942bv build = ayVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C66722az azVar = (C66722az) build;
        C69664n.m101061g(azVar, "value");
        baVar.copyOnWrite();
        C66725bb bbVar = (C66725bb) baVar.instance;
        azVar.getClass();
        bbVar.f181505b = azVar;
        bbVar.f181504a |= 1;
        C62942bv build2 = baVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C66725bb bbVar2 = (C66725bb) build2;
        C69664n.m101061g(bbVar2, "value");
        C66708al alVar3 = a2.f181522a;
        alVar3.copyOnWrite();
        C66709am amVar = (C66709am) alVar3.instance;
        bbVar2.getClass();
        amVar.f181472f = bbVar2;
        amVar.f181471e = 4;
        return a2.mo59727a();
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        Integer valueOf = Integer.valueOf(i);
        Optional of = Optional.m71637of(valueOf);
        C69664n.m101060f(of, "of(requestId)");
        C52081en a = C32290k.m60078a(cqVar, of, awVar);
        C59052c cVar = (C59052c) f86521a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String str = a == null ? "Not adding" : "Adding";
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52579));
        cVar.mo56359L("%s DialogStateParams to the ASRRequest. SessionToken: %s; RequestId: %s", str, b, valueOf);
        if (a != null) {
            C62940bt btVar = C66731bh.f181516d;
            C66730bg bgVar = (C66730bg) C66731bh.f181515c.createBuilder();
            C69664n.m101060f(bgVar, "newBuilder()");
            C66739f a2 = C69664n.m101061g(bgVar, "builder");
            a2.mo59732b(a);
            ayVar.mo58885m(btVar, a2.mo59731a());
        }
    }
}
