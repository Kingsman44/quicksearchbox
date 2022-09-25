package androidx.camera.camera2.p063b;

import android.hardware.camera2.TotalCaptureResult;
import java.util.HashSet;

/* renamed from: androidx.camera.camera2.b.q */
/* compiled from: PG */
public final /* synthetic */ class C1214q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1215r f3558a;

    /* renamed from: b */
    public final /* synthetic */ TotalCaptureResult f3559b;

    public /* synthetic */ C1214q(C1215r rVar, TotalCaptureResult totalCaptureResult) {
        this.f3558a = rVar;
        this.f3559b = totalCaptureResult;
    }

    public final void run() {
        C1215r rVar = this.f3558a;
        TotalCaptureResult totalCaptureResult = this.f3559b;
        HashSet hashSet = new HashSet();
        for (C1216s sVar : rVar.f3560a) {
            if (sVar.mo3872a(totalCaptureResult)) {
                hashSet.add(sVar);
            }
        }
        if (!hashSet.isEmpty()) {
            rVar.f3560a.removeAll(hashSet);
        }
    }
}
