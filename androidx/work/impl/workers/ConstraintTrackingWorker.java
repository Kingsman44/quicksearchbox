package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C4378ab;
import androidx.work.C4380ad;
import androidx.work.WorkerParameters;
import androidx.work.impl.p204a.C4442c;
import androidx.work.impl.utils.p209a.C4579m;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class ConstraintTrackingWorker extends C4378ab implements C4442c {

    /* renamed from: a */
    public final WorkerParameters f14522a;

    /* renamed from: b */
    public final Object f14523b = new Object();

    /* renamed from: g */
    public volatile boolean f14524g;

    /* renamed from: h */
    public final C4579m f14525h = new C4579m();

    /* renamed from: i */
    public C4378ab f14526i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(workerParameters, "workerParameters");
        this.f14522a = workerParameters;
    }

    /* renamed from: b */
    public final C60870cx mo9297b() {
        this.f14000d.f13992e.execute(new C4622a(this));
        return this.f14525h;
    }

    /* renamed from: d */
    public final void mo9299d() {
        C4378ab abVar = this.f14526i;
        if (abVar != null && !abVar.f14001e) {
            abVar.mo9308fA();
        }
    }

    /* renamed from: e */
    public final void mo9387e(List list) {
    }

    /* renamed from: f */
    public final void mo9388f(List list) {
        C4380ad h = C4380ad.m12560h();
        String str = C4624c.f14530a;
        new StringBuilder("Constraints changed for ").append(list);
        h.mo9309a(str, "Constraints changed for ".concat(list.toString()));
        synchronized (this.f14523b) {
            this.f14524g = true;
        }
    }
}
