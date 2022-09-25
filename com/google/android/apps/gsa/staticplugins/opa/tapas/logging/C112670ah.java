package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4500cm.p4518d.C58191h;
import com.google.p4500cm.p4518d.C58192i;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65844m;
import com.google.protos.p5129p.p5131b.C65845n;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ah */
/* compiled from: PG */
public final /* synthetic */ class C112670ah implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C112678ap f312289a;

    /* renamed from: b */
    public final /* synthetic */ C19087s f312290b;

    /* renamed from: c */
    public final /* synthetic */ C112667ae f312291c;

    public /* synthetic */ C112670ah(C112678ap apVar, C19087s sVar, C112667ae aeVar) {
        this.f312289a = apVar;
        this.f312290b = sVar;
        this.f312291c = aeVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C112678ap apVar = this.f312289a;
        C19087s sVar = this.f312290b;
        C112667ae aeVar = this.f312291c;
        C58191h hVar = (C58191h) ((C58192i) obj).toBuilder();
        hVar.copyOnWrite();
        C58192i iVar = (C58192i) hVar.instance;
        C19088t tVar = (C19088t) sVar.build();
        tVar.getClass();
        iVar.f155611g = tVar;
        iVar.f155605a |= 2048;
        C143657j d = ((C143658k) apVar.f312306b.mo27525b()).mo118999d((C58192i) hVar.build());
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C112695c cVar = (C112695c) aeVar;
        C60218r rVar = cVar.f312421e;
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        oeVar.f163227b = rVar;
        oeVar.f163226a |= 1;
        d.f389463e = (C60321oe) odVar.build();
        d.mo118996e(apVar.f312307c.mo79659F());
        d.mo118992a();
        if (cVar.f312420d.equals(C59743a.TAPAS_ON_DEVICE_QUERY)) {
            C19088t tVar2 = (C19088t) sVar.build();
            C60218r rVar2 = cVar.f312421e;
            C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
            C65138c cVar2 = (C65138c) C65139d.f176307e.createBuilder();
            C60220t tVar3 = rVar2.f162928b;
            if (tVar3 == null) {
                tVar3 = C60220t.f162931e;
            }
            long j = tVar3.f162934b;
            cVar2.copyOnWrite();
            C65139d dVar = (C65139d) cVar2.instance;
            dVar.f176309a |= 1;
            dVar.f176310b = j;
            C60220t tVar4 = rVar2.f162928b;
            if (tVar4 == null) {
                tVar4 = C60220t.f162931e;
            }
            int i = tVar4.f162935c;
            cVar2.copyOnWrite();
            C65139d dVar2 = (C65139d) cVar2.instance;
            dVar2.f176309a |= 2;
            dVar2.f176311c = i;
            C60220t tVar5 = rVar2.f162928b;
            if (tVar5 == null) {
                tVar5 = C60220t.f162931e;
            }
            int i2 = tVar5.f162936d;
            cVar2.copyOnWrite();
            C65139d dVar3 = (C65139d) cVar2.instance;
            dVar3.f176309a |= 4;
            dVar3.f176312d = i2;
            ayVar.copyOnWrite();
            C65768az azVar = (C65768az) ayVar.instance;
            C65139d dVar4 = (C65139d) cVar2.build();
            dVar4.getClass();
            azVar.f178796b = dVar4;
            azVar.f178795a |= 1;
            C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
            gVar.copyOnWrite();
            ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantHistoryElement";
            C65844m mVar = (C65844m) C65845n.f178992c.createBuilder();
            mVar.copyOnWrite();
            C65845n nVar = (C65845n) mVar.instance;
            tVar2.getClass();
            nVar.f178995b = tVar2;
            nVar.f178994a |= 2;
            C63088z byteString = ((C65845n) mVar.build()).toByteString();
            gVar.copyOnWrite();
            byteString.getClass();
            ((C63070h) gVar.instance).f170218b = byteString;
            ayVar.copyOnWrite();
            C65768az azVar2 = (C65768az) ayVar.instance;
            C63070h hVar2 = (C63070h) gVar.build();
            hVar2.getClass();
            azVar2.f178799e = hVar2;
            azVar2.f178795a |= 8;
            C65768az azVar3 = (C65768az) ayVar.build();
            String F = apVar.f312307c.mo79659F();
            if (F == null) {
                C59104x b = C112678ap.f312305a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "TapasClientEventLogger");
                ((C59052c) ((C59052c) b).mo56372aa(27515)).mo56386p("User not signed in.");
                return;
            }
            C90875ai.m148465b(C112668af.f312287a, apVar.f312310f.d(F, C65753ak.ASSISTANT_HISTORY, azVar3, false), apVar.f312316l, "Geller write logging").mo85223a(C112669ag.f312288a);
        }
    }
}
