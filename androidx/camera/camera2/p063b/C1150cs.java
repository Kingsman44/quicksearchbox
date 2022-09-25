package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: androidx.camera.camera2.b.cs */
/* compiled from: PG */
final class C1150cs extends CameraDevice.StateCallback {

    /* renamed from: b */
    public static final /* synthetic */ int f3378b = 0;

    /* renamed from: a */
    final /* synthetic */ C1151ct f3379a;

    public C1150cs(C1151ct ctVar) {
        this.f3379a = ctVar;
    }

    /* renamed from: a */
    private final void m3193a() {
        List<C1174dp> c;
        synchronized (this.f3379a.f3381b) {
            c = this.f3379a.mo3942c();
            this.f3379a.f3384e.clear();
            this.f3379a.f3382c.clear();
            this.f3379a.f3383d.clear();
        }
        for (C1174dp o : c) {
            o.mo3987o();
        }
    }

    /* renamed from: b */
    private final void m3194b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.f3379a.f3381b) {
            linkedHashSet.addAll(this.f3379a.f3384e);
            linkedHashSet.addAll(this.f3379a.f3382c);
        }
        this.f3379a.f3380a.execute(new C1149cr(linkedHashSet));
    }

    public final void onClosed(CameraDevice cameraDevice) {
        m3193a();
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        m3194b();
        m3193a();
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        m3194b();
        m3193a();
    }

    public final void onOpened(CameraDevice cameraDevice) {
    }
}
