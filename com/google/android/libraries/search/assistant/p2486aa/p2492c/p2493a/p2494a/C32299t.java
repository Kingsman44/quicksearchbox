package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62934bn;
import com.google.speech.p5218j.p5219a.C66697aa;
import com.google.speech.p5218j.p5219a.C66708al;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66723b;
import com.google.speech.p5218j.p5219a.C66728be;
import com.google.speech.p5218j.p5219a.C66729bf;
import com.google.speech.p5218j.p5219a.C66735bl;
import com.google.speech.p5218j.p5219a.C66737d;
import com.google.speech.p5218j.p5219a.C66759z;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.t */
/* compiled from: PG */
public final class C32299t implements C32287h {
    @Deprecated

    /* renamed from: a */
    public static final C33476a f86526a;
    @Deprecated

    /* renamed from: b */
    public static final C59071e f86527b = C59071e.m91331h();

    static {
        C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
        C69664n.m101060f(csVar, "newBuilder()");
        f86526a = new C33476a("assistant.api.params.DeviceProperties", C69664n.m101061g(csVar, "builder").mo53567a());
    }

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        String str;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        C66714ar arVar = (C66714ar) C66716at.f181484b.createBuilder();
        C69664n.m101060f(arVar, "newBuilder()");
        C66716at a = C32298s.m60088a(cqVar, empty, arVar, awVar);
        C59052c cVar = (C59052c) f86527b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        if (a.f181486a.size() == 0) {
            str = "Clearing";
        } else {
            str = "Adding " + a.f181486a.size();
        }
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52588));
        cVar.mo56359L("%s locations to the contextUpdate. SessionToken: %s; RequestId: %s", str, b, (Object) null);
        if (a.f181486a.size() > 0) {
            C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
            C69664n.m101060f(alVar, "newBuilder()");
            C66737d a2 = C69664n.m101061g(alVar, "builder");
            C66728be beVar = (C66728be) C66729bf.f181511c.createBuilder();
            C69664n.m101060f(beVar, "newBuilder()");
            C66735bl a3 = C69664n.m101061g(beVar, "builder");
            a3.mo59726b(a);
            a2.mo59730d(a3.mo59725a());
            return a2.mo59727a();
        }
        C66708al alVar2 = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar2, "newBuilder()");
        C66737d a4 = C69664n.m101061g(alVar2, "builder");
        C66759z zVar = (C66759z) C66697aa.f181436b.createBuilder();
        C69664n.m101060f(zVar, "newBuilder()");
        C66723b a5 = C69664n.m101061g(zVar, "builder");
        a5.mo59721b();
        a5.f181501a.mo59737a("latitude");
        a5.mo59721b();
        a5.f181501a.mo59737a("longitude");
        a4.mo59728b(a5.mo59720a());
        return a4.mo59727a();
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        Integer valueOf = Integer.valueOf(i);
        Optional of = Optional.m71637of(valueOf);
        C69664n.m101060f(of, "of(requestId)");
        C66716at atVar = ((C66722az) ayVar.instance).f181497c;
        if (atVar == null) {
            atVar = C66716at.f181484b;
        }
        C62934bn builder = atVar.toBuilder();
        C69664n.m101060f(builder, "recognitionContextBuilder.features.toBuilder()");
        C66716at a = C32298s.m60088a(cqVar, of, (C66714ar) builder, awVar);
        C59052c cVar = (C59052c) f86527b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        Integer valueOf2 = Integer.valueOf(a.f181486a.size());
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52589));
        cVar.mo56359L("Adding %s locations to the ASRRequest. SessionToken: %s; RequestId: %s", valueOf2, b, valueOf);
        ayVar.copyOnWrite();
        C66722az azVar = (C66722az) ayVar.instance;
        a.getClass();
        azVar.f181497c = a;
        azVar.f181495a |= 1;
    }
}
