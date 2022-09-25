package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.contextmanager.fence.internal.o */
/* compiled from: PG */
public abstract class C144047o extends C8849b implements C144048p {
    public C144047o() {
        super("com.google.android.gms.contextmanager.fence.internal.IContextFenceListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo119558b((FenceTriggerInfoImpl) C8850c.m23492a(parcel, FenceTriggerInfoImpl.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo119557a((FenceStateImpl) C8850c.m23492a(parcel, FenceStateImpl.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
