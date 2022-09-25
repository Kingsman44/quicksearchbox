package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import java.util.logging.Level;

/* renamed from: io.grpc.binder.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C70181ae implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C70182af f187038a;

    /* renamed from: b */
    public final /* synthetic */ int f187039b;

    /* renamed from: c */
    public final /* synthetic */ Parcel f187040c;

    public /* synthetic */ C70181ae(C70182af afVar, int i, Parcel parcel) {
        this.f187038a = afVar;
        this.f187039b = i;
        this.f187040c = parcel;
    }

    public final void run() {
        try {
            if (!this.f187038a.mo61783c(this.f187039b, this.f187040c)) {
                C70184ah.f187042a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "lambda$transact$0", "A oneway transaction was not understood - ignoring");
            }
        } catch (Exception e) {
            C70184ah.f187042a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "lambda$transact$0", "A oneway transaction threw - ignoring", e);
        }
    }
}
