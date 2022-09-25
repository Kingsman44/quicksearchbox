package p5488io.grpc.binder;

import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2389t;
import androidx.lifecycle.C2391v;
import p5488io.grpc.C70701ef;

/* renamed from: io.grpc.binder.LifecycleOnDestroyHelper$2 */
/* compiled from: PG */
public class LifecycleOnDestroyHelper$2 implements C2389t {

    /* renamed from: a */
    final /* synthetic */ C70701ef f187027a;

    public LifecycleOnDestroyHelper$2(C70701ef efVar) {
        this.f187027a = efVar;
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (mVar == C2382m.ON_DESTROY) {
            vVar.getLifecycle().mo5791c(this);
            this.f187027a.mo62395b();
        }
    }
}
