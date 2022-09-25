package com.google.android.apps.gsa.p8839t.p8841b;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8174ab.p8177c.C105988a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64279a;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64296ao;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64298aq;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64308b;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64347w;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64348x;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.t.b.a */
/* compiled from: PG */
public final /* synthetic */ class C118342a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C118345d f328482a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f328483b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f328484c;

    public /* synthetic */ C118342a(C118345d dVar, SettableFuture settableFuture, C53306j jVar) {
        this.f328482a = dVar;
        this.f328483b = settableFuture;
        this.f328484c = jVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C118345d dVar = this.f328482a;
        SettableFuture settableFuture = this.f328483b;
        C53306j jVar = this.f328484c;
        if (((C89062r) obj).mo83040a()) {
            C59104x b = C118345d.f328487a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.HmAutomationMng");
            ((C59052c) ((C59052c) b).mo56372aa(6933)).mo56386p("fetchHomeAutomationRecommendationListAsync()");
            if (!dVar.f328490d.mo56113h()) {
                settableFuture.mo57356n(C58836b.f156633a);
                C59104x d = C118345d.f328487a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "PCP.HmAutomationMng");
                ((C59052c) ((C59052c) d).mo56372aa(6934)).mo56386p("Entry point not present");
                return;
            }
            C64279a aVar = (C64279a) C64308b.f173874c.createBuilder();
            C53306j jVar2 = C53306j.UNKNOWNN;
            int ordinal = jVar.ordinal();
            int i = (ordinal == 25 || ordinal == 30) ? 8 : 6;
            C64347w wVar = (C64347w) C64348x.f173944c.createBuilder();
            C64296ao aoVar = (C64296ao) C64298aq.f173843d.createBuilder();
            aoVar.copyOnWrite();
            C64298aq aqVar = (C64298aq) aoVar.instance;
            aqVar.f173846b = i - 1;
            aqVar.f173845a |= 4;
            String b2 = ((bm) dVar.f328491e.mo27525b()).b();
            aoVar.copyOnWrite();
            C64298aq aqVar2 = (C64298aq) aoVar.instance;
            b2.getClass();
            aqVar2.f173845a = 8 | aqVar2.f173845a;
            aqVar2.f173847c = b2;
            wVar.copyOnWrite();
            C64348x xVar = (C64348x) wVar.instance;
            C64298aq aqVar3 = (C64298aq) aoVar.build();
            aqVar3.getClass();
            xVar.f173947b = aqVar3;
            xVar.f173946a |= 1;
            C64348x xVar2 = (C64348x) wVar.build();
            aVar.copyOnWrite();
            C64308b bVar = (C64308b) aVar.instance;
            xVar2.getClass();
            bVar.f173877b = xVar2;
            bVar.f173876a = 4;
            ((C105988a) ((C68214a) dVar.f328490d.mo56107c()).mo27525b()).mo95204a((C64308b) aVar.build(), new C118344c(settableFuture)).mo95206a();
            return;
        }
        C59104x d2 = C118345d.f328487a.mo56226d();
        d2.mo56378ag(C58975e.f156826a, "PCP.HmAutomationMng");
        ((C59052c) ((C59052c) d2).mo56372aa(6935)).mo56386p("No network connection");
        settableFuture.mo57356n(C58836b.f156633a);
    }
}
