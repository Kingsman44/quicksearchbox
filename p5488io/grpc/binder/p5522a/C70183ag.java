package p5488io.grpc.binder.p5522a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: io.grpc.binder.a.ag */
/* compiled from: PG */
final class C70183ag extends C70184ah {
    public C70183ag(IBinder iBinder) {
        super(iBinder);
    }

    /* renamed from: a */
    public final void mo61782a(int i, C70188al alVar) {
        Parcel a = alVar.mo61791a();
        alVar.f187061a = null;
        if (!mo61783c(i, a)) {
            throw new RemoteException("BinderProxy#transact(" + i + ", FLAG_ONEWAY) returned false");
        }
    }
}
