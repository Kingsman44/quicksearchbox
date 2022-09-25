package com.google.android.apps.gsa.staticplugins.p7551bq;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91378h;
import com.google.android.apps.gsa.sidekick.main.p7227s.C91611a;
import com.google.android.apps.gsa.sidekick.shared.p7244m.C91763c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7661fg;
import com.google.p375ai.p378b.C7769jg;
import com.google.p375ai.p378b.C7771ji;
import com.google.p375ai.p378b.C7950pz;
import com.google.p375ai.p378b.C7952qa;
import com.google.p375ai.p378b.C7963ql;

/* renamed from: com.google.android.apps.gsa.staticplugins.bq.c */
/* compiled from: PG */
public final /* synthetic */ class C96692c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96693d f270510a;

    public /* synthetic */ C96692c(C96693d dVar) {
        this.f270510a = dVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C96693d dVar = this.f270510a;
        ((C59052c) ((C59052c) C96693d.f270511a.mo56224b()).mo56372aa(20850)).mo56386p("#fetchAndUpdateConfigurationInternal");
        String F = dVar.f270512b.mo79659F();
        if (F == null) {
            return C118826c.f331423b;
        }
        if (dVar.f270516h.mo78109aw()) {
            return dVar.f270517i.mo77614b(F, C7642eo.LEGACY_NOW_SYNC_WITH_FULL_REFRESH);
        }
        C7950pz pzVar = (C7950pz) C91763c.m150327a(C7642eo.LEGACY_NOW_SYNC).toBuilder();
        C7769jg jgVar = C7769jg.f27208a;
        pzVar.copyOnWrite();
        C7952qa qaVar = (C7952qa) pzVar.instance;
        jgVar.getClass();
        qaVar.f27924e = jgVar;
        qaVar.f27920a |= 16;
        C91611a.m149877a(dVar.f270514f, F, pzVar);
        C7963ql qlVar = ((C91376f) dVar.f270513c.mo17428b()).mo85696a((C7952qa) pzVar.build(), (C91378h) null).f254946a;
        if (qlVar != null) {
            C7771ji jiVar = qlVar.f27974d;
            if (jiVar == null) {
                jiVar = C7771ji.f27210c;
            }
            if ((jiVar.f27212a & 1) != 0) {
                ((C59052c) ((C59052c) C96693d.f270511a.mo56224b()).mo56372aa(20851)).mo56386p("#fetchAndUpdateConfigurationInternal: Response received");
                C7771ji jiVar2 = qlVar.f27974d;
                if (jiVar2 == null) {
                    jiVar2 = C7771ji.f27210c;
                }
                C7661fg fgVar = jiVar2.f27213b;
                if (fgVar == null) {
                    fgVar = C7661fg.f26585n;
                }
                C91611a.m149878b(F, fgVar, dVar.f270515g);
            }
        }
        return C118826c.f331423b;
    }
}
