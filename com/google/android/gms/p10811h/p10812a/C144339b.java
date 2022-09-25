package com.google.android.gms.p10811h.p10812a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.h.a.b */
/* compiled from: PG */
public abstract class C144339b extends C8849b implements C144340c {
    public C144339b() {
        super("com.google.android.gms.homegraph.internal.ICastIdCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String readString = parcel.readString();
        enforceNoDataAvail(parcel);
        mo119863a((Status) C8850c.m23492a(parcel, Status.CREATOR), readString);
        return true;
    }
}
