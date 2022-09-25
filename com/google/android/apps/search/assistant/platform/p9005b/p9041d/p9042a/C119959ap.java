package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119838cf;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119839cg;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119840ch;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119842cj;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119871dl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120698m;
import com.google.android.apps.search.assistant.platform.p9080f.p9109g.C120699n;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33458l;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33460n;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C119959ap implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119966aw f334051a;

    /* renamed from: b */
    public final /* synthetic */ C33461o f334052b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f334053c;

    public /* synthetic */ C119959ap(C119966aw awVar, C33461o oVar, C2164c cVar) {
        this.f334051a = awVar;
        this.f334052b = oVar;
        this.f334053c = cVar;
    }

    public final void run() {
        C119966aw awVar = this.f334051a;
        C33461o oVar = this.f334052b;
        C2164c cVar = this.f334053c;
        C119834cb cbVar = awVar.f334069d;
        C119838cf cfVar = (C119838cf) C119844cl.f333788d.createBuilder();
        cfVar.copyOnWrite();
        cbVar.getClass();
        ((C119844cl) cfVar.instance).f333792c = cbVar;
        C120698m mVar = C120698m.OPENING_MICROPHONE;
        C120699n nVar = C120699n.EMPTY;
        int a = oVar.mo38842a();
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                C59104x b = C119966aw.f334066a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                C59052c cVar2 = (C59052c) b;
                cVar2.mo56378ag(C119938a.f334011a, cbVar.f333767a);
                ((C59052c) cVar2.mo56372aa(34616)).mo56386p("#interactionFinished: utterance finished: success");
                C33460n c = oVar.mo38855c();
                C119842cj cjVar = (C119842cj) C119843ck.f333783d.createBuilder();
                boolean b2 = c.mo38864b();
                cjVar.copyOnWrite();
                ((C119843ck) cjVar.instance).f333786b = !b2;
                C33457k a2 = c.mo38863a();
                cjVar.copyOnWrite();
                C119843ck ckVar = (C119843ck) cjVar.instance;
                a2.getClass();
                ckVar.f333787c = a2;
                ckVar.f333785a |= 1;
                C119843ck ckVar2 = (C119843ck) cjVar.build();
                cfVar.copyOnWrite();
                C119844cl clVar = (C119844cl) cfVar.instance;
                ckVar2.getClass();
                clVar.f333791b = ckVar2;
                clVar.f333790a = 2;
            } else if (i == 1) {
                C59104x d = C119966aw.f334066a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                C59052c cVar3 = (C59052c) d;
                cVar3.mo56378ag(C119938a.f334011a, cbVar.f333767a);
                ((C59052c) ((C59052c) cVar3.mo56382g(oVar.mo38851b().mo38859a())).mo56372aa(34617)).mo56386p("#interactionFinished: utterance failed");
                C33458l b3 = oVar.mo38851b();
                C119839cg cgVar = (C119839cg) C119840ch.f333779b.createBuilder();
                C34822b b4 = C34830d.m63595b(b3.mo38859a());
                cgVar.copyOnWrite();
                b4.getClass();
                ((C119840ch) cgVar.instance).f333781a = b4;
                cfVar.copyOnWrite();
                C119844cl clVar2 = (C119844cl) cfVar.instance;
                C119840ch chVar = (C119840ch) cgVar.build();
                chVar.getClass();
                clVar2.f333791b = chVar;
                clVar2.f333790a = 4;
            } else if (i == 2) {
                C59104x b5 = C119966aw.f334066a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
                C59052c cVar4 = (C59052c) b5;
                cVar4.mo56378ag(C119938a.f334011a, cbVar.f333767a);
                ((C59052c) cVar4.mo56372aa(34618)).mo56386p("#interactionFinished: utterance was cancelled");
                C62912at atVar = C62912at.f169862a;
                cfVar.copyOnWrite();
                C119844cl clVar3 = (C119844cl) cfVar.instance;
                atVar.getClass();
                clVar3.f333791b = atVar;
                clVar3.f333790a = 3;
            }
            C119871dl dlVar = (C119871dl) C119873dn.f333836c.createBuilder();
            dlVar.copyOnWrite();
            C119873dn dnVar = (C119873dn) dlVar.instance;
            C119844cl clVar4 = (C119844cl) cfVar.build();
            clVar4.getClass();
            dnVar.f333839b = clVar4;
            dnVar.f333838a = 4;
            awVar.mo104590b((C119873dn) dlVar.build());
            awVar.f334073h = 3;
            cVar.mo5437b((Object) null);
            return;
        }
        throw null;
    }
}
