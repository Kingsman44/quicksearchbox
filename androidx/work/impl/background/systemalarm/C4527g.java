package androidx.work.impl.background.systemalarm;

import androidx.work.C4380ad;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4591al;
import androidx.work.impl.utils.C4592am;

/* renamed from: androidx.work.impl.background.systemalarm.g */
/* compiled from: PG */
public final /* synthetic */ class C4527g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4528h f14308a;

    public /* synthetic */ C4527g(C4528h hVar) {
        this.f14308a = hVar;
    }

    public final void run() {
        C4528h hVar = this.f14308a;
        if (hVar.f14315g == 0) {
            hVar.f14315g = 1;
            C4380ad h = C4380ad.m12560h();
            String str = C4528h.f14309a;
            StringBuilder sb = new StringBuilder("onAllConstraintsMet for ");
            C4509r rVar = hVar.f14312d;
            sb.append(rVar);
            h.mo9309a(str, "onAllConstraintsMet for ".concat(rVar.toString()));
            if (hVar.f14313e.f14330d.mo9518g(hVar.f14320l)) {
                C4592am amVar = hVar.f14313e.f14329c;
                C4509r rVar2 = hVar.f14312d;
                synchronized (amVar.f14482e) {
                    C4380ad h2 = C4380ad.m12560h();
                    String str2 = C4592am.f14478a;
                    h2.mo9309a(str2, "Starting timer for " + rVar2);
                    amVar.mo9547a(rVar2);
                    C4591al alVar = new C4591al(amVar, rVar2);
                    amVar.f14480c.put(rVar2, alVar);
                    amVar.f14481d.put(rVar2, hVar);
                    amVar.f14479b.mo9322b(600000, alVar);
                }
                return;
            }
            hVar.mo9485a();
            return;
        }
        C4380ad h3 = C4380ad.m12560h();
        String str3 = C4528h.f14309a;
        StringBuilder sb2 = new StringBuilder("Already started work for ");
        C4509r rVar3 = hVar.f14312d;
        sb2.append(rVar3);
        h3.mo9309a(str3, "Already started work for ".concat(rVar3.toString()));
    }
}
