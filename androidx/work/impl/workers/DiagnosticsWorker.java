package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.C4377aa;
import androidx.work.C4380ad;
import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C4452ag;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.p207b.C4488aw;
import androidx.work.impl.p207b.C4503l;
import androidx.work.impl.p207b.C4511t;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C69664n.m101061g(context, "context");
        C69664n.m101061g(workerParameters, "parameters");
    }

    /* renamed from: c */
    public final C4377aa mo9300c() {
        C4452ag j = C4452ag.m12686j(this.f13999c);
        C69664n.m101060f(j, "getInstance(applicationContext)");
        WorkDatabase workDatabase = j.f14143e;
        C69664n.m101060f(workDatabase, "workManager.workDatabase");
        C4471af F = workDatabase.mo9364F();
        C4511t D = workDatabase.mo9362D();
        C4488aw G = workDatabase.mo9365G();
        C4503l C = workDatabase.mo9361C();
        List e = F.mo9425e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List f = F.mo9426f();
        List t = F.mo9440t();
        if (!e.isEmpty()) {
            C4380ad.m12560h().mo9313e(C4625d.f14531a, "Recently completed work:\n\n");
            C4380ad.m12560h().mo9313e(C4625d.f14531a, C4625d.m13020a(D, G, C, e));
        }
        if (!f.isEmpty()) {
            C4380ad.m12560h().mo9313e(C4625d.f14531a, "Running work:\n\n");
            C4380ad.m12560h().mo9313e(C4625d.f14531a, C4625d.m13020a(D, G, C, f));
        }
        if (!t.isEmpty()) {
            C4380ad.m12560h().mo9313e(C4625d.f14531a, "Enqueued work:\n\n");
            C4380ad.m12560h().mo9313e(C4625d.f14531a, C4625d.m13020a(D, G, C, t));
        }
        return new C4645z(C4632m.f14549a);
    }
}
