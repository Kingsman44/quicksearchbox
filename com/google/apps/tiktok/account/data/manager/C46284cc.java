package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.apps.tiktok.account.data.manager.cc */
/* compiled from: PG */
public abstract class C46284cc extends C8849b implements C46285cd {
    public C46284cc() {
        super("com.google.apps.tiktok.account.data.manager.IAccountSyncServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo50309b();
        } else if (i != 2) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo50308a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
