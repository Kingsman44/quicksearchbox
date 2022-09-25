package p5488io.grpc.binder.p5522a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* renamed from: io.grpc.binder.a.ah */
/* compiled from: PG */
public abstract class C70184ah {

    /* renamed from: a */
    public static final Logger f187042a = Logger.getLogger(C70184ah.class.getName());

    /* renamed from: b */
    protected final IBinder f187043b;

    public C70184ah(IBinder iBinder) {
        this.f187043b = iBinder;
    }

    /* renamed from: b */
    public static C70184ah m102228b(IBinder iBinder, Executor executor) {
        if (iBinder instanceof Binder) {
            return new C70182af(iBinder, executor);
        }
        return new C70183ag(iBinder);
    }

    /* renamed from: a */
    public abstract void mo61782a(int i, C70188al alVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo61783c(int i, Parcel parcel) {
        try {
            return this.f187043b.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
