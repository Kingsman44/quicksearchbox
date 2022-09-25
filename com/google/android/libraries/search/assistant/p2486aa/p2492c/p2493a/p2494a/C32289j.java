package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63088z;
import com.google.protobuf.p4746a.C62883b;
import com.google.speech.p5218j.p5219a.C66697aa;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66699ac;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66701ae;
import com.google.speech.p5218j.p5219a.C66702af;
import com.google.speech.p5218j.p5219a.C66707ak;
import com.google.speech.p5218j.p5219a.C66708al;
import com.google.speech.p5218j.p5219a.C66709am;
import com.google.speech.p5218j.p5219a.C66712ap;
import com.google.speech.p5218j.p5219a.C66713aq;
import com.google.speech.p5218j.p5219a.C66714ar;
import com.google.speech.p5218j.p5219a.C66716at;
import com.google.speech.p5218j.p5219a.C66717au;
import com.google.speech.p5218j.p5219a.C66718av;
import com.google.speech.p5218j.p5219a.C66721ay;
import com.google.speech.p5218j.p5219a.C66722az;
import com.google.speech.p5218j.p5219a.C66723b;
import com.google.speech.p5218j.p5219a.C66728be;
import com.google.speech.p5218j.p5219a.C66729bf;
import com.google.speech.p5218j.p5219a.C66735bl;
import com.google.speech.p5218j.p5219a.C66737d;
import com.google.speech.p5218j.p5219a.C66741h;
import com.google.speech.p5218j.p5219a.C66753t;
import com.google.speech.p5218j.p5219a.C66754u;
import com.google.speech.p5218j.p5219a.C66759z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.a.j */
/* compiled from: PG */
public final class C32289j {

    /* renamed from: a */
    private static final C59071e f86520a = C59071e.m91331h();

    /* renamed from: a */
    public static final C66707ak m60072a(String str, String str2, Iterable iterable) {
        C69664n.m101061g(iterable, "values");
        C66699ac acVar = (C66699ac) C66700ad.f181439d.createBuilder();
        C69664n.m101060f(acVar, "newBuilder()");
        C69664n.m101061g(acVar, "builder");
        acVar.copyOnWrite();
        C66700ad adVar = (C66700ad) acVar.instance;
        adVar.f181441a |= 1;
        adVar.f181442b = str2;
        List unmodifiableList = Collections.unmodifiableList(adVar.f181443c);
        C69664n.m101060f(unmodifiableList, "_builder.getInstanceList()");
        new C62883b(unmodifiableList);
        ArrayList arrayList = new ArrayList(C69540x.m100804k(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            C66701ae aeVar = (C66701ae) C66702af.f181445c.createBuilder();
            C69664n.m101060f(aeVar, "newBuilder()");
            C69664n.m101061g(aeVar, "builder");
            C69664n.m101061g(str3, "value");
            aeVar.copyOnWrite();
            C66702af afVar = (C66702af) aeVar.instance;
            str3.getClass();
            afVar.f181447a |= 1;
            afVar.f181448b = str3;
            C62942bv build = aeVar.build();
            C69664n.m101060f(build, "_builder.build()");
            arrayList.add((C66702af) build);
        }
        acVar.copyOnWrite();
        C66700ad adVar2 = (C66700ad) acVar.instance;
        adVar2.mo59709a();
        C62947c.addAll((Iterable) arrayList, (List) adVar2.f181443c);
        C62942bv build2 = acVar.build();
        C69664n.m101060f(build2, "_builder.build()");
        C66700ad adVar3 = (C66700ad) build2;
        C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
        C69664n.m101060f(abVar, "newBuilder()");
        C69664n.m101061g(abVar, "builder");
        abVar.copyOnWrite();
        C66707ak akVar = (C66707ak) abVar.instance;
        akVar.f181460a |= 1;
        akVar.f181463d = str;
        C69664n.m101061g(adVar3, "value");
        abVar.copyOnWrite();
        C66707ak akVar2 = (C66707ak) abVar.instance;
        adVar3.getClass();
        akVar2.f181462c = adVar3;
        akVar2.f181461b = 3;
        C62942bv build3 = abVar.build();
        C69664n.m101060f(build3, "_builder.build()");
        return (C66707ak) build3;
    }

    /* renamed from: b */
    public static final C66709am m60073b(String str) {
        C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C66737d a = C69664n.m101061g(alVar, "builder");
        C66759z zVar = (C66759z) C66697aa.f181436b.createBuilder();
        C69664n.m101060f(zVar, "newBuilder()");
        C66723b a2 = C69664n.m101061g(zVar, "builder");
        a2.mo59721b();
        a2.f181501a.mo59737a(str);
        a.mo59728b(a2.mo59720a());
        return a.mo59727a();
    }

    /* renamed from: c */
    public static final C66709am m60074c(C32849cq cqVar, Optional optional, boolean z, String str, String str2) {
        String str3;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(optional, "requestId");
        C69664n.m101061g(str2, "value");
        C59052c cVar = (C59052c) f86520a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        if (z) {
            str3 = str + " with value:" + str2;
        } else {
            str3 = str;
        }
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52575));
        cVar.mo56359L("Adding feature %s to the contextUpdate. SessionToken: %s; RequestId: %s", str3, b, optional);
        C66714ar arVar = (C66714ar) C66716at.f181484b.createBuilder();
        C69664n.m101060f(arVar, "newBuilder()");
        m60077f(arVar, str, str2);
        C66708al alVar = (C66708al) C66709am.f181465g.createBuilder();
        C69664n.m101060f(alVar, "newBuilder()");
        C66737d a = C69664n.m101061g(alVar, "builder");
        C66728be beVar = (C66728be) C66729bf.f181511c.createBuilder();
        C69664n.m101060f(beVar, "newBuilder()");
        C66735bl a2 = C69664n.m101061g(beVar, "builder");
        C62942bv build = arVar.build();
        C69664n.m101060f(build, "featuresBuilder.build()");
        a2.mo59726b((C66716at) build);
        a.mo59730d(a2.mo59725a());
        return a.mo59727a();
    }

    /* renamed from: d */
    public static final void m60075d(C32849cq cqVar, int i, boolean z, C66721ay ayVar, String str, String... strArr) {
        String str2;
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(ayVar, "recognitionContextBuilder");
        C69664n.m101061g(strArr, "values");
        C59052c cVar = (C59052c) f86520a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        if (z) {
            String arrays = Arrays.toString(strArr);
            C69664n.m101060f(arrays, "toString(this)");
            str2 = str + " with value " + arrays;
        } else {
            str2 = str;
        }
        String b = C32941s.m60951b(cqVar);
        Integer valueOf = Integer.valueOf(i);
        cVar.mo56379ah(new C59094n(52576));
        cVar.mo56359L("Adding feature %s to the ASRRequest. SessionToken: %s; RequestId: %s.", str2, b, valueOf);
        C66716at atVar = ((C66722az) ayVar.instance).f181497c;
        if (atVar == null) {
            atVar = C66716at.f181484b;
        }
        C62934bn builder = atVar.toBuilder();
        C69664n.m101060f(builder, "recognitionContextBuilder.features.toBuilder()");
        C66716at f = m60077f((C66714ar) builder, str, (String[]) Arrays.copyOf(strArr, strArr.length));
        ayVar.copyOnWrite();
        C66722az azVar = (C66722az) ayVar.instance;
        f.getClass();
        azVar.f181497c = f;
        azVar.f181495a |= 1;
    }

    /* renamed from: e */
    public static final void m60076e(C66714ar arVar, String str, float f) {
        C69664n.m101061g(arVar, "features");
        C66712ap apVar = (C66712ap) C66713aq.f181479c.createBuilder();
        C69664n.m101060f(apVar, "newBuilder()");
        C66741h a = C69664n.m101061g(apVar, "builder");
        C66717au auVar = (C66717au) C66718av.f181487b.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C69664n.m101061g(auVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C66718av) auVar.instance).f181489a);
        C69664n.m101060f(unmodifiableList, "_builder.getValueList()");
        new C62883b(unmodifiableList);
        auVar.mo59715a(f);
        C62942bv build = auVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C66718av avVar = (C66718av) build;
        C69664n.m101061g(avVar, "value");
        C66712ap apVar2 = a.f181524a;
        apVar2.copyOnWrite();
        C66713aq aqVar = (C66713aq) apVar2.instance;
        avVar.getClass();
        aqVar.f181482b = avVar;
        aqVar.f181481a = 2;
        arVar.mo59713b(str, a.mo59733a());
        C62942bv build2 = arVar.build();
        C69664n.m101060f(build2, "features.build()");
        C66716at atVar = (C66716at) build2;
    }

    /* renamed from: f */
    private static final C66716at m60077f(C66714ar arVar, String str, String... strArr) {
        C66712ap apVar = (C66712ap) C66713aq.f181479c.createBuilder();
        C69664n.m101060f(apVar, "newBuilder()");
        C66741h a = C69664n.m101061g(apVar, "builder");
        C66753t tVar = (C66753t) C66754u.f181563b.createBuilder();
        C69664n.m101060f(tVar, "newBuilder()");
        C69664n.m101061g(tVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C66754u) tVar.instance).f181565a);
        C69664n.m101060f(unmodifiableList, "_builder.getValueList()");
        new C62883b(unmodifiableList);
        ArrayList arrayList = new ArrayList(r3);
        for (String E : strArr) {
            arrayList.add(C63088z.m96143E(E));
        }
        tVar.mo59734a(arrayList);
        C62942bv build = tVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C66754u uVar = (C66754u) build;
        C69664n.m101061g(uVar, "value");
        C66712ap apVar2 = a.f181524a;
        apVar2.copyOnWrite();
        C66713aq aqVar = (C66713aq) apVar2.instance;
        uVar.getClass();
        aqVar.f181482b = uVar;
        aqVar.f181481a = 1;
        arVar.mo59713b(str, a.mo59733a());
        C62942bv build2 = arVar.build();
        C69664n.m101060f(build2, "features.build()");
        return (C66716at) build2;
    }
}
