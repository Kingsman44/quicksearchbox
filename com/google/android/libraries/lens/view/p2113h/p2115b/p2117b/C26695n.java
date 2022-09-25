package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.n */
/* compiled from: PG */
final class C26695n extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final /* synthetic */ C26701t f72775a;

    public C26695n(C26701t tVar) {
        this.f72775a = tVar;
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C26701t tVar = this.f72775a;
        if (cameraCaptureSession == tVar.f72797j) {
            tVar.f72803p = C26682a.m49313m(totalCaptureResult);
            this.f72775a.f72804q = C26682a.m49304d(totalCaptureResult);
            this.f72775a.f72805r = C58833ax.m90833j((Rect) totalCaptureResult.get(CaptureResult.SCALER_CROP_REGION));
            this.f72775a.f72806s = C26682a.m49307g(totalCaptureResult);
            this.f72775a.f72807t = C26682a.m49312l(captureRequest);
            this.f72775a.f72808u = C26682a.m49301a(totalCaptureResult);
            this.f72775a.f72809v = C26682a.m49305e(totalCaptureResult);
        }
    }
}
