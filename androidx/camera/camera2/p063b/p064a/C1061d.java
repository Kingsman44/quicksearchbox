package androidx.camera.camera2.p063b.p064a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: androidx.camera.camera2.b.a.d */
/* compiled from: PG */
public final class C1061d {
    /* renamed from: a */
    public static OutputConfiguration m3040a(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    /* renamed from: b */
    public static void m3041b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
