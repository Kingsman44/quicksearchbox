package com.google.android.libraries.assistant.p1356b.p1357a.p1358a;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.assistant.b.a.a.a */
/* compiled from: PG */
public abstract class C16918a extends C8849b implements C16919b {
    public C16918a() {
        super("com.google.android.libraries.assistant.ambient.deviceintegration.service.IAmbientModeDeviceIntegrationBinderSession");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) C8850c.m23492a(parcel, Bundle.CREATOR);
        enforceNoDataAvail(parcel);
        mo23085a();
        parcel2.writeNoException();
        return true;
    }
}
