package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p063b.p064a.C1068k;

/* renamed from: androidx.camera.camera2.b.cu */
/* compiled from: PG */
final class C1152cu implements C1195ej {

    /* renamed from: a */
    private final C1068k f3386a;

    public C1152cu(C1068k kVar) {
        this.f3386a = kVar;
    }

    /* renamed from: a */
    public final float mo3749a() {
        Float f = (Float) this.f3386a.mo3785a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    /* renamed from: b */
    public final float mo3750b() {
        return 1.0f;
    }

    /* renamed from: c */
    public final void mo3751c(C0988a aVar) {
    }

    /* renamed from: d */
    public final void mo3752d() {
    }

    /* renamed from: e */
    public final void mo3753e() {
    }
}
