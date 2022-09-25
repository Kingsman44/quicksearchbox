package androidx.work.impl.background.systemalarm;

import androidx.work.C4380ad;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* compiled from: PG */
public final /* synthetic */ class C4526f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C4528h f14307a;

    public /* synthetic */ C4526f(C4528h hVar) {
        this.f14307a = hVar;
    }

    public final void run() {
        C4528h hVar = this.f14307a;
        String str = hVar.f14312d.f14269a;
        if (hVar.f14315g < 2) {
            hVar.f14315g = 2;
            C4380ad.m12560h().mo9309a(C4528h.f14309a, "Stopping work for WorkSpec ".concat(String.valueOf(str)));
            hVar.f14317i.execute(new C4530j(hVar.f14313e, C4523c.m12878f(hVar.f14310b, hVar.f14312d), hVar.f14311c));
            if (hVar.f14313e.f14330d.mo9517f(hVar.f14312d.f14269a)) {
                C4380ad h = C4380ad.m12560h();
                String str2 = C4528h.f14309a;
                h.mo9309a(str2, "WorkSpec " + str + " needs to be rescheduled");
                hVar.f14317i.execute(new C4530j(hVar.f14313e, C4523c.m12877e(hVar.f14310b, hVar.f14312d), hVar.f14311c));
                return;
            }
            C4380ad h2 = C4380ad.m12560h();
            String str3 = C4528h.f14309a;
            h2.mo9309a(str3, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        C4380ad.m12560h().mo9309a(C4528h.f14309a, "Already stopped work for ".concat(String.valueOf(str)));
    }
}
