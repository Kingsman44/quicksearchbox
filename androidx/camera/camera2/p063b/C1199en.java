package androidx.camera.camera2.p063b;

import androidx.camera.core.C1473bs;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1330bq;
import androidx.camera.core.p069a.C1331br;
import androidx.camera.core.p069a.C1387n;
import androidx.camera.core.p069a.C1388o;
import androidx.camera.core.p069a.C1389p;
import androidx.camera.core.p069a.C1390q;
import androidx.camera.core.p073b.p077b.C1439e;

/* renamed from: androidx.camera.camera2.b.en */
/* compiled from: PG */
public final /* synthetic */ class C1199en implements C1330bq {

    /* renamed from: a */
    public final /* synthetic */ C1202eq f3524a;

    public /* synthetic */ C1199en(C1202eq eqVar) {
        this.f3524a = eqVar;
    }

    /* renamed from: a */
    public final void mo4018a(C1331br brVar) {
        Object a;
        C1202eq eqVar = this.f3524a;
        try {
            C1473bs f = brVar.mo4203f();
            if (f != null) {
                C1439e eVar = eqVar.f3529c;
                C1131c a2 = C1390q.m3808a(f.mo4305e());
                if (a2.mo3894c() == C1388o.LOCKED_FOCUSED || a2.mo3894c() == C1388o.PASSIVE_FOCUSED) {
                    if (a2.mo3893b() == C1387n.CONVERGED) {
                        if (a2.mo3895d() == C1389p.CONVERGED) {
                            synchronized (eVar.f3993b) {
                                a = eVar.f3992a.size() >= 3 ? eVar.mo4328a() : null;
                                eVar.f3992a.addFirst(f);
                            }
                            if (a != null) {
                                ((C1473bs) a).close();
                                return;
                            }
                            return;
                        }
                    }
                }
                f.close();
            }
        } catch (IllegalStateException e) {
            C1477bw.m3980c("ZslControlImpl", "Failed to acquire latest image IllegalStateException = ".concat(String.valueOf(e.getMessage())));
        }
    }
}
