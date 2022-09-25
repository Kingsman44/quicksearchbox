package p5488io.grpc.binder;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import p5488io.grpc.C70286co;

/* renamed from: io.grpc.binder.LifecycleOnDestroyHelper$1 */
/* compiled from: PG */
public class LifecycleOnDestroyHelper$1 implements C2389t {

    /* renamed from: a */
    final /* synthetic */ C70286co f187026a;

    public LifecycleOnDestroyHelper$1(C70286co coVar) {
        this.f187026a = coVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (mVar == C2382m.ON_DESTROY) {
            vVar.getLifecycle().mo5791c(this);
            this.f187026a.mo61975g();
        }
    }
}
