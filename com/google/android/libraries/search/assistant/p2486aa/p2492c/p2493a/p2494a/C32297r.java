package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.p5219a.C66697aa;
import com.google.speech.p5218j.p5219a.C66708al;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66723b;
import com.google.speech.p5218j.p5219a.C66726bc;
import com.google.speech.p5218j.p5219a.C66727bd;
import com.google.speech.p5218j.p5219a.C66733bj;
import com.google.speech.p5218j.p5219a.C66737d;
import com.google.speech.p5218j.p5219a.C66759z;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.r */
/* compiled from: PG */
public final class C32297r implements C32287h {
    @Deprecated

    /* renamed from: a */
    public static final C33476a f86524a;
    @Deprecated

    /* renamed from: b */
    public static final C59071e f86525b = C59071e.m91331h();

    static {
        C51714bl blVar = (C51714bl) C51715bm.f135662t.createBuilder();
        C69664n.m101060f(blVar, "newBuilder()");
        f86524a = new C33476a("assistant.api.DeviceCapabilities", C69664n.m101061g(blVar, "builder").mo53859a());
    }

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        String str;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        List b = C32296q.m60085b(cqVar, empty, awVar);
        C59052c cVar = (C59052c) f86525b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        if (b == null || b.isEmpty()) {
            str = "Clearing";
        } else {
            str = "Adding " + b.size();
        }
        String b2 = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52584));
        cVar.mo56359L("%s appNames to the contextUpdate. SessionToken: %s; RequestId: %s", str, b2, (Object) null);
        if (b == null || b.isEmpty()) {
            C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
            C69664n.m101060f(alVar, "newBuilder()");
            C66737d a = C69664n.m101061g(alVar, "builder");
            C66759z zVar = (C66759z) C66697aa.f181436b.createBuilder();
            C69664n.m101060f(zVar, "newBuilder()");
            C66723b a2 = C69664n.m101061g(zVar, "builder");
            a2.mo59721b();
            a2.f181501a.mo59737a("app-names");
            a.mo59728b(a2.mo59720a());
            return a.mo59727a();
        }
        C66708al alVar2 = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar2, "newBuilder()");
        C66737d a3 = C69664n.m101061g(alVar2, "builder");
        C66726bc bcVar = (C66726bc) C66727bd.f181507b.createBuilder();
        C69664n.m101060f(bcVar, "newBuilder()");
        C66733bj a4 = C69664n.m101061g(bcVar, "builder");
        a4.mo59724c();
        a4.mo59723b(C32296q.m60084a(b));
        a3.mo59729c(a4.mo59722a());
        return a3.mo59727a();
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        Integer valueOf = Integer.valueOf(i);
        Optional of = Optional.m71637of(valueOf);
        C69664n.m101060f(of, "of(requestId)");
        List b = C32296q.m60085b(cqVar, of, awVar);
        C59052c cVar = (C59052c) f86525b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String valueOf2 = (b == null || b.isEmpty()) ? "no" : Integer.valueOf(b.size());
        String b2 = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52585));
        cVar.mo56359L("Adding %s appNames to the ASRRequest. SessionToken: %s; RequestId: %s", valueOf2, b2, valueOf);
        if (b != null && !b.isEmpty()) {
            ayVar.mo59718c(C32296q.m60084a(b));
        }
    }
}
