package p5488io.grpc.binder.p5522a;

import android.os.IBinder;
import java.util.concurrent.Executor;
import p5488io.grpc.p5525e.C70633kf;

/* renamed from: io.grpc.binder.a.af */
/* compiled from: PG */
final class C70182af extends C70184ah {

    /* renamed from: c */
    private final C70633kf f187041c;

    public C70182af(IBinder iBinder, Executor executor) {
        super(iBinder);
        this.f187041c = new C70633kf(executor);
    }

    /* renamed from: a */
    public final void mo61782a(int i, C70188al alVar) {
        this.f187041c.execute(new C70181ae(this, i, alVar.mo61791a()));
        alVar.mo61791a();
        alVar.f187061a = null;
    }
}
