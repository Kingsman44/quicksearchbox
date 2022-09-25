package com.google.android.apps.gsa.speech.p7295k.p7297b;

import com.google.android.apps.gsa.contacts.ap;
import com.google.android.apps.gsa.contacts.bz;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.apps.gsa.speech.p7270c.C92221d;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66432l;
import com.google.speech.p5195a.p5196a.C66435o;
import com.google.speech.p5195a.p5196a.C66436p;
import com.google.speech.p5195a.p5196a.C66437q;
import com.google.speech.p5195a.p5196a.C66438r;
import com.google.speech.p5195a.p5196a.C66439s;
import com.google.speech.p5195a.p5196a.C66440t;
import com.google.speech.p5195a.p5196a.C66441u;
import com.google.speech.p5195a.p5196a.C66442v;
import com.google.speech.p5195a.p5196a.C66443w;
import com.google.speech.p5195a.p5196a.C66444x;
import com.google.speech.p5195a.p5196a.C66445y;
import com.google.speech.p5195a.p5196a.C66446z;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67244v;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.speech.k.b.g */
/* compiled from: PG */
public final class C92450g extends C90880an {

    /* renamed from: a */
    private static final C58528ij f257864a = C58528ij.m90012L("logtop-aggregate", "logtop-call", "logtop-text");

    /* renamed from: b */
    private final C67239q f257865b;

    /* renamed from: c */
    private final C90021c f257866c;

    /* renamed from: d */
    private final String f257867d;

    /* renamed from: e */
    private final List f257868e;

    /* renamed from: f */
    private final C92221d f257869f;

    public C92450g(C67244v vVar, C92221d dVar, String str, List list, C90021c cVar) {
        super("S3RecognizerInfoComplet", 1, 0);
        this.f257865b = (C67239q) vVar.toBuilder();
        this.f257869f = dVar;
        this.f257867d = str;
        this.f257868e = list;
        this.f257866c = cVar;
    }

    /* renamed from: d */
    private static final List m151925d(C58881cr crVar, String str) {
        C58976aa aaVar = C58975e.f156826a;
        List list = (List) crVar.mo6453a();
        ArrayList d = C58597ky.m90213d(1);
        if (!list.isEmpty()) {
            C66440t tVar = (C66440t) C66441u.f180652b.createBuilder();
            for (int i = 0; i < list.size(); i++) {
                String str2 = (String) list.get(i);
                C66438r rVar = (C66438r) C66439s.f180648c.createBuilder();
                rVar.copyOnWrite();
                C66439s sVar = (C66439s) rVar.instance;
                str2.getClass();
                sVar.f180650a |= 1;
                sVar.f180651b = str2;
                tVar.copyOnWrite();
                C66441u uVar = (C66441u) tVar.instance;
                C66439s sVar2 = (C66439s) rVar.build();
                sVar2.getClass();
                C62971cq cqVar = uVar.f180654a;
                if (!cqVar.mo58948c()) {
                    uVar.f180654a = C62942bv.mutableCopy(cqVar);
                }
                uVar.f180654a.add(sVar2);
            }
            C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
            cVar.copyOnWrite();
            C66446z zVar = (C66446z) cVar.instance;
            C66441u uVar2 = (C66441u) tVar.build();
            uVar2.getClass();
            zVar.f180669e = uVar2;
            zVar.f180665a |= 16;
            cVar.copyOnWrite();
            C66446z zVar2 = (C66446z) cVar.instance;
            zVar2.f180666b = 0;
            zVar2.f180665a = 1 | zVar2.f180665a;
            cVar.copyOnWrite();
            C66446z zVar3 = (C66446z) cVar.instance;
            str.getClass();
            zVar3.f180665a |= 2;
            zVar3.f180667c = str;
            d.add((C66446z) cVar.build());
        }
        return d;
    }

    /* renamed from: b */
    public final C67244v call() {
        C58976aa aaVar = C58975e.f156826a;
        C67239q qVar = this.f257865b;
        if ((((C67244v) qVar.instance).f182774a & 1) == 0) {
            return (C67244v) qVar.build();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m151925d(this.f257869f.f257112b, "contactdisambig"));
        List<bz> list = this.f257869f.f257111a;
        ArrayList d = C58597ky.m90213d(list.size());
        for (bz bzVar : list) {
            C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
            cVar.copyOnWrite();
            C66446z zVar = (C66446z) cVar.instance;
            zVar.f180666b = 2;
            zVar.f180665a |= 1;
            String str = bzVar.f257119f;
            cVar.copyOnWrite();
            C66446z zVar2 = (C66446z) cVar.instance;
            zVar2.f180665a |= 2;
            zVar2.f180667c = str;
            String str2 = this.f257867d;
            if (str2 != null) {
                cVar.copyOnWrite();
                C66446z zVar3 = (C66446z) cVar.instance;
                zVar3.f180665a |= 8;
                zVar3.f180668d = str2;
            }
            C66444x xVar = (C66444x) C66445y.f180660b.createBuilder();
            if (f257864a.contains(bzVar.f257119f)) {
                List<ap> c = bzVar.c();
                if (!c.isEmpty()) {
                    for (ap apVar : c) {
                        C66442v vVar = (C66442v) C66443w.f180655d.createBuilder();
                        String str3 = apVar.c;
                        vVar.copyOnWrite();
                        C66443w wVar = (C66443w) vVar.instance;
                        str3.getClass();
                        wVar.f180657a |= 1;
                        wVar.f180658b = str3;
                        double d2 = apVar.d;
                        vVar.copyOnWrite();
                        C66443w wVar2 = (C66443w) vVar.instance;
                        wVar2.f180657a |= 2;
                        wVar2.f180659c = (float) d2;
                        xVar.mo59630a(vVar);
                    }
                }
            } else {
                List<String> a = bzVar.mo70789a();
                if (a != null && !a.isEmpty()) {
                    for (String str4 : a) {
                        C66442v vVar2 = (C66442v) C66443w.f180655d.createBuilder();
                        vVar2.copyOnWrite();
                        C66443w wVar3 = (C66443w) vVar2.instance;
                        str4.getClass();
                        wVar3.f180657a |= 1;
                        wVar3.f180658b = str4;
                        xVar.mo59630a(vVar2);
                    }
                }
            }
            cVar.copyOnWrite();
            C66446z zVar4 = (C66446z) cVar.instance;
            C66445y yVar = (C66445y) xVar.build();
            yVar.getClass();
            zVar4.f180670f = yVar;
            zVar4.f180665a |= 64;
            d.add((C66446z) cVar.build());
        }
        arrayList.addAll(d);
        arrayList.addAll(m151925d(this.f257869f.f257113c, "handsfree"));
        List list2 = (List) this.f257869f.f257114d.mo6453a();
        ArrayList d3 = C58597ky.m90213d(1);
        if (!list2.isEmpty()) {
            C66436p pVar = (C66436p) C66437q.f180645b.createBuilder();
            for (int i = 0; i < list2.size(); i++) {
                String str5 = (String) list2.get(i);
                C66432l lVar = (C66432l) C66435o.f180640d.createBuilder();
                lVar.copyOnWrite();
                C66435o oVar = (C66435o) lVar.instance;
                str5.getClass();
                oVar.f180642a |= 1;
                oVar.f180643b = str5;
                pVar.mo59627a(lVar);
            }
            C66423c cVar2 = (C66423c) C66446z.f180663j.createBuilder();
            cVar2.copyOnWrite();
            C66446z zVar5 = (C66446z) cVar2.instance;
            C66437q qVar2 = (C66437q) pVar.build();
            qVar2.getClass();
            zVar5.f180671g = qVar2;
            zVar5.f180665a |= 128;
            cVar2.copyOnWrite();
            C66446z zVar6 = (C66446z) cVar2.instance;
            zVar6.f180666b = 3;
            zVar6.f180665a |= 1;
            cVar2.copyOnWrite();
            C66446z zVar7 = (C66446z) cVar2.instance;
            zVar7.f180665a = 2 | zVar7.f180665a;
            zVar7.f180667c = "timedBiasing";
            d3.add((C66446z) cVar2.build());
        }
        arrayList.addAll(d3);
        for (Map.Entry entry : ((C58495hd) this.f257869f.f257115e).entrySet()) {
            arrayList.addAll(m151925d((C58881cr) entry.getValue(), (String) entry.getKey()));
        }
        C66422b bVar = ((C67244v) this.f257865b.instance).f182776c;
        if (bVar == null) {
            bVar = C66422b.f180605k;
        }
        C66421a aVar = (C66421a) bVar.toBuilder();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.mo59624c((C66446z) arrayList.get(i2));
        }
        C67239q qVar3 = this.f257865b;
        qVar3.copyOnWrite();
        C67244v vVar3 = (C67244v) qVar3.instance;
        C66422b bVar2 = (C66422b) aVar.build();
        bVar2.getClass();
        vVar3.f182776c = bVar2;
        vVar3.f182774a |= 1;
        C58485gu c2 = this.f257866c.mo79745c(C90082eg.f250017ca);
        ArrayList arrayList2 = new ArrayList(this.f257868e);
        arrayList2.add(this.f257867d);
        int size2 = arrayList2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                break;
            }
            int i4 = i3 + 1;
            if (C90772bp.m148274A(c2, (String) arrayList2.get(i3))) {
                C67239q qVar4 = this.f257865b;
                qVar4.copyOnWrite();
                C67244v vVar4 = (C67244v) qVar4.instance;
                vVar4.f182775b |= 64;
                vVar4.f182790q = false;
                break;
            }
            i3 = i4;
        }
        return (C67244v) this.f257865b.build();
    }
}
