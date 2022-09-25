package androidx.camera.camera2.p063b.p064a;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.b.a.b */
/* compiled from: PG */
public final class C1009b {
    /* renamed from: a */
    public static void m3020a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
