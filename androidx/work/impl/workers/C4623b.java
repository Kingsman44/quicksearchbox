package androidx.work.impl.workers;

import androidx.work.C4644y;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.workers.b */
/* compiled from: PG */
public final /* synthetic */ class C4623b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConstraintTrackingWorker f14528a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f14529b;

    public /* synthetic */ C4623b(ConstraintTrackingWorker constraintTrackingWorker, C60870cx cxVar) {
        this.f14528a = constraintTrackingWorker;
        this.f14529b = cxVar;
    }

    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.f14528a;
        C60870cx cxVar = this.f14529b;
        C69664n.m101061g(cxVar, "$innerFuture");
        synchronized (constraintTrackingWorker.f14523b) {
            if (constraintTrackingWorker.f14524g) {
                constraintTrackingWorker.f14525h.mo9537e(new C4644y());
            } else {
                constraintTrackingWorker.f14525h.mo9539g(cxVar);
            }
        }
    }
}
