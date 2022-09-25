package androidx.work.impl.workers;

import androidx.work.C4378ab;
import androidx.work.C4380ad;
import androidx.work.C4632m;
import androidx.work.C4643x;
import androidx.work.C4644y;
import androidx.work.impl.C4452ag;
import androidx.work.impl.p204a.C4444e;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.utils.p209a.C4568b;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.workers.a */
/* compiled from: PG */
public final /* synthetic */ class C4622a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConstraintTrackingWorker f14527a;

    public /* synthetic */ C4622a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f14527a = constraintTrackingWorker;
    }

    public final void run() {
        ConstraintTrackingWorker constraintTrackingWorker = this.f14527a;
        if (!(constraintTrackingWorker.f14525h.f14444d instanceof C4568b)) {
            String b = constraintTrackingWorker.f14000d.f13989b.mo9567b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            C4380ad h = C4380ad.m12560h();
            C69664n.m101060f(h, "get()");
            if (b == null || b.length() == 0) {
                h.mo9311c(C4624c.f14530a, "No worker to delegate to.");
                constraintTrackingWorker.f14525h.mo9537e(new C4643x(C4632m.f14549a));
                return;
            }
            constraintTrackingWorker.f14526i = constraintTrackingWorker.f14000d.f13993f.mo9347b(constraintTrackingWorker.f13999c, b, constraintTrackingWorker.f14522a);
            if (constraintTrackingWorker.f14526i != null) {
                C4452ag j = C4452ag.m12686j(constraintTrackingWorker.f13999c);
                C69664n.m101060f(j, "getInstance(applicationContext)");
                C4471af F = j.f14143e.mo9364F();
                String uuid = constraintTrackingWorker.f14000d.f13988a.toString();
                C69664n.m101060f(uuid, "id.toString()");
                C4470ae b2 = F.mo9422b(uuid);
                if (b2 == null) {
                    constraintTrackingWorker.f14525h.mo9537e(new C4643x(C4632m.f14549a));
                    return;
                }
                C4444e eVar = new C4444e(j.f14150l, constraintTrackingWorker);
                eVar.mo9389a(C69540x.m100944b(b2));
                String uuid2 = constraintTrackingWorker.f14000d.f13988a.toString();
                C69664n.m101060f(uuid2, "id.toString()");
                if (eVar.mo9391c(uuid2)) {
                    h.mo9309a(C4624c.f14530a, "Constraints met for delegate ".concat(b));
                    try {
                        C4378ab abVar = constraintTrackingWorker.f14526i;
                        C69664n.m101058d(abVar);
                        C60870cx b3 = abVar.mo9297b();
                        C69664n.m101060f(b3, "delegate!!.startWork()");
                        b3.mo4106b(new C4623b(constraintTrackingWorker, b3), constraintTrackingWorker.f14000d.f13992e);
                    } catch (Throwable th) {
                        String str = C4624c.f14530a;
                        h.mo9310b(str, "Delegated worker " + b + " threw exception in startWork.", th);
                        synchronized (constraintTrackingWorker.f14523b) {
                            if (constraintTrackingWorker.f14524g) {
                                h.mo9309a(C4624c.f14530a, "Constraints were unmet, Retrying.");
                                constraintTrackingWorker.f14525h.mo9537e(new C4644y());
                            } else {
                                constraintTrackingWorker.f14525h.mo9537e(new C4643x(C4632m.f14549a));
                            }
                        }
                    }
                } else {
                    String str2 = C4624c.f14530a;
                    h.mo9309a(str2, "Constraints not met for delegate " + b + ". Requesting retry.");
                    constraintTrackingWorker.f14525h.mo9537e(new C4644y());
                }
            } else {
                h.mo9309a(C4624c.f14530a, "No worker to delegate to.");
                constraintTrackingWorker.f14525h.mo9537e(new C4643x(C4632m.f14549a));
            }
        }
    }
}
