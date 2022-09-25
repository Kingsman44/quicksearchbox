package com.google.android.gms.car;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.car.cj */
/* compiled from: PG */
public abstract class C143154cj extends C8849b implements C143155ck {
    public C143154cj() {
        super("com.google.android.gms.car.ICarVendorExtensionClient");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo118112b(readInt);
        } else if (i == 2) {
            mo118111a();
        } else if (i != 3) {
            return false;
        } else {
            mo118113c();
        }
        return true;
    }
}
