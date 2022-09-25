package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import com.google.common.base.C58838bb;
import java.io.Closeable;

/* renamed from: io.grpc.binder.a.al */
/* compiled from: PG */
final class C70188al implements Closeable {

    /* renamed from: a */
    public Parcel f187061a;

    public C70188al(Parcel parcel) {
        this.f187061a = parcel;
    }

    /* renamed from: b */
    public static C70188al m102242b() {
        return new C70188al(Parcel.obtain());
    }

    /* renamed from: a */
    public final Parcel mo61791a() {
        C58838bb.m90884s(this.f187061a != null, "get() after close()/release()");
        return this.f187061a;
    }

    public final void close() {
        Parcel parcel = this.f187061a;
        if (parcel != null) {
            parcel.recycle();
            this.f187061a = null;
        }
    }
}
