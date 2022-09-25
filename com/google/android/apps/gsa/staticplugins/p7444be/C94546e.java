package com.google.android.apps.gsa.staticplugins.p7444be;

import com.google.android.apps.gsa.assistant.shared.bo;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6513aj.C84538aw;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87868go;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87869gp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87870gq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.be.e */
/* compiled from: PG */
public final /* synthetic */ class C94546e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C94552k f264442a;

    /* renamed from: b */
    public final /* synthetic */ aaj f264443b;

    public /* synthetic */ C94546e(C94552k kVar, aaj aaj) {
        this.f264442a = kVar;
        this.f264443b = aaj;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        ClientConfig clientConfig;
        C94552k kVar = this.f264442a;
        aaj aaj = this.f264443b;
        C58976aa aaVar = C58975e.f156826a;
        boolean z = aaj.f237078b;
        boolean z2 = aaj.f237079c;
        boolean z3 = aaj.f237080d;
        if (aaj.f237081e) {
            C59104x b = C94552k.f264451a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
            ((C59052c) ((C59052c) b).mo56372aa(20145)).mo56386p("handleVSHFEvent(): Proxy voice cancel");
            kVar.mo88497f();
            if (((C84538aw) kVar.f264476r.mo27525b()).mo78249e()) {
                ((C84617a) kVar.f264482x.mo27525b()).mo78379b();
            }
            kVar.f264474p.mo28212l("notify ssbservice exiting Aog converastion by user taping the scrim", C94542a.f264433a);
            return C118826c.f331423b;
        }
        C86775r rVar = kVar.f264462b.f233977l;
        if (rVar != null) {
            clientConfig = rVar.f234384f;
        } else {
            clientConfig = ClientConfig.f236948a;
        }
        int i = 2;
        if (rVar == null || !BitFlags.m148144f(clientConfig.f236949b.f253762b, 35184372088832L) || ((!z && z3) || z2)) {
            if (((bo) kVar.f264469k.mo27525b()).s(true, 4)) {
                ((bo) kVar.f264469k.mo27525b()).x(2, 3);
            }
            return kVar.f264474p.mo28209i(kVar.f264472n.mo85138c(new C94550i(kVar)), String.format("%s: isScreenLocked()", new Object[]{"HandsFreeWorker"}), new C94543b(kVar, aaj, clientConfig, z, z3));
        }
        if (clientConfig.f236951d == amo.ANDROID_AUTO_PHONE) {
            if (z) {
                kVar.f264480v.mo83702b(C89849ae.AAV_START_PROXY_VOICE_BUTTON);
            } else {
                kVar.f264480v.mo83702b(C89849ae.AAV_START_BLUETOOTH);
            }
        }
        long j = rVar.f234381c;
        C86775r rVar2 = kVar.f264462b.f233977l;
        if (rVar2 == null || rVar2.f234381c != j) {
            C59104x c = C94552k.f264451a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HandsFreeWorker");
            ((C59052c) ((C59052c) c).mo56372aa(20157)).mo56351D("Client %d not active client: %s", j, rVar2);
        } else {
            C87684al alVar = new C87684al(C88244um.HANDSFREE_EVENT);
            C62940bt btVar = C87868go.f237720a;
            C87869gp gpVar = (C87869gp) C87870gq.f237721c.createBuilder();
            if (true == z) {
                i = 1;
            }
            gpVar.copyOnWrite();
            C87870gq gqVar = (C87870gq) gpVar.instance;
            gqVar.f237724b = i;
            gqVar.f237723a |= 1;
            alVar.mo81965b(btVar, (C87870gq) gpVar.build());
            rVar2.f234383e.mo80379b(alVar.mo81964a());
        }
        return C118826c.f331423b;
    }
}
