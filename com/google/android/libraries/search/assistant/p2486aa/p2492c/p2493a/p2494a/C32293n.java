package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.n */
/* compiled from: PG */
public final class C32293n implements C32287h {
    @Deprecated

    /* renamed from: a */
    public static final C33476a f86522a;
    @Deprecated

    /* renamed from: b */
    public static final C59071e f86523b = C59071e.m91331h();

    static {
        C51376fk fkVar = (C51376fk) C51379fn.f133814i.createBuilder();
        C69664n.m101060f(fkVar, "newBuilder()");
        f86522a = new C33476a("assistant.api.params.DisplayContextParams", C69664n.m101061g(fkVar, "builder").mo53607a());
    }

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        String a = C32292m.m60081a(cqVar, empty, awVar);
        if (a == null || a.length() == 0) {
            C59052c cVar = (C59052c) f86523b.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32941s.m60951b(cqVar);
            cVar.mo56379ah(new C59094n(52581));
            cVar.mo56359L("ForegroundApp not present. Clearing %s in the contextUpdate. SessionToken: %s; RequestId: %s", "foreground-app", b, (Object) null);
            return C32289j.m60073b("foreground-app");
        }
        Optional empty2 = Optional.empty();
        C69664n.m101060f(empty2, "empty()");
        return C32289j.m60074c(cqVar, empty2, false, "foreground-app", a);
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        Optional of = Optional.m71637of(Integer.valueOf(i));
        C69664n.m101060f(of, "of(requestId)");
        String a = C32292m.m60081a(cqVar, of, awVar);
        if (a == null || a.length() == 0) {
            C59052c cVar = (C59052c) f86523b.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32941s.m60951b(cqVar);
            cVar.mo56379ah(new C59094n(52582));
            cVar.mo56352E("ForegroundApp not present. SessionToken: %s; RequestId: %s", b, i);
            return;
        }
        C32289j.m60075d(cqVar, i, false, ayVar, "foreground-app", a);
    }
}
