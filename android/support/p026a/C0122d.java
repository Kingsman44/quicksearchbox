package android.support.p026a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: android.support.a.d */
/* compiled from: PG */
public final class C0122d implements IInterface {

    /* renamed from: a */
    public final IBinder f321a;

    public C0122d(IBinder iBinder) {
        this.f321a = iBinder;
    }

    /* renamed from: a */
    public final boolean mo94a(C0121c cVar, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
            obtain.writeStrongInterface(cVar);
            C0123e.m127a(obtain, bundle);
            boolean z = false;
            this.f321a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f321a;
    }
}
