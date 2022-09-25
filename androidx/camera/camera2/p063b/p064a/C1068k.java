package androidx.camera.camera2.p063b.p064a;

import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.camera.camera2.b.a.k */
/* compiled from: PG */
public final class C1068k {

    /* renamed from: a */
    private final Map f3207a = new HashMap();

    /* renamed from: b */
    private final C1067j f3208b;

    public C1068k(CameraCharacteristics cameraCharacteristics) {
        this.f3208b = new C1066i(cameraCharacteristics);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo3785a(android.hardware.camera2.CameraCharacteristics.Key r3) {
        /*
            r2 = this;
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0011
            androidx.camera.camera2.b.a.j r0 = r2.f3208b
            android.hardware.camera2.CameraCharacteristics r0 = r0.f3206a
            java.lang.Object r3 = r0.get(r3)
            return r3
        L_0x0011:
            monitor-enter(r2)
            java.util.Map r0 = r2.f3207a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x001c
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x001c:
            androidx.camera.camera2.b.a.j r0 = r2.f3208b     // Catch:{ all -> 0x002d }
            android.hardware.camera2.CameraCharacteristics r0 = r0.f3206a     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            java.util.Map r1 = r2.f3207a     // Catch:{ all -> 0x002d }
            r1.put(r3, r0)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            return r0
        L_0x002d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.p063b.p064a.C1068k.mo3785a(android.hardware.camera2.CameraCharacteristics$Key):java.lang.Object");
    }
}
