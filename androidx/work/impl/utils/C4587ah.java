package androidx.work.impl.utils;

import android.content.Context;
import androidx.core.content.C1880f;
import androidx.work.C4380ad;
import androidx.work.C4635p;
import androidx.work.impl.C4463ar;
import androidx.work.impl.C4562r;
import androidx.work.impl.foreground.C4542a;
import androidx.work.impl.foreground.C4545d;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.utils.p209a.C4568b;
import androidx.work.impl.utils.p209a.C4579m;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.ah */
/* compiled from: PG */
final class C4587ah implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4579m f14467a;

    /* renamed from: b */
    final /* synthetic */ UUID f14468b;

    /* renamed from: c */
    final /* synthetic */ C4635p f14469c;

    /* renamed from: d */
    final /* synthetic */ Context f14470d;

    /* renamed from: e */
    final /* synthetic */ C4588ai f14471e;

    public C4587ah(C4588ai aiVar, C4579m mVar, UUID uuid, C4635p pVar, Context context) {
        this.f14471e = aiVar;
        this.f14467a = mVar;
        this.f14468b = uuid;
        this.f14469c = pVar;
        this.f14470d = context;
    }

    public final void run() {
        try {
            if (!(this.f14467a.f14444d instanceof C4568b)) {
                String uuid = this.f14468b.toString();
                C4470ae b = this.f14471e.f14473b.mo9422b(uuid);
                if (b == null || b.f14218c.mo9323a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                C4542a aVar = this.f14471e.f14472a;
                C4635p pVar = this.f14469c;
                synchronized (((C4562r) aVar).f14405i) {
                    C4380ad h = C4380ad.m12560h();
                    String str = C4562r.f14397a;
                    h.mo9313e(str, "Moving WorkSpec (" + uuid + ") to the foreground");
                    C4463ar arVar = (C4463ar) ((C4562r) aVar).f14402f.remove(uuid);
                    if (arVar != null) {
                        if (((C4562r) aVar).f14398b == null) {
                            ((C4562r) aVar).f14398b = C4582ac.m12985a(((C4562r) aVar).f14399c, "ProcessorForegroundLck");
                            ((C4562r) aVar).f14398b.acquire();
                        }
                        ((C4562r) aVar).f14401e.put(uuid, arVar);
                        C1880f.m5134a(((C4562r) aVar).f14399c, C4545d.m12921c(((C4562r) aVar).f14399c, C4486au.m12791a(arVar.f14185c), pVar));
                    }
                }
                this.f14470d.startService(C4545d.m12920b(this.f14470d, C4486au.m12791a(b), this.f14469c));
            }
            this.f14467a.mo9537e((Object) null);
        } catch (Throwable th) {
            this.f14467a.mo9538f(th);
        }
    }
}
