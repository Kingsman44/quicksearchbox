package com.google.android.apps.search.fedora.p10110k.p10113c;

import com.google.android.gms.tasks.C146039s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.fedora.k.c.q */
/* compiled from: PG */
public final /* synthetic */ class C133043q implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ C133046t f362770a;

    public /* synthetic */ C133043q(C133046t tVar) {
        this.f362770a = tVar;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        C133046t tVar = this.f362770a;
        C59104x c = C133046t.f362774a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(39992)).mo56389s("Failed to queue install of %s", "fedora_brella_feature_module");
        tVar.f362779f.mo110965c("FedoraTNG.Brella.InstallSplitApkStartStatus", 0);
    }
}
