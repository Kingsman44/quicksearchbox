package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.r */
/* compiled from: PG */
final class C1215r extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final Set f3560a = new HashSet();

    /* renamed from: b */
    private final Executor f3561b;

    public C1215r(Executor executor) {
        this.f3561b = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4029a(C1216s sVar) {
        this.f3560a.add(sVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4030b() {
        this.f3560a.remove((Object) null);
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f3561b.execute(new C1214q(this, totalCaptureResult));
    }
}
