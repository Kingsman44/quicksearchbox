package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.b.ep */
/* compiled from: PG */
final class C1201ep extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C1202eq f3526a;

    public C1201ep(C1202eq eqVar) {
        this.f3526a = eqVar;
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface inputSurface = cameraCaptureSession.getInputSurface();
        if (inputSurface != null) {
            this.f3526a.f3536j = ImageWriter.newInstance(inputSurface, 1);
        }
    }
}
