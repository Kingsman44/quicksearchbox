package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119835cc;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119871dl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119873dn;
import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119938a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.am */
/* compiled from: PG */
public final /* synthetic */ class C119956am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119966aw f334047a;

    public /* synthetic */ C119956am(C119966aw awVar) {
        this.f334047a = awVar;
    }

    public final void run() {
        C119966aw awVar = this.f334047a;
        awVar.f334073h = 2;
        C119834cb cbVar = awVar.f334069d;
        C119836cd a = C119836cd.m198736a(awVar.f334070e.f335690j);
        if (a == null) {
            a = C119836cd.UNRECOGNIZED;
        }
        C59104x b = C119966aw.f334066a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConvEngine.ClientInteraction");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C119938a.f334011a, cbVar.f333767a);
        ((C59052c) cVar.mo56372aa(34619)).mo56389s("#interactionStarted %s", a.name());
        C119871dl dlVar = (C119871dl) C119873dn.f333836c.createBuilder();
        C119835cc ccVar = (C119835cc) C119837ce.f333775c.createBuilder();
        ccVar.copyOnWrite();
        cbVar.getClass();
        ((C119837ce) ccVar.instance).f333777a = cbVar;
        ccVar.copyOnWrite();
        ((C119837ce) ccVar.instance).f333778b = a.getNumber();
        C119837ce ceVar = (C119837ce) ccVar.build();
        dlVar.copyOnWrite();
        C119873dn dnVar = (C119873dn) dlVar.instance;
        ceVar.getClass();
        dnVar.f333839b = ceVar;
        dnVar.f333838a = 6;
        awVar.mo104590b((C119873dn) dlVar.build());
        for (C119873dn b2 : awVar.f334072g) {
            awVar.mo104590b(b2);
        }
        awVar.f334072g.clear();
        awVar.mo104591c(awVar.f334067b.mo104886a(), new C119961ar(awVar));
        awVar.mo104591c(awVar.f334067b.mo104887b(), new C119962as(awVar));
        awVar.mo104591c(awVar.f334068c.mo104778a(), new C119963at(awVar));
    }
}
