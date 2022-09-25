package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.p069a.C1364cx;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.C1386m;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.camera.camera2.b.ce */
/* compiled from: PG */
final class C1136ce extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    private final C1384k f3351a;

    public C1136ce(C1384k kVar) {
        if (kVar != null) {
            this.f3351a = kVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        C1364cx cxVar;
        super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        Object tag = captureRequest.getTag();
        if (tag != null) {
            C1974i.m5314b(tag instanceof C1364cx, "The tagBundle object from the CaptureResult is not a TagBundle object.");
            cxVar = (C1364cx) tag;
        } else {
            cxVar = C1364cx.f3852a;
        }
        this.f3351a.mo3870c(new C1131c(cxVar, totalCaptureResult));
    }

    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        this.f3351a.mo3869b(new C1386m());
    }
}
