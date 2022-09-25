package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51593nl;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.ao */
/* compiled from: PG */
public final class C32278ao implements C32287h {
    @Deprecated

    /* renamed from: a */
    public static final C33476a f86503a;
    @Deprecated

    /* renamed from: b */
    public static final C59071e f86504b = C59071e.m91331h();

    static {
        C51593nl nlVar = (C51593nl) C51594nm.f134474f.createBuilder();
        C69664n.m101060f(nlVar, "newBuilder()");
        C69664n.m101061g(nlVar, "builder");
        C62942bv build = nlVar.build();
        C69664n.m101060f(build, "_builder.build()");
        f86503a = new C33476a("assistant.api.params.TimerParams", (C51594nm) build);
    }

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        if (C32277an.m60053a(cqVar, empty, awVar)) {
            Optional empty2 = Optional.empty();
            C69664n.m101060f(empty2, "empty()");
            return C32289j.m60074c(cqVar, empty2, true, "timer-status", "FIRING");
        }
        C59052c cVar = (C59052c) f86504b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52593));
        cVar.mo56354G("Timer not firing. Clearing it from the contextUpdate. SessionToken: %s; RequestId: %s", b, (Object) null);
        return C32289j.m60073b("timer-status");
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        Optional of = Optional.m71637of(Integer.valueOf(i));
        C69664n.m101060f(of, "of(requestId)");
        if (C32277an.m60053a(cqVar, of, awVar)) {
            C32289j.m60075d(cqVar, i, true, ayVar, "timer-status", "FIRING");
            return;
        }
        C59052c cVar = (C59052c) f86504b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52594));
        cVar.mo56352E("Timer not firing. SessionToken: %s; RequestId: %s", b, i);
    }
}
