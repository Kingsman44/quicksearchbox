package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.ag */
/* compiled from: PG */
public abstract class C143399ag extends C8849b implements C143400ah {
    public C143399ag() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            enforceNoDataAvail(parcel);
            C144165j b = mo118594b(readString);
            parcel2.writeNoException();
            C8850c.m23499h(parcel2, b);
        } else if (i == 2) {
            boolean d = mo118596d();
            parcel2.writeNoException();
            C8850c.m23495d(parcel2, d);
        } else if (i == 3) {
            String c = mo118595c();
            parcel2.writeNoException();
            parcel2.writeString(c);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(mo118593a());
        }
        return true;
    }
}
