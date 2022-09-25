package com.google.android.apps.gsa.p8839t.p8841b;

import com.google.android.apps.gsa.opa.p6440e.C83608a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64328d;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64350z;

/* renamed from: com.google.android.apps.gsa.t.b.c */
/* compiled from: PG */
public final /* synthetic */ class C118344c implements C83608a {

    /* renamed from: a */
    public final /* synthetic */ SettableFuture f328486a;

    public /* synthetic */ C118344c(SettableFuture settableFuture) {
        this.f328486a = settableFuture;
    }

    /* renamed from: a */
    public final void mo76967a(C64328d dVar) {
        C64350z zVar;
        C64350z zVar2;
        SettableFuture settableFuture = this.f328486a;
        if (dVar.f173912a == 4) {
            C59104x b = C118345d.f328487a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.HmAutomationMng");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(6938);
            if (dVar.f173912a == 4) {
                zVar = (C64350z) dVar.f173913b;
            } else {
                zVar = C64350z.f173949b;
            }
            cVar.mo56387q("Explicit automation response present, rec count %d", zVar.f173951a.size());
            if (dVar.f173912a == 4) {
                zVar2 = (C64350z) dVar.f173913b;
            } else {
                zVar2 = C64350z.f173949b;
            }
            settableFuture.mo57356n(C58833ax.m90834k(C58485gu.m89842j(zVar2.f173951a)));
            return;
        }
        C59104x d = C118345d.f328487a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.HmAutomationMng");
        ((C59052c) ((C59052c) d).mo56372aa(6937)).mo56386p("Explicit automation response not present");
    }
}
