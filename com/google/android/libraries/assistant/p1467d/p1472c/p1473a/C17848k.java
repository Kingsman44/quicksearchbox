package com.google.android.libraries.assistant.p1467d.p1472c.p1473a;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.libraries.assistant.d.c.a.k */
/* compiled from: PG */
public abstract class C17848k extends C8849b implements C17849l {
    public C17848k() {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        enforceNoDataAvail(parcel);
        mo23472a(createByteArray);
        return true;
    }
}
