package com.google.android.gms.auth.p10737a.p10738a;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.a.a.g */
/* compiled from: PG */
public abstract class C142852g extends C8849b implements C142853h {
    public C142852g() {
        super("com.google.android.gms.auth.account.data.IGetAccountsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(Account.CREATOR);
        enforceNoDataAvail(parcel);
        mo117776a((Status) C8850c.m23492a(parcel, Status.CREATOR), createTypedArrayList);
        return true;
    }
}
