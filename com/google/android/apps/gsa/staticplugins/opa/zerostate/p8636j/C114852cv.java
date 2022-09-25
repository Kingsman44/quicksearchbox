package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Intent;
import com.google.android.gms.audit.C142836e;
import com.google.android.gms.audit.C142837f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p4017at.p4018a.p4019a.p4020a.C53743aa;
import com.google.p4017at.p4018a.p4019a.p4020a.C53745ac;
import com.google.p4017at.p4018a.p4019a.p4020a.C53746ad;
import com.google.p4017at.p4018a.p4019a.p4020a.C53747ae;
import com.google.p4017at.p4018a.p4019a.p4020a.C53748af;
import com.google.p4017at.p4018a.p4019a.p4020a.C53749ag;
import com.google.p4017at.p4018a.p4019a.p4020a.C53781bl;
import com.google.p4017at.p4018a.p4019a.p4020a.C53782bm;
import com.google.p4017at.p4018a.p4019a.p4020a.C53787br;
import com.google.p4017at.p4018a.p4019a.p4020a.C53789bt;
import com.google.p4017at.p4018a.p4019a.p4020a.C53790bu;
import com.google.p4017at.p4018a.p4019a.p4020a.C53791bv;
import com.google.p4017at.p4018a.p4019a.p4020a.C53800k;
import com.google.p4017at.p4018a.p4019a.p4020a.C53801l;
import com.google.p4017at.p4018a.p4019a.p4020a.C53806q;
import com.google.p4017at.p4018a.p4019a.p4020a.C53809t;
import com.google.p4017at.p4018a.p4019a.p4020a.C53810u;
import com.google.p4017at.p4018a.p4019a.p4020a.C53811v;
import com.google.p4017at.p4018a.p4019a.p4020a.C53814y;
import com.google.p4017at.p4018a.p4019a.p4020a.C53815z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.cv */
/* compiled from: PG */
public final /* synthetic */ class C114852cv implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114860dc f318644a;

    /* renamed from: b */
    public final /* synthetic */ Intent f318645b;

    public /* synthetic */ C114852cv(C114860dc dcVar, Intent intent) {
        this.f318644a = dcVar;
        this.f318645b = intent;
    }

    public final void run() {
        C114860dc dcVar = this.f318644a;
        Intent intent = this.f318645b;
        C142836e eVar = new C142836e(dcVar.f318670c);
        long longExtra = intent.getLongExtra("aog_account_linking_project_gaia_id", 0);
        if (longExtra == 0) {
            C58976aa aaVar = C58975e.f156826a;
            C146021aq.m237850d(Status.f389617c);
            return;
        }
        String g = dcVar.f318678k.mo79673g();
        String F = dcVar.f318678k.mo79659F();
        if (g == null || F == null) {
            C58976aa aaVar2 = C58975e.f156826a;
            C146021aq.m237850d(Status.f389617c);
            return;
        }
        C53810u uVar = (C53810u) C53811v.f141229c.createBuilder();
        uVar.copyOnWrite();
        C53811v vVar = (C53811v) uVar.instance;
        vVar.f141231a = 1;
        vVar.f141232b = g;
        C53811v vVar2 = (C53811v) uVar.build();
        C53800k kVar = (C53800k) C53801l.f141209g.createBuilder();
        C53806q qVar = (C53806q) C53745ac.f141093d.createBuilder();
        qVar.copyOnWrite();
        C53745ac acVar = (C53745ac) qVar.instance;
        acVar.f141096b = 1;
        acVar.f141095a |= 1;
        C53809t tVar = (C53809t) C53743aa.f141085f.createBuilder();
        tVar.copyOnWrite();
        C53743aa aaVar3 = (C53743aa) tVar.instance;
        vVar2.getClass();
        aaVar3.f141088b = vVar2;
        aaVar3.f141087a |= 1;
        qVar.copyOnWrite();
        C53745ac acVar2 = (C53745ac) qVar.instance;
        C53743aa aaVar4 = (C53743aa) tVar.build();
        aaVar4.getClass();
        acVar2.f141097c = aaVar4;
        acVar2.f141095a |= 2;
        kVar.mo54015a(qVar);
        C53806q qVar2 = (C53806q) C53745ac.f141093d.createBuilder();
        qVar2.copyOnWrite();
        C53745ac acVar3 = (C53745ac) qVar2.instance;
        acVar3.f141096b = 2;
        acVar3.f141095a |= 1;
        C53809t tVar2 = (C53809t) C53743aa.f141085f.createBuilder();
        tVar2.copyOnWrite();
        C53743aa aaVar5 = (C53743aa) tVar2.instance;
        vVar2.getClass();
        aaVar5.f141088b = vVar2;
        aaVar5.f141087a |= 1;
        C53814y yVar = (C53814y) C53815z.f141237c.createBuilder();
        yVar.copyOnWrite();
        C53815z zVar = (C53815z) yVar.instance;
        zVar.f141239a |= 1;
        zVar.f141240b = longExtra;
        tVar2.copyOnWrite();
        C53743aa aaVar6 = (C53743aa) tVar2.instance;
        C53815z zVar2 = (C53815z) yVar.build();
        zVar2.getClass();
        aaVar6.f141090d = zVar2;
        aaVar6.f141087a |= 64;
        qVar2.copyOnWrite();
        C53745ac acVar4 = (C53745ac) qVar2.instance;
        C53743aa aaVar7 = (C53743aa) tVar2.build();
        aaVar7.getClass();
        acVar4.f141097c = aaVar7;
        acVar4.f141095a |= 2;
        kVar.mo54015a(qVar2);
        C53746ad adVar = (C53746ad) C53747ae.f141098d.createBuilder();
        adVar.copyOnWrite();
        C53747ae aeVar = (C53747ae) adVar.instance;
        aeVar.f141101b = 266;
        aeVar.f141100a |= 1;
        C53748af afVar = (C53748af) C53749ag.f141103h.createBuilder();
        C53781bl blVar = (C53781bl) C53782bm.f141165c.createBuilder();
        C53787br brVar = (C53787br) C53789bt.f141180c.createBuilder();
        brVar.copyOnWrite();
        C53789bt btVar = (C53789bt) brVar.instance;
        btVar.f141183b = 1;
        btVar.f141182a |= 1;
        blVar.copyOnWrite();
        C53782bm bmVar = (C53782bm) blVar.instance;
        C53789bt btVar2 = (C53789bt) brVar.build();
        btVar2.getClass();
        bmVar.f141168b = btVar2;
        bmVar.f141167a |= 1;
        afVar.copyOnWrite();
        C53749ag agVar = (C53749ag) afVar.instance;
        C53782bm bmVar2 = (C53782bm) blVar.build();
        bmVar2.getClass();
        agVar.f141110f = bmVar2;
        agVar.f141105a |= 8388608;
        C53749ag agVar2 = (C53749ag) afVar.build();
        adVar.copyOnWrite();
        C53747ae aeVar2 = (C53747ae) adVar.instance;
        agVar2.getClass();
        aeVar2.f141102c = agVar2;
        aeVar2.f141100a |= 2;
        C142837f fVar = new C142837f();
        fVar.f387635a = 1;
        fVar.f387636b = 38;
        fVar.f387637c = F;
        kVar.copyOnWrite();
        C53801l lVar = (C53801l) kVar.instance;
        C53747ae aeVar3 = (C53747ae) adVar.build();
        aeVar3.getClass();
        lVar.f141215e = aeVar3;
        lVar.f141211a |= 4;
        C53790bu buVar = (C53790bu) C53791bv.f141184e.createBuilder();
        C45595b bVar = C45595b.GOOGLE_ASSISTANT_ANDROID_LOCATION_TRACKING_SNAPSHOT_CONSENT;
        buVar.copyOnWrite();
        C53791bv bvVar = (C53791bv) buVar.instance;
        bvVar.f141187b = bVar.f119929nK;
        bvVar.f141186a |= 1;
        kVar.copyOnWrite();
        C53801l lVar2 = (C53801l) kVar.instance;
        C53791bv bvVar2 = (C53791bv) buVar.build();
        bvVar2.getClass();
        lVar2.f141216f = bvVar2;
        lVar2.f141211a |= 8;
        fVar.mo117764b(((C53801l) kVar.build()).toByteArray());
        eVar.mo117761a(fVar.mo117763a()).mo122497p(new C114851cu(dcVar, intent));
    }
}
