package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.core.C1564n;
import androidx.camera.core.p069a.C1300an;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import java.util.Collections;

/* renamed from: androidx.camera.camera2.b.au */
/* compiled from: PG */
public final /* synthetic */ class C1098au implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C1100aw f3278a;

    public /* synthetic */ C1098au(C1100aw awVar) {
        this.f3278a = awVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C1100aw awVar = this.f3278a;
        C1159da daVar = awVar.f3280a.f3564c;
        if (!daVar.f3400c) {
            cVar.mo5439d(new C1564n("Camera is not active."));
        } else {
            C1300an anVar = new C1300an();
            anVar.f3742c = daVar.f3402e;
            anVar.f3743d = true;
            C0988a aVar = new C0988a();
            aVar.mo3739d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            anVar.mo4161e(aVar.mo3736a());
            anVar.mo4159c(new C1157cz(cVar));
            C1217t tVar = daVar.f3399b;
            tVar.f3570i.mo3798a(Collections.singletonList(anVar.mo4157a()));
        }
        awVar.f3281b.f3182b = true;
        return "AePreCapture";
    }
}
