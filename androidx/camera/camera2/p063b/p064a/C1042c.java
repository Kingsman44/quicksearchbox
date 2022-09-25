package androidx.camera.camera2.p063b.p064a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.b.a.c */
/* compiled from: PG */
public final class C1042c {
    /* renamed from: a */
    public static void m3032a(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
    }
}
