package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.o */
/* compiled from: PG */
public abstract class C143544o extends C8849b implements C143545p {
    public C143544o() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C144165j b = mo118644b();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, b);
        } else if (i == 2) {
            mo118646d();
            parcel2.writeNoException();
        } else if (i == 3) {
            mo118645c();
            parcel2.writeNoException();
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(mo118643a());
        }
        return true;
    }
}
