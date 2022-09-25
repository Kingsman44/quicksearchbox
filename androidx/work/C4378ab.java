package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.p209a.C4579m;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.work.ab */
/* compiled from: PG */
public abstract class C4378ab {

    /* renamed from: c */
    public Context f13999c;

    /* renamed from: d */
    public WorkerParameters f14000d;

    /* renamed from: e */
    public volatile boolean f14001e;

    /* renamed from: f */
    public boolean f14002f;

    public C4378ab(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f13999c = context;
            this.f14000d = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    /* renamed from: a */
    public C60870cx mo9296a() {
        C4579m mVar = new C4579m();
        mVar.mo9538f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return mVar;
    }

    /* renamed from: b */
    public abstract C60870cx mo9297b();

    /* renamed from: d */
    public void mo9299d() {
    }

    /* renamed from: fA */
    public final void mo9308fA() {
        this.f14001e = true;
        mo9299d();
    }
}
