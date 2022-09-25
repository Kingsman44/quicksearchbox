package com.google.android.play.core.install.p3544b;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.play.core.install.b.b */
/* compiled from: PG */
public abstract class C45201b extends C8849b implements C45202c {
    public C45201b() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo49028a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle2 = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
        }
        return true;
    }
}
