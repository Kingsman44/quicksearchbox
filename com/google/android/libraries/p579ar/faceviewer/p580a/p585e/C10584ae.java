package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.mediapipe.p4722a.C62708j;
import com.google.protos.youtube.p5162a.p5163a.C65980aj;
import com.google.protos.youtube.p5162a.p5163a.C65991h;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.ae */
/* compiled from: PG */
final class C10584ae implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C62708j f35405a;

    public C10584ae(C62708j jVar) {
        this.f35405a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C10587ah.f35407a.mo56225c()).mo56382g(th)).mo56372aa(42291)).mo56386p("Failed to set alignment.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C65991h hVar = ((C65980aj) obj).f179456b;
        if (hVar == null) {
            hVar = C65991h.f179478e;
        }
        float f = hVar.f179482c;
        C62708j jVar = this.f35405a;
        jVar.f169310e = 0.5f;
        jVar.f169311f = 1.0f - f;
    }
}
