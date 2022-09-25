package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: androidx.camera.camera2.b.bs */
/* compiled from: PG */
final class C1123bs {
    /* renamed from: a */
    static CaptureRequest.Builder m3146a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
        return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
    }
}
