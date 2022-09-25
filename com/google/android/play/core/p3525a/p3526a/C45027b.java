package com.google.android.play.core.p3525a.p3526a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.play.core.a.a.b */
/* compiled from: PG */
public abstract class C45027b extends C8849b implements C45028c {
    public C45027b() {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            enforceNoDataAvail(parcel);
            mo48863a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
            enforceNoDataAvail(parcel);
            mo48864b();
            return true;
        }
    }
}
