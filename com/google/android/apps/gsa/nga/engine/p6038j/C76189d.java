package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.C78712r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119840ch;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119841ci;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124445ap;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124447ar;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124450au;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124454ay;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124455az;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.d */
/* compiled from: PG */
public final /* synthetic */ class C76189d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76193h f211186a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f211187b;

    /* renamed from: c */
    public final /* synthetic */ C124455az f211188c;

    public /* synthetic */ C76189d(C76193h hVar, AccountId accountId, C124455az azVar) {
        this.f211186a = hVar;
        this.f211187b = accountId;
        this.f211188c = azVar;
    }

    public final void run() {
        C124450au auVar;
        C124450au auVar2;
        C119843ck ckVar;
        C119840ch chVar;
        C76193h hVar = this.f211186a;
        AccountId accountId = this.f211187b;
        C124455az azVar = this.f211188c;
        if (hVar.f211196c.equals(accountId)) {
            C76188c cVar = hVar.f211194a;
            int i = azVar.f343466a;
            if (i == 4) {
                C78712r rVar = ((C76164aa) cVar).f211148e;
                C119785ag agVar = ((C124447ar) azVar.f343467b).f343452b;
                if (agVar == null) {
                    agVar = C119785ag.f333648b;
                }
                rVar.mo73589a(((float) agVar.f333650a) / 100.0f);
            } else if (i == 3) {
                C124454ay ayVar = (C124454ay) azVar.f343467b;
                C58976aa aaVar = C58975e.f156826a;
                C119885dz dzVar = ayVar.f343463b;
                if (dzVar == null) {
                    dzVar = C119885dz.f333865f;
                }
                String str = dzVar.f333868b;
                C76164aa aaVar2 = (C76164aa) cVar;
                C76164aa.m122746c(C60856cj.m92903l(C47810es.m84977q(new C76201o(aaVar2, ayVar)), aaVar2.f211150g), "[NGA] onTranscription");
                aaVar2.f211146c.t(true);
            } else if (i == 2) {
                C124445ap apVar = (C124445ap) azVar.f343467b;
                C58976aa aaVar3 = C58975e.f156826a;
                C119904w wVar = apVar.f343448b;
                if (wVar == null) {
                    wVar = C119904w.f333909c;
                }
                if (C119900s.m198775b(wVar.f333911a) != 0) {
                    C76164aa aaVar4 = (C76164aa) cVar;
                    C76164aa.m122746c(C60856cj.m92903l(C47810es.m84977q(new C76200n(aaVar4, apVar)), aaVar4.f211150g), "[NGA] onAssistantUpdateEvent");
                    return;
                }
                throw null;
            } else if (i == 5) {
                C58976aa aaVar5 = C58975e.f156826a;
                if (azVar.f343466a == 5) {
                    auVar = (C124450au) azVar.f343467b;
                } else {
                    auVar = C124450au.f343453c;
                }
                C119844cl clVar = auVar.f343456b;
                if (clVar == null) {
                    clVar = C119844cl.f333788d;
                }
                if (C119841ci.m198738b(clVar.f333790a) != 0) {
                    if (azVar.f343466a == 5) {
                        auVar2 = (C124450au) azVar.f343467b;
                    } else {
                        auVar2 = C124450au.f343453c;
                    }
                    C119844cl clVar2 = auVar2.f343456b;
                    int b = C119841ci.m198738b((clVar2 == null ? C119844cl.f333788d : clVar2).f333790a);
                    int i2 = b - 1;
                    if (b == 0) {
                        throw null;
                    } else if (i2 == 0) {
                        if (clVar2 == null) {
                            clVar2 = C119844cl.f333788d;
                        }
                        if (clVar2.f333790a == 2) {
                            ckVar = (C119843ck) clVar2.f333791b;
                        } else {
                            ckVar = C119843ck.f333783d;
                        }
                        if (ckVar.f333786b) {
                            C76164aa aaVar6 = (C76164aa) cVar;
                            C76164aa.m122746c(C60856cj.m92903l(C47810es.m84977q(new C76204r(aaVar6)), aaVar6.f211150g), "[NGA] onTimeout");
                            return;
                        }
                        C76164aa aaVar7 = (C76164aa) cVar;
                        C76164aa.m122746c(C60856cj.m92903l(C47810es.m84977q(new C76202p(aaVar7)), aaVar7.f211150g), "[NGA] onStopped");
                    } else if (i2 == 1) {
                        C76164aa aaVar8 = (C76164aa) cVar;
                        C76164aa.m122746c(C60856cj.m92903l(C47810es.m84977q(new C76196j(aaVar8)), aaVar8.f211150g), "[NGA] onCancelled");
                    } else if (i2 == 2) {
                        if (clVar2 == null) {
                            clVar2 = C119844cl.f333788d;
                        }
                        if (clVar2.f333790a == 4) {
                            chVar = (C119840ch) clVar2.f333791b;
                        } else {
                            chVar = C119840ch.f333779b;
                        }
                        C34822b bVar = chVar.f333781a;
                        if (bVar == null) {
                            bVar = C34822b.f92358d;
                        }
                        throw new IllegalStateException(bVar.f92361b);
                    } else if (i2 == 3) {
                        C59104x d = C76164aa.f211144a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "ConvHandler");
                        ((C58970a) ((C58970a) d).mo56372aa(3136)).mo56386p("Interaction result not set");
                        C76164aa aaVar9 = (C76164aa) cVar;
                        C76164aa.m122746c(C60856cj.m92903l(C47810es.m84977q(new C76203q(aaVar9)), aaVar9.f211150g), "[NGA] onCancelled Result not set");
                    }
                } else {
                    throw null;
                }
            }
        } else {
            ((C59052c) ((C59052c) C76194i.f211198a.mo56226d()).mo56372aa(3133)).mo56386p("Event received on non primary account.");
            hVar.f211195b.mo106410c();
        }
    }
}
