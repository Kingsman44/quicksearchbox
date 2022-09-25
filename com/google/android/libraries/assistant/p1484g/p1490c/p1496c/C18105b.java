package com.google.android.libraries.assistant.p1484g.p1490c.p1496c;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.g.c.c.b */
/* compiled from: PG */
public abstract class C18105b extends C8849b implements C18106c {
    public C18105b() {
        super("com.google.android.libraries.assistant.directactions.highcommand.backport.IPerformDirectActionCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        enforceNoDataAvail(parcel);
        mo23604a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        return true;
    }
}
