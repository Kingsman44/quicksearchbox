package androidx.camera.core;

import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.cp */
/* compiled from: PG */
final class C1512cp implements C1330bq {

    /* renamed from: a */
    final /* synthetic */ C1517cu f4158a;

    public C1512cp(C1517cu cuVar) {
        this.f4158a = cuVar;
    }

    /* renamed from: a */
    public final void mo4018a(C1331br brVar) {
        C1330bq bqVar;
        Executor executor;
        synchronized (this.f4158a.f4166a) {
            C1517cu cuVar = this.f4158a;
            bqVar = cuVar.f4171f;
            executor = cuVar.f4172g;
            cuVar.f4179n.mo4396e();
            this.f4158a.mo4390n();
        }
        if (bqVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C1511co(this, bqVar));
        } else {
            bqVar.mo4018a(this.f4158a);
        }
    }
}
