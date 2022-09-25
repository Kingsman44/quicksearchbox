package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.gms.tasks.C146039s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.ak */
/* compiled from: PG */
public final /* synthetic */ class C100984ak implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ C100988ao f282057a;

    public /* synthetic */ C100984ak(C100988ao aoVar) {
        this.f282057a = aoVar;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        C100988ao aoVar = this.f282057a;
        C59104x c = C100988ao.f282061e.mo56225c();
        c.mo56378ag(C58975e.f156826a, "TrainRegHelperFatBrella");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(19643)).mo56389s("Failed to queue install of %s", "fedora_brella_feature_module");
        aoVar.f282055d.mo24621c("Fedora.Brella.InstallSplitApkStartStatus", 0);
    }
}
