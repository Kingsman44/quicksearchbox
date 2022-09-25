package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.q */
/* compiled from: PG */
public abstract class C143546q extends C8849b implements C143547r {
    public C143546q() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            enforceNoDataAvail(parcel);
            mo118706c(readString, readString2);
            parcel2.writeNoException();
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo118707d(parcel.readString(), (LaunchOptions) C8850c.m23492a(parcel, LaunchOptions.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            String readString3 = parcel.readString();
            enforceNoDataAvail(parcel);
            mo118708e(readString3);
            parcel2.writeNoException();
        } else if (i == 4) {
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo118705b(readInt);
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(mo118704a());
        }
        return true;
    }
}
