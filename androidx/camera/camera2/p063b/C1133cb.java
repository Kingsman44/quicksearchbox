package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.cb */
/* compiled from: PG */
final class C1133cb extends CameraDevice.StateCallback {

    /* renamed from: a */
    private final List f3348a = new ArrayList();

    public C1133cb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof C1134cc)) {
                this.f3348a.add(stateCallback);
            }
        }
    }

    public final void onClosed(CameraDevice cameraDevice) {
        for (CameraDevice.StateCallback onClosed : this.f3348a) {
            onClosed.onClosed(cameraDevice);
        }
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        for (CameraDevice.StateCallback onDisconnected : this.f3348a) {
            onDisconnected.onDisconnected(cameraDevice);
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        for (CameraDevice.StateCallback onError : this.f3348a) {
            onError.onError(cameraDevice, i);
        }
    }

    public final void onOpened(CameraDevice cameraDevice) {
        for (CameraDevice.StateCallback onOpened : this.f3348a) {
            onOpened.onOpened(cameraDevice);
        }
    }
}
