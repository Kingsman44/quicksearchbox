package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.core.p069a.C1300an;
import java.util.Collections;

/* renamed from: androidx.camera.camera2.b.da */
/* compiled from: PG */
final class C1159da {

    /* renamed from: a */
    public static final MeteringRectangle[] f3398a = new MeteringRectangle[0];

    /* renamed from: b */
    public final C1217t f3399b;

    /* renamed from: c */
    public volatile boolean f3400c = false;

    /* renamed from: d */
    public volatile Rational f3401d = null;

    /* renamed from: e */
    public int f3402e = 1;

    /* renamed from: f */
    public MeteringRectangle[] f3403f;

    /* renamed from: g */
    public MeteringRectangle[] f3404g;

    /* renamed from: h */
    public MeteringRectangle[] f3405h;

    public C1159da(C1217t tVar) {
        MeteringRectangle[] meteringRectangleArr = f3398a;
        this.f3403f = meteringRectangleArr;
        this.f3404g = meteringRectangleArr;
        this.f3405h = meteringRectangleArr;
        this.f3399b = tVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3949a(boolean z, boolean z2) {
        if (this.f3400c) {
            C1300an anVar = new C1300an();
            anVar.f3743d = true;
            anVar.f3742c = this.f3402e;
            C0988a aVar = new C0988a();
            if (z) {
                aVar.mo3739d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z2) {
                aVar.mo3739d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            anVar.mo4161e(aVar.mo3736a());
            C1217t tVar = this.f3399b;
            tVar.f3570i.mo3798a(Collections.singletonList(anVar.mo4157a()));
        }
    }
}
