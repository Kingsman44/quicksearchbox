package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
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
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.y */
/* compiled from: PG */
public class C32304y implements C32287h {

    /* renamed from: a */
    private static final C59071e f86531a = C59071e.m91331h();

    /* renamed from: b */
    private final String f86532b;

    /* renamed from: c */
    private final String f86533c;

    public C32304y(String str, String str2) {
        this.f86532b = str;
        this.f86533c = str2;
    }

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        List a = C32303x.m60094a(awVar);
        C59052c cVar = (C59052c) f86531a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        Integer valueOf = Integer.valueOf(a.size());
        String str = this.f86532b;
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52590));
        cVar.mo56360M("Adding %s values of %s updates to the contextUpdate. SessionToken: %s; RequestId: %s", valueOf, str, b, (Object) null);
        C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C66737d a2 = C69664n.m101061g(alVar, "builder");
        C66726bc bcVar = (C66726bc) C66727bd.f181507b.createBuilder();
        C69664n.m101060f(bcVar, "newBuilder()");
        C66733bj a3 = C69664n.m101061g(bcVar, "builder");
        a3.mo59724c();
        a3.mo59723b(C32289j.m60072a(this.f86532b, this.f86533c, a));
        a2.mo59729c(a3.mo59722a());
        return a2.mo59727a();
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        List a = C32303x.m60094a(awVar);
        C59052c cVar = (C59052c) f86531a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        Integer valueOf = Integer.valueOf(a.size());
        String str = this.f86532b;
        String b = C32941s.m60951b(cqVar);
        Integer valueOf2 = Integer.valueOf(i);
        cVar.mo56379ah(new C59094n(52591));
        cVar.mo56360M("Adding %s values of %s to the ASRRequest. SessionToken: %s; RequestId: %s", valueOf, str, b, valueOf2);
        if (!a.isEmpty()) {
            ayVar.mo59718c(C32289j.m60072a(this.f86532b, this.f86533c, a));
        }
    }
}
