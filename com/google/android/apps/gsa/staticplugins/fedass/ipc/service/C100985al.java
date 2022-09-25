package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.play.core.p3538g.C45188w;
import com.google.apps.tiktok.tracing.contrib.p3707h.C47689c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.al */
/* compiled from: PG */
public final /* synthetic */ class C100985al implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C100988ao f282058a;

    public /* synthetic */ C100985al(C100988ao aoVar) {
        this.f282058a = aoVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C100988ao aoVar = this.f282058a;
        C59104x b = C100988ao.f282061e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "TrainRegHelperFatBrella");
        ((C59052c) ((C59052c) b).mo56372aa(19640)).mo56389s("Installing %s...", "fedora_brella_feature_module");
        aoVar.f282055d.mo24619a("Fedora.Brella.NumInstallSplitApkStart");
        C146006ab a = C45188w.m80459a(aoVar.f282053b).mo48994a(Arrays.asList(new String[]{"fedora_brella_feature_module"}));
        a.mo122499r(new C100983aj(aoVar));
        a.mo122498q(new C100984ak(aoVar));
        return C47689c.m84830a(a);
    }
}
