package com.google.android.sidekick.shared.remoteapi;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.sidekick.shared.remoteapi.b */
/* compiled from: PG */
public abstract class C45330b extends C8849b implements C45331c {
    public C45330b() {
        super("com.google.android.sidekick.shared.remoteapi.IGoogleNowRemoteService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 4) {
            boolean b = mo49329b();
            parcel2.writeNoException();
            C8850c.m23495d(parcel2, b);
            return true;
        } else if (i != 54) {
            return false;
        } else {
            Account a = mo49328a();
            parcel2.writeNoException();
            C8850c.m23498g(parcel2, a);
            return true;
        }
    }
}
