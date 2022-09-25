package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1357cq;
import java.util.Collections;

/* renamed from: androidx.camera.camera2.b.cm */
/* compiled from: PG */
final class C1144cm extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final /* synthetic */ C1147cp f3359a;

    public C1144cm(C1147cp cpVar) {
        this.f3359a = cpVar;
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        synchronized (this.f3359a.f3361a) {
            C1357cq cqVar = this.f3359a.f3364d;
            if (cqVar != null) {
                C1302ap apVar = cqVar.f3847f;
                C1477bw.m3978a("CaptureSession", "Submit FLASH_MODE_OFF request");
                C1147cp cpVar = this.f3359a;
                C1300an anVar = new C1300an();
                anVar.f3742c = apVar.f3751e;
                for (C1314ba f : Collections.unmodifiableList(apVar.f3749c)) {
                    anVar.mo4162f(f);
                }
                anVar.mo4161e(apVar.f3750d);
                C0988a aVar = new C0988a();
                aVar.mo3739d(CaptureRequest.FLASH_MODE, 0);
                anVar.mo4161e(aVar.mo3736a());
                cpVar.mo3928i(Collections.singletonList(anVar.mo4157a()));
            }
        }
    }
}
