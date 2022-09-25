package androidx.camera.camera2.p063b.p064a.p067c;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import androidx.p104d.p105a.C2164c;

/* renamed from: androidx.camera.camera2.b.a.c.q */
/* compiled from: PG */
final class C1059q extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final /* synthetic */ C1060r f3195a;

    public C1059q(C1060r rVar) {
        this.f3195a = rVar;
    }

    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        C2164c cVar = this.f3195a.f3199d;
        if (cVar != null) {
            cVar.mo5438c();
            this.f3195a.f3199d = null;
        }
    }

    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        C2164c cVar = this.f3195a.f3199d;
        if (cVar != null) {
            cVar.mo5437b((Object) null);
            this.f3195a.f3199d = null;
        }
    }
}
