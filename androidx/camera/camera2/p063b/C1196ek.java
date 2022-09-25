package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p073b.C1447j;
import androidx.lifecycle.C2332ag;

/* renamed from: androidx.camera.camera2.b.ek */
/* compiled from: PG */
final class C1196ek {

    /* renamed from: a */
    public final C1217t f3514a;

    /* renamed from: b */
    public final C1197el f3515b;

    /* renamed from: c */
    public final C2332ag f3516c;

    /* renamed from: d */
    final C1195ej f3517d;

    /* renamed from: e */
    public boolean f3518e = false;

    /* renamed from: f */
    private final C1216s f3519f;

    public C1196ek(C1217t tVar, C1068k kVar) {
        C1195ej ejVar;
        C1194ei eiVar = new C1194ei(this);
        this.f3519f = eiVar;
        this.f3514a = tVar;
        if (Build.VERSION.SDK_INT < 30 || m3348a(kVar) == null) {
            ejVar = new C1152cu(kVar);
        } else {
            ejVar = new C0994a(kVar);
        }
        this.f3517d = ejVar;
        C1197el elVar = new C1197el(ejVar.mo3749a(), ejVar.mo3750b());
        this.f3515b = elVar;
        elVar.mo4016a();
        this.f3516c = new C2332ag(C1447j.m3914e(elVar));
        tVar.f3562a.mo4029a(eiVar);
    }

    /* renamed from: a */
    private static Range m3348a(C1068k kVar) {
        try {
            return (Range) kVar.mo3785a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        } catch (AssertionError e) {
            C1477bw.m3984g("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }
}
