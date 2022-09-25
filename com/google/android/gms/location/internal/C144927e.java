package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.internal.e */
/* compiled from: PG */
public abstract class C144927e extends C8849b implements C144928f {
    public C144927e() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            parcel.createStringArray();
            enforceNoDataAvail(parcel);
            mo120431a(readInt);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            parcel.createStringArray();
            enforceNoDataAvail(parcel);
            mo120433c(readInt2);
        } else if (i != 3) {
            return false;
        } else {
            int readInt3 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) C8850c.m23492a(parcel, PendingIntent.CREATOR);
            enforceNoDataAvail(parcel);
            mo120432b(readInt3);
        }
        return true;
    }
}
