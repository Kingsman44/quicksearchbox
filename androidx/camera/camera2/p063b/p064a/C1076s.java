package androidx.camera.camera2.p063b.p064a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.a.s */
/* compiled from: PG */
final class C1076s extends C1075r {
    public C1076s(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final CameraCharacteristics mo3788a(String str) {
        try {
            return this.f3213a.getCameraCharacteristics(str);
        } catch (CameraAccessException e) {
            throw new C1062e(e);
        }
    }

    /* renamed from: b */
    public final void mo3789b(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        try {
            this.f3213a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw new C1062e(e);
        }
    }
}
