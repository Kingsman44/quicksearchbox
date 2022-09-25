package com.google.android.gms.gmscompliance;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.gmscompliance.e */
/* compiled from: PG */
public abstract class C144275e extends C8849b implements C144276f {
    public C144275e() {
        super("com.google.android.gms.gmscompliance.IGmsDeviceComplianceServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo119797a((Status) C8850c.m23492a(parcel, Status.CREATOR), (GmsDeviceComplianceResponse) C8850c.m23492a(parcel, GmsDeviceComplianceResponse.CREATOR));
        return true;
    }
}
