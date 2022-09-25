package p5488io.grpc.binder.p5522a;

import android.os.Binder;
import android.os.Parcel;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.binder.a.z */
/* compiled from: PG */
public final class C70221z extends Binder {

    /* renamed from: b */
    private static final Logger f187182b = Logger.getLogger(C70221z.class.getName());

    /* renamed from: a */
    public C70220y f187183a;

    public C70221z(C70220y yVar) {
        this.f187183a = yVar;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        C70220y yVar = this.f187183a;
        if (yVar != null) {
            try {
                return yVar.mo61818d(i, parcel);
            } catch (RuntimeException e) {
                Logger logger = f187182b;
                Level level = Level.WARNING;
                logger.logp(level, "io.grpc.binder.internal.LeakSafeOneWayBinder", "onTransact", "failure sending transaction " + i, e);
            }
        }
        return false;
    }

    public final boolean pingBinder() {
        return this.f187183a != null;
    }
}
