package com.google.android.libraries.gsa.p1859d.p1860a;

import android.os.Bundle;
import android.os.Parcel;
import android.widget.RemoteViews;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.gsa.d.a.b */
/* compiled from: PG */
public abstract class C22731b extends C8849b implements C22732c {
    public C22731b() {
        super("com.google.android.libraries.gsa.launcherclient.partnertab.IPartnerTabContentManagerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            long readLong = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo27886d(readLong);
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo27883a(parcel.readLong(), (RemoteViews) C8850c.m23492a(parcel, RemoteViews.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i == 3) {
            long readLong2 = parcel.readLong();
            enforceNoDataAvail(parcel);
            mo27885c(readLong2);
        } else if (i != 4) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo27884b(parcel.readLong(), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
