package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.hardware.camera2.CameraCaptureSession;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.l */
/* compiled from: PG */
public final /* synthetic */ class C26693l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26694m f72772a;

    /* renamed from: b */
    public final /* synthetic */ CameraCaptureSession f72773b;

    public /* synthetic */ C26693l(C26694m mVar, CameraCaptureSession cameraCaptureSession) {
        this.f72772a = mVar;
        this.f72773b = cameraCaptureSession;
    }

    public final void run() {
        C26694m mVar = this.f72772a;
        CameraCaptureSession cameraCaptureSession = this.f72773b;
        C59071e eVar = C26701t.f72779a;
        C26701t tVar = mVar.f72774a;
        CameraCaptureSession cameraCaptureSession2 = tVar.f72797j;
        if (cameraCaptureSession2 == cameraCaptureSession || cameraCaptureSession2 == null) {
            tVar.mo32005a();
            mVar.f72774a.mo32009g(new C26699r());
        }
    }
}
