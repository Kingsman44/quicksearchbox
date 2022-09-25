package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.gms.audit.C142830a;
import com.google.android.gms.audit.C142837f;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p4017at.p4018a.p4019a.p4020a.C53742a;
import com.google.p4017at.p4018a.p4019a.p4020a.C53743aa;
import com.google.p4017at.p4018a.p4019a.p4020a.C53746ad;
import com.google.p4017at.p4018a.p4019a.p4020a.C53747ae;
import com.google.p4017at.p4018a.p4019a.p4020a.C53748af;
import com.google.p4017at.p4018a.p4019a.p4020a.C53749ag;
import com.google.p4017at.p4018a.p4019a.p4020a.C53769b;
import com.google.p4017at.p4018a.p4019a.p4020a.C53783bn;
import com.google.p4017at.p4018a.p4019a.p4020a.C53784bo;
import com.google.p4017at.p4018a.p4019a.p4020a.C53785bp;
import com.google.p4017at.p4018a.p4019a.p4020a.C53786bq;
import com.google.p4017at.p4018a.p4019a.p4020a.C53787br;
import com.google.p4017at.p4018a.p4019a.p4020a.C53789bt;
import com.google.p4017at.p4018a.p4019a.p4020a.C53790bu;
import com.google.p4017at.p4018a.p4019a.p4020a.C53791bv;
import com.google.p4017at.p4018a.p4019a.p4020a.C53794e;
import com.google.p4017at.p4018a.p4019a.p4020a.C53795f;
import com.google.p4017at.p4018a.p4019a.p4020a.C53796g;
import com.google.p4017at.p4018a.p4019a.p4020a.C53797h;
import com.google.p4017at.p4018a.p4019a.p4020a.C53798i;
import com.google.p4017at.p4018a.p4019a.p4020a.C53799j;
import com.google.p4017at.p4018a.p4019a.p4020a.C53800k;
import com.google.p4017at.p4018a.p4019a.p4020a.C53801l;
import com.google.p4017at.p4018a.p4019a.p4020a.C53809t;
import com.google.p4017at.p4018a.p4019a.p4020a.C53810u;
import com.google.p4017at.p4018a.p4019a.p4020a.C53811v;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.m */
/* compiled from: PG */
public final /* synthetic */ class C96393m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96431q f269674a;

    /* renamed from: b */
    public final /* synthetic */ String f269675b;

    /* renamed from: c */
    public final /* synthetic */ String[] f269676c;

    /* renamed from: d */
    public final /* synthetic */ String f269677d;

    /* renamed from: e */
    public final /* synthetic */ String f269678e;

    public /* synthetic */ C96393m(C96431q qVar, String str, String[] strArr, String str2, String str3) {
        this.f269674a = qVar;
        this.f269675b = str;
        this.f269676c = strArr;
        this.f269677d = str2;
        this.f269678e = str3;
    }

    public final void run() {
        C96431q qVar = this.f269674a;
        String str = this.f269675b;
        C96366l lVar = new C96366l(qVar, this.f269676c, this.f269677d, this.f269678e);
        C58976aa aaVar = C58975e.f156826a;
        String g = ((C86054o) qVar.f269769i.mo27525b()).mo79673g();
        String F = ((C86054o) qVar.f269769i.mo27525b()).mo79659F();
        LogAuditRecordsRequest logAuditRecordsRequest = null;
        if (!(g == null || F == null)) {
            if (((Long) qVar.f269771k.mo17428b()).longValue() == 0) {
                C59104x c = C96431q.f269762b.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AccLinkFrag");
                ((C59052c) ((C59052c) c).mo56372aa(16927)).mo56386p("auditImpression: failed to look up Gservices Android ID.");
            } else {
                C53800k kVar = (C53800k) C53801l.f141209g.createBuilder();
                C53809t tVar = (C53809t) C53743aa.f141085f.createBuilder();
                C53810u uVar = (C53810u) C53811v.f141229c.createBuilder();
                uVar.copyOnWrite();
                C53811v vVar = (C53811v) uVar.instance;
                vVar.f141231a = 1;
                vVar.f141232b = g;
                tVar.copyOnWrite();
                C53743aa aaVar2 = (C53743aa) tVar.instance;
                C53811v vVar2 = (C53811v) uVar.build();
                vVar2.getClass();
                aaVar2.f141088b = vVar2;
                aaVar2.f141087a |= 1;
                kVar.copyOnWrite();
                C53801l lVar2 = (C53801l) kVar.instance;
                C53743aa aaVar3 = (C53743aa) tVar.build();
                aaVar3.getClass();
                lVar2.f141213c = aaVar3;
                lVar2.f141211a |= 1;
                C53809t tVar2 = (C53809t) C53743aa.f141085f.createBuilder();
                C53810u uVar2 = (C53810u) C53811v.f141229c.createBuilder();
                uVar2.copyOnWrite();
                C53811v vVar3 = (C53811v) uVar2.instance;
                vVar3.f141231a = 1;
                vVar3.f141232b = g;
                tVar2.copyOnWrite();
                C53743aa aaVar4 = (C53743aa) tVar2.instance;
                C53811v vVar4 = (C53811v) uVar2.build();
                vVar4.getClass();
                aaVar4.f141088b = vVar4;
                aaVar4.f141087a |= 1;
                kVar.copyOnWrite();
                C53801l lVar3 = (C53801l) kVar.instance;
                C53743aa aaVar5 = (C53743aa) tVar2.build();
                aaVar5.getClass();
                lVar3.f141214d = aaVar5;
                lVar3.f141211a |= 2;
                C53746ad adVar = (C53746ad) C53747ae.f141098d.createBuilder();
                adVar.copyOnWrite();
                C53747ae aeVar = (C53747ae) adVar.instance;
                aeVar.f141101b = 299;
                aeVar.f141100a |= 1;
                C53748af afVar = (C53748af) C53749ag.f141103h.createBuilder();
                C53783bn bnVar = (C53783bn) C53784bo.f141169c.createBuilder();
                C53787br brVar = (C53787br) C53789bt.f141180c.createBuilder();
                brVar.copyOnWrite();
                C53789bt btVar = (C53789bt) brVar.instance;
                btVar.f141183b = 1;
                btVar.f141182a |= 1;
                bnVar.copyOnWrite();
                C53784bo boVar = (C53784bo) bnVar.instance;
                C53789bt btVar2 = (C53789bt) brVar.build();
                btVar2.getClass();
                boVar.f141172b = btVar2;
                boVar.f141171a |= 1;
                afVar.copyOnWrite();
                C53749ag agVar = (C53749ag) afVar.instance;
                C53784bo boVar2 = (C53784bo) bnVar.build();
                boVar2.getClass();
                agVar.f141111g = boVar2;
                agVar.f141106b |= 2048;
                adVar.copyOnWrite();
                C53747ae aeVar2 = (C53747ae) adVar.instance;
                C53749ag agVar2 = (C53749ag) afVar.build();
                agVar2.getClass();
                aeVar2.f141102c = agVar2;
                aeVar2.f141100a |= 2;
                C53747ae aeVar3 = (C53747ae) adVar.build();
                C53790bu buVar = (C53790bu) C53791bv.f141184e.createBuilder();
                C45595b bVar = C45595b.OPA_HEALTH_AND_FITNESS_ANDROID_OOBE_PROVIDER;
                buVar.copyOnWrite();
                C53791bv bvVar = (C53791bv) buVar.instance;
                bvVar.f141187b = bVar.f119929nK;
                bvVar.f141186a |= 1;
                C53785bp bpVar = (C53785bp) C53786bq.f141173e.createBuilder();
                C53742a aVar = (C53742a) C53769b.f141138f.createBuilder();
                C53798i iVar = (C53798i) C53799j.f141206b.createBuilder();
                iVar.mo54014a(R.string.sleep_account_linking_legalese_title);
                aVar.copyOnWrite();
                C53769b bVar2 = (C53769b) aVar.instance;
                C53799j jVar = (C53799j) iVar.build();
                jVar.getClass();
                bVar2.f141141b = jVar;
                bVar2.f141140a |= 2;
                C53798i iVar2 = (C53798i) C53799j.f141206b.createBuilder();
                iVar2.mo54014a(R.string.bisto_account_linking_consent_positive);
                aVar.copyOnWrite();
                C53769b bVar3 = (C53769b) aVar.instance;
                C53799j jVar2 = (C53799j) iVar2.build();
                jVar2.getClass();
                bVar3.f141143d = jVar2;
                bVar3.f141140a |= 8;
                C53798i iVar3 = (C53798i) C53799j.f141206b.createBuilder();
                iVar3.mo54014a(R.string.bisto_no_thanks_button);
                aVar.copyOnWrite();
                C53769b bVar4 = (C53769b) aVar.instance;
                C53799j jVar3 = (C53799j) iVar3.build();
                jVar3.getClass();
                bVar4.f141144e = jVar3;
                bVar4.f141140a |= 16;
                C53794e eVar = (C53794e) C53797h.f141203b.createBuilder();
                C53795f fVar = (C53795f) C53796g.f141198d.createBuilder();
                fVar.copyOnWrite();
                C53796g gVar = (C53796g) fVar.instance;
                gVar.f141200a |= 1;
                gVar.f141201b = R.string.sleep_account_linking_legalese;
                eVar.mo54013a(fVar);
                C53795f fVar2 = (C53795f) C53796g.f141198d.createBuilder();
                fVar2.copyOnWrite();
                C53796g gVar2 = (C53796g) fVar2.instance;
                gVar2.f141200a |= 2;
                gVar2.f141202c = str;
                eVar.mo54013a(fVar2);
                aVar.copyOnWrite();
                C53769b bVar5 = (C53769b) aVar.instance;
                C53797h hVar = (C53797h) eVar.build();
                hVar.getClass();
                bVar5.f141142c = hVar;
                bVar5.f141140a |= 4;
                bpVar.copyOnWrite();
                C53786bq bqVar = (C53786bq) bpVar.instance;
                C53769b bVar6 = (C53769b) aVar.build();
                bVar6.getClass();
                bqVar.f141177c = bVar6;
                bqVar.f141175a |= 2;
                buVar.copyOnWrite();
                C53791bv bvVar2 = (C53791bv) buVar.instance;
                C53786bq bqVar2 = (C53786bq) bpVar.build();
                bqVar2.getClass();
                bvVar2.f141189d = bqVar2;
                bvVar2.f141186a |= 8;
                C53791bv bvVar3 = (C53791bv) buVar.build();
                C142837f fVar3 = new C142837f();
                fVar3.f387635a = 1;
                fVar3.f387636b = 38;
                fVar3.f387637c = F;
                kVar.copyOnWrite();
                C53801l lVar4 = (C53801l) kVar.instance;
                aeVar3.getClass();
                lVar4.f141215e = aeVar3;
                lVar4.f141211a |= 4;
                kVar.copyOnWrite();
                C53801l lVar5 = (C53801l) kVar.instance;
                bvVar3.getClass();
                lVar5.f141216f = bvVar3;
                lVar5.f141211a |= 8;
                fVar3.mo117764b(((C53801l) kVar.build()).toByteArray());
                logAuditRecordsRequest = fVar3.mo117763a();
            }
        }
        if (logAuditRecordsRequest != null) {
            ((C142830a) qVar.f269770j.mo17428b()).mo117761a(logAuditRecordsRequest).mo122497p(new C96231g(qVar, lVar));
        }
    }
}
