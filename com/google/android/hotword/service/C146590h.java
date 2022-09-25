package com.google.android.hotword.service;

import android.os.Parcel;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.hotword.service.h */
/* compiled from: PG */
public abstract class C146590h extends C8849b implements C146591i {
    public C146590h() {
        super("com.google.android.hotword.service.IHotwordService");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                boolean i3 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo123393e(readString, i3);
                parcel2.writeNoException();
                return true;
            case 2:
                String c = mo123391c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 3:
                boolean i4 = C8850c.m23500i(parcel);
                enforceNoDataAvail(parcel);
                mo123395g(i4);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean j = mo123398j();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, j);
                return true;
            case 5:
                boolean i5 = mo123397i();
                parcel2.writeNoException();
                C8850c.m23495d(parcel2, i5);
                return true;
            case 6:
                HotwordSettings b = mo123390b();
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, b);
                return true;
            case 10:
                HotwordInformation a = mo123389a();
                parcel2.writeNoException();
                C8850c.m23498g(parcel2, a);
                return true;
            case 11:
                int readInt = parcel.readInt();
                boolean i6 = C8850c.m23500i(parcel);
                String readString2 = parcel.readString();
                enforceNoDataAvail(parcel);
                mo123396h(readInt, i6, readString2);
                parcel2.writeNoException();
                return true;
            case 12:
                mo123392d();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
