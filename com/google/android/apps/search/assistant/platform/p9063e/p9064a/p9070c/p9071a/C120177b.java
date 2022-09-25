package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9070c.p9071a;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.assistant.p3897e.p3917i.p3918a.C51602nu;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.assistant.p3897e.p3917i.p3918a.C51606ny;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.speech.p5195a.C66449d;
import com.google.speech.p5195a.p5196a.C66421a;
import com.google.speech.p5195a.p5196a.C66422b;
import com.google.speech.p5195a.p5196a.C66423c;
import com.google.speech.p5195a.p5196a.C66442v;
import com.google.speech.p5195a.p5196a.C66443w;
import com.google.speech.p5195a.p5196a.C66444x;
import com.google.speech.p5195a.p5196a.C66445y;
import com.google.speech.p5195a.p5196a.C66446z;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67244v;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.c.a.b */
/* compiled from: PG */
final class C120177b implements C17235c {

    /* renamed from: a */
    final /* synthetic */ C119937f f334459a;

    /* renamed from: b */
    final /* synthetic */ C120178c f334460b;

    public C120177b(C120178c cVar, C119937f fVar) {
        this.f334460b = cVar;
        this.f334459a = fVar;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        C67239q qVar = (C67239q) C67244v.f182771s.createBuilder();
        int i = this.f334460b.f334465e;
        qVar.copyOnWrite();
        C67244v vVar = (C67244v) qVar.instance;
        vVar.f182774a |= 2;
        vVar.f182777d = i;
        C66449d dVar = C120178c.f334463c;
        qVar.copyOnWrite();
        C67244v vVar2 = (C67244v) qVar.instance;
        dVar.getClass();
        vVar2.f182778e = dVar;
        vVar2.f182774a |= 4;
        qVar.copyOnWrite();
        C67244v vVar3 = (C67244v) qVar.instance;
        vVar3.f182774a |= 8;
        vVar3.f182779f = true;
        qVar.copyOnWrite();
        C67244v vVar4 = (C67244v) qVar.instance;
        vVar4.f182774a |= 64;
        vVar4.f182781h = true;
        qVar.copyOnWrite();
        C67244v vVar5 = (C67244v) qVar.instance;
        vVar5.f182774a |= 33554432;
        vVar5.f182786m = true;
        qVar.copyOnWrite();
        C67244v vVar6 = (C67244v) qVar.instance;
        vVar6.f182774a |= 1024;
        vVar6.f182782i = 0;
        boolean z = this.f334460b.f334464d;
        qVar.copyOnWrite();
        C67244v vVar7 = (C67244v) qVar.instance;
        vVar7.f182774a |= C89885b.S3REQUEST_VALUE;
        vVar7.f182784k = z;
        qVar.copyOnWrite();
        C67244v vVar8 = (C67244v) qVar.instance;
        vVar8.f182774a |= C89885b.HTTP_VALUE;
        vVar8.f182785l = true;
        qVar.copyOnWrite();
        C67244v vVar9 = (C67244v) qVar.instance;
        vVar9.f182775b |= 128;
        vVar9.f182791r = false;
        for (C52232kc kcVar : this.f334459a.mo104571a().f136712a) {
            if (kcVar.f137065b.equals("asst.communication.top_contact")) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if (kaVar.f137060b.equals("assistant.api.params.TopContactParams")) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        C63088z zVar = kaVar2.f137061c;
                        C62921ba a = C62921ba.m95368a();
                        ArrayList<C66446z> arrayList = new ArrayList<>();
                        for (C51606ny nyVar : ((C51609oa) C62942bv.parseFrom((C62942bv) C51609oa.f134502b, zVar, a)).f134504a) {
                            C66423c cVar = (C66423c) C66446z.f180663j.createBuilder();
                            cVar.copyOnWrite();
                            C66446z zVar2 = (C66446z) cVar.instance;
                            zVar2.f180666b = 2;
                            zVar2.f180665a |= 1;
                            C58495hd hdVar = C120178c.f334462b;
                            C51605nx a2 = C51605nx.m86246a(nyVar.f134501c);
                            if (a2 == null) {
                                a2 = C51605nx.UNKNOWN;
                            }
                            String str = (String) hdVar.get(a2);
                            if (str != null) {
                                cVar.copyOnWrite();
                                C66446z zVar3 = (C66446z) cVar.instance;
                                zVar3.f180665a |= 2;
                                zVar3.f180667c = str;
                                C66444x xVar = (C66444x) C66445y.f180660b.createBuilder();
                                for (C51602nu nuVar : nyVar.f134500b) {
                                    C66442v vVar10 = (C66442v) C66443w.f180655d.createBuilder();
                                    String str2 = nuVar.f134487b;
                                    vVar10.copyOnWrite();
                                    C66443w wVar = (C66443w) vVar10.instance;
                                    str2.getClass();
                                    wVar.f180657a |= 1;
                                    wVar.f180658b = str2;
                                    float f = nuVar.f134488c;
                                    vVar10.copyOnWrite();
                                    C66443w wVar2 = (C66443w) vVar10.instance;
                                    wVar2.f180657a |= 2;
                                    wVar2.f180659c = f;
                                    xVar.mo59630a(vVar10);
                                }
                                cVar.copyOnWrite();
                                C66446z zVar4 = (C66446z) cVar.instance;
                                C66445y yVar = (C66445y) xVar.build();
                                yVar.getClass();
                                zVar4.f180670f = yVar;
                                zVar4.f180665a |= 64;
                                arrayList.add((C66446z) cVar.build());
                            }
                        }
                        C66421a aVar = (C66421a) C66422b.f180605k.createBuilder();
                        for (C66446z c : arrayList) {
                            aVar.mo59624c(c);
                        }
                        qVar.copyOnWrite();
                        C67244v vVar11 = (C67244v) qVar.instance;
                        C66422b bVar = (C66422b) aVar.build();
                        bVar.getClass();
                        vVar11.f182776c = bVar;
                        vVar11.f182774a |= 1;
                    } catch (C62974ct e) {
                        ((C59052c) ((C59052c) ((C59052c) C120178c.f334461a.mo56225c()).mo56382g(e)).mo56372aa(34673)).mo56386p("Failed to parse TopContacts");
                    }
                }
            }
        }
        C67239q qVar2 = (C67239q) ((C67244v) cdVar.mo58881i(C67244v.f182772t)).toBuilder();
        C62940bt btVar = C67244v.f182772t;
        qVar2.mergeFrom((C67244v) qVar.build());
        cdVar.mo58885m(btVar, (C67244v) qVar2.build());
    }
}
