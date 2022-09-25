package com.google.android.apps.gsa.nga.engine.p6038j;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119900s;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a.C124445ap;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.n */
/* compiled from: PG */
public final /* synthetic */ class C76200n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C76164aa f211206a;

    /* renamed from: b */
    public final /* synthetic */ C124445ap f211207b;

    public /* synthetic */ C76200n(C76164aa aaVar, C124445ap apVar) {
        this.f211206a = aaVar;
        this.f211207b = apVar;
    }

    public final void run() {
        C119903v vVar;
        C76164aa aaVar = this.f211206a;
        C124445ap apVar = this.f211207b;
        C76167ad adVar = aaVar.f211154k;
        if (adVar != null) {
            C58976aa aaVar2 = C58975e.f156826a;
            C119904w wVar = apVar.f343448b;
            if (wVar == null) {
                wVar = C119904w.f333909c;
            }
            if (C119900s.m198775b(wVar.f333911a) != 0) {
                C76185av avVar = (C76185av) adVar;
                String str = ((C76180aq) avVar.f211180d.get()).f211171a;
                C119904w wVar2 = apVar.f343448b;
                if (wVar2 == null) {
                    wVar2 = C119904w.f333909c;
                }
                if (wVar2.f333911a == 2) {
                    vVar = (C119903v) wVar2.f333912b;
                } else {
                    vVar = C119903v.f333904d;
                }
                if (C119902u.m198776a(vVar.f333906a) != 0) {
                    C119904w wVar3 = apVar.f343448b;
                    if (wVar3 == null) {
                        wVar3 = C119904w.f333909c;
                    }
                    int b = C119900s.m198775b(wVar3.f333911a);
                    String a = C119900s.m198774a(b);
                    if (b != 0) {
                        avVar.mo72118b("onAssistantStateUpdateEvent ".concat(a), new C76170ag(avVar, apVar));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }
}
