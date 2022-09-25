package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: androidx.camera.camera2.b.eg */
/* compiled from: PG */
public final /* synthetic */ class C1192eg implements C1216s {

    /* renamed from: a */
    public final /* synthetic */ C1193eh f3506a;

    public /* synthetic */ C1192eg(C1193eh ehVar) {
        this.f3506a = ehVar;
    }

    /* renamed from: a */
    public final boolean mo3872a(TotalCaptureResult totalCaptureResult) {
        C1193eh ehVar = this.f3506a;
        if (ehVar.f3510d != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == ehVar.f3511e) {
                ehVar.f3510d.mo5437b((Object) null);
                ehVar.f3510d = null;
            }
        }
        return false;
    }
}
