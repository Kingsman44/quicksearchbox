package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.impl.utils.C4615v;

/* renamed from: androidx.work.impl.background.systemalarm.l */
/* compiled from: PG */
final class C4532l implements Runnable {

    /* renamed from: a */
    private final C4533m f14326a;

    public C4532l(C4533m mVar) {
        this.f14326a = mVar;
    }

    public final void run() {
        boolean z;
        boolean z2;
        C4533m mVar = this.f14326a;
        C4380ad.m12560h().mo9309a(C4533m.f14327a, "Checking if commands are complete.");
        C4533m.m12887e();
        synchronized (mVar.f14333g) {
            if (mVar.f14334h != null) {
                C4380ad.m12560h().mo9309a(C4533m.f14327a, "Removing command " + mVar.f14334h);
                if (((Intent) mVar.f14333g.remove(0)).equals(mVar.f14334h)) {
                    mVar.f14334h = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C4615v vVar = mVar.f14336j.f14486a;
            C4523c cVar = mVar.f14332f;
            synchronized (cVar.f14301d) {
                z = !cVar.f14300c.isEmpty();
            }
            if (!z) {
                if (mVar.f14333g.isEmpty()) {
                    synchronized (vVar.f14508b) {
                        z2 = !vVar.f14507a.isEmpty();
                    }
                    if (!z2) {
                        C4380ad.m12560h().mo9309a(C4533m.f14327a, "No more commands & intents.");
                        C4531k kVar = mVar.f14335i;
                        if (kVar != null) {
                            kVar.mo9480a();
                        }
                    }
                }
            }
            if (!mVar.f14333g.isEmpty()) {
                mVar.mo9491c();
            }
        }
    }
}
