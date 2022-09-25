package com.google.android.apps.auto.sdk;

import android.os.Parcel;
import com.google.android.p445a.C8849b;

/* renamed from: com.google.android.apps.auto.sdk.i */
/* compiled from: PG */
public abstract class C8977i extends C8849b implements C8978j {
    public C8977i() {
        super("com.google.android.apps.auto.sdk.IDrawerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i == 2) {
                mo17295b();
            } else if (i == 3) {
                mo17294a();
            } else if (i != 4) {
                return false;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
