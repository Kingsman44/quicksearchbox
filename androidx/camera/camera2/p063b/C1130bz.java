package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.p063b.p064a.C1009b;
import androidx.camera.camera2.p063b.p064a.C1061d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.bz */
/* compiled from: PG */
final class C1130bz extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    private final List f3345a = new ArrayList();

    public C1130bz(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C1132ca)) {
                this.f3345a.add(stateCallback);
            }
        }
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        for (CameraCaptureSession.StateCallback onActive : this.f3345a) {
            onActive.onActive(cameraCaptureSession);
        }
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        for (CameraCaptureSession.StateCallback b : this.f3345a) {
            C1061d.m3041b(b, cameraCaptureSession);
        }
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        for (CameraCaptureSession.StateCallback onClosed : this.f3345a) {
            onClosed.onClosed(cameraCaptureSession);
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        for (CameraCaptureSession.StateCallback onConfigureFailed : this.f3345a) {
            onConfigureFailed.onConfigureFailed(cameraCaptureSession);
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        for (CameraCaptureSession.StateCallback onConfigured : this.f3345a) {
            onConfigured.onConfigured(cameraCaptureSession);
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        for (CameraCaptureSession.StateCallback onReady : this.f3345a) {
            onReady.onReady(cameraCaptureSession);
        }
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        for (CameraCaptureSession.StateCallback a : this.f3345a) {
            C1009b.m3020a(a, cameraCaptureSession, surface);
        }
    }
}
