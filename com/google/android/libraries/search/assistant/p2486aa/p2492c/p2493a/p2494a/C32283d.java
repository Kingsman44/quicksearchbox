package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import com.google.speech.p5218j.p5219a.C66708al;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66726bc;
import com.google.speech.p5218j.p5219a.C66727bd;
import com.google.speech.p5218j.p5219a.C66733bj;
import com.google.speech.p5218j.p5219a.C66737d;
import com.google.speech.p5218j.p5219a.C66755v;
import com.google.speech.p5218j.p5219a.C66756w;
import java.util.Collections;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.d */
/* compiled from: PG */
public class C32283d implements C32287h {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f86509a = C59071e.m91331h();

    /* renamed from: b */
    private final String f86510b;

    /* renamed from: c */
    private final String f86511c;

    /* renamed from: d */
    private final String f86512d;

    public C32283d(String str, String str2, String str3) {
        this.f86510b = str;
        this.f86511c = str2;
        this.f86512d = str3;
    }

    /* renamed from: a */
    public final C66709am mo38031a(C32849cq cqVar, C32801aw awVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        List a = C32282c.m60062a(awVar, this.f86512d);
        C59052c cVar = (C59052c) f86509a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String valueOf = !a.isEmpty() ? String.valueOf(a.size()) : "no";
        String str = this.f86510b;
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52567));
        cVar.mo56360M("Adding %s %s to the contextUpdate. SessionToken: %s; RequestId: %s", valueOf, str, b, (Object) null);
        if (a.isEmpty()) {
            C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
            C69664n.m101060f(alVar, "newBuilder()");
            C66737d a2 = C69664n.m101061g(alVar, "builder");
            C66755v vVar = (C66755v) C66756w.f181566b.createBuilder();
            C69664n.m101060f(vVar, "newBuilder()");
            C69664n.m101061g(vVar, "builder");
            List unmodifiableList = Collections.unmodifiableList(((C66756w) vVar.instance).f181568a);
            C69664n.m101060f(unmodifiableList, "_builder.getContextInputNameList()");
            new C62883b(unmodifiableList);
            String str2 = this.f86510b;
            vVar.copyOnWrite();
            C66756w wVar = (C66756w) vVar.instance;
            C62971cq cqVar2 = wVar.f181568a;
            if (!cqVar2.mo58948c()) {
                wVar.f181568a = C62942bv.mutableCopy(cqVar2);
            }
            wVar.f181568a.add(str2);
            C62942bv build = vVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C66756w wVar2 = (C66756w) build;
            C69664n.m101061g(wVar2, "value");
            C66708al alVar2 = a2.f181522a;
            alVar2.copyOnWrite();
            C66709am amVar = (C66709am) alVar2.instance;
            wVar2.getClass();
            amVar.f181468b = wVar2;
            amVar.f181467a = 6;
            return a2.mo59727a();
        }
        C66708al alVar3 = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar3, "newBuilder()");
        C66737d a3 = C69664n.m101061g(alVar3, "builder");
        C66726bc bcVar = (C66726bc) C66727bd.f181507b.createBuilder();
        C69664n.m101060f(bcVar, "newBuilder()");
        C66733bj a4 = C69664n.m101061g(bcVar, "builder");
        a4.mo59724c();
        a4.mo59723b(C32289j.m60072a(this.f86510b, this.f86511c, a));
        a3.mo59729c(a4.mo59722a());
        return a3.mo59727a();
    }

    /* renamed from: b */
    public final void mo38032b(C32849cq cqVar, int i, C32801aw awVar, C66721ay ayVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(awVar, "contextResult");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        List a = C32282c.m60062a(awVar, this.f86512d);
        C59052c cVar = (C59052c) f86509a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String valueOf = !a.isEmpty() ? String.valueOf(a.size()) : "no";
        String str = this.f86510b;
        String b = C32941s.m60951b(cqVar);
        Integer valueOf2 = Integer.valueOf(i);
        cVar.mo56379ah(new C59094n(52568));
        cVar.mo56360M("Adding %s %s to the ASRRequest. SessionToken: %s; RequestId: %s", valueOf, str, b, valueOf2);
        if (!a.isEmpty()) {
            ayVar.mo59718c(C32289j.m60072a(this.f86510b, this.f86511c, a));
        }
    }
}
