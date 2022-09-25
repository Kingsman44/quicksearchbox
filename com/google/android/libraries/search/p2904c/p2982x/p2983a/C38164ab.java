package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.x.a.ab */
/* compiled from: PG */
final class C38164ab implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Runnable f101124a;

    public C38164ab(Runnable runnable) {
        this.f101124a = runnable;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C38166ad.f101128a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
        ((C59052c) ((C59052c) d).mo56372aa(53020)).mo56386p("#audio# Failed to get registerAudioBytesReceiver status.");
        ((C38213v) this.f101124a).f101289a.mo41297c();
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = C38166ad.f101128a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.GrpcHWCRespSender");
            ((C59052c) ((C59052c) d).mo56372aa(53021)).mo56386p("#audio# Registered AudioBytesReceiver with loss of audio bytes.");
        }
    }
}
