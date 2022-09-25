package androidx.work.impl.utils;

import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4463ar;
import androidx.work.impl.C4562r;
import androidx.work.impl.C4620v;
import java.util.Set;

/* renamed from: androidx.work.impl.utils.aa */
/* compiled from: PG */
public final class C4580aa implements Runnable {

    /* renamed from: a */
    private static final String f14449a = C4380ad.m12561i("StopWorkRunnable");

    /* renamed from: b */
    private final C4452ag f14450b;

    /* renamed from: c */
    private final C4620v f14451c;

    /* renamed from: d */
    private final boolean f14452d;

    public C4580aa(C4452ag agVar, C4620v vVar, boolean z) {
        this.f14450b = agVar;
        this.f14451c = vVar;
        this.f14452d = z;
    }

    public final void run() {
        boolean z;
        C4463ar arVar;
        if (this.f14452d) {
            C4562r rVar = this.f14450b.f14145g;
            String str = this.f14451c.f14519a.f14269a;
            synchronized (rVar.f14405i) {
                C4380ad h = C4380ad.m12560h();
                String str2 = C4562r.f14397a;
                h.mo9309a(str2, "Processor stopping foreground work " + str);
                arVar = (C4463ar) rVar.f14401e.remove(str);
                if (arVar != null) {
                    rVar.f14403g.remove(str);
                }
            }
            z = C4562r.m12939e(str, arVar);
        } else {
            C4562r rVar2 = this.f14450b.f14145g;
            C4620v vVar = this.f14451c;
            String str3 = vVar.f14519a.f14269a;
            synchronized (rVar2.f14405i) {
                C4463ar arVar2 = (C4463ar) rVar2.f14402f.remove(str3);
                if (arVar2 == null) {
                    C4380ad h2 = C4380ad.m12560h();
                    String str4 = C4562r.f14397a;
                    h2.mo9309a(str4, "WorkerWrapper could not be found for " + str3);
                } else {
                    Set set = (Set) rVar2.f14403g.get(str3);
                    if (set != null) {
                        if (set.contains(vVar)) {
                            C4380ad h3 = C4380ad.m12560h();
                            String str5 = C4562r.f14397a;
                            h3.mo9309a(str5, "Processor stopping background work " + str3);
                            rVar2.f14403g.remove(str3);
                            z = C4562r.m12939e(str3, arVar2);
                        }
                    }
                }
                z = false;
            }
        }
        C4380ad h4 = C4380ad.m12560h();
        String str6 = f14449a;
        h4.mo9309a(str6, "StopWorkRunnable for " + this.f14451c.f14519a.f14269a + "; Processor.stopWork = " + z);
    }
}
