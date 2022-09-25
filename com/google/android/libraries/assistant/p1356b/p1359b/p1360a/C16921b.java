package com.google.android.libraries.assistant.p1356b.p1359b.p1360a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.b.b.a.b */
/* compiled from: PG */
public abstract class C16921b extends C8849b implements C16922c {
    public C16921b() {
        super("com.google.android.libraries.assistant.ambient.dynamic.service.IAmbientModeBinderSession");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo23088c((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo23086a((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo23087b((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
