package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.p5219a.C66708al;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66726bc;
import com.google.speech.p5218j.p5219a.C66727bd;
import com.google.speech.p5218j.p5219a.C66733bj;
import com.google.speech.p5218j.p5219a.C66737d;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.aq */
/* compiled from: PG */
public final class C32280aq implements C32287h {

    /* renamed from: a */
    public static final C33476a f86505a = new C33476a("assistant.api.params.TopContactParams", C51609oa.f134502b);

    /* renamed from: b */
    public static final C59071e f86506b = C59071e.m91331h();

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        C51606ny b = C32279ap.m60057b(cqVar, empty, awVar);
        if (b == null) {
            b = C51606ny.f134497d;
            C69664n.m101060f(b, "getDefaultInstance()");
        }
        C59052c cVar = (C59052c) f86506b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        Integer valueOf = Integer.valueOf(b.f134500b.size());
        String b2 = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52597));
        cVar.mo56359L("Adding %s top contacts to the ContextUpdate. SessionToken: %s; RequestId: %s", valueOf, b2, (Object) null);
        C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C66737d a = C69664n.m101061g(alVar, "builder");
        C66726bc bcVar = (C66726bc) C66727bd.f181507b.createBuilder();
        C69664n.m101060f(bcVar, "newBuilder()");
        C66733bj a2 = C69664n.m101061g(bcVar, "builder");
        a2.mo59724c();
        a2.mo59723b(C32279ap.m60056a(b));
        a.mo59729c(a2.mo59722a());
        return a.mo59727a();
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        Object obj;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        Integer valueOf = Integer.valueOf(i);
        Optional of = Optional.m71637of(valueOf);
        C69664n.m101060f(of, "of(requestId)");
        C51606ny b = C32279ap.m60057b(cqVar, of, awVar);
        C59052c cVar = (C59052c) f86506b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        if (b == null) {
            obj = "no";
        } else {
            obj = Integer.valueOf(b.f134500b.size());
        }
        String b2 = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52598));
        cVar.mo56359L("Adding %s top contacts to the ASRRequest. SessionToken: %s; RequestId: %s", obj, b2, valueOf);
        if (b != null) {
            ayVar.mo59718c(C32279ap.m60056a(b));
        }
    }
}
