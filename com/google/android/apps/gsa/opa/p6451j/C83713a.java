package com.google.android.apps.gsa.opa.p6451j;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.opa.j.a */
/* compiled from: PG */
public abstract class C83713a extends C8849b implements C83714b {
    public C83713a() {
        super("com.google.android.apps.gsa.opa.testing.IOpaTestService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            boolean i3 = C8850c.m23500i(parcel);
            boolean i4 = C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo77035d(i3, i4);
        } else if (i == 3) {
            boolean i5 = C8850c.m23500i(parcel);
            enforceNoDataAvail(parcel);
            mo77036e(i5);
        } else if (i == 4) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo77033b(readString, readInt);
        } else if (i == 5) {
            ArrayList readArrayList = parcel.readArrayList(C8850c.f30763a);
            enforceNoDataAvail(parcel);
            mo77032a(readArrayList);
        } else if (i != 6) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo77034c((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
