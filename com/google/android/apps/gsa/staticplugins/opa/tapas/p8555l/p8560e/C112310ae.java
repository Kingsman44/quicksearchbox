package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.assistant.shared.l.i;
import com.google.android.apps.gsa.assistant.shared.l.m;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60945d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.research.p5181a.p5187e.C66355e;
import com.google.research.p5181a.p5187e.C66364n;
import java.io.IOException;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ae */
/* compiled from: PG */
public final /* synthetic */ class C112310ae implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112312ag f311667a;

    public /* synthetic */ C112310ae(C112312ag agVar) {
        this.f311667a = agVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112312ag agVar = this.f311667a;
        if (((Boolean) obj).booleanValue() && agVar.f311675g.mo79746e(C90014bt.f247740mp)) {
            String F = agVar.f311679k.mo79659F();
            if (F == null) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            synchronized (agVar) {
                C112331az azVar = agVar.f311676h;
                C66355e eVar = agVar.f311681m;
                Instant ofEpochMilli = Instant.ofEpochMilli(agVar.f311677i.mo26870b());
                if (azVar.f311709f.mo79746e(C90063do.f249331bX)) {
                    m b = C112331az.m186193b(eVar, ofEpochMilli);
                    C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
                    C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                    long a = C60945d.m93096a(ofEpochMilli);
                    cVar.copyOnWrite();
                    C65139d dVar = (C65139d) cVar.instance;
                    dVar.f176309a |= 1;
                    dVar.f176310b = a;
                    ayVar.copyOnWrite();
                    C65768az azVar2 = (C65768az) ayVar.instance;
                    C65139d dVar2 = (C65139d) cVar.build();
                    dVar2.getClass();
                    azVar2.f178796b = dVar2;
                    azVar2.f178795a |= 1;
                    C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                    gVar.copyOnWrite();
                    ((C63070h) gVar.instance).f170217a = "type.googleapis.com/android.apps.gsa.assistant.shared.proto.TapasReflectionProto.TapasTrainingBuffers";
                    C63088z byteString = b.toByteString();
                    gVar.copyOnWrite();
                    byteString.getClass();
                    ((C63070h) gVar.instance).f170218b = byteString;
                    ayVar.copyOnWrite();
                    C65768az azVar3 = (C65768az) ayVar.instance;
                    C63070h hVar = (C63070h) gVar.build();
                    hVar.getClass();
                    azVar3.f178799e = hVar;
                    azVar3.f178795a |= 8;
                    C65753ak akVar = C65753ak.TAPAS_REFLECTION_TRAINING_BUFFERS;
                    C121537f fVar = C112331az.f311704a;
                    C60870cx d = azVar.f311707d.d(F, akVar, (C65768az) ayVar.build(), false);
                    fVar.mo105244m("saveTrainingBuffersGeller", d);
                    C90875ai.m148465b(new C112324as(akVar), d, azVar.f311706c, "Writing Tapas training buffers to Geller").mo85223a(new C112325at(akVar));
                } else {
                    C121492b a2 = C112331az.f311704a.mo105233a("saveTrainingBuffersOpaStore");
                    C90875ai.m148465b(new C112326au(a2), azVar.f311708e.mo76941p(C112331az.m186193b(eVar, ofEpochMilli)), azVar.f311706c, "Writing Tapas training buffers to OpaStore").mo85223a(new C112327av(a2));
                }
                if (!agVar.f311682n.isEmpty()) {
                    C112331az azVar4 = agVar.f311676h;
                    C58495hd n = C58495hd.m89900n("SuggestionSorting", (C66364n) agVar.f311682n.get());
                    Instant ofEpochMilli2 = Instant.ofEpochMilli(agVar.f311677i.mo26870b());
                    if (azVar4.f311709f.mo79746e(C90063do.f249331bX)) {
                        C121492b a3 = C112331az.f311704a.mo105233a("saveRankerMapGeller");
                        C65768az azVar5 = C65768az.f178793f;
                        try {
                            i a4 = azVar4.mo99498a(n, ofEpochMilli2);
                            C65767ay ayVar2 = (C65767ay) C65768az.f178793f.createBuilder();
                            C65138c cVar2 = (C65138c) C65139d.f176307e.createBuilder();
                            long a5 = C60945d.m93096a(ofEpochMilli2);
                            cVar2.copyOnWrite();
                            C65139d dVar3 = (C65139d) cVar2.instance;
                            dVar3.f176309a |= 1;
                            dVar3.f176310b = a5;
                            ayVar2.copyOnWrite();
                            C65768az azVar6 = (C65768az) ayVar2.instance;
                            C65139d dVar4 = (C65139d) cVar2.build();
                            dVar4.getClass();
                            azVar6.f178796b = dVar4;
                            azVar6.f178795a |= 1;
                            C63062g gVar2 = (C63062g) C63070h.f170215c.createBuilder();
                            gVar2.copyOnWrite();
                            ((C63070h) gVar2.instance).f170217a = "type.googleapis.com/android.apps.gsa.assistant.shared.proto.TapasReflectionProto.TapasModels";
                            C63088z byteString2 = a4.toByteString();
                            gVar2.copyOnWrite();
                            byteString2.getClass();
                            ((C63070h) gVar2.instance).f170218b = byteString2;
                            ayVar2.copyOnWrite();
                            C65768az azVar7 = (C65768az) ayVar2.instance;
                            C63070h hVar2 = (C63070h) gVar2.build();
                            hVar2.getClass();
                            azVar7.f178799e = hVar2;
                            azVar7.f178795a |= 8;
                            C65768az azVar8 = (C65768az) ayVar2.build();
                            C65753ak akVar2 = C65753ak.TAPAS_REFLECTION_MODELS;
                            C121537f fVar2 = C112331az.f311704a;
                            C60870cx d2 = azVar4.f311707d.d(F, akVar2, azVar8, false);
                            fVar2.mo105244m("putTapasModelOpaStore", d2);
                            C90875ai.m148465b(new C112315aj(a3, akVar2), d2, azVar4.f311706c, "Writing Tapas models to Geller").mo85223a(new C112316ak(a3, akVar2));
                        } catch (IOException e) {
                            ((C59052c) ((C59052c) ((C59052c) C112331az.f311705b.mo56225c()).mo56382g(e)).mo56372aa(27708)).mo56386p("Saved predictor failed.");
                            a3.mo105190c();
                        }
                    } else {
                        i iVar = i.b;
                        try {
                            i a6 = azVar4.mo99498a(n, ofEpochMilli2);
                            C121537f fVar3 = C112331az.f311704a;
                            C60870cx n2 = azVar4.f311708e.mo76939n(a6);
                            fVar3.mo105244m("putTapasModelOpaStore", n2);
                            C90875ai.m148465b(C112317al.f311691a, n2, azVar4.f311706c, "Writing Tapas models to OpaStore").mo85223a(C112318am.f311692a);
                        } catch (IOException e2) {
                            ((C59052c) ((C59052c) ((C59052c) C112331az.f311705b.mo56225c()).mo56382g(e2)).mo56372aa(27707)).mo56386p("Saved predictor failed.");
                        }
                    }
                }
            }
        }
    }
}
