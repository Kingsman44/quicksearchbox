package com.google.android.gms.learning.internal.training;

import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.learning.internal.training.e */
/* compiled from: PG */
public abstract class C144801e extends C8849b implements C144802f {
    public C144801e() {
        super("com.google.android.gms.learning.internal.training.IHttpUrlConnectionFactory");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                boolean d = mo120227d();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, d);
                return true;
            case 2:
                String readString = parcel.readString();
                enforceNoDataAvail(parcel);
                C144165j a = mo120224a(readString);
                parcel2.writeNoException();
                C8850c.m23499h(parcel2, a);
                return true;
            case 3:
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, mo120226c());
                return true;
            case 4:
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, mo120228e());
                return true;
            case 5:
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, mo120229f());
                return true;
            case 6:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo120225b(i3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
