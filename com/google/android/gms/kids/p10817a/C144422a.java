package com.google.android.gms.kids.p10817a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.kids.GetParentVerificationIntentResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.kids.a.a */
/* compiled from: PG */
public abstract class C144422a extends C8849b implements C144423b {
    public C144422a() {
        super("com.google.android.gms.kids.internal.IGetParentVerificationIntentCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo119886a((Status) C8850c.m23492a(parcel, Status.CREATOR), (GetParentVerificationIntentResponse) C8850c.m23492a(parcel, GetParentVerificationIntentResponse.CREATOR));
        return true;
    }
}
