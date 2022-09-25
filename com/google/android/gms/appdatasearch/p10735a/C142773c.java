package com.google.android.gms.appdatasearch.p10735a;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Response;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.appdatasearch.a.c */
/* compiled from: PG */
public abstract class C142773c extends C8849b implements C142774d {
    public C142773c() {
        super("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearchCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo117676c((Status) C8850c.m23492a(parcel, Status.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo117675b((Status) C8850c.m23492a(parcel, Status.CREATOR), (ParcelFileDescriptor) C8850c.m23492a(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo117674a((GetRecentContextCall$Response) C8850c.m23492a(parcel, GetRecentContextCall$Response.CREATOR));
        }
        return true;
    }
}
