package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.C1477bw;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.camera2.b.bl */
/* compiled from: PG */
final class C1116bl implements C1216s {

    /* renamed from: a */
    public C2164c f3314a;

    /* renamed from: b */
    public final C60870cx f3315b = C2169h.m6027a(new C1114bj(this));

    /* renamed from: c */
    private final long f3316c;

    /* renamed from: d */
    private final C1115bk f3317d;

    /* renamed from: e */
    private volatile Long f3318e = null;

    public C1116bl(long j, C1115bk bkVar) {
        this.f3316c = j;
        this.f3317d = bkVar;
    }

    /* renamed from: a */
    public final boolean mo3872a(TotalCaptureResult totalCaptureResult) {
        Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null && this.f3318e == null) {
            this.f3318e = l;
        }
        Long l2 = this.f3318e;
        if (this.f3316c == 0 || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f3316c) {
            C1115bk bkVar = this.f3317d;
            if (bkVar != null && !bkVar.mo3863a(totalCaptureResult)) {
                return false;
            }
            this.f3314a.mo5437b(totalCaptureResult);
            return true;
        }
        this.f3314a.mo5437b((Object) null);
        C1477bw.m3978a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
        return true;
    }
}
