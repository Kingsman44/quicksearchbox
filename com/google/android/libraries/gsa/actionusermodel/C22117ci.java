package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22099b;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3745ab.C48201aa;
import com.google.assistant.p3745ab.C48206ab;
import com.google.assistant.p3745ab.C48311dj;
import com.google.assistant.p3745ab.C48313dl;
import com.google.assistant.p3745ab.C48314dm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60253m;
import com.google.common.p4552o.C60286n;
import com.google.protobuf.C62971cq;
import com.google.protos.p4985f.p4986a.C64676bc;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ci */
/* compiled from: PG */
public final class C22117ci implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C22118cj f60946a;

    public C22117ci(C22118cj cjVar) {
        this.f60946a = cjVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C22099b bVar = (C22099b) obj;
        C22119ck ckVar = this.f60946a.f60953g;
        C62971cq cqVar = bVar.f60912c;
        C48201aa aaVar = (C48201aa) C48206ab.f124736b.createBuilder();
        Iterator it = cqVar.iterator();
        while (true) {
            int i = 2;
            if (!it.hasNext()) {
                break;
            }
            C22104g gVar = (C22104g) it.next();
            C48311dj djVar = (C48311dj) C48314dm.f124952e.createBuilder();
            C64676bc bcVar = C64676bc.UNSPECIFIED;
            C64676bc a = C64676bc.m96428a(gVar.f60923b);
            if (a == null) {
                a = C64676bc.UNSPECIFIED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                djVar.copyOnWrite();
                ((C48314dm) djVar.instance).f124954a = "person";
            } else if (ordinal == 3) {
                djVar.copyOnWrite();
                ((C48314dm) djVar.instance).f124954a = "type";
            } else if (ordinal == 4) {
                djVar.copyOnWrite();
                ((C48314dm) djVar.instance).f124954a = "provider";
            } else if (ordinal != 5) {
                ((C58970a) ((C58970a) C22119ck.f60956a.mo56225c()).mo56372aa(48211)).mo56386p("Unknown disambiguation type.");
            } else {
                djVar.copyOnWrite();
                ((C48314dm) djVar.instance).f124954a = "instance";
            }
            int size = gVar.f60927f.size();
            djVar.copyOnWrite();
            ((C48314dm) djVar.instance).f124955b = size;
            int b = C48313dl.m85219b(gVar.f60924c);
            if (b != 0) {
                i = b;
            }
            djVar.copyOnWrite();
            ((C48314dm) djVar.instance).f124956c = C48313dl.m85218a(i);
            int i2 = gVar.f60925d;
            djVar.copyOnWrite();
            ((C48314dm) djVar.instance).f124957d = i2;
            aaVar.copyOnWrite();
            C48206ab abVar = (C48206ab) aaVar.instance;
            C48314dm dmVar = (C48314dm) djVar.build();
            dmVar.getClass();
            abVar.mo53148a();
            abVar.f124738a.add(dmVar);
        }
        C60253m mVar = (C60253m) C60286n.f163096c.createBuilder();
        C48206ab abVar2 = (C48206ab) aaVar.build();
        mVar.copyOnWrite();
        C60286n nVar = (C60286n) mVar.instance;
        abVar2.getClass();
        nVar.f163099b = abVar2;
        nVar.f163098a |= 2;
        C60286n nVar2 = (C60286n) mVar.build();
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        nVar2.getClass();
        cbVar.f160083aU = nVar2;
        cbVar.f160123d |= 16384;
        C89856f fVar = new C89856f();
        fVar.f246203c = (C59687cb) ajVar.build();
        fVar.f246201a = C89849ae.AUM_ACTION_LOGGED;
        ((C89859i) ckVar.f60957b.mo27525b()).mo74236a(fVar.mo83699a());
        if ((bVar.f60910a & 1) != 0) {
            String F = this.f60946a.f60950d.mo79659F();
            if (F == null) {
                ((C58970a) ((C58970a) C22118cj.f60947a.mo56225c()).mo56372aa(48209)).mo56386p("User not signed in.");
                return;
            }
            C22118cj cjVar = this.f60946a;
            C65768az azVar = bVar.f60911b;
            if (azVar == null) {
                azVar = C65768az.f178793f;
            }
            C90875ai.m148465b(C22115cg.f60944a, cjVar.f60951e.d(F, C65753ak.ACTION_HISTORY, azVar, true), cjVar.f60949c, "Geller write logging").mo85223a(C22116ch.f60945a);
        }
    }
}
