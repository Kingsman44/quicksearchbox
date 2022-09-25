package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.Range;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p063b.p064a.C1068k;

/* renamed from: androidx.camera.camera2.b.a */
/* compiled from: PG */
final class C0994a implements C1195ej {

    /* renamed from: a */
    private final C1068k f3142a;

    /* renamed from: b */
    private final Range f3143b;

    /* renamed from: c */
    private float f3144c = 1.0f;

    public C0994a(C1068k kVar) {
        this.f3142a = kVar;
        this.f3143b = (Range) kVar.mo3785a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
    }

    /* renamed from: a */
    public final float mo3749a() {
        return ((Float) this.f3143b.getUpper()).floatValue();
    }

    /* renamed from: b */
    public final float mo3750b() {
        return ((Float) this.f3143b.getLower()).floatValue();
    }

    /* renamed from: c */
    public final void mo3751c(C0988a aVar) {
        aVar.mo3739d(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.f3144c));
    }

    /* renamed from: d */
    public final void mo3752d() {
        this.f3144c = 1.0f;
    }

    /* renamed from: e */
    public final void mo3753e() {
    }
}
