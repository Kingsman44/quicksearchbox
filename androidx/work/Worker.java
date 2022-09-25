package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.p209a.C4579m;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public abstract class Worker extends C4378ab {

    /* renamed from: a */
    C4579m f13987a;

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public final C60870cx mo9296a() {
        C4579m mVar = new C4579m();
        this.f14000d.f13992e.execute(new C4402az(mVar));
        return mVar;
    }

    /* renamed from: b */
    public final C60870cx mo9297b() {
        this.f13987a = new C4579m();
        this.f14000d.f13992e.execute(new C4401ay(this));
        return this.f13987a;
    }

    /* renamed from: c */
    public abstract C4377aa mo9300c();
}
