package com.google.android.libraries.p10922ab;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.libraries.ab.e */
/* compiled from: PG */
public abstract class C146709e extends C8849b implements C146710f {
    public C146709e() {
        super("com.google.android.libraries.launcherclient.ILauncherOverlayCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            float readFloat = parcel.readFloat();
            enforceNoDataAvail(parcel);
            mo28128a(readFloat);
        } else if (i == 2) {
            int readInt = parcel.readInt();
            enforceNoDataAvail(parcel);
            mo28129b(readInt);
        } else if (i != 3) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo28130c((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
        }
        return true;
    }
}
