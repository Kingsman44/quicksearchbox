package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C4377aa;
import androidx.work.C4645z;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C69664n.m101061g(context, "context");
        C69664n.m101061g(workerParameters, "workerParams");
    }

    /* renamed from: c */
    public final C4377aa mo9300c() {
        return new C4645z(this.f14000d.f13989b);
    }
}
