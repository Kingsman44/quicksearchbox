package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.account.data.manager.bz */
/* compiled from: PG */
public abstract class C46280bz extends C8849b implements C46282ca {
    public C46280bz() {
        super("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceAddAccountsCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            mo50307b(createTypedArrayList);
        } else if (i != 2) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo50306a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
