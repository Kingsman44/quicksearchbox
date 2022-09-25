package android.support.p031v4.p032os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: android.support.v4.os.a */
/* compiled from: PG */
final class C0332a implements C0334c {

    /* renamed from: a */
    private final IBinder f1057a;

    public C0332a(IBinder iBinder) {
        this.f1057a = iBinder;
    }

    /* renamed from: a */
    public final void mo1099a(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f1057a.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1057a;
    }
}
