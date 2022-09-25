package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123728av;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123741bh;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123742bi;
import com.google.android.libraries.assistant.pcp.p1573k.C18925e;
import com.google.android.libraries.logging.C28260b;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52563wj;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.assistant.p3980n.p3985c.C53021l;
import com.google.assistant.p3980n.p3985c.C53024o;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.protos.p4816ai.p4818b.C63203i;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cb */
/* compiled from: PG */
public final /* synthetic */ class C18856cb implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18868cn f53101a;

    /* renamed from: b */
    public final /* synthetic */ C123742bi f53102b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f53103c;

    public /* synthetic */ C18856cb(C18868cn cnVar, C123742bi biVar, C53306j jVar) {
        this.f53101a = cnVar;
        this.f53102b = biVar;
        this.f53103c = jVar;
    }

    public final Object apply(Object obj) {
        C52560wg wgVar;
        C18868cn cnVar = this.f53101a;
        C123742bi biVar = this.f53102b;
        C53306j jVar = this.f53103c;
        C58833ax axVar = (C58833ax) obj;
        C123741bh bhVar = (C123741bh) C123742bi.f341800b.createBuilder(biVar);
        cnVar.f53117c = C28260b.m52825a();
        C53019j jVar2 = (C53019j) C53020k.f138970d.createBuilder();
        C53021l lVar = (C53021l) C53024o.f138977d.createBuilder();
        lVar.copyOnWrite();
        C53024o oVar = (C53024o) lVar.instance;
        oVar.f138981c = 2;
        oVar.f138979a |= 4;
        jVar2.copyOnWrite();
        C53020k kVar = (C53020k) jVar2.instance;
        C53024o oVar2 = (C53024o) lVar.build();
        oVar2.getClass();
        kVar.f138973b = oVar2;
        kVar.f138972a |= 1;
        if (cnVar.f53124j.contains(Integer.valueOf(jVar.f139793X))) {
            wgVar = C18925e.m36385c(cnVar.f53118d);
        } else {
            wgVar = C18925e.m36384b(cnVar.f53118d);
        }
        int i = 0;
        if (!axVar.mo56113h() || ((C123728av) axVar.mo56107c()).f341758d.isEmpty()) {
            ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47465)).mo56386p("Fallback podcast recommendations don't exist.");
            C52559wf wfVar = (C52559wf) wgVar.toBuilder();
            C63203i iVar = (C63203i) C63204j.f170749e.createBuilder();
            iVar.copyOnWrite();
            C63204j jVar3 = (C63204j) iVar.instance;
            jVar3.f170753c = 3;
            jVar3.f170754d = 0;
            C60218r rVar = cnVar.f53117c;
            iVar.copyOnWrite();
            C63204j jVar4 = (C63204j) iVar.instance;
            rVar.getClass();
            jVar4.f170752b = rVar;
            jVar4.f170751a = 2;
            wfVar.copyOnWrite();
            C52560wg wgVar2 = (C52560wg) wfVar.instance;
            C63204j jVar5 = (C63204j) iVar.build();
            jVar5.getClass();
            wgVar2.f137953i = jVar5;
            wgVar2.f137945a |= 8192;
            jVar2.mo53956a((C52560wg) wfVar.build());
        } else {
            for (C52560wg wgVar3 : ((C123728av) axVar.mo56107c()).f341758d) {
                C52559wf wfVar2 = (C52559wf) wgVar3.toBuilder();
                C52568wo woVar = wgVar3.f137950f;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                C52563wj wjVar = (C52563wj) woVar.toBuilder();
                C52567wn wnVar = C52567wn.PODCAST_EPISODE;
                wjVar.copyOnWrite();
                C52568wo woVar2 = (C52568wo) wjVar.instance;
                woVar2.f138003j = wnVar.f137991y;
                woVar2.f137994a |= 512;
                wfVar2.copyOnWrite();
                C52560wg wgVar4 = (C52560wg) wfVar2.instance;
                C52568wo woVar3 = (C52568wo) wjVar.build();
                woVar3.getClass();
                wgVar4.f137950f = woVar3;
                wgVar4.f137945a |= 8;
                C51098gh ghVar = wgVar3.f137949e;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                C51097gg ggVar = (C51097gg) ghVar.toBuilder();
                ggVar.copyOnWrite();
                C51098gh ghVar2 = (C51098gh) ggVar.instance;
                ghVar2.f133011a |= 1024;
                ghVar2.f133014d = "https://fonts.gstatic.com/s/i/productlogos/podcasts_round/v7/web-48dp/logo_podcasts_round_color_2x_web_48dp.png";
                wfVar2.copyOnWrite();
                C52560wg wgVar5 = (C52560wg) wfVar2.instance;
                C51098gh ghVar3 = (C51098gh) ggVar.build();
                ghVar3.getClass();
                wgVar5.f137949e = ghVar3;
                wgVar5.f137945a |= 4;
                C63203i iVar2 = (C63203i) C63204j.f170749e.createBuilder();
                int i2 = i + 1;
                iVar2.copyOnWrite();
                C63204j jVar6 = (C63204j) iVar2.instance;
                jVar6.f170753c = 3;
                jVar6.f170754d = Integer.valueOf(i);
                C60218r rVar2 = cnVar.f53117c;
                iVar2.copyOnWrite();
                C63204j jVar7 = (C63204j) iVar2.instance;
                rVar2.getClass();
                jVar7.f170752b = rVar2;
                jVar7.f170751a = 2;
                wfVar2.copyOnWrite();
                C52560wg wgVar6 = (C52560wg) wfVar2.instance;
                C63204j jVar8 = (C63204j) iVar2.build();
                jVar8.getClass();
                wgVar6.f137953i = jVar8;
                wgVar6.f137945a |= 8192;
                jVar2.mo53956a((C52560wg) wfVar2.build());
                if (i2 == 1) {
                    C52559wf wfVar3 = (C52559wf) wgVar.toBuilder();
                    C63203i iVar3 = (C63203i) C63204j.f170749e.createBuilder();
                    iVar3.copyOnWrite();
                    C63204j jVar9 = (C63204j) iVar3.instance;
                    jVar9.f170753c = 3;
                    jVar9.f170754d = 1;
                    C60218r rVar3 = cnVar.f53117c;
                    iVar3.copyOnWrite();
                    C63204j jVar10 = (C63204j) iVar3.instance;
                    rVar3.getClass();
                    jVar10.f170752b = rVar3;
                    jVar10.f170751a = 2;
                    wfVar3.copyOnWrite();
                    C52560wg wgVar7 = (C52560wg) wfVar3.instance;
                    C63204j jVar11 = (C63204j) iVar3.build();
                    jVar11.getClass();
                    wgVar7.f137953i = jVar11;
                    wgVar7.f137945a |= 8192;
                    jVar2.mo53956a((C52560wg) wfVar3.build());
                    i = 2;
                } else {
                    i = i2;
                }
            }
        }
        ((C59052c) ((C59052c) C18868cn.f53115a.mo56224b()).mo56372aa(47466)).mo56387q("Fallback Google Podcast and News recommendations size %d", ((C53020k) jVar2.instance).f138974c.size());
        bhVar.mo106122b(jVar2);
        return (C123742bi) bhVar.build();
    }
}
