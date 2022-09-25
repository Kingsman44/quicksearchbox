package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32877w;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.g */
/* compiled from: PG */
public final class C32286g implements C32287h {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f86514a = C59071e.m91331h();

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C32877w wVar;
        C32877w wVar2;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C59052c cVar = (C59052c) f86514a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        if (awVar.f87980a == 6) {
            wVar = (C32877w) awVar.f87981b;
        } else {
            wVar = C32877w.f88108c;
        }
        String str = wVar.f88111b;
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52571));
        cVar.mo56360M("Adding %s with value: %s updates to the ContextUpdate. SessionToken: %s; RequestId: %s", "client-id", str, b, (Object) null);
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        if (awVar.f87980a == 6) {
            wVar2 = (C32877w) awVar.f87981b;
        } else {
            wVar2 = C32877w.f88108c;
        }
        String str2 = wVar2.f88111b;
        C69664n.m101060f(str2, "contextResult.clientIdResult.idOnlyForApprovedUse");
        return C32289j.m60074c(cqVar, empty, true, "client-id", str2);
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C32877w wVar;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        if (awVar.f87980a == 6) {
            wVar = (C32877w) awVar.f87981b;
        } else {
            wVar = C32877w.f88108c;
        }
        String str = wVar.f88111b;
        C69664n.m101060f(str, "contextResult.clientIdResult.idOnlyForApprovedUse");
        if (str.length() > 0) {
            C32289j.m60075d(cqVar, i, true, ayVar, "client-id", str);
            return;
        }
        C59052c cVar = (C59052c) f86514a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52572));
        cVar.mo56352E("ClientId not present. SessionToken: %s; RequestId: %s", b, i);
    }
}
