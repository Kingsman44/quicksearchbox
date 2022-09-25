package androidx.camera.camera2.p063b;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.p069a.C1364cx;
import androidx.p104d.p105a.C2164c;

/* renamed from: androidx.camera.camera2.b.i */
/* compiled from: PG */
public final /* synthetic */ class C1206i implements C1216s {

    /* renamed from: a */
    public final /* synthetic */ long f3541a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f3542b;

    public /* synthetic */ C1206i(long j, C2164c cVar) {
        this.f3541a = j;
        this.f3542b = cVar;
    }

    /* renamed from: a */
    public final boolean mo3872a(TotalCaptureResult totalCaptureResult) {
        Long l;
        long j = this.f3541a;
        C2164c cVar = this.f3542b;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof C1364cx) || (l = (Long) ((C1364cx) tag).mo4257d("CameraControlSessionUpdateId")) == null || l.longValue() < j) {
            return false;
        }
        cVar.mo5437b((Object) null);
        return true;
    }
}
