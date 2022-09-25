package com.google.android.libraries.assistant.p1484g.p1490c.p1496c;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.g.c.c.d */
/* compiled from: PG */
public abstract class C18107d extends C8849b implements C18108e {
    public C18107d() {
        super("com.google.android.libraries.assistant.directactions.highcommand.backport.IRequestDirectActionsListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo23606b(parcel.createTypedArrayList(Bundle.CREATOR), (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            mo23605a();
        }
        return true;
    }
}
