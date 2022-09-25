package com.google.android.gms.cast.framework;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.cast.framework.ai */
/* compiled from: PG */
public abstract class C143401ai extends C8849b implements C143402aj {
    public C143401ai() {
        super("com.google.android.gms.cast.framework.ISessionProxy");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                C144165j c = mo118599c();
                parcel2.writeNoException();
                C8850c.m23499h(parcel2, c);
                return true;
            case 2:
                enforceNoDataAvail(parcel);
                mo118604h((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
                enforceNoDataAvail(parcel);
                mo118603g((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo118600d(i3);
                parcel2.writeNoException();
                return true;
            case 5:
                long b = mo118598b();
                parcel2.writeNoException();
                parcel2.writeLong(b);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(mo118597a());
                return true;
            case 7:
                enforceNoDataAvail(parcel);
                mo118602f((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                enforceNoDataAvail(parcel);
                mo118601e((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                enforceNoDataAvail(parcel);
                mo118605i((Bundle) C8850c.m23492a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
