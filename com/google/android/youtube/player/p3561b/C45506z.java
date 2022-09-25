package com.google.android.youtube.player.p3561b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.youtube.player.b.z */
public class C45506z extends Binder implements IInterface {
    protected C45506z(String str) {
        attachInterface(this, str);
    }

    public final IBinder asBinder() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo49624i(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo49624i(i, parcel, parcel2);
    }
}
