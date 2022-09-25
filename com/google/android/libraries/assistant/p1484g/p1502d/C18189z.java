package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.g.d.z */
/* compiled from: PG */
public abstract class C18189z extends C8849b implements C18149aa {
    public C18189z() {
        super("com.google.android.libraries.assistant.directactions.sender.IPerformDirectActionCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo20094a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
