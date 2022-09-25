package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.hardware.camera2.CameraCaptureSession;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.m */
/* compiled from: PG */
final class C26694m extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C26701t f72774a;

    public C26694m(C26701t tVar) {
        this.f72774a = tVar;
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        C59071e eVar = C26701t.f72779a;
        this.f72774a.mo32008f("captureSessionCallback.onClosed");
        C26701t tVar = this.f72774a;
        if (tVar.f72797j == cameraCaptureSession) {
            tVar.mo32006b();
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C59071e eVar = C26701t.f72779a;
        this.f72774a.mo32008f("captureSessionCallback.onConfigureFailed");
        C26693l lVar = new C26693l(this, cameraCaptureSession);
        if (this.f72774a.mo32012p()) {
            lVar.run();
        } else {
            this.f72774a.f72790c.post(C47810es.m84977q(lVar));
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C59071e eVar = C26701t.f72779a;
        this.f72774a.mo32008f("captureSessionCallback.onConfigured");
        C26701t tVar = this.f72774a;
        if (tVar.f72795h == null) {
            ((C59052c) ((C59052c) C26701t.f72779a.mo56226d()).mo56372aa(49082)).mo56386p("Capture session opened, but camera is closed.");
            return;
        }
        tVar.f72797j = cameraCaptureSession;
        tVar.mo32010h();
    }
}
