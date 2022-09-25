package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;

/* renamed from: androidx.camera.camera2.b.ax */
/* compiled from: PG */
final class C1101ax implements C1113bi {

    /* renamed from: a */
    private final C1217t f3284a;

    /* renamed from: b */
    private boolean f3285b = false;

    public C1101ax(C1217t tVar) {
        this.f3284a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo3860a(TotalCaptureResult totalCaptureResult) {
        Integer num;
        C60870cx b = C1263l.m3430b(true);
        if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
            return b;
        }
        int intValue = num.intValue();
        if (intValue == 1 || intValue == 2) {
            C1477bw.m3978a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
            Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
            if (num2 != null && num2.intValue() == 0) {
                C1477bw.m3978a("Camera2CapturePipeline", "Trigger AF");
                this.f3285b = true;
                C1159da daVar = this.f3284a.f3564c;
                if (daVar.f3400c) {
                    C1300an anVar = new C1300an();
                    anVar.f3742c = daVar.f3402e;
                    anVar.f3743d = true;
                    C0988a aVar = new C0988a();
                    aVar.mo3739d(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                    anVar.mo4161e(aVar.mo3736a());
                    anVar.mo4159c(new C1156cy());
                    C1217t tVar = daVar.f3399b;
                    tVar.f3570i.mo3798a(Collections.singletonList(anVar.mo4157a()));
                }
            }
        }
        return b;
    }

    /* renamed from: b */
    public final void mo3861b() {
        if (this.f3285b) {
            C1477bw.m3978a("Camera2CapturePipeline", "cancel TriggerAF");
            this.f3284a.f3564c.mo3949a(true, false);
        }
    }

    /* renamed from: c */
    public final boolean mo3862c() {
        return true;
    }
}
