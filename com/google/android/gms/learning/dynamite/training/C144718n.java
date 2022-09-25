package com.google.android.gms.learning.dynamite.training;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.learning.dynamite.training.n */
/* compiled from: PG */
public abstract class C144718n extends C8849b implements C144719o {
    public C144718n() {
        super("com.google.android.gms.learning.dynamite.training.IInAppTrainingResultCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 6) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        enforceNoDataAvail(parcel);
        mo120156e(createByteArray, readInt);
        parcel2.writeNoException();
        return true;
    }
}
