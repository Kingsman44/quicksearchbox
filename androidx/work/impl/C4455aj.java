package androidx.work.impl;

import androidx.work.C4384ah;
import androidx.work.C4388al;
import androidx.work.C4394ar;
import androidx.work.C4400ax;
import androidx.work.C4409e;
import androidx.work.impl.p207b.C4468ac;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4471af;
import java.util.List;
import java.util.Set;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.aj */
/* compiled from: PG */
public final /* synthetic */ class C4455aj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4452ag f14160a;

    /* renamed from: b */
    public final /* synthetic */ String f14161b;

    /* renamed from: c */
    public final /* synthetic */ C4558n f14162c;

    /* renamed from: d */
    public final /* synthetic */ C69615a f14163d;

    /* renamed from: e */
    public final /* synthetic */ C4400ax f14164e;

    public /* synthetic */ C4455aj(C4452ag agVar, String str, C4558n nVar, C69615a aVar, C4400ax axVar) {
        this.f14160a = agVar;
        this.f14161b = str;
        this.f14162c = nVar;
        this.f14163d = aVar;
        this.f14164e = axVar;
    }

    public final void run() {
        C4452ag agVar = this.f14160a;
        String str = this.f14161b;
        C4558n nVar = this.f14162c;
        C69615a aVar = this.f14163d;
        C4400ax axVar = this.f14164e;
        C69664n.m101061g(str, "$name");
        C69664n.m101061g(axVar, "$workRequest");
        C4471af F = agVar.f14143e.mo9364F();
        List j = F.mo9430j(str);
        if (j.size() > 1) {
            C4458am.m12705a(nVar, "Can't apply UPDATE policy to the chains of work.");
            return;
        }
        C4468ac acVar = (C4468ac) C69540x.m100821C(j);
        if (acVar == null) {
            aVar.mo5672a();
            return;
        }
        C4470ae b = F.mo9422b(acVar.f14207a);
        if (b == null) {
            nVar.mo9510b(new C4384ah(new IllegalStateException("WorkSpec with " + acVar.f14207a + ", that matches a name \"" + str + "\", wasn't found")));
        } else if (!b.mo9418f()) {
            C4458am.m12705a(nVar, "Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        } else if (acVar.f14208b != C4394ar.CANCELLED) {
            C4470ae g = C4470ae.m12718g(axVar.f14046b, acVar.f14207a, (C4394ar) null, 0, 0, 0, 1048574);
            try {
                C4562r rVar = agVar.f14145g;
                C69664n.m101060f(rVar, "processor");
                WorkDatabase workDatabase = agVar.f14143e;
                C69664n.m101060f(workDatabase, "workDatabase");
                C4409e eVar = agVar.f14142d;
                C69664n.m101060f(eVar, "configuration");
                List<C4564t> list = agVar.f14144f;
                C69664n.m101060f(list, "schedulers");
                Set set = axVar.f14047c;
                String str2 = g.f14217b;
                C4470ae b2 = workDatabase.mo9364F().mo9422b(str2);
                if (b2 != null) {
                    if (!b2.f14218c.mo9323a()) {
                        if (!(b2.mo9418f() ^ g.mo9418f())) {
                            boolean f = rVar.mo9517f(str2);
                            if (!f) {
                                for (C4564t b3 : list) {
                                    b3.mo9474b(str2);
                                }
                            }
                            workDatabase.mo8187v(new C4454ai(workDatabase, g, b2, list, str2, set, f));
                            if (!f) {
                                C4565u.m12952b(eVar, workDatabase, list);
                            }
                        } else {
                            throw new UnsupportedOperationException("Can't update " + C4457al.m12703b(b2) + " Worker to " + C4457al.m12703b(g) + " Worker. Update operation must preserve worker's type.");
                        }
                    }
                    nVar.mo9510b(C4388al.f14014a);
                    return;
                }
                throw new IllegalArgumentException("Worker with " + str2 + " doesn't exist");
            } catch (Throwable th) {
                nVar.mo9510b(new C4384ah(th));
            }
        } else {
            F.mo9432l(acVar.f14207a);
            aVar.mo5672a();
        }
    }
}
