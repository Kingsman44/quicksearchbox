package com.google.android.apps.gsa.voiceinteraction.hotword;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.d */
/* compiled from: PG */
final class C118716d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C118719g f331136a;

    public C118716d(C118719g gVar) {
        this.f331136a = gVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C118719g.f331138a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(34094)).mo56386p("startHotwordDetection failed with error.");
        this.f331136a.mo103915g();
        this.f331136a.mo103917i();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C59104x b = C118719g.f331138a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HwDetectorWithState");
            ((C59052c) ((C59052c) b).mo56372aa(34095)).mo56386p("startHotwordDetection failed. Will re-try after some time.");
            this.f331136a.mo103915g();
            this.f331136a.mo103917i();
        }
    }
}
