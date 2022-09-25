package com.google.android.gms.p10815k.p10816a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.gms.k.a.al */
/* compiled from: PG */
public abstract class C144370al extends C8849b implements C144371am {
    public C144370al() {
        super("com.google.android.gms.inappreach.internal.IOnAccountHealthAlertsListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo119878a(createByteArray);
        return true;
    }
}
