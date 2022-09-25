package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.graphics.PointF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import com.google.common.base.C58833ax;
import java.util.Timer;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.e */
/* compiled from: PG */
public final /* synthetic */ class C26686e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C26701t f72760a;

    /* renamed from: b */
    public final /* synthetic */ PointF f72761b;

    public /* synthetic */ C26686e(C26701t tVar, PointF pointF) {
        this.f72760a = tVar;
        this.f72761b = pointF;
    }

    public final void run() {
        CameraCharacteristics cameraCharacteristics;
        C26701t tVar = this.f72760a;
        PointF pointF = this.f72761b;
        if (tVar.f72798k != null && (cameraCharacteristics = tVar.f72794g) != null && C26682a.m49310j(cameraCharacteristics)) {
            Size size = tVar.f72798k;
            size.getClass();
            C58833ax h = C26682a.m49308h(pointF, size, tVar.f72805r);
            if (h.mo56113h()) {
                CameraCharacteristics cameraCharacteristics2 = tVar.f72794g;
                cameraCharacteristics2.getClass();
                C58833ax f = C26682a.m49306f(cameraCharacteristics2, tVar.f72805r, (PointF) h.mo56107c());
                if (f.mo56113h()) {
                    tVar.mo32007e();
                    tVar.mo32013q((MeteringRectangle) f.mo56107c());
                    tVar.f72800m = new Timer();
                    tVar.f72801n = new C26698q(tVar);
                    Timer timer = tVar.f72800m;
                    timer.getClass();
                    timer.schedule(tVar.f72801n, C26701t.f72780b.toMillis());
                }
            }
        }
    }
}
