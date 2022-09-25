package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.aa */
/* compiled from: PG */
public abstract class C84121aa extends C8849b implements C84122ab {
    public C84121aa() {
        super("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.INavigator");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            enforceNoDataAvail(parcel);
            mo77552d(parcel.readInt(), parcel.readString(), C8850c.m23500i(parcel), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo77551a(parcel.readInt(), (Intent) C8850c.m23492a(parcel, Intent.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
