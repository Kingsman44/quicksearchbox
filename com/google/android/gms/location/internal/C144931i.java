package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.internal.i */
/* compiled from: PG */
public abstract class C144931i extends C8849b implements C144932j {
    public C144931i() {
        super("com.google.android.gms.location.internal.ILocationStatusCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo120447a((Status) C8850c.m23492a(parcel, Status.CREATOR), (Location) C8850c.m23492a(parcel, Location.CREATOR));
        return true;
    }
}
