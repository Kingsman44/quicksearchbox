package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.internal.ar */
/* compiled from: PG */
public abstract class C143902ar extends C8849b implements C143903as {
    public C143902ar() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C144165j c = mo119418c();
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, c);
        } else if (i != 2) {
            return false;
        } else {
            int b = mo119417b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
