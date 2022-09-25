package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.by */
/* compiled from: PG */
final class C14837by implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C14842cc f44674a;

    public C14837by(C14842cc ccVar) {
        this.f44674a = ccVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C14842cc.f44681a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
        ((C59052c) ((C59052c) c).mo56372aa(45576)).mo56386p("#getMediaStatusReadyEventFuture failed.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C14492lf lfVar = (C14492lf) obj;
        if (lfVar == null) {
            C59104x c = C14842cc.f44681a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "Morris.MediaDataSrc");
            ((C59052c) ((C59052c) c).mo56372aa(45577)).mo56386p("MediaStatusReadyEvent returned from #getMediaStatusReadyEventFuture is null.");
            return;
        }
        this.f44674a.f44683b.mo21875g(lfVar);
    }
}
