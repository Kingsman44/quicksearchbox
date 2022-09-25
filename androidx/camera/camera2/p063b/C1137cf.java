package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.p069a.C1384k;

/* renamed from: androidx.camera.camera2.b.cf */
/* compiled from: PG */
final class C1137cf extends C1384k {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f3352a;

    public C1137cf(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f3352a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
