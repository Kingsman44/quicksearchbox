package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: io.grpc.e.ln */
/* compiled from: PG */
public final class C70668ln {

    /* renamed from: a */
    public static final C70668ln f188396a = new C70668ln();

    /* renamed from: b */
    public final IdentityHashMap f188397b = new IdentityHashMap();

    /* renamed from: c */
    public ScheduledExecutorService f188398c;

    /* renamed from: a */
    public final synchronized Object mo62410a(C70667lm lmVar) {
        C70666ll llVar;
        llVar = (C70666ll) this.f188397b.get(lmVar);
        if (llVar == null) {
            llVar = new C70666ll(lmVar.mo62176a());
            this.f188397b.put(lmVar, llVar);
        }
        ScheduledFuture scheduledFuture = llVar.f188395c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            llVar.f188395c = null;
        }
        llVar.f188394b++;
        return llVar.f188393a;
    }

    /* renamed from: b */
    public final synchronized void mo62411b(C70667lm lmVar, Object obj) {
        C70666ll llVar = (C70666ll) this.f188397b.get(lmVar);
        if (llVar != null) {
            boolean z = true;
            C58838bb.m90869d(obj == llVar.f188393a, "Releasing the wrong instance");
            C58838bb.m90884s(llVar.f188394b > 0, "Refcount has already reached zero");
            int i = llVar.f188394b - 1;
            llVar.f188394b = i;
            if (i == 0) {
                if (llVar.f188395c != null) {
                    z = false;
                }
                C58838bb.m90884s(z, "Destroy task already scheduled");
                if (this.f188398c == null) {
                    this.f188398c = Executors.newSingleThreadScheduledExecutor(C70460dv.m102884l("grpc-shared-destroyer-%d"));
                }
                llVar.f188395c = this.f188398c.schedule(new C70499fg(new C70665lk(this, llVar, lmVar, obj)), 1, TimeUnit.SECONDS);
                return;
            }
            return;
        }
        new StringBuilder("No cached instance found for ").append(lmVar);
        throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(lmVar)));
    }
}
