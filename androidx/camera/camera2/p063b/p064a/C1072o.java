package androidx.camera.camera2.p063b.p064a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.p063b.p064a.p065a.C1008m;

/* renamed from: androidx.camera.camera2.b.a.o */
/* compiled from: PG */
final class C1072o extends C1071n {
    public C1072o(CameraDevice cameraDevice) {
        super(cameraDevice);
    }

    /* renamed from: a */
    public final void mo3786a(C1008m mVar) {
        try {
            this.f3210a.createCaptureSession(mVar.f3150a.f3149a);
        } catch (CameraAccessException e) {
            throw new C1062e(e);
        }
    }
}
