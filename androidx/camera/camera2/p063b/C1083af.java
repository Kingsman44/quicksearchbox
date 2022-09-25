package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraManager;

/* renamed from: androidx.camera.camera2.b.af */
/* compiled from: PG */
public final class C1083af extends CameraManager.AvailabilityCallback {

    /* renamed from: a */
    public boolean f3226a = true;

    /* renamed from: b */
    public final /* synthetic */ C1091an f3227b;

    /* renamed from: c */
    private final String f3228c;

    public C1083af(C1091an anVar, String str) {
        this.f3227b = anVar;
        this.f3228c = str;
    }

    public final void onCameraAvailable(String str) {
        if (this.f3228c.equals(str)) {
            this.f3226a = true;
            if (this.f3227b.f3253l == 2) {
                this.f3227b.mo3833s(false);
            }
        }
    }

    public final void onCameraUnavailable(String str) {
        if (this.f3228c.equals(str)) {
            this.f3226a = false;
        }
    }
}
