package p5488io.grpc.binder.p5522a;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;
import p5488io.grpc.C70294cw;

/* renamed from: io.grpc.binder.a.aa */
/* compiled from: PG */
public final class C70177aa implements C70294cw {

    /* renamed from: a */
    private final Parcelable.Creator f187029a;

    /* renamed from: b */
    private final boolean f187030b;

    public C70177aa(Parcelable.Creator creator, boolean z) {
        this.f187029a = creator;
        this.f187030b = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ InputStream mo61753a(Object obj) {
        return new C70189am(this.f187029a, (Parcelable) obj, this.f187030b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo61754b(InputStream inputStream) {
        if (inputStream instanceof C70189am) {
            C70189am amVar = (C70189am) inputStream;
            if (amVar.f187064b) {
                return amVar.f187065c;
            }
            if (amVar.f187067e == null) {
                Parcelable parcelable = amVar.f187065c;
                Parcelable.Creator creator = amVar.f187063a;
                creator.getClass();
                Parcel obtain = Parcel.obtain();
                parcelable.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                obtain.recycle();
                amVar.f187067e = (Parcelable) creator.createFromParcel(obtain);
            }
            return amVar.f187067e;
        }
        throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
    }
}
