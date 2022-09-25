package androidx.work.impl;

import android.util.Log;
import androidx.work.C4377aa;
import androidx.work.C4379ac;
import androidx.work.C4380ad;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.ap */
/* compiled from: PG */
final class C4461ap implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f14173a;

    /* renamed from: b */
    final /* synthetic */ C4463ar f14174b;

    public C4461ap(C4463ar arVar, String str) {
        this.f14174b = arVar;
        this.f14173a = str;
    }

    public final void run() {
        C4463ar arVar;
        try {
            C4377aa aaVar = (C4377aa) this.f14174b.f14189g.get();
            if (aaVar == null) {
                C4380ad.m12560h().mo9311c(C4463ar.f14183a, this.f14174b.f14185c.f14219d + " returned a null result. Treating it as a failure.");
            } else {
                C4380ad.m12560h().mo9309a(C4463ar.f14183a, this.f14174b.f14185c.f14219d + " returned a " + aaVar + ".");
                this.f14174b.f14187e = aaVar;
            }
            arVar = this.f14174b;
        } catch (CancellationException e) {
            C4380ad h = C4380ad.m12560h();
            String str = C4463ar.f14183a;
            String str2 = this.f14173a + " was cancelled";
            if (((C4379ac) h).f14003a <= 4) {
                Log.i(str, str2, e);
            }
            arVar = this.f14174b;
        } catch (InterruptedException | ExecutionException e2) {
            C4380ad.m12560h().mo9312d(C4463ar.f14183a, this.f14173a + " failed because it threw an exception/error", e2);
            arVar = this.f14174b;
        } catch (Throwable th) {
            this.f14174b.mo9401a();
            throw th;
        }
        arVar.mo9401a();
    }
}
