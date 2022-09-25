package android.support.p031v4.p032os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: android.support.v4.os.b */
/* compiled from: PG */
public abstract class C0333b extends Binder implements C0334c {
    public C0333b() {
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            mo1099a(parcel.readInt(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            return true;
        }
    }
}
