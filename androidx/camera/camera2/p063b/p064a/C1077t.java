package androidx.camera.camera2.p063b.p064a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.a.t */
/* compiled from: PG */
public class C1077t {

    /* renamed from: a */
    public final CameraManager f3213a;

    public C1077t(Context context) {
        this.f3213a = (CameraManager) context.getSystemService("camera");
    }

    /* renamed from: a */
    public CameraCharacteristics mo3788a(String str) {
        throw null;
    }

    /* renamed from: b */
    public void mo3789b(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        throw null;
    }

    /* renamed from: c */
    public final String[] mo3790c() {
        try {
            return this.f3213a.getCameraIdList();
        } catch (CameraAccessException e) {
            throw new C1062e(e);
        }
    }
}
